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
 * Class Chart.
 * 
 * @version $Revision$ $Date$
 */
public class Chart implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type
     */
    private org.pentaho.jfreereport.castormodel.reportspec.types.ChartType _type = org.pentaho.jfreereport.castormodel.reportspec.types.ChartType.valueOf("bar");

    /**
     * Field _categoryColumn
     */
    private java.lang.String _categoryColumn;

    /**
     * Field _group
     */
    private java.lang.String _group;

    /**
     * Field _resetGroup
     */
    private java.lang.String _resetGroup;

    /**
     * Field _title
     */
    private java.lang.String _title = "Chart Title";

    /**
     * Field _backgroundColor
     */
    private java.lang.String _backgroundColor = "#FFFFFF";

    /**
     * Field _isThreeDimensional
     */
    private boolean _isThreeDimensional = true;

    /**
     * keeps track of state for field: _isThreeDimensional
     */
    private boolean _has_isThreeDimensional;

    /**
     * Field _isStacked
     */
    private boolean _isStacked = false;

    /**
     * keeps track of state for field: _isStacked
     */
    private boolean _has_isStacked;

    /**
     * Field _isSummaryOnly
     */
    private boolean _isSummaryOnly = false;

    /**
     * keeps track of state for field: _isSummaryOnly
     */
    private boolean _has_isSummaryOnly;

    /**
     * Field _showLegend
     */
    private boolean _showLegend = true;

    /**
     * keeps track of state for field: _showLegend
     */
    private boolean _has_showLegend;

    /**
     * Field _drawLegendBorder
     */
    private boolean _drawLegendBorder = true;

    /**
     * keeps track of state for field: _drawLegendBorder
     */
    private boolean _has_drawLegendBorder;

    /**
     * Field _legendLocation
     */
    private org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation _legendLocation = org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation.valueOf("bottom");

    /**
     * Field _labelRotation
     */
    private int _labelRotation = 7;

    /**
     * keeps track of state for field: _labelRotation
     */
    private boolean _has_labelRotation;

    /**
     * Field _showBorder
     */
    private boolean _showBorder = false;

    /**
     * keeps track of state for field: _showBorder
     */
    private boolean _has_showBorder;

    /**
     * Field _isHorizontal
     */
    private boolean _isHorizontal = false;

    /**
     * keeps track of state for field: _isHorizontal
     */
    private boolean _has_isHorizontal;

    /**
     * Field _height
     */
    private int _height = 400;

    /**
     * keeps track of state for field: _height
     */
    private boolean _has_height;

    /**
     * Field _width
     */
    private int _width = 600;

    /**
     * keeps track of state for field: _width
     */
    private boolean _has_width;

    /**
     * Field _horizontalOffset
     */
    private int _horizontalOffset = 0;

    /**
     * keeps track of state for field: _horizontalOffset
     */
    private boolean _has_horizontalOffset;

    /**
     * Field _seriesList
     */
    private java.util.List _seriesList;

    /**
     * Field _valuesColumnList
     */
    private java.util.List _valuesColumnList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Chart() 
     {
        super();
        setType(org.pentaho.jfreereport.castormodel.reportspec.types.ChartType.valueOf("bar"));
        setTitle("Chart Title");
        setBackgroundColor("#FFFFFF");
        setLegendLocation(org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation.valueOf("bottom"));
        this._seriesList = new java.util.ArrayList();
        this._valuesColumnList = new java.util.ArrayList();
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Chart()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSeries
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSeries(org.pentaho.jfreereport.castormodel.reportspec.Series vSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        this._seriesList.add(vSeries);
    } //-- void addSeries(org.pentaho.jfreereport.castormodel.reportspec.Series) 

    /**
     * 
     * 
     * @param index
     * @param vSeries
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSeries(int index, org.pentaho.jfreereport.castormodel.reportspec.Series vSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        this._seriesList.add(index, vSeries);
    } //-- void addSeries(int, org.pentaho.jfreereport.castormodel.reportspec.Series) 

    /**
     * 
     * 
     * @param vValuesColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValuesColumn(java.lang.String vValuesColumn)
        throws java.lang.IndexOutOfBoundsException
    {
        this._valuesColumnList.add(vValuesColumn);
    } //-- void addValuesColumn(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vValuesColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValuesColumn(int index, java.lang.String vValuesColumn)
        throws java.lang.IndexOutOfBoundsException
    {
        this._valuesColumnList.add(index, vValuesColumn);
    } //-- void addValuesColumn(int, java.lang.String) 

    /**
     */
    public void deleteDrawLegendBorder()
    {
        this._has_drawLegendBorder= false;
    } //-- void deleteDrawLegendBorder() 

    /**
     */
    public void deleteHeight()
    {
        this._has_height= false;
    } //-- void deleteHeight() 

    /**
     */
    public void deleteHorizontalOffset()
    {
        this._has_horizontalOffset= false;
    } //-- void deleteHorizontalOffset() 

    /**
     */
    public void deleteIsHorizontal()
    {
        this._has_isHorizontal= false;
    } //-- void deleteIsHorizontal() 

    /**
     */
    public void deleteIsStacked()
    {
        this._has_isStacked= false;
    } //-- void deleteIsStacked() 

    /**
     */
    public void deleteIsSummaryOnly()
    {
        this._has_isSummaryOnly= false;
    } //-- void deleteIsSummaryOnly() 

    /**
     */
    public void deleteIsThreeDimensional()
    {
        this._has_isThreeDimensional= false;
    } //-- void deleteIsThreeDimensional() 

    /**
     */
    public void deleteLabelRotation()
    {
        this._has_labelRotation= false;
    } //-- void deleteLabelRotation() 

    /**
     */
    public void deleteShowBorder()
    {
        this._has_showBorder= false;
    } //-- void deleteShowBorder() 

    /**
     */
    public void deleteShowLegend()
    {
        this._has_showLegend= false;
    } //-- void deleteShowLegend() 

    /**
     */
    public void deleteWidth()
    {
        this._has_width= false;
    } //-- void deleteWidth() 

    /**
     * Method enumerateSeries
     * 
     * 
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateSeries()
    {
        return java.util.Collections.enumeration(this._seriesList);
    } //-- java.util.Enumeration enumerateSeries() 

    /**
     * Method enumerateValuesColumn
     * 
     * 
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateValuesColumn()
    {
        return java.util.Collections.enumeration(this._valuesColumnList);
    } //-- java.util.Enumeration enumerateValuesColumn() 

    /**
     * Returns the value of field 'backgroundColor'.
     * 
     * @return the value of field 'BackgroundColor'.
     */
    public java.lang.String getBackgroundColor()
    {
        return this._backgroundColor;
    } //-- java.lang.String getBackgroundColor() 

    /**
     * Returns the value of field 'categoryColumn'.
     * 
     * @return the value of field 'CategoryColumn'.
     */
    public java.lang.String getCategoryColumn()
    {
        return this._categoryColumn;
    } //-- java.lang.String getCategoryColumn() 

    /**
     * Returns the value of field 'drawLegendBorder'.
     * 
     * @return the value of field 'DrawLegendBorder'.
     */
    public boolean getDrawLegendBorder()
    {
        return this._drawLegendBorder;
    } //-- boolean getDrawLegendBorder() 

    /**
     * Returns the value of field 'group'.
     * 
     * @return the value of field 'Group'.
     */
    public java.lang.String getGroup()
    {
        return this._group;
    } //-- java.lang.String getGroup() 

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
     * Returns the value of field 'horizontalOffset'.
     * 
     * @return the value of field 'HorizontalOffset'.
     */
    public int getHorizontalOffset()
    {
        return this._horizontalOffset;
    } //-- int getHorizontalOffset() 

    /**
     * Returns the value of field 'isHorizontal'.
     * 
     * @return the value of field 'IsHorizontal'.
     */
    public boolean getIsHorizontal()
    {
        return this._isHorizontal;
    } //-- boolean getIsHorizontal() 

    /**
     * Returns the value of field 'isStacked'.
     * 
     * @return the value of field 'IsStacked'.
     */
    public boolean getIsStacked()
    {
        return this._isStacked;
    } //-- boolean getIsStacked() 

    /**
     * Returns the value of field 'isSummaryOnly'.
     * 
     * @return the value of field 'IsSummaryOnly'.
     */
    public boolean getIsSummaryOnly()
    {
        return this._isSummaryOnly;
    } //-- boolean getIsSummaryOnly() 

    /**
     * Returns the value of field 'isThreeDimensional'.
     * 
     * @return the value of field 'IsThreeDimensional'.
     */
    public boolean getIsThreeDimensional()
    {
        return this._isThreeDimensional;
    } //-- boolean getIsThreeDimensional() 

    /**
     * Returns the value of field 'labelRotation'.
     * 
     * @return the value of field 'LabelRotation'.
     */
    public int getLabelRotation()
    {
        return this._labelRotation;
    } //-- int getLabelRotation() 

    /**
     * Returns the value of field 'legendLocation'.
     * 
     * @return the value of field 'LegendLocation'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation getLegendLocation()
    {
        return this._legendLocation;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation getLegendLocation() 

    /**
     * Returns the value of field 'resetGroup'.
     * 
     * @return the value of field 'ResetGroup'.
     */
    public java.lang.String getResetGroup()
    {
        return this._resetGroup;
    } //-- java.lang.String getResetGroup() 

    /**
     * Method getSeries
     * 
     * 
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.pentaho.jfreereport.castormodel.reportspec.Series at the
     * given index
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Series getSeries(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._seriesList.size()) {
            throw new IndexOutOfBoundsException("getSeries: Index value '" + index + "' not in range [0.." + (this._seriesList.size() - 1) + "]");
        }
        
        return (org.pentaho.jfreereport.castormodel.reportspec.Series) _seriesList.get(index);
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Series getSeries(int) 

    /**
     * Method getSeries
     * 
     * 
     * 
     * @return this collection as an Array
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Series[] getSeries()
    {
        int size = this._seriesList.size();
        org.pentaho.jfreereport.castormodel.reportspec.Series[] array = new org.pentaho.jfreereport.castormodel.reportspec.Series[size];
        for (int index = 0; index < size; index++){
            array[index] = (org.pentaho.jfreereport.castormodel.reportspec.Series) _seriesList.get(index);
        }
        
        return array;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Series[] getSeries() 

    /**
     * Method getSeriesCount
     * 
     * 
     * 
     * @return the size of this collection
     */
    public int getSeriesCount()
    {
        return this._seriesList.size();
    } //-- int getSeriesCount() 

    /**
     * Returns the value of field 'showBorder'.
     * 
     * @return the value of field 'ShowBorder'.
     */
    public boolean getShowBorder()
    {
        return this._showBorder;
    } //-- boolean getShowBorder() 

    /**
     * Returns the value of field 'showLegend'.
     * 
     * @return the value of field 'ShowLegend'.
     */
    public boolean getShowLegend()
    {
        return this._showLegend;
    } //-- boolean getShowLegend() 

    /**
     * Returns the value of field 'title'.
     * 
     * @return the value of field 'Title'.
     */
    public java.lang.String getTitle()
    {
        return this._title;
    } //-- java.lang.String getTitle() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.types.ChartType getType()
    {
        return this._type;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.types.ChartType getType() 

    /**
     * Method getValuesColumn
     * 
     * 
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getValuesColumn(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._valuesColumnList.size()) {
            throw new IndexOutOfBoundsException("getValuesColumn: Index value '" + index + "' not in range [0.." + (this._valuesColumnList.size() - 1) + "]");
        }
        
        return (String)_valuesColumnList.get(index);
    } //-- java.lang.String getValuesColumn(int) 

    /**
     * Method getValuesColumn
     * 
     * 
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getValuesColumn()
    {
        int size = this._valuesColumnList.size();
        java.lang.String[] array = new java.lang.String[size];
        for (int index = 0; index < size; index++){
            array[index] = (String)_valuesColumnList.get(index);
        }
        
        return array;
    } //-- java.lang.String[] getValuesColumn() 

    /**
     * Method getValuesColumnCount
     * 
     * 
     * 
     * @return the size of this collection
     */
    public int getValuesColumnCount()
    {
        return this._valuesColumnList.size();
    } //-- int getValuesColumnCount() 

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
     * Method hasDrawLegendBorder
     * 
     * 
     * 
     * @return true if at least one DrawLegendBorder has been added
     */
    public boolean hasDrawLegendBorder()
    {
        return this._has_drawLegendBorder;
    } //-- boolean hasDrawLegendBorder() 

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
     * Method hasHorizontalOffset
     * 
     * 
     * 
     * @return true if at least one HorizontalOffset has been added
     */
    public boolean hasHorizontalOffset()
    {
        return this._has_horizontalOffset;
    } //-- boolean hasHorizontalOffset() 

    /**
     * Method hasIsHorizontal
     * 
     * 
     * 
     * @return true if at least one IsHorizontal has been added
     */
    public boolean hasIsHorizontal()
    {
        return this._has_isHorizontal;
    } //-- boolean hasIsHorizontal() 

    /**
     * Method hasIsStacked
     * 
     * 
     * 
     * @return true if at least one IsStacked has been added
     */
    public boolean hasIsStacked()
    {
        return this._has_isStacked;
    } //-- boolean hasIsStacked() 

    /**
     * Method hasIsSummaryOnly
     * 
     * 
     * 
     * @return true if at least one IsSummaryOnly has been added
     */
    public boolean hasIsSummaryOnly()
    {
        return this._has_isSummaryOnly;
    } //-- boolean hasIsSummaryOnly() 

    /**
     * Method hasIsThreeDimensional
     * 
     * 
     * 
     * @return true if at least one IsThreeDimensional has been adde
     */
    public boolean hasIsThreeDimensional()
    {
        return this._has_isThreeDimensional;
    } //-- boolean hasIsThreeDimensional() 

    /**
     * Method hasLabelRotation
     * 
     * 
     * 
     * @return true if at least one LabelRotation has been added
     */
    public boolean hasLabelRotation()
    {
        return this._has_labelRotation;
    } //-- boolean hasLabelRotation() 

    /**
     * Method hasShowBorder
     * 
     * 
     * 
     * @return true if at least one ShowBorder has been added
     */
    public boolean hasShowBorder()
    {
        return this._has_showBorder;
    } //-- boolean hasShowBorder() 

    /**
     * Method hasShowLegend
     * 
     * 
     * 
     * @return true if at least one ShowLegend has been added
     */
    public boolean hasShowLegend()
    {
        return this._has_showLegend;
    } //-- boolean hasShowLegend() 

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
     * Returns the value of field 'drawLegendBorder'.
     * 
     * @return the value of field 'DrawLegendBorder'.
     */
    public boolean isDrawLegendBorder()
    {
        return this._drawLegendBorder;
    } //-- boolean isDrawLegendBorder() 

    /**
     * Returns the value of field 'isHorizontal'.
     * 
     * @return the value of field 'IsHorizontal'.
     */
    public boolean isIsHorizontal()
    {
        return this._isHorizontal;
    } //-- boolean isIsHorizontal() 

    /**
     * Returns the value of field 'isStacked'.
     * 
     * @return the value of field 'IsStacked'.
     */
    public boolean isIsStacked()
    {
        return this._isStacked;
    } //-- boolean isIsStacked() 

    /**
     * Returns the value of field 'isSummaryOnly'.
     * 
     * @return the value of field 'IsSummaryOnly'.
     */
    public boolean isIsSummaryOnly()
    {
        return this._isSummaryOnly;
    } //-- boolean isIsSummaryOnly() 

    /**
     * Returns the value of field 'isThreeDimensional'.
     * 
     * @return the value of field 'IsThreeDimensional'.
     */
    public boolean isIsThreeDimensional()
    {
        return this._isThreeDimensional;
    } //-- boolean isIsThreeDimensional() 

    /**
     * Returns the value of field 'showBorder'.
     * 
     * @return the value of field 'ShowBorder'.
     */
    public boolean isShowBorder()
    {
        return this._showBorder;
    } //-- boolean isShowBorder() 

    /**
     * Returns the value of field 'showLegend'.
     * 
     * @return the value of field 'ShowLegend'.
     */
    public boolean isShowLegend()
    {
        return this._showLegend;
    } //-- boolean isShowLegend() 

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
     * Method iterateSeries
     * 
     * 
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateSeries()
    {
        return this._seriesList.iterator();
    } //-- java.util.Iterator iterateSeries() 

    /**
     * Method iterateValuesColumn
     * 
     * 
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateValuesColumn()
    {
        return this._valuesColumnList.iterator();
    } //-- java.util.Iterator iterateValuesColumn() 

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
     */
    public void removeAllSeries()
    {
        this._seriesList.clear();
    } //-- void removeAllSeries() 

    /**
     */
    public void removeAllValuesColumn()
    {
        this._valuesColumnList.clear();
    } //-- void removeAllValuesColumn() 

    /**
     * Method removeSeries
     * 
     * 
     * 
     * @param vSeries
     * @return true if the object was removed from the collection.
     */
    public boolean removeSeries(org.pentaho.jfreereport.castormodel.reportspec.Series vSeries)
    {
        boolean removed = _seriesList.remove(vSeries);
        return removed;
    } //-- boolean removeSeries(org.pentaho.jfreereport.castormodel.reportspec.Series) 

    /**
     * Method removeSeriesAt
     * 
     * 
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Series removeSeriesAt(int index)
    {
        Object obj = this._seriesList.remove(index);
        return (org.pentaho.jfreereport.castormodel.reportspec.Series) obj;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Series removeSeriesAt(int) 

    /**
     * Method removeValuesColumn
     * 
     * 
     * 
     * @param vValuesColumn
     * @return true if the object was removed from the collection.
     */
    public boolean removeValuesColumn(java.lang.String vValuesColumn)
    {
        boolean removed = _valuesColumnList.remove(vValuesColumn);
        return removed;
    } //-- boolean removeValuesColumn(java.lang.String) 

    /**
     * Method removeValuesColumnAt
     * 
     * 
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeValuesColumnAt(int index)
    {
        Object obj = this._valuesColumnList.remove(index);
        return (String)obj;
    } //-- java.lang.String removeValuesColumnAt(int) 

    /**
     * Sets the value of field 'backgroundColor'.
     * 
     * @param backgroundColor the value of field 'backgroundColor'.
     */
    public void setBackgroundColor(java.lang.String backgroundColor)
    {
        this._backgroundColor = backgroundColor;
    } //-- void setBackgroundColor(java.lang.String) 

    /**
     * Sets the value of field 'categoryColumn'.
     * 
     * @param categoryColumn the value of field 'categoryColumn'.
     */
    public void setCategoryColumn(java.lang.String categoryColumn)
    {
        this._categoryColumn = categoryColumn;
    } //-- void setCategoryColumn(java.lang.String) 

    /**
     * Sets the value of field 'drawLegendBorder'.
     * 
     * @param drawLegendBorder the value of field 'drawLegendBorder'
     */
    public void setDrawLegendBorder(boolean drawLegendBorder)
    {
        this._drawLegendBorder = drawLegendBorder;
        this._has_drawLegendBorder = true;
    } //-- void setDrawLegendBorder(boolean) 

    /**
     * Sets the value of field 'group'.
     * 
     * @param group the value of field 'group'.
     */
    public void setGroup(java.lang.String group)
    {
        this._group = group;
    } //-- void setGroup(java.lang.String) 

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
     * Sets the value of field 'horizontalOffset'.
     * 
     * @param horizontalOffset the value of field 'horizontalOffset'
     */
    public void setHorizontalOffset(int horizontalOffset)
    {
        this._horizontalOffset = horizontalOffset;
        this._has_horizontalOffset = true;
    } //-- void setHorizontalOffset(int) 

    /**
     * Sets the value of field 'isHorizontal'.
     * 
     * @param isHorizontal the value of field 'isHorizontal'.
     */
    public void setIsHorizontal(boolean isHorizontal)
    {
        this._isHorizontal = isHorizontal;
        this._has_isHorizontal = true;
    } //-- void setIsHorizontal(boolean) 

    /**
     * Sets the value of field 'isStacked'.
     * 
     * @param isStacked the value of field 'isStacked'.
     */
    public void setIsStacked(boolean isStacked)
    {
        this._isStacked = isStacked;
        this._has_isStacked = true;
    } //-- void setIsStacked(boolean) 

    /**
     * Sets the value of field 'isSummaryOnly'.
     * 
     * @param isSummaryOnly the value of field 'isSummaryOnly'.
     */
    public void setIsSummaryOnly(boolean isSummaryOnly)
    {
        this._isSummaryOnly = isSummaryOnly;
        this._has_isSummaryOnly = true;
    } //-- void setIsSummaryOnly(boolean) 

    /**
     * Sets the value of field 'isThreeDimensional'.
     * 
     * @param isThreeDimensional the value of field
     * 'isThreeDimensional'.
     */
    public void setIsThreeDimensional(boolean isThreeDimensional)
    {
        this._isThreeDimensional = isThreeDimensional;
        this._has_isThreeDimensional = true;
    } //-- void setIsThreeDimensional(boolean) 

    /**
     * Sets the value of field 'labelRotation'.
     * 
     * @param labelRotation the value of field 'labelRotation'.
     */
    public void setLabelRotation(int labelRotation)
    {
        this._labelRotation = labelRotation;
        this._has_labelRotation = true;
    } //-- void setLabelRotation(int) 

    /**
     * Sets the value of field 'legendLocation'.
     * 
     * @param legendLocation the value of field 'legendLocation'.
     */
    public void setLegendLocation(org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation legendLocation)
    {
        this._legendLocation = legendLocation;
    } //-- void setLegendLocation(org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation) 

    /**
     * Sets the value of field 'resetGroup'.
     * 
     * @param resetGroup the value of field 'resetGroup'.
     */
    public void setResetGroup(java.lang.String resetGroup)
    {
        this._resetGroup = resetGroup;
    } //-- void setResetGroup(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vSeries
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSeries(int index, org.pentaho.jfreereport.castormodel.reportspec.Series vSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._seriesList.size()) {
            throw new IndexOutOfBoundsException("setSeries: Index value '" + index + "' not in range [0.." + (this._seriesList.size() - 1) + "]");
        }
        
        this._seriesList.set(index, vSeries);
    } //-- void setSeries(int, org.pentaho.jfreereport.castormodel.reportspec.Series) 

    /**
     * 
     * 
     * @param vSeriesArray
     */
    public void setSeries(org.pentaho.jfreereport.castormodel.reportspec.Series[] vSeriesArray)
    {
        //-- copy array
        _seriesList.clear();
        
        for (int i = 0; i < vSeriesArray.length; i++) {
                this._seriesList.add(vSeriesArray[i]);
        }
    } //-- void setSeries(org.pentaho.jfreereport.castormodel.reportspec.Series) 

    /**
     * Sets the value of field 'showBorder'.
     * 
     * @param showBorder the value of field 'showBorder'.
     */
    public void setShowBorder(boolean showBorder)
    {
        this._showBorder = showBorder;
        this._has_showBorder = true;
    } //-- void setShowBorder(boolean) 

    /**
     * Sets the value of field 'showLegend'.
     * 
     * @param showLegend the value of field 'showLegend'.
     */
    public void setShowLegend(boolean showLegend)
    {
        this._showLegend = showLegend;
        this._has_showLegend = true;
    } //-- void setShowLegend(boolean) 

    /**
     * Sets the value of field 'title'.
     * 
     * @param title the value of field 'title'.
     */
    public void setTitle(java.lang.String title)
    {
        this._title = title;
    } //-- void setTitle(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(org.pentaho.jfreereport.castormodel.reportspec.types.ChartType type)
    {
        this._type = type;
    } //-- void setType(org.pentaho.jfreereport.castormodel.reportspec.types.ChartType) 

    /**
     * 
     * 
     * @param index
     * @param vValuesColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setValuesColumn(int index, java.lang.String vValuesColumn)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._valuesColumnList.size()) {
            throw new IndexOutOfBoundsException("setValuesColumn: Index value '" + index + "' not in range [0.." + (this._valuesColumnList.size() - 1) + "]");
        }
        
        this._valuesColumnList.set(index, vValuesColumn);
    } //-- void setValuesColumn(int, java.lang.String) 

    /**
     * 
     * 
     * @param vValuesColumnArray
     */
    public void setValuesColumn(java.lang.String[] vValuesColumnArray)
    {
        //-- copy array
        _valuesColumnList.clear();
        
        for (int i = 0; i < vValuesColumnArray.length; i++) {
                this._valuesColumnList.add(vValuesColumnArray[i]);
        }
    } //-- void setValuesColumn(java.lang.String) 

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
     * org.pentaho.jfreereport.castormodel.reportspec.Chart
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.Chart unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.pentaho.jfreereport.castormodel.reportspec.Chart) Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.Chart.class, reader);
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Chart unmarshal(java.io.Reader) 

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
