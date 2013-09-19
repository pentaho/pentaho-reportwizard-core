/*
* Copyright 2002 - 2013 Pentaho Corporation.  All rights reserved.
* 
* This software was developed by Pentaho Corporation and is provided under the terms
* of the Mozilla Public License, Version 1.1, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to http://www.mozilla.org/MPL/MPL-1.1.txt. TThe Initial Developer is Pentaho Corporation.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.5</a>, using an XML
 * Schema.
 * $Id$
 */

package org.pentaho.jfreereport.castormodel.reportspec;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Series.
 * 
 * @version $Revision$ $Date$
 */
public class Series implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _seriesColor
     */
    private java.lang.String _seriesColor;

    /**
     * Field _seriesName
     */
    private java.lang.String _seriesName;


      //----------------/
     //- Constructors -/
    //----------------/

    public Series() 
     {
        super();
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Series()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'seriesColor'.
     * 
     * @return the value of field 'SeriesColor'.
     */
    public java.lang.String getSeriesColor()
    {
        return this._seriesColor;
    } //-- java.lang.String getSeriesColor() 

    /**
     * Returns the value of field 'seriesName'.
     * 
     * @return the value of field 'SeriesName'.
     */
    public java.lang.String getSeriesName()
    {
        return this._seriesName;
    } //-- java.lang.String getSeriesName() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'seriesColor'.
     * 
     * @param seriesColor the value of field 'seriesColor'.
     */
    public void setSeriesColor(java.lang.String seriesColor)
    {
        this._seriesColor = seriesColor;
    } //-- void setSeriesColor(java.lang.String) 

    /**
     * Sets the value of field 'seriesName'.
     * 
     * @param seriesName the value of field 'seriesName'.
     */
    public void setSeriesName(java.lang.String seriesName)
    {
        this._seriesName = seriesName;
    } //-- void setSeriesName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.pentaho.jfreereport.castormodel.reportspec.Series
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.Series unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.pentaho.jfreereport.castormodel.reportspec.Series) Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.Series.class, reader);
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Series unmarshal(java.io.Reader) 

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
