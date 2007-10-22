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
 * Class ReportSpec.
 * 
 * @version $Revision$ $Date$
 */
public class ReportSpec implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tool
     */
    private java.lang.String _tool;

    /**
     * Field _toolVersion
     */
    private java.lang.String _toolVersion;

    /**
     * Field _templateName
     */
    private java.lang.String _templateName;

    /**
     * Field _reportSpecChoice
     */
    private org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice _reportSpecChoice;

    /**
     * Field _chart
     */
    private org.pentaho.jfreereport.castormodel.reportspec.Chart _chart;

    /**
     * Field _useChart
     */
    private boolean _useChart = false;

    /**
     * keeps track of state for field: _useChart
     */
    private boolean _has_useChart;

    /**
     * Field _reportName
     */
    private java.lang.String _reportName = "JFreeReport-WizardReport";

    /**
     * Field _reportDesc
     */
    private java.lang.String _reportDesc = "Description";

    /**
     * Field _isMQL
     */
    private boolean _isMQL = false;

    /**
     * keeps track of state for field: _isMQL
     */
    private boolean _has_isMQL;

    /**
     * Field _xmiPath
     */
    private java.lang.String _xmiPath;

    /**
     * Field _isMDX
     */
    private boolean _isMDX = false;

    /**
     * keeps track of state for field: _isMDX
     */
    private boolean _has_isMDX;

    /**
     * Field _mondrianCubeDefinitionPath
     */
    private java.lang.String _mondrianCubeDefinitionPath;

    /**
     * Field _kettleStep
     */
    private java.lang.String _kettleStep;

    /**
     * Field _query
     */
    private java.lang.String _query = "";

    /**
     * Field _mqlQuery
     */
    private java.lang.String _mqlQuery = "";

    /**
     * Field _includeSrc
     */
    private java.lang.String _includeSrc;

    /**
     * Field _templateSrc
     */
    private java.lang.String _templateSrc;

    /**
     * Field _fieldMappingList
     */
    private java.util.List _fieldMappingList;

    /**
     * Field _watermark
     */
    private org.pentaho.jfreereport.castormodel.reportspec.Watermark _watermark;

    /**
     * Field _pageFormat
     */
    private java.lang.String _pageFormat = "LETTER";

    /**
     * Field _useCustomPageFormat
     */
    private boolean _useCustomPageFormat = false;

    /**
     * keeps track of state for field: _useCustomPageFormat
     */
    private boolean _has_useCustomPageFormat;

    /**
     * Field _customPageFormatWidth
     */
    private int _customPageFormatWidth;

    /**
     * keeps track of state for field: _customPageFormatWidth
     */
    private boolean _has_customPageFormatWidth;

    /**
     * Field _customPageFormatHeight
     */
    private int _customPageFormatHeight;

    /**
     * keeps track of state for field: _customPageFormatHeight
     */
    private boolean _has_customPageFormatHeight;

    /**
     * Field _orientation
     */
    private java.lang.String _orientation = "landscape";

    /**
     * Field _useRowBanding
     */
    private boolean _useRowBanding = true;

    /**
     * keeps track of state for field: _useRowBanding
     */
    private boolean _has_useRowBanding;

    /**
     * Field _rowBandingColor
     */
    private java.lang.String _rowBandingColor = "#E0E0E0";

    /**
     * Field _rowBandingInitialState
     */
    private boolean _rowBandingInitialState = true;

    /**
     * keeps track of state for field: _rowBandingInitialState
     */
    private boolean _has_rowBandingInitialState;

    /**
     * Field _useExpressionUnderlining
     */
    private boolean _useExpressionUnderlining;

    /**
     * keeps track of state for field: _useExpressionUnderlining
     */
    private boolean _has_useExpressionUnderlining;

    /**
     * Field _doubleUnderlineExpression
     */
    private boolean _doubleUnderlineExpression;

    /**
     * keeps track of state for field: _doubleUnderlineExpression
     */
    private boolean _has_doubleUnderlineExpression;

    /**
     * Field _useMasterDetail
     */
    private boolean _useMasterDetail = false;

    /**
     * keeps track of state for field: _useMasterDetail
     */
    private boolean _has_useMasterDetail;

    /**
     * Field _useMasterDetailGridlines
     */
    private boolean _useMasterDetailGridlines = true;

    /**
     * keeps track of state for field: _useMasterDetailGridlines
     */
    private boolean _has_useMasterDetailGridlines;

    /**
     * Field _useMasterDetailBanding
     */
    private boolean _useMasterDetailBanding = true;

    /**
     * keeps track of state for field: _useMasterDetailBanding
     */
    private boolean _has_useMasterDetailBanding;

    /**
     * Field _generateReportLevelColumnHeaders
     */
    private boolean _generateReportLevelColumnHeaders = false;

    /**
     * keeps track of state for field:
     * _generateReportLevelColumnHeaders
     */
    private boolean _has_generateReportLevelColumnHeaders;

    /**
     * Field _useColumnHeaderBackgroundColor
     */
    private boolean _useColumnHeaderBackgroundColor = true;

    /**
     * keeps track of state for field:
     * _useColumnHeaderBackgroundColor
     */
    private boolean _has_useColumnHeaderBackgroundColor;

    /**
     * Field _columnHeaderBackgroundColor
     */
    private java.lang.String _columnHeaderBackgroundColor = "#C0C0C0";

    /**
     * Field _columnHeaderHeight
     */
    private int _columnHeaderHeight = 18;

    /**
     * keeps track of state for field: _columnHeaderHeight
     */
    private boolean _has_columnHeaderHeight;

    /**
     * Field _calculateGrandTotals
     */
    private boolean _calculateGrandTotals = true;

    /**
     * keeps track of state for field: _calculateGrandTotals
     */
    private boolean _has_calculateGrandTotals;

    /**
     * Field _grandTotalsLabel
     */
    private java.lang.String _grandTotalsLabel = "Grand Total";

    /**
     * Field _grandTotalsHorizontalAlignment
     */
    private java.lang.String _grandTotalsHorizontalAlignment = "left";

    /**
     * Field _useDummyGroupFooterBackgroundColor
     */
    private boolean _useDummyGroupFooterBackgroundColor = true;

    /**
     * keeps track of state for field:
     * _useDummyGroupFooterBackgroundColor
     */
    private boolean _has_useDummyGroupFooterBackgroundColor;

    /**
     * Field _dummyGroupFooterBackgroundColor
     */
    private java.lang.String _dummyGroupFooterBackgroundColor = "#e0d0c0";

    /**
     * Field _useHorizontalGridlines
     */
    private boolean _useHorizontalGridlines = false;

    /**
     * keeps track of state for field: _useHorizontalGridlines
     */
    private boolean _has_useHorizontalGridlines;

    /**
     * Field _useVerticalGridlines
     */
    private boolean _useVerticalGridlines = false;

    /**
     * keeps track of state for field: _useVerticalGridlines
     */
    private boolean _has_useVerticalGridlines;

    /**
     * Field _horizontalGridlinesColor
     */
    private java.lang.String _horizontalGridlinesColor = "#000000";

    /**
     * Field _verticalGridlinesColor
     */
    private java.lang.String _verticalGridlinesColor = "#000000";

    /**
     * Field _groupHeaderFontName
     */
    private java.lang.String _groupHeaderFontName = "SansSerif";

    /**
     * Field _groupHeaderFontStyle
     */
    private int _groupHeaderFontStyle = 1;

    /**
     * keeps track of state for field: _groupHeaderFontStyle
     */
    private boolean _has_groupHeaderFontStyle;

    /**
     * Field _groupHeaderFontSize
     */
    private int _groupHeaderFontSize = 11;

    /**
     * keeps track of state for field: _groupHeaderFontSize
     */
    private boolean _has_groupHeaderFontSize;

    /**
     * Field _groupHeaderFontColor
     */
    private java.lang.String _groupHeaderFontColor = "#000000";

    /**
     * Field _groupFooterFontName
     */
    private java.lang.String _groupFooterFontName = "SansSerif";

    /**
     * Field _groupFooterFontStyle
     */
    private int _groupFooterFontStyle = 1;

    /**
     * keeps track of state for field: _groupFooterFontStyle
     */
    private boolean _has_groupFooterFontStyle;

    /**
     * Field _groupFooterFontSize
     */
    private int _groupFooterFontSize = 11;

    /**
     * keeps track of state for field: _groupFooterFontSize
     */
    private boolean _has_groupFooterFontSize;

    /**
     * Field _groupFooterFontColor
     */
    private java.lang.String _groupFooterFontColor = "#000000";

    /**
     * Field _columnHeaderFontName
     */
    private java.lang.String _columnHeaderFontName = "SansSerif";

    /**
     * Field _columnHeaderFontStyle
     */
    private int _columnHeaderFontStyle = 1;

    /**
     * keeps track of state for field: _columnHeaderFontStyle
     */
    private boolean _has_columnHeaderFontStyle;

    /**
     * Field _columnHeaderFontSize
     */
    private int _columnHeaderFontSize = 12;

    /**
     * keeps track of state for field: _columnHeaderFontSize
     */
    private boolean _has_columnHeaderFontSize;

    /**
     * Field _columnHeaderFontColor
     */
    private java.lang.String _columnHeaderFontColor = "#000000";

    /**
     * Field _columnHeaderGap
     */
    private int _columnHeaderGap = 2;

    /**
     * keeps track of state for field: _columnHeaderGap
     */
    private boolean _has_columnHeaderGap;

    /**
     * Field _columnHeaderTopGap
     */
    private int _columnHeaderTopGap = 2;

    /**
     * keeps track of state for field: _columnHeaderTopGap
     */
    private boolean _has_columnHeaderTopGap;

    /**
     * Field _itemsFontName
     */
    private java.lang.String _itemsFontName = "SansSerif";

    /**
     * Field _itemsFontStyle
     */
    private int _itemsFontStyle = 1;

    /**
     * keeps track of state for field: _itemsFontStyle
     */
    private boolean _has_itemsFontStyle;

    /**
     * Field _itemsFontSize
     */
    private int _itemsFontSize = 9;

    /**
     * keeps track of state for field: _itemsFontSize
     */
    private boolean _has_itemsFontSize;

    /**
     * Field _itemsFontColor
     */
    private java.lang.String _itemsFontColor = "#000000";

    /**
     * Field _horizontalOffset
     */
    private int _horizontalOffset = 0;

    /**
     * keeps track of state for field: _horizontalOffset
     */
    private boolean _has_horizontalOffset;

    /**
     * Field _leftMargin
     */
    private int _leftMargin = 10;

    /**
     * keeps track of state for field: _leftMargin
     */
    private boolean _has_leftMargin;

    /**
     * Field _rightMargin
     */
    private int _rightMargin = 10;

    /**
     * keeps track of state for field: _rightMargin
     */
    private boolean _has_rightMargin;

    /**
     * Field _topMargin
     */
    private int _topMargin = 10;

    /**
     * keeps track of state for field: _topMargin
     */
    private boolean _has_topMargin;

    /**
     * Field _bottomMargin
     */
    private int _bottomMargin = 10;

    /**
     * keeps track of state for field: _bottomMargin
     */
    private boolean _has_bottomMargin;

    /**
     * Field _fieldList
     */
    private java.util.List _fieldList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportSpec() 
     {
        super();
        setReportName("JFreeReport-WizardReport");
        setReportDesc("Description");
        setQuery("");
        setMqlQuery("");
        this._fieldMappingList = new java.util.ArrayList();
        setPageFormat("LETTER");
        setOrientation("landscape");
        setRowBandingColor("#E0E0E0");
        setColumnHeaderBackgroundColor("#C0C0C0");
        setGrandTotalsLabel("Grand Total");
        setGrandTotalsHorizontalAlignment("left");
        setDummyGroupFooterBackgroundColor("#e0d0c0");
        setHorizontalGridlinesColor("#000000");
        setVerticalGridlinesColor("#000000");
        setGroupHeaderFontName("SansSerif");
        setGroupHeaderFontColor("#000000");
        setGroupFooterFontName("SansSerif");
        setGroupFooterFontColor("#000000");
        setColumnHeaderFontName("SansSerif");
        setColumnHeaderFontColor("#000000");
        setItemsFontName("SansSerif");
        setItemsFontColor("#000000");
        this._fieldList = new java.util.ArrayList();
    } //-- org.pentaho.jfreereport.castormodel.reportspec.ReportSpec()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vField
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addField(org.pentaho.jfreereport.castormodel.reportspec.Field vField)
        throws java.lang.IndexOutOfBoundsException
    {
        this._fieldList.add(vField);
    } //-- void addField(org.pentaho.jfreereport.castormodel.reportspec.Field) 

    /**
     * 
     * 
     * @param index
     * @param vField
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addField(int index, org.pentaho.jfreereport.castormodel.reportspec.Field vField)
        throws java.lang.IndexOutOfBoundsException
    {
        this._fieldList.add(index, vField);
    } //-- void addField(int, org.pentaho.jfreereport.castormodel.reportspec.Field) 

    /**
     * 
     * 
     * @param vFieldMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFieldMapping(org.pentaho.jfreereport.castormodel.reportspec.FieldMapping vFieldMapping)
        throws java.lang.IndexOutOfBoundsException
    {
        this._fieldMappingList.add(vFieldMapping);
    } //-- void addFieldMapping(org.pentaho.jfreereport.castormodel.reportspec.FieldMapping) 

    /**
     * 
     * 
     * @param index
     * @param vFieldMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFieldMapping(int index, org.pentaho.jfreereport.castormodel.reportspec.FieldMapping vFieldMapping)
        throws java.lang.IndexOutOfBoundsException
    {
        this._fieldMappingList.add(index, vFieldMapping);
    } //-- void addFieldMapping(int, org.pentaho.jfreereport.castormodel.reportspec.FieldMapping) 

    /**
     */
    public void deleteBottomMargin()
    {
        this._has_bottomMargin= false;
    } //-- void deleteBottomMargin() 

    /**
     */
    public void deleteCalculateGrandTotals()
    {
        this._has_calculateGrandTotals= false;
    } //-- void deleteCalculateGrandTotals() 

    /**
     */
    public void deleteColumnHeaderFontSize()
    {
        this._has_columnHeaderFontSize= false;
    } //-- void deleteColumnHeaderFontSize() 

    /**
     */
    public void deleteColumnHeaderFontStyle()
    {
        this._has_columnHeaderFontStyle= false;
    } //-- void deleteColumnHeaderFontStyle() 

    /**
     */
    public void deleteColumnHeaderGap()
    {
        this._has_columnHeaderGap= false;
    } //-- void deleteColumnHeaderGap() 

    /**
     */
    public void deleteColumnHeaderHeight()
    {
        this._has_columnHeaderHeight= false;
    } //-- void deleteColumnHeaderHeight() 

    /**
     */
    public void deleteColumnHeaderTopGap()
    {
        this._has_columnHeaderTopGap= false;
    } //-- void deleteColumnHeaderTopGap() 

    /**
     */
    public void deleteCustomPageFormatHeight()
    {
        this._has_customPageFormatHeight= false;
    } //-- void deleteCustomPageFormatHeight() 

    /**
     */
    public void deleteCustomPageFormatWidth()
    {
        this._has_customPageFormatWidth= false;
    } //-- void deleteCustomPageFormatWidth() 

    /**
     */
    public void deleteDoubleUnderlineExpression()
    {
        this._has_doubleUnderlineExpression= false;
    } //-- void deleteDoubleUnderlineExpression() 

    /**
     */
    public void deleteGenerateReportLevelColumnHeaders()
    {
        this._has_generateReportLevelColumnHeaders= false;
    } //-- void deleteGenerateReportLevelColumnHeaders() 

    /**
     */
    public void deleteGroupFooterFontSize()
    {
        this._has_groupFooterFontSize= false;
    } //-- void deleteGroupFooterFontSize() 

    /**
     */
    public void deleteGroupFooterFontStyle()
    {
        this._has_groupFooterFontStyle= false;
    } //-- void deleteGroupFooterFontStyle() 

    /**
     */
    public void deleteGroupHeaderFontSize()
    {
        this._has_groupHeaderFontSize= false;
    } //-- void deleteGroupHeaderFontSize() 

    /**
     */
    public void deleteGroupHeaderFontStyle()
    {
        this._has_groupHeaderFontStyle= false;
    } //-- void deleteGroupHeaderFontStyle() 

    /**
     */
    public void deleteHorizontalOffset()
    {
        this._has_horizontalOffset= false;
    } //-- void deleteHorizontalOffset() 

    /**
     */
    public void deleteIsMDX()
    {
        this._has_isMDX= false;
    } //-- void deleteIsMDX() 

    /**
     */
    public void deleteIsMQL()
    {
        this._has_isMQL= false;
    } //-- void deleteIsMQL() 

    /**
     */
    public void deleteItemsFontSize()
    {
        this._has_itemsFontSize= false;
    } //-- void deleteItemsFontSize() 

    /**
     */
    public void deleteItemsFontStyle()
    {
        this._has_itemsFontStyle= false;
    } //-- void deleteItemsFontStyle() 

    /**
     */
    public void deleteLeftMargin()
    {
        this._has_leftMargin= false;
    } //-- void deleteLeftMargin() 

    /**
     */
    public void deleteRightMargin()
    {
        this._has_rightMargin= false;
    } //-- void deleteRightMargin() 

    /**
     */
    public void deleteRowBandingInitialState()
    {
        this._has_rowBandingInitialState= false;
    } //-- void deleteRowBandingInitialState() 

    /**
     */
    public void deleteTopMargin()
    {
        this._has_topMargin= false;
    } //-- void deleteTopMargin() 

    /**
     */
    public void deleteUseChart()
    {
        this._has_useChart= false;
    } //-- void deleteUseChart() 

    /**
     */
    public void deleteUseColumnHeaderBackgroundColor()
    {
        this._has_useColumnHeaderBackgroundColor= false;
    } //-- void deleteUseColumnHeaderBackgroundColor() 

    /**
     */
    public void deleteUseCustomPageFormat()
    {
        this._has_useCustomPageFormat= false;
    } //-- void deleteUseCustomPageFormat() 

    /**
     */
    public void deleteUseDummyGroupFooterBackgroundColor()
    {
        this._has_useDummyGroupFooterBackgroundColor= false;
    } //-- void deleteUseDummyGroupFooterBackgroundColor() 

    /**
     */
    public void deleteUseExpressionUnderlining()
    {
        this._has_useExpressionUnderlining= false;
    } //-- void deleteUseExpressionUnderlining() 

    /**
     */
    public void deleteUseHorizontalGridlines()
    {
        this._has_useHorizontalGridlines= false;
    } //-- void deleteUseHorizontalGridlines() 

    /**
     */
    public void deleteUseMasterDetail()
    {
        this._has_useMasterDetail= false;
    } //-- void deleteUseMasterDetail() 

    /**
     */
    public void deleteUseMasterDetailBanding()
    {
        this._has_useMasterDetailBanding= false;
    } //-- void deleteUseMasterDetailBanding() 

    /**
     */
    public void deleteUseMasterDetailGridlines()
    {
        this._has_useMasterDetailGridlines= false;
    } //-- void deleteUseMasterDetailGridlines() 

    /**
     */
    public void deleteUseRowBanding()
    {
        this._has_useRowBanding= false;
    } //-- void deleteUseRowBanding() 

    /**
     */
    public void deleteUseVerticalGridlines()
    {
        this._has_useVerticalGridlines= false;
    } //-- void deleteUseVerticalGridlines() 

    /**
     * Method enumerateField
     * 
     * 
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateField()
    {
        return java.util.Collections.enumeration(this._fieldList);
    } //-- java.util.Enumeration enumerateField() 

    /**
     * Method enumerateFieldMapping
     * 
     * 
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateFieldMapping()
    {
        return java.util.Collections.enumeration(this._fieldMappingList);
    } //-- java.util.Enumeration enumerateFieldMapping() 

    /**
     * Returns the value of field 'bottomMargin'.
     * 
     * @return the value of field 'BottomMargin'.
     */
    public int getBottomMargin()
    {
        return this._bottomMargin;
    } //-- int getBottomMargin() 

    /**
     * Returns the value of field 'calculateGrandTotals'.
     * 
     * @return the value of field 'CalculateGrandTotals'.
     */
    public boolean getCalculateGrandTotals()
    {
        return this._calculateGrandTotals;
    } //-- boolean getCalculateGrandTotals() 

    /**
     * Returns the value of field 'chart'.
     * 
     * @return the value of field 'Chart'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Chart getChart()
    {
        return this._chart;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Chart getChart() 

    /**
     * Returns the value of field 'columnHeaderBackgroundColor'.
     * 
     * @return the value of field 'ColumnHeaderBackgroundColor'.
     */
    public java.lang.String getColumnHeaderBackgroundColor()
    {
        return this._columnHeaderBackgroundColor;
    } //-- java.lang.String getColumnHeaderBackgroundColor() 

    /**
     * Returns the value of field 'columnHeaderFontColor'.
     * 
     * @return the value of field 'ColumnHeaderFontColor'.
     */
    public java.lang.String getColumnHeaderFontColor()
    {
        return this._columnHeaderFontColor;
    } //-- java.lang.String getColumnHeaderFontColor() 

    /**
     * Returns the value of field 'columnHeaderFontName'.
     * 
     * @return the value of field 'ColumnHeaderFontName'.
     */
    public java.lang.String getColumnHeaderFontName()
    {
        return this._columnHeaderFontName;
    } //-- java.lang.String getColumnHeaderFontName() 

    /**
     * Returns the value of field 'columnHeaderFontSize'.
     * 
     * @return the value of field 'ColumnHeaderFontSize'.
     */
    public int getColumnHeaderFontSize()
    {
        return this._columnHeaderFontSize;
    } //-- int getColumnHeaderFontSize() 

    /**
     * Returns the value of field 'columnHeaderFontStyle'.
     * 
     * @return the value of field 'ColumnHeaderFontStyle'.
     */
    public int getColumnHeaderFontStyle()
    {
        return this._columnHeaderFontStyle;
    } //-- int getColumnHeaderFontStyle() 

    /**
     * Returns the value of field 'columnHeaderGap'.
     * 
     * @return the value of field 'ColumnHeaderGap'.
     */
    public int getColumnHeaderGap()
    {
        return this._columnHeaderGap;
    } //-- int getColumnHeaderGap() 

    /**
     * Returns the value of field 'columnHeaderHeight'.
     * 
     * @return the value of field 'ColumnHeaderHeight'.
     */
    public int getColumnHeaderHeight()
    {
        return this._columnHeaderHeight;
    } //-- int getColumnHeaderHeight() 

    /**
     * Returns the value of field 'columnHeaderTopGap'.
     * 
     * @return the value of field 'ColumnHeaderTopGap'.
     */
    public int getColumnHeaderTopGap()
    {
        return this._columnHeaderTopGap;
    } //-- int getColumnHeaderTopGap() 

    /**
     * Returns the value of field 'customPageFormatHeight'.
     * 
     * @return the value of field 'CustomPageFormatHeight'.
     */
    public int getCustomPageFormatHeight()
    {
        return this._customPageFormatHeight;
    } //-- int getCustomPageFormatHeight() 

    /**
     * Returns the value of field 'customPageFormatWidth'.
     * 
     * @return the value of field 'CustomPageFormatWidth'.
     */
    public int getCustomPageFormatWidth()
    {
        return this._customPageFormatWidth;
    } //-- int getCustomPageFormatWidth() 

    /**
     * Returns the value of field 'doubleUnderlineExpression'.
     * 
     * @return the value of field 'DoubleUnderlineExpression'.
     */
    public boolean getDoubleUnderlineExpression()
    {
        return this._doubleUnderlineExpression;
    } //-- boolean getDoubleUnderlineExpression() 

    /**
     * Returns the value of field
     * 'dummyGroupFooterBackgroundColor'.
     * 
     * @return the value of field 'DummyGroupFooterBackgroundColor'.
     */
    public java.lang.String getDummyGroupFooterBackgroundColor()
    {
        return this._dummyGroupFooterBackgroundColor;
    } //-- java.lang.String getDummyGroupFooterBackgroundColor() 

    /**
     * Method getField
     * 
     * 
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.pentaho.jfreereport.castormodel.reportspec.Field at the
     * given index
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Field getField(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._fieldList.size()) {
            throw new IndexOutOfBoundsException("getField: Index value '" + index + "' not in range [0.." + (this._fieldList.size() - 1) + "]");
        }
        
        return (org.pentaho.jfreereport.castormodel.reportspec.Field) _fieldList.get(index);
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Field getField(int) 

    /**
     * Method getField
     * 
     * 
     * 
     * @return this collection as an Array
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Field[] getField()
    {
        int size = this._fieldList.size();
        org.pentaho.jfreereport.castormodel.reportspec.Field[] array = new org.pentaho.jfreereport.castormodel.reportspec.Field[size];
        for (int index = 0; index < size; index++){
            array[index] = (org.pentaho.jfreereport.castormodel.reportspec.Field) _fieldList.get(index);
        }
        
        return array;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Field[] getField() 

    /**
     * Method getFieldCount
     * 
     * 
     * 
     * @return the size of this collection
     */
    public int getFieldCount()
    {
        return this._fieldList.size();
    } //-- int getFieldCount() 

    /**
     * Method getFieldMapping
     * 
     * 
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.pentaho.jfreereport.castormodel.reportspec.FieldMapping
     * at the given index
     */
    public org.pentaho.jfreereport.castormodel.reportspec.FieldMapping getFieldMapping(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._fieldMappingList.size()) {
            throw new IndexOutOfBoundsException("getFieldMapping: Index value '" + index + "' not in range [0.." + (this._fieldMappingList.size() - 1) + "]");
        }
        
        return (org.pentaho.jfreereport.castormodel.reportspec.FieldMapping) _fieldMappingList.get(index);
    } //-- org.pentaho.jfreereport.castormodel.reportspec.FieldMapping getFieldMapping(int) 

    /**
     * Method getFieldMapping
     * 
     * 
     * 
     * @return this collection as an Array
     */
    public org.pentaho.jfreereport.castormodel.reportspec.FieldMapping[] getFieldMapping()
    {
        int size = this._fieldMappingList.size();
        org.pentaho.jfreereport.castormodel.reportspec.FieldMapping[] array = new org.pentaho.jfreereport.castormodel.reportspec.FieldMapping[size];
        for (int index = 0; index < size; index++){
            array[index] = (org.pentaho.jfreereport.castormodel.reportspec.FieldMapping) _fieldMappingList.get(index);
        }
        
        return array;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.FieldMapping[] getFieldMapping() 

    /**
     * Method getFieldMappingCount
     * 
     * 
     * 
     * @return the size of this collection
     */
    public int getFieldMappingCount()
    {
        return this._fieldMappingList.size();
    } //-- int getFieldMappingCount() 

    /**
     * Returns the value of field
     * 'generateReportLevelColumnHeaders'.
     * 
     * @return the value of field 'GenerateReportLevelColumnHeaders'
     */
    public boolean getGenerateReportLevelColumnHeaders()
    {
        return this._generateReportLevelColumnHeaders;
    } //-- boolean getGenerateReportLevelColumnHeaders() 

    /**
     * Returns the value of field 'grandTotalsHorizontalAlignment'.
     * 
     * @return the value of field 'GrandTotalsHorizontalAlignment'.
     */
    public java.lang.String getGrandTotalsHorizontalAlignment()
    {
        return this._grandTotalsHorizontalAlignment;
    } //-- java.lang.String getGrandTotalsHorizontalAlignment() 

    /**
     * Returns the value of field 'grandTotalsLabel'.
     * 
     * @return the value of field 'GrandTotalsLabel'.
     */
    public java.lang.String getGrandTotalsLabel()
    {
        return this._grandTotalsLabel;
    } //-- java.lang.String getGrandTotalsLabel() 

    /**
     * Returns the value of field 'groupFooterFontColor'.
     * 
     * @return the value of field 'GroupFooterFontColor'.
     */
    public java.lang.String getGroupFooterFontColor()
    {
        return this._groupFooterFontColor;
    } //-- java.lang.String getGroupFooterFontColor() 

    /**
     * Returns the value of field 'groupFooterFontName'.
     * 
     * @return the value of field 'GroupFooterFontName'.
     */
    public java.lang.String getGroupFooterFontName()
    {
        return this._groupFooterFontName;
    } //-- java.lang.String getGroupFooterFontName() 

    /**
     * Returns the value of field 'groupFooterFontSize'.
     * 
     * @return the value of field 'GroupFooterFontSize'.
     */
    public int getGroupFooterFontSize()
    {
        return this._groupFooterFontSize;
    } //-- int getGroupFooterFontSize() 

    /**
     * Returns the value of field 'groupFooterFontStyle'.
     * 
     * @return the value of field 'GroupFooterFontStyle'.
     */
    public int getGroupFooterFontStyle()
    {
        return this._groupFooterFontStyle;
    } //-- int getGroupFooterFontStyle() 

    /**
     * Returns the value of field 'groupHeaderFontColor'.
     * 
     * @return the value of field 'GroupHeaderFontColor'.
     */
    public java.lang.String getGroupHeaderFontColor()
    {
        return this._groupHeaderFontColor;
    } //-- java.lang.String getGroupHeaderFontColor() 

    /**
     * Returns the value of field 'groupHeaderFontName'.
     * 
     * @return the value of field 'GroupHeaderFontName'.
     */
    public java.lang.String getGroupHeaderFontName()
    {
        return this._groupHeaderFontName;
    } //-- java.lang.String getGroupHeaderFontName() 

    /**
     * Returns the value of field 'groupHeaderFontSize'.
     * 
     * @return the value of field 'GroupHeaderFontSize'.
     */
    public int getGroupHeaderFontSize()
    {
        return this._groupHeaderFontSize;
    } //-- int getGroupHeaderFontSize() 

    /**
     * Returns the value of field 'groupHeaderFontStyle'.
     * 
     * @return the value of field 'GroupHeaderFontStyle'.
     */
    public int getGroupHeaderFontStyle()
    {
        return this._groupHeaderFontStyle;
    } //-- int getGroupHeaderFontStyle() 

    /**
     * Returns the value of field 'horizontalGridlinesColor'.
     * 
     * @return the value of field 'HorizontalGridlinesColor'.
     */
    public java.lang.String getHorizontalGridlinesColor()
    {
        return this._horizontalGridlinesColor;
    } //-- java.lang.String getHorizontalGridlinesColor() 

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
     * Returns the value of field 'includeSrc'.
     * 
     * @return the value of field 'IncludeSrc'.
     */
    public java.lang.String getIncludeSrc()
    {
        return this._includeSrc;
    } //-- java.lang.String getIncludeSrc() 

    /**
     * Returns the value of field 'isMDX'.
     * 
     * @return the value of field 'IsMDX'.
     */
    public boolean getIsMDX()
    {
        return this._isMDX;
    } //-- boolean getIsMDX() 

    /**
     * Returns the value of field 'isMQL'.
     * 
     * @return the value of field 'IsMQL'.
     */
    public boolean getIsMQL()
    {
        return this._isMQL;
    } //-- boolean getIsMQL() 

    /**
     * Returns the value of field 'itemsFontColor'.
     * 
     * @return the value of field 'ItemsFontColor'.
     */
    public java.lang.String getItemsFontColor()
    {
        return this._itemsFontColor;
    } //-- java.lang.String getItemsFontColor() 

    /**
     * Returns the value of field 'itemsFontName'.
     * 
     * @return the value of field 'ItemsFontName'.
     */
    public java.lang.String getItemsFontName()
    {
        return this._itemsFontName;
    } //-- java.lang.String getItemsFontName() 

    /**
     * Returns the value of field 'itemsFontSize'.
     * 
     * @return the value of field 'ItemsFontSize'.
     */
    public int getItemsFontSize()
    {
        return this._itemsFontSize;
    } //-- int getItemsFontSize() 

    /**
     * Returns the value of field 'itemsFontStyle'.
     * 
     * @return the value of field 'ItemsFontStyle'.
     */
    public int getItemsFontStyle()
    {
        return this._itemsFontStyle;
    } //-- int getItemsFontStyle() 

    /**
     * Returns the value of field 'kettleStep'.
     * 
     * @return the value of field 'KettleStep'.
     */
    public java.lang.String getKettleStep()
    {
        return this._kettleStep;
    } //-- java.lang.String getKettleStep() 

    /**
     * Returns the value of field 'leftMargin'.
     * 
     * @return the value of field 'LeftMargin'.
     */
    public int getLeftMargin()
    {
        return this._leftMargin;
    } //-- int getLeftMargin() 

    /**
     * Returns the value of field 'mondrianCubeDefinitionPath'.
     * 
     * @return the value of field 'MondrianCubeDefinitionPath'.
     */
    public java.lang.String getMondrianCubeDefinitionPath()
    {
        return this._mondrianCubeDefinitionPath;
    } //-- java.lang.String getMondrianCubeDefinitionPath() 

    /**
     * Returns the value of field 'mqlQuery'.
     * 
     * @return the value of field 'MqlQuery'.
     */
    public java.lang.String getMqlQuery()
    {
        return this._mqlQuery;
    } //-- java.lang.String getMqlQuery() 

    /**
     * Returns the value of field 'orientation'.
     * 
     * @return the value of field 'Orientation'.
     */
    public java.lang.String getOrientation()
    {
        return this._orientation;
    } //-- java.lang.String getOrientation() 

    /**
     * Returns the value of field 'pageFormat'.
     * 
     * @return the value of field 'PageFormat'.
     */
    public java.lang.String getPageFormat()
    {
        return this._pageFormat;
    } //-- java.lang.String getPageFormat() 

    /**
     * Returns the value of field 'query'.
     * 
     * @return the value of field 'Query'.
     */
    public java.lang.String getQuery()
    {
        return this._query;
    } //-- java.lang.String getQuery() 

    /**
     * Returns the value of field 'reportDesc'.
     * 
     * @return the value of field 'ReportDesc'.
     */
    public java.lang.String getReportDesc()
    {
        return this._reportDesc;
    } //-- java.lang.String getReportDesc() 

    /**
     * Returns the value of field 'reportName'.
     * 
     * @return the value of field 'ReportName'.
     */
    public java.lang.String getReportName()
    {
        return this._reportName;
    } //-- java.lang.String getReportName() 

    /**
     * Returns the value of field 'reportSpecChoice'.
     * 
     * @return the value of field 'ReportSpecChoice'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice getReportSpecChoice()
    {
        return this._reportSpecChoice;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice getReportSpecChoice() 

    /**
     * Returns the value of field 'rightMargin'.
     * 
     * @return the value of field 'RightMargin'.
     */
    public int getRightMargin()
    {
        return this._rightMargin;
    } //-- int getRightMargin() 

    /**
     * Returns the value of field 'rowBandingColor'.
     * 
     * @return the value of field 'RowBandingColor'.
     */
    public java.lang.String getRowBandingColor()
    {
        return this._rowBandingColor;
    } //-- java.lang.String getRowBandingColor() 

    /**
     * Returns the value of field 'rowBandingInitialState'.
     * 
     * @return the value of field 'RowBandingInitialState'.
     */
    public boolean getRowBandingInitialState()
    {
        return this._rowBandingInitialState;
    } //-- boolean getRowBandingInitialState() 

    /**
     * Returns the value of field 'templateName'.
     * 
     * @return the value of field 'TemplateName'.
     */
    public java.lang.String getTemplateName()
    {
        return this._templateName;
    } //-- java.lang.String getTemplateName() 

    /**
     * Returns the value of field 'templateSrc'.
     * 
     * @return the value of field 'TemplateSrc'.
     */
    public java.lang.String getTemplateSrc()
    {
        return this._templateSrc;
    } //-- java.lang.String getTemplateSrc() 

    /**
     * Returns the value of field 'tool'.
     * 
     * @return the value of field 'Tool'.
     */
    public java.lang.String getTool()
    {
        return this._tool;
    } //-- java.lang.String getTool() 

    /**
     * Returns the value of field 'toolVersion'.
     * 
     * @return the value of field 'ToolVersion'.
     */
    public java.lang.String getToolVersion()
    {
        return this._toolVersion;
    } //-- java.lang.String getToolVersion() 

    /**
     * Returns the value of field 'topMargin'.
     * 
     * @return the value of field 'TopMargin'.
     */
    public int getTopMargin()
    {
        return this._topMargin;
    } //-- int getTopMargin() 

    /**
     * Returns the value of field 'useChart'.
     * 
     * @return the value of field 'UseChart'.
     */
    public boolean getUseChart()
    {
        return this._useChart;
    } //-- boolean getUseChart() 

    /**
     * Returns the value of field 'useColumnHeaderBackgroundColor'.
     * 
     * @return the value of field 'UseColumnHeaderBackgroundColor'.
     */
    public boolean getUseColumnHeaderBackgroundColor()
    {
        return this._useColumnHeaderBackgroundColor;
    } //-- boolean getUseColumnHeaderBackgroundColor() 

    /**
     * Returns the value of field 'useCustomPageFormat'.
     * 
     * @return the value of field 'UseCustomPageFormat'.
     */
    public boolean getUseCustomPageFormat()
    {
        return this._useCustomPageFormat;
    } //-- boolean getUseCustomPageFormat() 

    /**
     * Returns the value of field
     * 'useDummyGroupFooterBackgroundColor'.
     * 
     * @return the value of field
     * 'UseDummyGroupFooterBackgroundColor'.
     */
    public boolean getUseDummyGroupFooterBackgroundColor()
    {
        return this._useDummyGroupFooterBackgroundColor;
    } //-- boolean getUseDummyGroupFooterBackgroundColor() 

    /**
     * Returns the value of field 'useExpressionUnderlining'.
     * 
     * @return the value of field 'UseExpressionUnderlining'.
     */
    public boolean getUseExpressionUnderlining()
    {
        return this._useExpressionUnderlining;
    } //-- boolean getUseExpressionUnderlining() 

    /**
     * Returns the value of field 'useHorizontalGridlines'.
     * 
     * @return the value of field 'UseHorizontalGridlines'.
     */
    public boolean getUseHorizontalGridlines()
    {
        return this._useHorizontalGridlines;
    } //-- boolean getUseHorizontalGridlines() 

    /**
     * Returns the value of field 'useMasterDetail'.
     * 
     * @return the value of field 'UseMasterDetail'.
     */
    public boolean getUseMasterDetail()
    {
        return this._useMasterDetail;
    } //-- boolean getUseMasterDetail() 

    /**
     * Returns the value of field 'useMasterDetailBanding'.
     * 
     * @return the value of field 'UseMasterDetailBanding'.
     */
    public boolean getUseMasterDetailBanding()
    {
        return this._useMasterDetailBanding;
    } //-- boolean getUseMasterDetailBanding() 

    /**
     * Returns the value of field 'useMasterDetailGridlines'.
     * 
     * @return the value of field 'UseMasterDetailGridlines'.
     */
    public boolean getUseMasterDetailGridlines()
    {
        return this._useMasterDetailGridlines;
    } //-- boolean getUseMasterDetailGridlines() 

    /**
     * Returns the value of field 'useRowBanding'.
     * 
     * @return the value of field 'UseRowBanding'.
     */
    public boolean getUseRowBanding()
    {
        return this._useRowBanding;
    } //-- boolean getUseRowBanding() 

    /**
     * Returns the value of field 'useVerticalGridlines'.
     * 
     * @return the value of field 'UseVerticalGridlines'.
     */
    public boolean getUseVerticalGridlines()
    {
        return this._useVerticalGridlines;
    } //-- boolean getUseVerticalGridlines() 

    /**
     * Returns the value of field 'verticalGridlinesColor'.
     * 
     * @return the value of field 'VerticalGridlinesColor'.
     */
    public java.lang.String getVerticalGridlinesColor()
    {
        return this._verticalGridlinesColor;
    } //-- java.lang.String getVerticalGridlinesColor() 

    /**
     * Returns the value of field 'watermark'.
     * 
     * @return the value of field 'Watermark'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Watermark getWatermark()
    {
        return this._watermark;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Watermark getWatermark() 

    /**
     * Returns the value of field 'xmiPath'.
     * 
     * @return the value of field 'XmiPath'.
     */
    public java.lang.String getXmiPath()
    {
        return this._xmiPath;
    } //-- java.lang.String getXmiPath() 

    /**
     * Method hasBottomMargin
     * 
     * 
     * 
     * @return true if at least one BottomMargin has been added
     */
    public boolean hasBottomMargin()
    {
        return this._has_bottomMargin;
    } //-- boolean hasBottomMargin() 

    /**
     * Method hasCalculateGrandTotals
     * 
     * 
     * 
     * @return true if at least one CalculateGrandTotals has been
     * added
     */
    public boolean hasCalculateGrandTotals()
    {
        return this._has_calculateGrandTotals;
    } //-- boolean hasCalculateGrandTotals() 

    /**
     * Method hasColumnHeaderFontSize
     * 
     * 
     * 
     * @return true if at least one ColumnHeaderFontSize has been
     * added
     */
    public boolean hasColumnHeaderFontSize()
    {
        return this._has_columnHeaderFontSize;
    } //-- boolean hasColumnHeaderFontSize() 

    /**
     * Method hasColumnHeaderFontStyle
     * 
     * 
     * 
     * @return true if at least one ColumnHeaderFontStyle has been
     * added
     */
    public boolean hasColumnHeaderFontStyle()
    {
        return this._has_columnHeaderFontStyle;
    } //-- boolean hasColumnHeaderFontStyle() 

    /**
     * Method hasColumnHeaderGap
     * 
     * 
     * 
     * @return true if at least one ColumnHeaderGap has been added
     */
    public boolean hasColumnHeaderGap()
    {
        return this._has_columnHeaderGap;
    } //-- boolean hasColumnHeaderGap() 

    /**
     * Method hasColumnHeaderHeight
     * 
     * 
     * 
     * @return true if at least one ColumnHeaderHeight has been adde
     */
    public boolean hasColumnHeaderHeight()
    {
        return this._has_columnHeaderHeight;
    } //-- boolean hasColumnHeaderHeight() 

    /**
     * Method hasColumnHeaderTopGap
     * 
     * 
     * 
     * @return true if at least one ColumnHeaderTopGap has been adde
     */
    public boolean hasColumnHeaderTopGap()
    {
        return this._has_columnHeaderTopGap;
    } //-- boolean hasColumnHeaderTopGap() 

    /**
     * Method hasCustomPageFormatHeight
     * 
     * 
     * 
     * @return true if at least one CustomPageFormatHeight has been
     * added
     */
    public boolean hasCustomPageFormatHeight()
    {
        return this._has_customPageFormatHeight;
    } //-- boolean hasCustomPageFormatHeight() 

    /**
     * Method hasCustomPageFormatWidth
     * 
     * 
     * 
     * @return true if at least one CustomPageFormatWidth has been
     * added
     */
    public boolean hasCustomPageFormatWidth()
    {
        return this._has_customPageFormatWidth;
    } //-- boolean hasCustomPageFormatWidth() 

    /**
     * Method hasDoubleUnderlineExpression
     * 
     * 
     * 
     * @return true if at least one DoubleUnderlineExpression has
     * been added
     */
    public boolean hasDoubleUnderlineExpression()
    {
        return this._has_doubleUnderlineExpression;
    } //-- boolean hasDoubleUnderlineExpression() 

    /**
     * Method hasGenerateReportLevelColumnHeaders
     * 
     * 
     * 
     * @return true if at least one
     * GenerateReportLevelColumnHeaders has been added
     */
    public boolean hasGenerateReportLevelColumnHeaders()
    {
        return this._has_generateReportLevelColumnHeaders;
    } //-- boolean hasGenerateReportLevelColumnHeaders() 

    /**
     * Method hasGroupFooterFontSize
     * 
     * 
     * 
     * @return true if at least one GroupFooterFontSize has been
     * added
     */
    public boolean hasGroupFooterFontSize()
    {
        return this._has_groupFooterFontSize;
    } //-- boolean hasGroupFooterFontSize() 

    /**
     * Method hasGroupFooterFontStyle
     * 
     * 
     * 
     * @return true if at least one GroupFooterFontStyle has been
     * added
     */
    public boolean hasGroupFooterFontStyle()
    {
        return this._has_groupFooterFontStyle;
    } //-- boolean hasGroupFooterFontStyle() 

    /**
     * Method hasGroupHeaderFontSize
     * 
     * 
     * 
     * @return true if at least one GroupHeaderFontSize has been
     * added
     */
    public boolean hasGroupHeaderFontSize()
    {
        return this._has_groupHeaderFontSize;
    } //-- boolean hasGroupHeaderFontSize() 

    /**
     * Method hasGroupHeaderFontStyle
     * 
     * 
     * 
     * @return true if at least one GroupHeaderFontStyle has been
     * added
     */
    public boolean hasGroupHeaderFontStyle()
    {
        return this._has_groupHeaderFontStyle;
    } //-- boolean hasGroupHeaderFontStyle() 

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
     * Method hasIsMDX
     * 
     * 
     * 
     * @return true if at least one IsMDX has been added
     */
    public boolean hasIsMDX()
    {
        return this._has_isMDX;
    } //-- boolean hasIsMDX() 

    /**
     * Method hasIsMQL
     * 
     * 
     * 
     * @return true if at least one IsMQL has been added
     */
    public boolean hasIsMQL()
    {
        return this._has_isMQL;
    } //-- boolean hasIsMQL() 

    /**
     * Method hasItemsFontSize
     * 
     * 
     * 
     * @return true if at least one ItemsFontSize has been added
     */
    public boolean hasItemsFontSize()
    {
        return this._has_itemsFontSize;
    } //-- boolean hasItemsFontSize() 

    /**
     * Method hasItemsFontStyle
     * 
     * 
     * 
     * @return true if at least one ItemsFontStyle has been added
     */
    public boolean hasItemsFontStyle()
    {
        return this._has_itemsFontStyle;
    } //-- boolean hasItemsFontStyle() 

    /**
     * Method hasLeftMargin
     * 
     * 
     * 
     * @return true if at least one LeftMargin has been added
     */
    public boolean hasLeftMargin()
    {
        return this._has_leftMargin;
    } //-- boolean hasLeftMargin() 

    /**
     * Method hasRightMargin
     * 
     * 
     * 
     * @return true if at least one RightMargin has been added
     */
    public boolean hasRightMargin()
    {
        return this._has_rightMargin;
    } //-- boolean hasRightMargin() 

    /**
     * Method hasRowBandingInitialState
     * 
     * 
     * 
     * @return true if at least one RowBandingInitialState has been
     * added
     */
    public boolean hasRowBandingInitialState()
    {
        return this._has_rowBandingInitialState;
    } //-- boolean hasRowBandingInitialState() 

    /**
     * Method hasTopMargin
     * 
     * 
     * 
     * @return true if at least one TopMargin has been added
     */
    public boolean hasTopMargin()
    {
        return this._has_topMargin;
    } //-- boolean hasTopMargin() 

    /**
     * Method hasUseChart
     * 
     * 
     * 
     * @return true if at least one UseChart has been added
     */
    public boolean hasUseChart()
    {
        return this._has_useChart;
    } //-- boolean hasUseChart() 

    /**
     * Method hasUseColumnHeaderBackgroundColor
     * 
     * 
     * 
     * @return true if at least one UseColumnHeaderBackgroundColor
     * has been added
     */
    public boolean hasUseColumnHeaderBackgroundColor()
    {
        return this._has_useColumnHeaderBackgroundColor;
    } //-- boolean hasUseColumnHeaderBackgroundColor() 

    /**
     * Method hasUseCustomPageFormat
     * 
     * 
     * 
     * @return true if at least one UseCustomPageFormat has been
     * added
     */
    public boolean hasUseCustomPageFormat()
    {
        return this._has_useCustomPageFormat;
    } //-- boolean hasUseCustomPageFormat() 

    /**
     * Method hasUseDummyGroupFooterBackgroundColor
     * 
     * 
     * 
     * @return true if at least one
     * UseDummyGroupFooterBackgroundColor has been added
     */
    public boolean hasUseDummyGroupFooterBackgroundColor()
    {
        return this._has_useDummyGroupFooterBackgroundColor;
    } //-- boolean hasUseDummyGroupFooterBackgroundColor() 

    /**
     * Method hasUseExpressionUnderlining
     * 
     * 
     * 
     * @return true if at least one UseExpressionUnderlining has
     * been added
     */
    public boolean hasUseExpressionUnderlining()
    {
        return this._has_useExpressionUnderlining;
    } //-- boolean hasUseExpressionUnderlining() 

    /**
     * Method hasUseHorizontalGridlines
     * 
     * 
     * 
     * @return true if at least one UseHorizontalGridlines has been
     * added
     */
    public boolean hasUseHorizontalGridlines()
    {
        return this._has_useHorizontalGridlines;
    } //-- boolean hasUseHorizontalGridlines() 

    /**
     * Method hasUseMasterDetail
     * 
     * 
     * 
     * @return true if at least one UseMasterDetail has been added
     */
    public boolean hasUseMasterDetail()
    {
        return this._has_useMasterDetail;
    } //-- boolean hasUseMasterDetail() 

    /**
     * Method hasUseMasterDetailBanding
     * 
     * 
     * 
     * @return true if at least one UseMasterDetailBanding has been
     * added
     */
    public boolean hasUseMasterDetailBanding()
    {
        return this._has_useMasterDetailBanding;
    } //-- boolean hasUseMasterDetailBanding() 

    /**
     * Method hasUseMasterDetailGridlines
     * 
     * 
     * 
     * @return true if at least one UseMasterDetailGridlines has
     * been added
     */
    public boolean hasUseMasterDetailGridlines()
    {
        return this._has_useMasterDetailGridlines;
    } //-- boolean hasUseMasterDetailGridlines() 

    /**
     * Method hasUseRowBanding
     * 
     * 
     * 
     * @return true if at least one UseRowBanding has been added
     */
    public boolean hasUseRowBanding()
    {
        return this._has_useRowBanding;
    } //-- boolean hasUseRowBanding() 

    /**
     * Method hasUseVerticalGridlines
     * 
     * 
     * 
     * @return true if at least one UseVerticalGridlines has been
     * added
     */
    public boolean hasUseVerticalGridlines()
    {
        return this._has_useVerticalGridlines;
    } //-- boolean hasUseVerticalGridlines() 

    /**
     * Returns the value of field 'calculateGrandTotals'.
     * 
     * @return the value of field 'CalculateGrandTotals'.
     */
    public boolean isCalculateGrandTotals()
    {
        return this._calculateGrandTotals;
    } //-- boolean isCalculateGrandTotals() 

    /**
     * Returns the value of field 'doubleUnderlineExpression'.
     * 
     * @return the value of field 'DoubleUnderlineExpression'.
     */
    public boolean isDoubleUnderlineExpression()
    {
        return this._doubleUnderlineExpression;
    } //-- boolean isDoubleUnderlineExpression() 

    /**
     * Returns the value of field
     * 'generateReportLevelColumnHeaders'.
     * 
     * @return the value of field 'GenerateReportLevelColumnHeaders'
     */
    public boolean isGenerateReportLevelColumnHeaders()
    {
        return this._generateReportLevelColumnHeaders;
    } //-- boolean isGenerateReportLevelColumnHeaders() 

    /**
     * Returns the value of field 'isMDX'.
     * 
     * @return the value of field 'IsMDX'.
     */
    public boolean isIsMDX()
    {
        return this._isMDX;
    } //-- boolean isIsMDX() 

    /**
     * Returns the value of field 'isMQL'.
     * 
     * @return the value of field 'IsMQL'.
     */
    public boolean isIsMQL()
    {
        return this._isMQL;
    } //-- boolean isIsMQL() 

    /**
     * Returns the value of field 'rowBandingInitialState'.
     * 
     * @return the value of field 'RowBandingInitialState'.
     */
    public boolean isRowBandingInitialState()
    {
        return this._rowBandingInitialState;
    } //-- boolean isRowBandingInitialState() 

    /**
     * Returns the value of field 'useChart'.
     * 
     * @return the value of field 'UseChart'.
     */
    public boolean isUseChart()
    {
        return this._useChart;
    } //-- boolean isUseChart() 

    /**
     * Returns the value of field 'useColumnHeaderBackgroundColor'.
     * 
     * @return the value of field 'UseColumnHeaderBackgroundColor'.
     */
    public boolean isUseColumnHeaderBackgroundColor()
    {
        return this._useColumnHeaderBackgroundColor;
    } //-- boolean isUseColumnHeaderBackgroundColor() 

    /**
     * Returns the value of field 'useCustomPageFormat'.
     * 
     * @return the value of field 'UseCustomPageFormat'.
     */
    public boolean isUseCustomPageFormat()
    {
        return this._useCustomPageFormat;
    } //-- boolean isUseCustomPageFormat() 

    /**
     * Returns the value of field
     * 'useDummyGroupFooterBackgroundColor'.
     * 
     * @return the value of field
     * 'UseDummyGroupFooterBackgroundColor'.
     */
    public boolean isUseDummyGroupFooterBackgroundColor()
    {
        return this._useDummyGroupFooterBackgroundColor;
    } //-- boolean isUseDummyGroupFooterBackgroundColor() 

    /**
     * Returns the value of field 'useExpressionUnderlining'.
     * 
     * @return the value of field 'UseExpressionUnderlining'.
     */
    public boolean isUseExpressionUnderlining()
    {
        return this._useExpressionUnderlining;
    } //-- boolean isUseExpressionUnderlining() 

    /**
     * Returns the value of field 'useHorizontalGridlines'.
     * 
     * @return the value of field 'UseHorizontalGridlines'.
     */
    public boolean isUseHorizontalGridlines()
    {
        return this._useHorizontalGridlines;
    } //-- boolean isUseHorizontalGridlines() 

    /**
     * Returns the value of field 'useMasterDetail'.
     * 
     * @return the value of field 'UseMasterDetail'.
     */
    public boolean isUseMasterDetail()
    {
        return this._useMasterDetail;
    } //-- boolean isUseMasterDetail() 

    /**
     * Returns the value of field 'useMasterDetailBanding'.
     * 
     * @return the value of field 'UseMasterDetailBanding'.
     */
    public boolean isUseMasterDetailBanding()
    {
        return this._useMasterDetailBanding;
    } //-- boolean isUseMasterDetailBanding() 

    /**
     * Returns the value of field 'useMasterDetailGridlines'.
     * 
     * @return the value of field 'UseMasterDetailGridlines'.
     */
    public boolean isUseMasterDetailGridlines()
    {
        return this._useMasterDetailGridlines;
    } //-- boolean isUseMasterDetailGridlines() 

    /**
     * Returns the value of field 'useRowBanding'.
     * 
     * @return the value of field 'UseRowBanding'.
     */
    public boolean isUseRowBanding()
    {
        return this._useRowBanding;
    } //-- boolean isUseRowBanding() 

    /**
     * Returns the value of field 'useVerticalGridlines'.
     * 
     * @return the value of field 'UseVerticalGridlines'.
     */
    public boolean isUseVerticalGridlines()
    {
        return this._useVerticalGridlines;
    } //-- boolean isUseVerticalGridlines() 

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
     * Method iterateField
     * 
     * 
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateField()
    {
        return this._fieldList.iterator();
    } //-- java.util.Iterator iterateField() 

    /**
     * Method iterateFieldMapping
     * 
     * 
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateFieldMapping()
    {
        return this._fieldMappingList.iterator();
    } //-- java.util.Iterator iterateFieldMapping() 

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
    public void removeAllField()
    {
        this._fieldList.clear();
    } //-- void removeAllField() 

    /**
     */
    public void removeAllFieldMapping()
    {
        this._fieldMappingList.clear();
    } //-- void removeAllFieldMapping() 

    /**
     * Method removeField
     * 
     * 
     * 
     * @param vField
     * @return true if the object was removed from the collection.
     */
    public boolean removeField(org.pentaho.jfreereport.castormodel.reportspec.Field vField)
    {
        boolean removed = _fieldList.remove(vField);
        return removed;
    } //-- boolean removeField(org.pentaho.jfreereport.castormodel.reportspec.Field) 

    /**
     * Method removeFieldAt
     * 
     * 
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Field removeFieldAt(int index)
    {
        Object obj = this._fieldList.remove(index);
        return (org.pentaho.jfreereport.castormodel.reportspec.Field) obj;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Field removeFieldAt(int) 

    /**
     * Method removeFieldMapping
     * 
     * 
     * 
     * @param vFieldMapping
     * @return true if the object was removed from the collection.
     */
    public boolean removeFieldMapping(org.pentaho.jfreereport.castormodel.reportspec.FieldMapping vFieldMapping)
    {
        boolean removed = _fieldMappingList.remove(vFieldMapping);
        return removed;
    } //-- boolean removeFieldMapping(org.pentaho.jfreereport.castormodel.reportspec.FieldMapping) 

    /**
     * Method removeFieldMappingAt
     * 
     * 
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.pentaho.jfreereport.castormodel.reportspec.FieldMapping removeFieldMappingAt(int index)
    {
        Object obj = this._fieldMappingList.remove(index);
        return (org.pentaho.jfreereport.castormodel.reportspec.FieldMapping) obj;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.FieldMapping removeFieldMappingAt(int) 

    /**
     * Sets the value of field 'bottomMargin'.
     * 
     * @param bottomMargin the value of field 'bottomMargin'.
     */
    public void setBottomMargin(int bottomMargin)
    {
        this._bottomMargin = bottomMargin;
        this._has_bottomMargin = true;
    } //-- void setBottomMargin(int) 

    /**
     * Sets the value of field 'calculateGrandTotals'.
     * 
     * @param calculateGrandTotals the value of field
     * 'calculateGrandTotals'.
     */
    public void setCalculateGrandTotals(boolean calculateGrandTotals)
    {
        this._calculateGrandTotals = calculateGrandTotals;
        this._has_calculateGrandTotals = true;
    } //-- void setCalculateGrandTotals(boolean) 

    /**
     * Sets the value of field 'chart'.
     * 
     * @param chart the value of field 'chart'.
     */
    public void setChart(org.pentaho.jfreereport.castormodel.reportspec.Chart chart)
    {
        this._chart = chart;
    } //-- void setChart(org.pentaho.jfreereport.castormodel.reportspec.Chart) 

    /**
     * Sets the value of field 'columnHeaderBackgroundColor'.
     * 
     * @param columnHeaderBackgroundColor the value of field
     * 'columnHeaderBackgroundColor'.
     */
    public void setColumnHeaderBackgroundColor(java.lang.String columnHeaderBackgroundColor)
    {
        this._columnHeaderBackgroundColor = columnHeaderBackgroundColor;
    } //-- void setColumnHeaderBackgroundColor(java.lang.String) 

    /**
     * Sets the value of field 'columnHeaderFontColor'.
     * 
     * @param columnHeaderFontColor the value of field
     * 'columnHeaderFontColor'.
     */
    public void setColumnHeaderFontColor(java.lang.String columnHeaderFontColor)
    {
        this._columnHeaderFontColor = columnHeaderFontColor;
    } //-- void setColumnHeaderFontColor(java.lang.String) 

    /**
     * Sets the value of field 'columnHeaderFontName'.
     * 
     * @param columnHeaderFontName the value of field
     * 'columnHeaderFontName'.
     */
    public void setColumnHeaderFontName(java.lang.String columnHeaderFontName)
    {
        this._columnHeaderFontName = columnHeaderFontName;
    } //-- void setColumnHeaderFontName(java.lang.String) 

    /**
     * Sets the value of field 'columnHeaderFontSize'.
     * 
     * @param columnHeaderFontSize the value of field
     * 'columnHeaderFontSize'.
     */
    public void setColumnHeaderFontSize(int columnHeaderFontSize)
    {
        this._columnHeaderFontSize = columnHeaderFontSize;
        this._has_columnHeaderFontSize = true;
    } //-- void setColumnHeaderFontSize(int) 

    /**
     * Sets the value of field 'columnHeaderFontStyle'.
     * 
     * @param columnHeaderFontStyle the value of field
     * 'columnHeaderFontStyle'.
     */
    public void setColumnHeaderFontStyle(int columnHeaderFontStyle)
    {
        this._columnHeaderFontStyle = columnHeaderFontStyle;
        this._has_columnHeaderFontStyle = true;
    } //-- void setColumnHeaderFontStyle(int) 

    /**
     * Sets the value of field 'columnHeaderGap'.
     * 
     * @param columnHeaderGap the value of field 'columnHeaderGap'.
     */
    public void setColumnHeaderGap(int columnHeaderGap)
    {
        this._columnHeaderGap = columnHeaderGap;
        this._has_columnHeaderGap = true;
    } //-- void setColumnHeaderGap(int) 

    /**
     * Sets the value of field 'columnHeaderHeight'.
     * 
     * @param columnHeaderHeight the value of field
     * 'columnHeaderHeight'.
     */
    public void setColumnHeaderHeight(int columnHeaderHeight)
    {
        this._columnHeaderHeight = columnHeaderHeight;
        this._has_columnHeaderHeight = true;
    } //-- void setColumnHeaderHeight(int) 

    /**
     * Sets the value of field 'columnHeaderTopGap'.
     * 
     * @param columnHeaderTopGap the value of field
     * 'columnHeaderTopGap'.
     */
    public void setColumnHeaderTopGap(int columnHeaderTopGap)
    {
        this._columnHeaderTopGap = columnHeaderTopGap;
        this._has_columnHeaderTopGap = true;
    } //-- void setColumnHeaderTopGap(int) 

    /**
     * Sets the value of field 'customPageFormatHeight'.
     * 
     * @param customPageFormatHeight the value of field
     * 'customPageFormatHeight'.
     */
    public void setCustomPageFormatHeight(int customPageFormatHeight)
    {
        this._customPageFormatHeight = customPageFormatHeight;
        this._has_customPageFormatHeight = true;
    } //-- void setCustomPageFormatHeight(int) 

    /**
     * Sets the value of field 'customPageFormatWidth'.
     * 
     * @param customPageFormatWidth the value of field
     * 'customPageFormatWidth'.
     */
    public void setCustomPageFormatWidth(int customPageFormatWidth)
    {
        this._customPageFormatWidth = customPageFormatWidth;
        this._has_customPageFormatWidth = true;
    } //-- void setCustomPageFormatWidth(int) 

    /**
     * Sets the value of field 'doubleUnderlineExpression'.
     * 
     * @param doubleUnderlineExpression the value of field
     * 'doubleUnderlineExpression'.
     */
    public void setDoubleUnderlineExpression(boolean doubleUnderlineExpression)
    {
        this._doubleUnderlineExpression = doubleUnderlineExpression;
        this._has_doubleUnderlineExpression = true;
    } //-- void setDoubleUnderlineExpression(boolean) 

    /**
     * Sets the value of field 'dummyGroupFooterBackgroundColor'.
     * 
     * @param dummyGroupFooterBackgroundColor the value of field
     * 'dummyGroupFooterBackgroundColor'.
     */
    public void setDummyGroupFooterBackgroundColor(java.lang.String dummyGroupFooterBackgroundColor)
    {
        this._dummyGroupFooterBackgroundColor = dummyGroupFooterBackgroundColor;
    } //-- void setDummyGroupFooterBackgroundColor(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vField
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setField(int index, org.pentaho.jfreereport.castormodel.reportspec.Field vField)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._fieldList.size()) {
            throw new IndexOutOfBoundsException("setField: Index value '" + index + "' not in range [0.." + (this._fieldList.size() - 1) + "]");
        }
        
        this._fieldList.set(index, vField);
    } //-- void setField(int, org.pentaho.jfreereport.castormodel.reportspec.Field) 

    /**
     * 
     * 
     * @param vFieldArray
     */
    public void setField(org.pentaho.jfreereport.castormodel.reportspec.Field[] vFieldArray)
    {
        //-- copy array
        _fieldList.clear();
        
        for (int i = 0; i < vFieldArray.length; i++) {
                this._fieldList.add(vFieldArray[i]);
        }
    } //-- void setField(org.pentaho.jfreereport.castormodel.reportspec.Field) 

    /**
     * 
     * 
     * @param index
     * @param vFieldMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setFieldMapping(int index, org.pentaho.jfreereport.castormodel.reportspec.FieldMapping vFieldMapping)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._fieldMappingList.size()) {
            throw new IndexOutOfBoundsException("setFieldMapping: Index value '" + index + "' not in range [0.." + (this._fieldMappingList.size() - 1) + "]");
        }
        
        this._fieldMappingList.set(index, vFieldMapping);
    } //-- void setFieldMapping(int, org.pentaho.jfreereport.castormodel.reportspec.FieldMapping) 

    /**
     * 
     * 
     * @param vFieldMappingArray
     */
    public void setFieldMapping(org.pentaho.jfreereport.castormodel.reportspec.FieldMapping[] vFieldMappingArray)
    {
        //-- copy array
        _fieldMappingList.clear();
        
        for (int i = 0; i < vFieldMappingArray.length; i++) {
                this._fieldMappingList.add(vFieldMappingArray[i]);
        }
    } //-- void setFieldMapping(org.pentaho.jfreereport.castormodel.reportspec.FieldMapping) 

    /**
     * Sets the value of field 'generateReportLevelColumnHeaders'.
     * 
     * @param generateReportLevelColumnHeaders the value of field
     * 'generateReportLevelColumnHeaders'.
     */
    public void setGenerateReportLevelColumnHeaders(boolean generateReportLevelColumnHeaders)
    {
        this._generateReportLevelColumnHeaders = generateReportLevelColumnHeaders;
        this._has_generateReportLevelColumnHeaders = true;
    } //-- void setGenerateReportLevelColumnHeaders(boolean) 

    /**
     * Sets the value of field 'grandTotalsHorizontalAlignment'.
     * 
     * @param grandTotalsHorizontalAlignment the value of field
     * 'grandTotalsHorizontalAlignment'.
     */
    public void setGrandTotalsHorizontalAlignment(java.lang.String grandTotalsHorizontalAlignment)
    {
        this._grandTotalsHorizontalAlignment = grandTotalsHorizontalAlignment;
    } //-- void setGrandTotalsHorizontalAlignment(java.lang.String) 

    /**
     * Sets the value of field 'grandTotalsLabel'.
     * 
     * @param grandTotalsLabel the value of field 'grandTotalsLabel'
     */
    public void setGrandTotalsLabel(java.lang.String grandTotalsLabel)
    {
        this._grandTotalsLabel = grandTotalsLabel;
    } //-- void setGrandTotalsLabel(java.lang.String) 

    /**
     * Sets the value of field 'groupFooterFontColor'.
     * 
     * @param groupFooterFontColor the value of field
     * 'groupFooterFontColor'.
     */
    public void setGroupFooterFontColor(java.lang.String groupFooterFontColor)
    {
        this._groupFooterFontColor = groupFooterFontColor;
    } //-- void setGroupFooterFontColor(java.lang.String) 

    /**
     * Sets the value of field 'groupFooterFontName'.
     * 
     * @param groupFooterFontName the value of field
     * 'groupFooterFontName'.
     */
    public void setGroupFooterFontName(java.lang.String groupFooterFontName)
    {
        this._groupFooterFontName = groupFooterFontName;
    } //-- void setGroupFooterFontName(java.lang.String) 

    /**
     * Sets the value of field 'groupFooterFontSize'.
     * 
     * @param groupFooterFontSize the value of field
     * 'groupFooterFontSize'.
     */
    public void setGroupFooterFontSize(int groupFooterFontSize)
    {
        this._groupFooterFontSize = groupFooterFontSize;
        this._has_groupFooterFontSize = true;
    } //-- void setGroupFooterFontSize(int) 

    /**
     * Sets the value of field 'groupFooterFontStyle'.
     * 
     * @param groupFooterFontStyle the value of field
     * 'groupFooterFontStyle'.
     */
    public void setGroupFooterFontStyle(int groupFooterFontStyle)
    {
        this._groupFooterFontStyle = groupFooterFontStyle;
        this._has_groupFooterFontStyle = true;
    } //-- void setGroupFooterFontStyle(int) 

    /**
     * Sets the value of field 'groupHeaderFontColor'.
     * 
     * @param groupHeaderFontColor the value of field
     * 'groupHeaderFontColor'.
     */
    public void setGroupHeaderFontColor(java.lang.String groupHeaderFontColor)
    {
        this._groupHeaderFontColor = groupHeaderFontColor;
    } //-- void setGroupHeaderFontColor(java.lang.String) 

    /**
     * Sets the value of field 'groupHeaderFontName'.
     * 
     * @param groupHeaderFontName the value of field
     * 'groupHeaderFontName'.
     */
    public void setGroupHeaderFontName(java.lang.String groupHeaderFontName)
    {
        this._groupHeaderFontName = groupHeaderFontName;
    } //-- void setGroupHeaderFontName(java.lang.String) 

    /**
     * Sets the value of field 'groupHeaderFontSize'.
     * 
     * @param groupHeaderFontSize the value of field
     * 'groupHeaderFontSize'.
     */
    public void setGroupHeaderFontSize(int groupHeaderFontSize)
    {
        this._groupHeaderFontSize = groupHeaderFontSize;
        this._has_groupHeaderFontSize = true;
    } //-- void setGroupHeaderFontSize(int) 

    /**
     * Sets the value of field 'groupHeaderFontStyle'.
     * 
     * @param groupHeaderFontStyle the value of field
     * 'groupHeaderFontStyle'.
     */
    public void setGroupHeaderFontStyle(int groupHeaderFontStyle)
    {
        this._groupHeaderFontStyle = groupHeaderFontStyle;
        this._has_groupHeaderFontStyle = true;
    } //-- void setGroupHeaderFontStyle(int) 

    /**
     * Sets the value of field 'horizontalGridlinesColor'.
     * 
     * @param horizontalGridlinesColor the value of field
     * 'horizontalGridlinesColor'.
     */
    public void setHorizontalGridlinesColor(java.lang.String horizontalGridlinesColor)
    {
        this._horizontalGridlinesColor = horizontalGridlinesColor;
    } //-- void setHorizontalGridlinesColor(java.lang.String) 

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
     * Sets the value of field 'includeSrc'.
     * 
     * @param includeSrc the value of field 'includeSrc'.
     */
    public void setIncludeSrc(java.lang.String includeSrc)
    {
        this._includeSrc = includeSrc;
    } //-- void setIncludeSrc(java.lang.String) 

    /**
     * Sets the value of field 'isMDX'.
     * 
     * @param isMDX the value of field 'isMDX'.
     */
    public void setIsMDX(boolean isMDX)
    {
        this._isMDX = isMDX;
        this._has_isMDX = true;
    } //-- void setIsMDX(boolean) 

    /**
     * Sets the value of field 'isMQL'.
     * 
     * @param isMQL the value of field 'isMQL'.
     */
    public void setIsMQL(boolean isMQL)
    {
        this._isMQL = isMQL;
        this._has_isMQL = true;
    } //-- void setIsMQL(boolean) 

    /**
     * Sets the value of field 'itemsFontColor'.
     * 
     * @param itemsFontColor the value of field 'itemsFontColor'.
     */
    public void setItemsFontColor(java.lang.String itemsFontColor)
    {
        this._itemsFontColor = itemsFontColor;
    } //-- void setItemsFontColor(java.lang.String) 

    /**
     * Sets the value of field 'itemsFontName'.
     * 
     * @param itemsFontName the value of field 'itemsFontName'.
     */
    public void setItemsFontName(java.lang.String itemsFontName)
    {
        this._itemsFontName = itemsFontName;
    } //-- void setItemsFontName(java.lang.String) 

    /**
     * Sets the value of field 'itemsFontSize'.
     * 
     * @param itemsFontSize the value of field 'itemsFontSize'.
     */
    public void setItemsFontSize(int itemsFontSize)
    {
        this._itemsFontSize = itemsFontSize;
        this._has_itemsFontSize = true;
    } //-- void setItemsFontSize(int) 

    /**
     * Sets the value of field 'itemsFontStyle'.
     * 
     * @param itemsFontStyle the value of field 'itemsFontStyle'.
     */
    public void setItemsFontStyle(int itemsFontStyle)
    {
        this._itemsFontStyle = itemsFontStyle;
        this._has_itemsFontStyle = true;
    } //-- void setItemsFontStyle(int) 

    /**
     * Sets the value of field 'kettleStep'.
     * 
     * @param kettleStep the value of field 'kettleStep'.
     */
    public void setKettleStep(java.lang.String kettleStep)
    {
        this._kettleStep = kettleStep;
    } //-- void setKettleStep(java.lang.String) 

    /**
     * Sets the value of field 'leftMargin'.
     * 
     * @param leftMargin the value of field 'leftMargin'.
     */
    public void setLeftMargin(int leftMargin)
    {
        this._leftMargin = leftMargin;
        this._has_leftMargin = true;
    } //-- void setLeftMargin(int) 

    /**
     * Sets the value of field 'mondrianCubeDefinitionPath'.
     * 
     * @param mondrianCubeDefinitionPath the value of field
     * 'mondrianCubeDefinitionPath'.
     */
    public void setMondrianCubeDefinitionPath(java.lang.String mondrianCubeDefinitionPath)
    {
        this._mondrianCubeDefinitionPath = mondrianCubeDefinitionPath;
    } //-- void setMondrianCubeDefinitionPath(java.lang.String) 

    /**
     * Sets the value of field 'mqlQuery'.
     * 
     * @param mqlQuery the value of field 'mqlQuery'.
     */
    public void setMqlQuery(java.lang.String mqlQuery)
    {
        this._mqlQuery = mqlQuery;
    } //-- void setMqlQuery(java.lang.String) 

    /**
     * Sets the value of field 'orientation'.
     * 
     * @param orientation the value of field 'orientation'.
     */
    public void setOrientation(java.lang.String orientation)
    {
        this._orientation = orientation;
    } //-- void setOrientation(java.lang.String) 

    /**
     * Sets the value of field 'pageFormat'.
     * 
     * @param pageFormat the value of field 'pageFormat'.
     */
    public void setPageFormat(java.lang.String pageFormat)
    {
        this._pageFormat = pageFormat;
    } //-- void setPageFormat(java.lang.String) 

    /**
     * Sets the value of field 'query'.
     * 
     * @param query the value of field 'query'.
     */
    public void setQuery(java.lang.String query)
    {
        this._query = query;
    } //-- void setQuery(java.lang.String) 

    /**
     * Sets the value of field 'reportDesc'.
     * 
     * @param reportDesc the value of field 'reportDesc'.
     */
    public void setReportDesc(java.lang.String reportDesc)
    {
        this._reportDesc = reportDesc;
    } //-- void setReportDesc(java.lang.String) 

    /**
     * Sets the value of field 'reportName'.
     * 
     * @param reportName the value of field 'reportName'.
     */
    public void setReportName(java.lang.String reportName)
    {
        this._reportName = reportName;
    } //-- void setReportName(java.lang.String) 

    /**
     * Sets the value of field 'reportSpecChoice'.
     * 
     * @param reportSpecChoice the value of field 'reportSpecChoice'
     */
    public void setReportSpecChoice(org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice reportSpecChoice)
    {
        this._reportSpecChoice = reportSpecChoice;
    } //-- void setReportSpecChoice(org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice) 

    /**
     * Sets the value of field 'rightMargin'.
     * 
     * @param rightMargin the value of field 'rightMargin'.
     */
    public void setRightMargin(int rightMargin)
    {
        this._rightMargin = rightMargin;
        this._has_rightMargin = true;
    } //-- void setRightMargin(int) 

    /**
     * Sets the value of field 'rowBandingColor'.
     * 
     * @param rowBandingColor the value of field 'rowBandingColor'.
     */
    public void setRowBandingColor(java.lang.String rowBandingColor)
    {
        this._rowBandingColor = rowBandingColor;
    } //-- void setRowBandingColor(java.lang.String) 

    /**
     * Sets the value of field 'rowBandingInitialState'.
     * 
     * @param rowBandingInitialState the value of field
     * 'rowBandingInitialState'.
     */
    public void setRowBandingInitialState(boolean rowBandingInitialState)
    {
        this._rowBandingInitialState = rowBandingInitialState;
        this._has_rowBandingInitialState = true;
    } //-- void setRowBandingInitialState(boolean) 

    /**
     * Sets the value of field 'templateName'.
     * 
     * @param templateName the value of field 'templateName'.
     */
    public void setTemplateName(java.lang.String templateName)
    {
        this._templateName = templateName;
    } //-- void setTemplateName(java.lang.String) 

    /**
     * Sets the value of field 'templateSrc'.
     * 
     * @param templateSrc the value of field 'templateSrc'.
     */
    public void setTemplateSrc(java.lang.String templateSrc)
    {
        this._templateSrc = templateSrc;
    } //-- void setTemplateSrc(java.lang.String) 

    /**
     * Sets the value of field 'tool'.
     * 
     * @param tool the value of field 'tool'.
     */
    public void setTool(java.lang.String tool)
    {
        this._tool = tool;
    } //-- void setTool(java.lang.String) 

    /**
     * Sets the value of field 'toolVersion'.
     * 
     * @param toolVersion the value of field 'toolVersion'.
     */
    public void setToolVersion(java.lang.String toolVersion)
    {
        this._toolVersion = toolVersion;
    } //-- void setToolVersion(java.lang.String) 

    /**
     * Sets the value of field 'topMargin'.
     * 
     * @param topMargin the value of field 'topMargin'.
     */
    public void setTopMargin(int topMargin)
    {
        this._topMargin = topMargin;
        this._has_topMargin = true;
    } //-- void setTopMargin(int) 

    /**
     * Sets the value of field 'useChart'.
     * 
     * @param useChart the value of field 'useChart'.
     */
    public void setUseChart(boolean useChart)
    {
        this._useChart = useChart;
        this._has_useChart = true;
    } //-- void setUseChart(boolean) 

    /**
     * Sets the value of field 'useColumnHeaderBackgroundColor'.
     * 
     * @param useColumnHeaderBackgroundColor the value of field
     * 'useColumnHeaderBackgroundColor'.
     */
    public void setUseColumnHeaderBackgroundColor(boolean useColumnHeaderBackgroundColor)
    {
        this._useColumnHeaderBackgroundColor = useColumnHeaderBackgroundColor;
        this._has_useColumnHeaderBackgroundColor = true;
    } //-- void setUseColumnHeaderBackgroundColor(boolean) 

    /**
     * Sets the value of field 'useCustomPageFormat'.
     * 
     * @param useCustomPageFormat the value of field
     * 'useCustomPageFormat'.
     */
    public void setUseCustomPageFormat(boolean useCustomPageFormat)
    {
        this._useCustomPageFormat = useCustomPageFormat;
        this._has_useCustomPageFormat = true;
    } //-- void setUseCustomPageFormat(boolean) 

    /**
     * Sets the value of field
     * 'useDummyGroupFooterBackgroundColor'.
     * 
     * @param useDummyGroupFooterBackgroundColor the value of field
     * 'useDummyGroupFooterBackgroundColor'.
     */
    public void setUseDummyGroupFooterBackgroundColor(boolean useDummyGroupFooterBackgroundColor)
    {
        this._useDummyGroupFooterBackgroundColor = useDummyGroupFooterBackgroundColor;
        this._has_useDummyGroupFooterBackgroundColor = true;
    } //-- void setUseDummyGroupFooterBackgroundColor(boolean) 

    /**
     * Sets the value of field 'useExpressionUnderlining'.
     * 
     * @param useExpressionUnderlining the value of field
     * 'useExpressionUnderlining'.
     */
    public void setUseExpressionUnderlining(boolean useExpressionUnderlining)
    {
        this._useExpressionUnderlining = useExpressionUnderlining;
        this._has_useExpressionUnderlining = true;
    } //-- void setUseExpressionUnderlining(boolean) 

    /**
     * Sets the value of field 'useHorizontalGridlines'.
     * 
     * @param useHorizontalGridlines the value of field
     * 'useHorizontalGridlines'.
     */
    public void setUseHorizontalGridlines(boolean useHorizontalGridlines)
    {
        this._useHorizontalGridlines = useHorizontalGridlines;
        this._has_useHorizontalGridlines = true;
    } //-- void setUseHorizontalGridlines(boolean) 

    /**
     * Sets the value of field 'useMasterDetail'.
     * 
     * @param useMasterDetail the value of field 'useMasterDetail'.
     */
    public void setUseMasterDetail(boolean useMasterDetail)
    {
        this._useMasterDetail = useMasterDetail;
        this._has_useMasterDetail = true;
    } //-- void setUseMasterDetail(boolean) 

    /**
     * Sets the value of field 'useMasterDetailBanding'.
     * 
     * @param useMasterDetailBanding the value of field
     * 'useMasterDetailBanding'.
     */
    public void setUseMasterDetailBanding(boolean useMasterDetailBanding)
    {
        this._useMasterDetailBanding = useMasterDetailBanding;
        this._has_useMasterDetailBanding = true;
    } //-- void setUseMasterDetailBanding(boolean) 

    /**
     * Sets the value of field 'useMasterDetailGridlines'.
     * 
     * @param useMasterDetailGridlines the value of field
     * 'useMasterDetailGridlines'.
     */
    public void setUseMasterDetailGridlines(boolean useMasterDetailGridlines)
    {
        this._useMasterDetailGridlines = useMasterDetailGridlines;
        this._has_useMasterDetailGridlines = true;
    } //-- void setUseMasterDetailGridlines(boolean) 

    /**
     * Sets the value of field 'useRowBanding'.
     * 
     * @param useRowBanding the value of field 'useRowBanding'.
     */
    public void setUseRowBanding(boolean useRowBanding)
    {
        this._useRowBanding = useRowBanding;
        this._has_useRowBanding = true;
    } //-- void setUseRowBanding(boolean) 

    /**
     * Sets the value of field 'useVerticalGridlines'.
     * 
     * @param useVerticalGridlines the value of field
     * 'useVerticalGridlines'.
     */
    public void setUseVerticalGridlines(boolean useVerticalGridlines)
    {
        this._useVerticalGridlines = useVerticalGridlines;
        this._has_useVerticalGridlines = true;
    } //-- void setUseVerticalGridlines(boolean) 

    /**
     * Sets the value of field 'verticalGridlinesColor'.
     * 
     * @param verticalGridlinesColor the value of field
     * 'verticalGridlinesColor'.
     */
    public void setVerticalGridlinesColor(java.lang.String verticalGridlinesColor)
    {
        this._verticalGridlinesColor = verticalGridlinesColor;
    } //-- void setVerticalGridlinesColor(java.lang.String) 

    /**
     * Sets the value of field 'watermark'.
     * 
     * @param watermark the value of field 'watermark'.
     */
    public void setWatermark(org.pentaho.jfreereport.castormodel.reportspec.Watermark watermark)
    {
        this._watermark = watermark;
    } //-- void setWatermark(org.pentaho.jfreereport.castormodel.reportspec.Watermark) 

    /**
     * Sets the value of field 'xmiPath'.
     * 
     * @param xmiPath the value of field 'xmiPath'.
     */
    public void setXmiPath(java.lang.String xmiPath)
    {
        this._xmiPath = xmiPath;
    } //-- void setXmiPath(java.lang.String) 

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
     * org.pentaho.jfreereport.castormodel.reportspec.ReportSpec
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.ReportSpec unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.pentaho.jfreereport.castormodel.reportspec.ReportSpec) Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.ReportSpec.class, reader);
    } //-- org.pentaho.jfreereport.castormodel.reportspec.ReportSpec unmarshal(java.io.Reader) 

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
