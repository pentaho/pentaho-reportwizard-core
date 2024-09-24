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
public class Watermark implements java.io.Serializable {

    /**
     * Field name.
     */
    private java.lang.String name = "watermark";

    /**
     * Field src.
     */
    private java.lang.String src;

    /**
     * Field x.
     */
    private int x;

    /**
     * Keeps track of whether primitive field x has been set already
     */
    private boolean _hasx;

    /**
     * Field y.
     */
    private int y;

    /**
     * Keeps track of whether primitive field y has been set already
     */
    private boolean _hasy;

    /**
     * Field width.
     */
    private int width = 100;

    /**
     * Keeps track of whether primitive field width has been set
     * already.
     */
    private boolean _haswidth;

    /**
     * Field height.
     */
    private int height = 100;

    /**
     * Keeps track of whether primitive field height has been set
     * already.
     */
    private boolean _hasheight;

    /**
     * Field scale.
     */
    private boolean scale = true;

    /**
     * Keeps track of whether primitive field scale has been set
     * already.
     */
    private boolean _hasscale;

    /**
     * Field keepAspectRatio.
     */
    private boolean keepAspectRatio = true;

    /**
     * Keeps track of whether primitive field keepAspectRatio has
     * been set already.
     */
    private boolean _haskeepAspectRatio;

    /**
     * Field useWatermark.
     */
    private boolean useWatermark = true;

    /**
     * Keeps track of whether primitive field useWatermark has been
     * set already.
     */
    private boolean _hasuseWatermark;

    public Watermark() {
        super();
        setName("watermark");
    }

    /**
     */
    public void deleteHeight() {
        this._hasheight= false;
    }

    /**
     */
    public void deleteKeepAspectRatio() {
        this._haskeepAspectRatio= false;
    }

    /**
     */
    public void deleteScale() {
        this._hasscale= false;
    }

    /**
     */
    public void deleteUseWatermark() {
        this._hasuseWatermark= false;
    }

    /**
     */
    public void deleteWidth() {
        this._haswidth= false;
    }

    /**
     */
    public void deleteX() {
        this._hasx= false;
    }

    /**
     */
    public void deleteY() {
        this._hasy= false;
    }

    /**
     * Returns the value of field 'height'.
     * 
     * @return the value of field 'Height'.
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Returns the value of field 'keepAspectRatio'.
     * 
     * @return the value of field 'KeepAspectRatio'.
     */
    public boolean getKeepAspectRatio() {
        return this.keepAspectRatio;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * Returns the value of field 'scale'.
     * 
     * @return the value of field 'Scale'.
     */
    public boolean getScale() {
        return this.scale;
    }

    /**
     * Returns the value of field 'src'.
     * 
     * @return the value of field 'Src'.
     */
    public java.lang.String getSrc() {
        return this.src;
    }

    /**
     * Returns the value of field 'useWatermark'.
     * 
     * @return the value of field 'UseWatermark'.
     */
    public boolean getUseWatermark() {
        return this.useWatermark;
    }

    /**
     * Returns the value of field 'width'.
     * 
     * @return the value of field 'Width'.
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Returns the value of field 'x'.
     * 
     * @return the value of field 'X'.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Returns the value of field 'y'.
     * 
     * @return the value of field 'Y'.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Method hasHeight.
     * 
     * @return true if at least one Height has been added
     */
    public boolean hasHeight() {
        return this._hasheight;
    }

    /**
     * Method hasKeepAspectRatio.
     * 
     * @return true if at least one KeepAspectRatio has been added
     */
    public boolean hasKeepAspectRatio() {
        return this._haskeepAspectRatio;
    }

    /**
     * Method hasScale.
     * 
     * @return true if at least one Scale has been added
     */
    public boolean hasScale() {
        return this._hasscale;
    }

    /**
     * Method hasUseWatermark.
     * 
     * @return true if at least one UseWatermark has been added
     */
    public boolean hasUseWatermark() {
        return this._hasuseWatermark;
    }

    /**
     * Method hasWidth.
     * 
     * @return true if at least one Width has been added
     */
    public boolean hasWidth() {
        return this._haswidth;
    }

    /**
     * Method hasX.
     * 
     * @return true if at least one X has been added
     */
    public boolean hasX() {
        return this._hasx;
    }

    /**
     * Method hasY.
     * 
     * @return true if at least one Y has been added
     */
    public boolean hasY() {
        return this._hasy;
    }

    /**
     * Returns the value of field 'keepAspectRatio'.
     * 
     * @return the value of field 'KeepAspectRatio'.
     */
    public boolean isKeepAspectRatio() {
        return this.keepAspectRatio;
    }

    /**
     * Returns the value of field 'scale'.
     * 
     * @return the value of field 'Scale'.
     */
    public boolean isScale() {
        return this.scale;
    }

    /**
     * Returns the value of field 'useWatermark'.
     * 
     * @return the value of field 'UseWatermark'.
     */
    public boolean isUseWatermark() {
        return this.useWatermark;
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
     * Sets the value of field 'height'.
     * 
     * @param height the value of field 'height'.
     */
    public void setHeight(final int height) {
        this.height = height;
        this._hasheight = true;
    }

    /**
     * Sets the value of field 'keepAspectRatio'.
     * 
     * @param keepAspectRatio the value of field 'keepAspectRatio'.
     */
    public void setKeepAspectRatio(final boolean keepAspectRatio) {
        this.keepAspectRatio = keepAspectRatio;
        this._haskeepAspectRatio = true;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(final java.lang.String name) {
        this.name = name;
    }

    /**
     * Sets the value of field 'scale'.
     * 
     * @param scale the value of field 'scale'.
     */
    public void setScale(final boolean scale) {
        this.scale = scale;
        this._hasscale = true;
    }

    /**
     * Sets the value of field 'src'.
     * 
     * @param src the value of field 'src'.
     */
    public void setSrc(final java.lang.String src) {
        this.src = src;
    }

    /**
     * Sets the value of field 'useWatermark'.
     * 
     * @param useWatermark the value of field 'useWatermark'.
     */
    public void setUseWatermark(final boolean useWatermark) {
        this.useWatermark = useWatermark;
        this._hasuseWatermark = true;
    }

    /**
     * Sets the value of field 'width'.
     * 
     * @param width the value of field 'width'.
     */
    public void setWidth(final int width) {
        this.width = width;
        this._haswidth = true;
    }

    /**
     * Sets the value of field 'x'.
     * 
     * @param x the value of field 'x'.
     */
    public void setX(final int x) {
        this.x = x;
        this._hasx = true;
    }

    /**
     * Sets the value of field 'y'.
     * 
     * @param y the value of field 'y'.
     */
    public void setY(final int y) {
        this.y = y;
        this._hasy = true;
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
     * org.pentaho.jfreereport.castormodel.reportspec.Watermark
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.Watermark unmarshal(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.pentaho.jfreereport.castormodel.reportspec.Watermark) org.exolab.castor.xml.Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.Watermark.class, reader);
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
