/*
* Copyright 2002 - 2017 Hitachi Vantara.  All rights reserved.
* 
* This software was developed by Hitachi Vantara and is provided under the terms
* of the Mozilla Public License, Version 1.1, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to http://www.mozilla.org/MPL/MPL-1.1.txt. TThe Initial Developer is Pentaho Corporation.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

package org.pentaho.jfreereport.wizard.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

public class CastorUtility {
  private static CastorUtility instance;

  public static Log getLogger() {
    return LogFactory.getLog( CastorUtility.class );
  }

  public static CastorUtility getInstance() {
    if ( instance == null ) {
      instance = new CastorUtility();
    }
    return instance;
  }

  public Object readCastorObject( String inputFileName, Class expectedClass ) {
    Object o = null;
    try {
      // read in the object
      o = Unmarshaller.unmarshal( expectedClass, new FileReader( inputFileName ) );
    } catch ( Exception e ) {
      getLogger().error( e.getMessage(), e );
    }
    return o;
  }

  /**
   * Create an object instance representing the contents of the XML document
   * contained in <param>inputStream</param>
   *
   * @param inputStream   InputStream the input stream containing the text of the xml document.
   * @param expectedClass
   * @param encoding      This should be the encoding of the document-text contained in <param>inputStream</param>.
   *                      Typically this will be the encoding specified in the processing instruction in the xml
   *                      document, for instance: <? version='1.0' encoding='UTF-8'?>. The caller may want to use
   *                      CleanXmlHelper.getEncoding() on the string that created inputStream to determine the encoding
   *                      in the XML text. A null value is acceptable ONLY for backward compatibility. If the encoding
   *                      is null, the default character set will be used. This is generally NOT the desired behavior.
   * @return Object an instance of the class specified by the <param>expectedClass</param> parameter, initialized with
   * the contents of the XML text in the <param>inputStream</param>.
   */
  public Object readCastorObject( InputStream inputStream, Class expectedClass, String encoding ) {

    Object o = null;
    try {
      // read in the object
      InputStreamReader reader = null;
      if ( null != encoding ) {
        reader = new InputStreamReader( inputStream, encoding );
      } else {
        reader = new InputStreamReader( inputStream );
      }
      o = Unmarshaller.unmarshal( expectedClass, reader );
    } catch ( Exception e ) {
      getLogger().error( e.getMessage(), e );
    }
    return o;
  }

  /**
   * @param inputStream
   * @param expectedClass
   * @return
   * @deprecated This method does not provide a mechanism for the caller to provide a valid character encoding. The
   * caller should always provide a valid character encoding. Instead use: Object readCastorObject(InputStream
   * inputStream, Class expectedClass, String encoding )
   */
  public Object readCastorObject( InputStream inputStream, Class expectedClass ) {
    return readCastorObject( inputStream, expectedClass, null );
  }

  public File writeCastorObject( Object object, String outputFileName ) {
    // marshal the changed properties back to disk
    File file = null;
    Writer fileWriter = null;
    try {
      file = new File( outputFileName );
      fileWriter = new FileWriter( file );
      Marshaller.marshal( object, fileWriter );
      fileWriter.close();
    } catch ( Exception e ) {
      getLogger().error( e.getMessage(), e );
    } finally {
      try {
        fileWriter.flush();
      } catch ( Exception ignored ) {
        //ignored
      }
      try {
        fileWriter.close();
      } catch ( Exception ignored ) {
        //ignored
      }
    }
    return file;
  }
}
