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


/**
 *
 */

package org.pentaho.jfreereport.wizard.utility.report;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Types;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.pentaho.jfreereport.castormodel.reportspec.Chart;
import org.pentaho.jfreereport.castormodel.reportspec.Field;
import org.pentaho.jfreereport.castormodel.reportspec.ReportSpec;

/**
 * @author Michael D'Amour
 */
public class ReportSpecUtility {

  public static final String NUMBER_FIELD = "number-field"; //$NON-NLS-1$
  public static final String DATE_FIELD = "date-field"; //$NON-NLS-1$
  public static final String STRING_FIELD = "string-field"; //$NON-NLS-1$
  public static final String MESSAGE_FIELD = "message-field"; //$NON-NLS-1$
  public static final String LABEL = "label"; //$NON-NLS-1$

  private static final int BOLD = 0x00000001;
  private static final int ITALIC = 0x00000002;
  private static final int BOLD_ITALIC = ( BOLD | ITALIC );

  public static void copyFile( String input, String output ) {
    try {
      File inputFile = new File( input );
      File outputFile = new File( output );
      if ( inputFile.exists() && !inputFile.getCanonicalPath().equals( outputFile.getCanonicalPath() ) ) {
        FileInputStream fis = new FileInputStream( inputFile );
        FileOutputStream fos = new FileOutputStream( outputFile );
        fos.getChannel().transferFrom( fis.getChannel(), 0, fis.getChannel().size() );
        fos.close();
        fis.close();
      }
    } catch ( Exception e ) {
      e.printStackTrace( System.err );
    }
  }

  public static Field[] getGroups( Field[] fields ) {
    if ( fields == null ) {
      return null;
    }
    int numDetails = 0;
    for ( int i = 0; i < fields.length; i++ ) {
      Field f = fields[ i ];
      if ( f.getIsDetail() ) {
        numDetails++;
      }
    }
    Field[] groups = new Field[ fields.length - numDetails ];
    int fieldCount = 0;
    for ( int i = 0; i < fields.length; i++ ) {
      Field f = fields[ i ];
      if ( !f.getIsDetail() ) {
        groups[ fieldCount ] = f;
        fieldCount++;
      }
    }
    return groups;
  }

  public static String[] getFieldNames( ReportSpec spec ) {
    String[] fieldNames = new String[ spec.getField().length ];
    for ( int i = 0; i < fieldNames.length; i++ ) {
      fieldNames[ i ] = spec.getField( i ).getName();
    }
    return fieldNames;
  }

  public static String[] getDetailFieldNames( ReportSpec spec ) {
    Field[] details = getDetails( spec.getField() );
    if ( details == null ) {
      return null;
    }
    String[] detailFieldNames = new String[ details.length ];
    for ( int i = 0; i < details.length; i++ ) {
      detailFieldNames[ i ] = details[ i ].getName();
    }
    return detailFieldNames;
  }

  public static String[] getGroupFieldNames( ReportSpec spec ) {
    Field[] groups = getGroups( spec.getField() );
    if ( groups == null ) {
      return null;
    }
    String[] groupFieldNames = new String[ groups.length ];
    for ( int i = 0; i < groups.length; i++ ) {
      groupFieldNames[ i ] = groups[ i ].getName();
    }
    return groupFieldNames;
  }

  public static String[] getHorizontalAlignmentChoices() {
    String[] choices = new String[] { "left", "center", "right" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return choices;
  }

  public static String[] getVerticalAlignmentChoices() {
    String[] choices = new String[] { "top", "middle", "bottom" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return choices;
  }

  public static String[] getExpressionChoices( int type ) {
    String[] choices = new String[] { "none", "sum", "average", "min", "max", "item-count", "group-count" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
    if ( type == Types.VARCHAR ) {
      choices = new String[] { "none", "item-count", "group-count" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    } else if ( type == Types.DATE || type == Types.TIME || type == Types.TIMESTAMP ) {
      choices = new String[] { "none", "item-count", "group-count" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }
    return choices;
  }

  public static Field getField( Field[] fields, String name, boolean isDetail ) {
    for ( int i = 0; i < fields.length; i++ ) {
      Field f = fields[ i ];
      if ( f.getName().equals( name ) && f.getIsDetail() == isDetail ) {
        return f;
      }
    }
    return null;
  }

  /**
   * @param fieldType    int one of the java.sql.Types, see http://java.sun.com/j2se/1.5.0/docs/api/java/sql/Types.html
   * @return String indicating the field type
   */
  public static String getFieldType( int fieldType ) {
    if ( fieldType == Types.NUMERIC ) {
      return ReportSpecUtility.NUMBER_FIELD;
    } else if ( fieldType == Types.DATE ) {
      return ReportSpecUtility.DATE_FIELD;
    } else {
      return ReportSpecUtility.STRING_FIELD;
    }
  }

  public static Field[] getDetails( Field[] fields ) {
    if ( fields == null ) {
      return null;
    }
    int numDetails = 0;
    for ( int i = 0; i < fields.length; i++ ) {
      Field f = fields[ i ];
      if ( f.getIsDetail() ) {
        numDetails++;
      }
    }
    Field[] details = new Field[ numDetails ];
    int fieldCount = 0;
    for ( int i = 0; i < fields.length; i++ ) {
      Field f = fields[ i ];
      if ( f.getIsDetail() ) {
        details[ fieldCount ] = f;
        fieldCount++;
      }
    }
    return details;
  }

  public static boolean isLastGroup( ReportSpec reportSpec, Field f ) {
    Field lastGroup = null;
    for ( int i = 0; i < reportSpec.getFieldCount(); i++ ) {
      if ( !reportSpec.getField( i ).getIsDetail() ) {
        lastGroup = reportSpec.getField( i );
      }
    }
    if ( lastGroup != null && f.getName().equals( lastGroup.getName() ) ) {
      return true;
    }
    return false;
  }

  public static boolean isFontStyleBoldAndItalic( int fontStyle ) {
    return ( fontStyle & BOLD_ITALIC ) == BOLD_ITALIC;
  }

  public static int addFontStyleItalic( int fontStyle ) {
    return fontStyle & ITALIC;
  }

  public static int addFontStyleBold( int fontStyle ) {
    return fontStyle & BOLD;
  }
  // TODO someday add setters/clearers

  public static boolean isFontStyleItalic( int fontStyle ) {
    return ( fontStyle & ITALIC ) == ITALIC;
  }

  public static boolean isFontStyleBold( int fontStyle ) {
    return ( fontStyle & BOLD ) == BOLD;
  }

  public static String getFontStyleString( int fontStyle ) {
    if ( isFontStyleBoldAndItalic( fontStyle ) ) {
      return "bold-italic"; //$NON-NLS-1$
    } else if ( isFontStyleItalic( fontStyle ) ) {
      return "italic"; //$NON-NLS-1$
    } else if ( isFontStyleBold( fontStyle ) ) {
      return "bold"; //$NON-NLS-1$
    } else {
      return "plain"; //$NON-NLS-1$
    }
  }

  public static int getActualColumnCount( Field[] groups, Field[] details ) {
    int count = 0;
    if ( groups != null ) {
      count += groups.length;
    }
    for ( int i = 0; details != null && i < details.length; i++ ) {
      if ( details[ i ].getName() != null && !details[ i ].getName().equals( "" ) ) { //$NON-NLS-1$
        count++;
      }
    }
    return count;
  }

  public static String[] getSeriesColumns( Chart chart ) {
    String[] series = new String[ chart.getSeriesCount() ];
    for ( int i = 0; i < chart.getSeriesCount(); i++ ) {
      series[ i ] = chart.getSeries( i ).getSeriesName();
    }
    return series;
  }

  public static boolean doesExpressionExist( Field[] fields ) {
    boolean expressionExists = false;
    for ( int i = 0; i < fields.length; i++ ) {
      Field f = fields[ i ];
      String value = f.getExpression();
      if ( value != null && !value.equals( "none" ) ) { //$NON-NLS-1$
        expressionExists = true;
        break;
      }
    }
    return expressionExists;
  }

  public static String[] enumerationToStringArray( Enumeration e ) {
    List list = new LinkedList();
    while ( e.hasMoreElements() ) {
      String element = e.nextElement().toString();
      list.add( element );
    }
    return (String[]) list.toArray( new String[ 0 ] );
  }

  /**
   * Find the effective font size for the item. Find the max
   * font size of each column, the report's column-header-font-size
   * attribute's value, and the report's items-font-size attribute's value.
   * Return that value as the effective font size.
   *
   * @param reportSpec ReportSpec
   * @param details    Field[]
   * @return int the effective font size for an item.
   */
  public static int getItemFontSize( ReportSpec reportSpec, Field[] details ) {
    int maxDetailFontSize = Integer.MIN_VALUE;
    for ( int i = 0; i < details.length; i++ ) {
      Field f = details[ i ];
      maxDetailFontSize = Math.max( maxDetailFontSize, f.getFontSize() );
    }

    if ( reportSpec.getColumnHeaderFontSize() > maxDetailFontSize ) {
      maxDetailFontSize = reportSpec.getColumnHeaderFontSize();
    }

    return Math.max( reportSpec.getItemsFontSize(), maxDetailFontSize );
  }

  public static int getRowHeight( ReportSpec reportSpec, Field[] details ) {
    return getItemFontSize( reportSpec, details ) + 2;
  }

  /**
   * @param expression
   * @return $objectType$
   */
  public static String getJFreeExpressionClass( String expression ) {
    // assume that expression is "sum", "average", or "count"
    String jfreeExpression = null;
    if ( expression.equalsIgnoreCase( "sum" ) ) { //$NON-NLS-1$
      jfreeExpression = "org.jfree.report.function.ItemSumFunction"; //$NON-NLS-1$
    } else if ( expression.equalsIgnoreCase( "average" ) ) { //$NON-NLS-1$
      jfreeExpression = "org.jfree.report.function.ItemAvgFunction"; //$NON-NLS-1$
    } else if ( expression.equalsIgnoreCase( "min" ) ) { //$NON-NLS-1$
      jfreeExpression = "org.jfree.report.function.ItemMinFunction"; //$NON-NLS-1$
    } else if ( expression.equalsIgnoreCase( "max" ) ) { //$NON-NLS-1$
      jfreeExpression = "org.jfree.report.function.ItemMaxFunction"; //$NON-NLS-1$
    } else if ( expression.equalsIgnoreCase( "item-count" ) ) { //$NON-NLS-1$
      jfreeExpression = "org.jfree.report.function.ItemCountFunction"; //$NON-NLS-1$
    } else if ( expression.equalsIgnoreCase( "group-count" ) ) { //$NON-NLS-1$
      jfreeExpression = "org.jfree.report.function.GroupCountFunction"; //$NON-NLS-1$
    }
    return jfreeExpression;
  }

  public static int getNumberOfGroupsInTemplate( Document templateDoc ) {
    int numGroups = 0;
    try {
      List groups = templateDoc.selectNodes( "/report/groups/*" ); //$NON-NLS-1$
      if ( groups != null ) {
        for ( int i = 0; i < groups.size(); i++ ) {
          Element groupElement = (Element) groups.get( i );
          List fields = groupElement.selectNodes( "fields/*" ); //$NON-NLS-1$
          if ( fields != null && fields.size() > 0 ) {
            numGroups++;
          }
        }
      }
    } catch ( Exception e ) {
    }
    return numGroups;
  }

}
