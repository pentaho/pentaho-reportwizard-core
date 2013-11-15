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
 * Class ReportSpecChoice.
 * 
 * @version $Revision$ $Date$
 */
public class ReportSpecChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _xqueryUrl
     */
    private java.lang.String _xqueryUrl;

    /**
     * Field _jndiSource
     */
    private java.lang.String _jndiSource;

    /**
     * Field _kettleUrl
     */
    private java.lang.String _kettleUrl;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportSpecChoice() 
     {
        super();
    } //-- org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'jndiSource'.
     * 
     * @return the value of field 'JndiSource'.
     */
    public java.lang.String getJndiSource()
    {
        return this._jndiSource;
    } //-- java.lang.String getJndiSource() 

    /**
     * Returns the value of field 'kettleUrl'.
     * 
     * @return the value of field 'KettleUrl'.
     */
    public java.lang.String getKettleUrl()
    {
        return this._kettleUrl;
    } //-- java.lang.String getKettleUrl() 

    /**
     * Returns the value of field 'xqueryUrl'.
     * 
     * @return the value of field 'XqueryUrl'.
     */
    public java.lang.String getXqueryUrl()
    {
        return this._xqueryUrl;
    } //-- java.lang.String getXqueryUrl() 

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
     * Sets the value of field 'jndiSource'.
     * 
     * @param jndiSource the value of field 'jndiSource'.
     */
    public void setJndiSource(java.lang.String jndiSource)
    {
        this._jndiSource = jndiSource;
    } //-- void setJndiSource(java.lang.String) 

    /**
     * Sets the value of field 'kettleUrl'.
     * 
     * @param kettleUrl the value of field 'kettleUrl'.
     */
    public void setKettleUrl(java.lang.String kettleUrl)
    {
        this._kettleUrl = kettleUrl;
    } //-- void setKettleUrl(java.lang.String) 

    /**
     * Sets the value of field 'xqueryUrl'.
     * 
     * @param xqueryUrl the value of field 'xqueryUrl'.
     */
    public void setXqueryUrl(java.lang.String xqueryUrl)
    {
        this._xqueryUrl = xqueryUrl;
    } //-- void setXqueryUrl(java.lang.String) 

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
     * org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice) Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice.class, reader);
    } //-- org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice unmarshal(java.io.Reader) 

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
