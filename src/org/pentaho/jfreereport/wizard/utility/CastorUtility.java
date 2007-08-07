/*
 * Copyright 2006 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 *
 * @created Feb 01, 2006
 * @author Michael D'Amour
 */
package org.pentaho.jfreereport.wizard.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

public class CastorUtility {
  private static CastorUtility instance;

  public static CastorUtility getInstance() {
    if (instance == null) {
      instance = new CastorUtility();
    }
    return instance;
  }

  public Object readCastorObject(String inputFileName, Class expectedClass) {
    Object o = null;
    try {
      // read in the object
      o = Unmarshaller.unmarshal(expectedClass, new FileReader(inputFileName));
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
    return o;
  }

  public Object readCastorObject(InputStream inputStream, Class expectedClass) {
    Object o = null;
    try {
      // read in the object
      InputStreamReader reader = new InputStreamReader(inputStream);
      o = Unmarshaller.unmarshal(expectedClass, reader);
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
    return o;
  }

  public File writeCastorObject(Object object, String outputFileName) {
    // marshal the changed properties back to disk
    File file = null;
    FileWriter fileWriter = null;
    try {
      file = new File(outputFileName);
      fileWriter = new FileWriter(file);
      Marshaller.marshal(object, fileWriter);
      fileWriter.close();
    } catch (Exception e) {
      e.printStackTrace(System.err);
    } finally {
      try {
        fileWriter.flush();
      } catch (Exception e) {
        // e.printStackTrace();
      }
      try {
        fileWriter.close();
      } catch (Exception e) {
        // e.printStackTrace();
      }
    }
    return file;
  }
}
