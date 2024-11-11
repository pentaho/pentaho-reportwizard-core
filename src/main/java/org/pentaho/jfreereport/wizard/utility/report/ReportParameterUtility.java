/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/


package org.pentaho.jfreereport.wizard.utility.report;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.pentaho.jfreereport.castormodel.reportspec.ReportSpec;
import org.pentaho.jfreereport.wizard.utility.CastorUtility;

public class ReportParameterUtility {
  public static String[] getParameterNamesFromReportSpecPath( String reportSpecPath ) {
    try {
      ReportSpec reportSpec = null;
      boolean isZIPReportSpec = false;
      try {
        ZipFile zipFile = new ZipFile( reportSpecPath );
        ZipEntry reportSpecEntry = zipFile.getEntry( "report.xreportspec" ); //$NON-NLS-1$
        File tempFile = File
          .createTempFile( "report", ".xreportspec", new File( "/temp" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        tempFile.deleteOnExit();
        FileOutputStream fos = new FileOutputStream( tempFile );
        InputStream inputStream = zipFile.getInputStream( reportSpecEntry );
        int numRead = 0;
        byte bytes[] = new byte[ 16384 ];
        while ( ( numRead = inputStream.read( bytes ) ) != -1 ) {
          if ( numRead > 0 ) {
            fos.write( bytes, 0, numRead );
          }
        }
        fos.close();
        reportSpec = (ReportSpec) CastorUtility.getInstance().readCastorObject( tempFile.getAbsolutePath(),
          ReportSpec.class );
        isZIPReportSpec = true;
      } catch ( Exception e ) {
      }
      if ( !isZIPReportSpec ) {
        if ( reportSpecPath != null ) {
          reportSpec = (ReportSpec) CastorUtility.getInstance().readCastorObject( reportSpecPath, ReportSpec.class );
        }
      }
      List paramsList = getParametersKeys( reportSpec.getQuery() );
      return (String[]) paramsList.toArray( new String[ 0 ] );
    } catch ( Exception e ) {
    }
    return null;
  }

  public static List getParameterNamesFromQuery( String query ) {
    List params = new LinkedList();
    while ( query.indexOf( "{" ) != -1 ) { //$NON-NLS-1$
      String param = query.substring( query.indexOf( "{" ) + 1, query.indexOf( "}" ) ); //$NON-NLS-1$ //$NON-NLS-2$
      query = query.substring( query.indexOf( "}" ) + 1 ); //$NON-NLS-1$
      params.add( param );
    }
    return params;
  }

  public static String setupParameters( String query ) {
    List parameterNames = getParameterNamesFromQuery( query );
    for ( int i = 0; i < parameterNames.size(); i++ ) {
      String param = (String) parameterNames.get( i );
      String paramValue = param.substring( param.indexOf( "=" ) + 1 ); //$NON-NLS-1$
      String trueParam = "\\{" + param + "\\}"; //$NON-NLS-1$ //$NON-NLS-2$
      query = query.replaceAll( trueParam, paramValue );
    }
    return query;
  }

  public static List getParametersKeys( String query ) {
    List parameterNames = getParameterNamesFromQuery( query );
    List parameterKeys = new LinkedList();
    for ( int i = 0; i < parameterNames.size(); i++ ) {
      String param = (String) parameterNames.get( i );
      String paramKey = param.substring( 0, param.indexOf( "=" ) ); //$NON-NLS-1$
      if ( !parameterKeys.contains( paramKey ) ) {
        parameterKeys.add( paramKey );
      }
    }
    return parameterKeys;
  }

  public static String setupParametersForActionSequence( String query ) {
    List parameterNames = getParameterNamesFromQuery( query );
    for ( int i = 0; i < parameterNames.size(); i++ ) {
      String param = (String) parameterNames.get( i );
      String paramKey = param.substring( 0, param.indexOf( "=" ) ); //$NON-NLS-1$
      String trueParam = "\\{" + param + "\\}"; //$NON-NLS-1$ //$NON-NLS-2$
      query = query.replaceAll( trueParam, "{PREPARE:" + paramKey + "}" ); //$NON-NLS-1$ //$NON-NLS-2$
    }
    return query;
  }
}
