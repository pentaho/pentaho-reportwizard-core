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
public class Series implements java.io.Serializable {

    /**
     * Field seriesColor.
     */
    private java.lang.String seriesColor;

    /**
     * Field seriesName.
     */
    private java.lang.String seriesName;

    public Series() {
        super();
    }

    /**
     * Returns the value of field 'seriesColor'.
     * 
     * @return the value of field 'SeriesColor'.
     */
    public java.lang.String getSeriesColor() {
        return this.seriesColor;
    }

    /**
     * Returns the value of field 'seriesName'.
     * 
     * @return the value of field 'SeriesName'.
     */
    public java.lang.String getSeriesName() {
        return this.seriesName;
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
     * Sets the value of field 'seriesColor'.
     * 
     * @param seriesColor the value of field 'seriesColor'.
     */
    public void setSeriesColor(final java.lang.String seriesColor) {
        this.seriesColor = seriesColor;
    }

    /**
     * Sets the value of field 'seriesName'.
     * 
     * @param seriesName the value of field 'seriesName'.
     */
    public void setSeriesName(final java.lang.String seriesName) {
        this.seriesName = seriesName;
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
     * org.pentaho.jfreereport.castormodel.reportspec.Series
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.Series unmarshal(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.pentaho.jfreereport.castormodel.reportspec.Series) org.exolab.castor.xml.Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.Series.class, reader);
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
