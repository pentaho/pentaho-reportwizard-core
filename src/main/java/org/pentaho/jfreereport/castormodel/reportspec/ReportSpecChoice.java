/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.pentaho.jfreereport.castormodel.reportspec;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ReportSpecChoice implements java.io.Serializable {

    /**
     * Field xqueryUrl.
     */
    private java.lang.String xqueryUrl;

    /**
     * Field jndiSource.
     */
    private java.lang.String jndiSource;

    /**
     * Field kettleUrl.
     */
    private java.lang.String kettleUrl;

    public ReportSpecChoice() {
        super();
    }

    /**
     * Returns the value of field 'jndiSource'.
     * 
     * @return the value of field 'JndiSource'.
     */
    public java.lang.String getJndiSource() {
        return this.jndiSource;
    }

    /**
     * Returns the value of field 'kettleUrl'.
     * 
     * @return the value of field 'KettleUrl'.
     */
    public java.lang.String getKettleUrl() {
        return this.kettleUrl;
    }

    /**
     * Returns the value of field 'xqueryUrl'.
     * 
     * @return the value of field 'XqueryUrl'.
     */
    public java.lang.String getXqueryUrl() {
        return this.xqueryUrl;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid() {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(final java.io.Writer out) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

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
    public void marshal(final org.xml.sax.ContentHandler handler) throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'jndiSource'.
     * 
     * @param jndiSource the value of field 'jndiSource'.
     */
    public void setJndiSource(final java.lang.String jndiSource) {
        this.jndiSource = jndiSource;
    }

    /**
     * Sets the value of field 'kettleUrl'.
     * 
     * @param kettleUrl the value of field 'kettleUrl'.
     */
    public void setKettleUrl(final java.lang.String kettleUrl) {
        this.kettleUrl = kettleUrl;
    }

    /**
     * Sets the value of field 'xqueryUrl'.
     * 
     * @param xqueryUrl the value of field 'xqueryUrl'.
     */
    public void setXqueryUrl(final java.lang.String xqueryUrl) {
        this.xqueryUrl = xqueryUrl;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice unmarshal(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate() throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
