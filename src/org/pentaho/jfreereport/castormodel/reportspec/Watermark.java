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
 * Class Watermark.
 * 
 * @version $Revision$ $Date$
 */
public class Watermark implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name = "watermark";

    /**
     * Field _src
     */
    private java.lang.String _src;

    /**
     * Field _x
     */
    private int _x;

    /**
     * keeps track of state for field: _x
     */
    private boolean _has_x;

    /**
     * Field _y
     */
    private int _y;

    /**
     * keeps track of state for field: _y
     */
    private boolean _has_y;

    /**
     * Field _width
     */
    private int _width = 100;

    /**
     * keeps track of state for field: _width
     */
    private boolean _has_width;

    /**
     * Field _height
     */
    private int _height = 100;

    /**
     * keeps track of state for field: _height
     */
    private boolean _has_height;

    /**
     * Field _scale
     */
    private boolean _scale = true;

    /**
     * keeps track of state for field: _scale
     */
    private boolean _has_scale;

    /**
     * Field _keepAspectRatio
     */
    private boolean _keepAspectRatio = true;

    /**
     * keeps track of state for field: _keepAspectRatio
     */
    private boolean _has_keepAspectRatio;

    /**
     * Field _useWatermark
     */
    private boolean _useWatermark = true;

    /**
     * keeps track of state for field: _useWatermark
     */
    private boolean _has_useWatermark;


      //----------------/
     //- Constructors -/
    //----------------/

    public Watermark() 
     {
        super();
        setName("watermark");
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Watermark()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteHeight()
    {
        this._has_height= false;
    } //-- void deleteHeight() 

    /**
     */
    public void deleteKeepAspectRatio()
    {
        this._has_keepAspectRatio= false;
    } //-- void deleteKeepAspectRatio() 

    /**
     */
    public void deleteScale()
    {
        this._has_scale= false;
    } //-- void deleteScale() 

    /**
     */
    public void deleteUseWatermark()
    {
        this._has_useWatermark= false;
    } //-- void deleteUseWatermark() 

    /**
     */
    public void deleteWidth()
    {
        this._has_width= false;
    } //-- void deleteWidth() 

    /**
     */
    public void deleteX()
    {
        this._has_x= false;
    } //-- void deleteX() 

    /**
     */
    public void deleteY()
    {
        this._has_y= false;
    } //-- void deleteY() 

    /**
     * Returns the value of field 'height'.
     * 
     * @return the value of field 'Height'.
     */
    public int getHeight()
    {
        return this._height;
    } //-- int getHeight() 

    /**
     * Returns the value of field 'keepAspectRatio'.
     * 
     * @return the value of field 'KeepAspectRatio'.
     */
    public boolean getKeepAspectRatio()
    {
        return this._keepAspectRatio;
    } //-- boolean getKeepAspectRatio() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'scale'.
     * 
     * @return the value of field 'Scale'.
     */
    public boolean getScale()
    {
        return this._scale;
    } //-- boolean getScale() 

    /**
     * Returns the value of field 'src'.
     * 
     * @return the value of field 'Src'.
     */
    public java.lang.String getSrc()
    {
        return this._src;
    } //-- java.lang.String getSrc() 

    /**
     * Returns the value of field 'useWatermark'.
     * 
     * @return the value of field 'UseWatermark'.
     */
    public boolean getUseWatermark()
    {
        return this._useWatermark;
    } //-- boolean getUseWatermark() 

    /**
     * Returns the value of field 'width'.
     * 
     * @return the value of field 'Width'.
     */
    public int getWidth()
    {
        return this._width;
    } //-- int getWidth() 

    /**
     * Returns the value of field 'x'.
     * 
     * @return the value of field 'X'.
     */
    public int getX()
    {
        return this._x;
    } //-- int getX() 

    /**
     * Returns the value of field 'y'.
     * 
     * @return the value of field 'Y'.
     */
    public int getY()
    {
        return this._y;
    } //-- int getY() 

    /**
     * Method hasHeight
     * 
     * 
     * 
     * @return true if at least one Height has been added
     */
    public boolean hasHeight()
    {
        return this._has_height;
    } //-- boolean hasHeight() 

    /**
     * Method hasKeepAspectRatio
     * 
     * 
     * 
     * @return true if at least one KeepAspectRatio has been added
     */
    public boolean hasKeepAspectRatio()
    {
        return this._has_keepAspectRatio;
    } //-- boolean hasKeepAspectRatio() 

    /**
     * Method hasScale
     * 
     * 
     * 
     * @return true if at least one Scale has been added
     */
    public boolean hasScale()
    {
        return this._has_scale;
    } //-- boolean hasScale() 

    /**
     * Method hasUseWatermark
     * 
     * 
     * 
     * @return true if at least one UseWatermark has been added
     */
    public boolean hasUseWatermark()
    {
        return this._has_useWatermark;
    } //-- boolean hasUseWatermark() 

    /**
     * Method hasWidth
     * 
     * 
     * 
     * @return true if at least one Width has been added
     */
    public boolean hasWidth()
    {
        return this._has_width;
    } //-- boolean hasWidth() 

    /**
     * Method hasX
     * 
     * 
     * 
     * @return true if at least one X has been added
     */
    public boolean hasX()
    {
        return this._has_x;
    } //-- boolean hasX() 

    /**
     * Method hasY
     * 
     * 
     * 
     * @return true if at least one Y has been added
     */
    public boolean hasY()
    {
        return this._has_y;
    } //-- boolean hasY() 

    /**
     * Returns the value of field 'keepAspectRatio'.
     * 
     * @return the value of field 'KeepAspectRatio'.
     */
    public boolean isKeepAspectRatio()
    {
        return this._keepAspectRatio;
    } //-- boolean isKeepAspectRatio() 

    /**
     * Returns the value of field 'scale'.
     * 
     * @return the value of field 'Scale'.
     */
    public boolean isScale()
    {
        return this._scale;
    } //-- boolean isScale() 

    /**
     * Returns the value of field 'useWatermark'.
     * 
     * @return the value of field 'UseWatermark'.
     */
    public boolean isUseWatermark()
    {
        return this._useWatermark;
    } //-- boolean isUseWatermark() 

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
     * Sets the value of field 'height'.
     * 
     * @param height the value of field 'height'.
     */
    public void setHeight(int height)
    {
        this._height = height;
        this._has_height = true;
    } //-- void setHeight(int) 

    /**
     * Sets the value of field 'keepAspectRatio'.
     * 
     * @param keepAspectRatio the value of field 'keepAspectRatio'.
     */
    public void setKeepAspectRatio(boolean keepAspectRatio)
    {
        this._keepAspectRatio = keepAspectRatio;
        this._has_keepAspectRatio = true;
    } //-- void setKeepAspectRatio(boolean) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'scale'.
     * 
     * @param scale the value of field 'scale'.
     */
    public void setScale(boolean scale)
    {
        this._scale = scale;
        this._has_scale = true;
    } //-- void setScale(boolean) 

    /**
     * Sets the value of field 'src'.
     * 
     * @param src the value of field 'src'.
     */
    public void setSrc(java.lang.String src)
    {
        this._src = src;
    } //-- void setSrc(java.lang.String) 

    /**
     * Sets the value of field 'useWatermark'.
     * 
     * @param useWatermark the value of field 'useWatermark'.
     */
    public void setUseWatermark(boolean useWatermark)
    {
        this._useWatermark = useWatermark;
        this._has_useWatermark = true;
    } //-- void setUseWatermark(boolean) 

    /**
     * Sets the value of field 'width'.
     * 
     * @param width the value of field 'width'.
     */
    public void setWidth(int width)
    {
        this._width = width;
        this._has_width = true;
    } //-- void setWidth(int) 

    /**
     * Sets the value of field 'x'.
     * 
     * @param x the value of field 'x'.
     */
    public void setX(int x)
    {
        this._x = x;
        this._has_x = true;
    } //-- void setX(int) 

    /**
     * Sets the value of field 'y'.
     * 
     * @param y the value of field 'y'.
     */
    public void setY(int y)
    {
        this._y = y;
        this._has_y = true;
    } //-- void setY(int) 

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
     * org.pentaho.jfreereport.castormodel.reportspec.Watermark
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.Watermark unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.pentaho.jfreereport.castormodel.reportspec.Watermark) Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.Watermark.class, reader);
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Watermark unmarshal(java.io.Reader) 

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
