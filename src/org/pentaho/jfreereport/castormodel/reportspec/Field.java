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
 * Class Field.
 * 
 * @version $Revision$ $Date$
 */
public class Field implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _useChart
     */
    private boolean _useChart = false;

    /**
     * keeps track of state for field: _useChart
     */
    private boolean _has_useChart;

    /**
     * Field _showChartAboveGroupHeader
     */
    private boolean _showChartAboveGroupHeader = false;

    /**
     * keeps track of state for field: _showChartAboveGroupHeader
     */
    private boolean _has_showChartAboveGroupHeader;

    /**
     * Field _isCalculatedColumn
     */
    private boolean _isCalculatedColumn = false;

    /**
     * keeps track of state for field: _isCalculatedColumn
     */
    private boolean _has_isCalculatedColumn;

    /**
     * Field _calculatedColumnFunction
     */
    private java.lang.String _calculatedColumnFunction = "sum";

    /**
     * Field _isDetail
     */
    private boolean _isDetail = true;

    /**
     * keeps track of state for field: _isDetail
     */
    private boolean _has_isDetail;

    /**
     * Field _isRowHeader
     */
    private boolean _isRowHeader = false;

    /**
     * keeps track of state for field: _isRowHeader
     */
    private boolean _has_isRowHeader;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _levelName
     */
    private java.lang.String _levelName;

    /**
     * Field _createGroupHeader
     */
    private boolean _createGroupHeader = true;

    /**
     * keeps track of state for field: _createGroupHeader
     */
    private boolean _has_createGroupHeader;

    /**
     * Field _displayName
     */
    private java.lang.String _displayName;

    /**
     * Field _nullString
     */
    private java.lang.String _nullString = "-";

    /**
     * Field _width
     */
    private java.math.BigDecimal _width = new java.math.BigDecimal("15");

    /**
     * Field _widthLocked
     */
    private boolean _widthLocked = false;

    /**
     * keeps track of state for field: _widthLocked
     */
    private boolean _has_widthLocked;

    /**
     * Field _isWidthPercent
     */
    private boolean _isWidthPercent = true;

    /**
     * keeps track of state for field: _isWidthPercent
     */
    private boolean _has_isWidthPercent;

    /**
     * Field _horizontalAlignment
     */
    private java.lang.String _horizontalAlignment = "center";

    /**
     * Field _verticalAlignment
     */
    private java.lang.String _verticalAlignment = "middle";

    /**
     * Field _type
     */
    private int _type = 12;

    /**
     * keeps track of state for field: _type
     */
    private boolean _has_type;

    /**
     * Field _format
     */
    private java.lang.String _format = "";

    /**
     * Field _expression
     */
    private java.lang.String _expression = "none";

    /**
     * Field _useItemHide
     */
    private boolean _useItemHide = false;

    /**
     * keeps track of state for field: _useItemHide
     */
    private boolean _has_useItemHide;

    /**
     * Field _calculateGroupTotals
     */
    private boolean _calculateGroupTotals = true;

    /**
     * keeps track of state for field: _calculateGroupTotals
     */
    private boolean _has_calculateGroupTotals;

    /**
     * Field _groupTotalsLabel
     */
    private java.lang.String _groupTotalsLabel = "Total";

    /**
     * Field _groupTotalsHorizontalAlignment
     */
    private java.lang.String _groupTotalsHorizontalAlignment = "left";

    /**
     * Field _fontName
     */
    private java.lang.String _fontName;

    /**
     * Field _fontStyle
     */
    private int _fontStyle = -1;

    /**
     * keeps track of state for field: _fontStyle
     */
    private boolean _has_fontStyle;

    /**
     * Field _fontSize
     */
    private int _fontSize = -1;

    /**
     * keeps track of state for field: _fontSize
     */
    private boolean _has_fontSize;

    /**
     * Field _fontColor
     */
    private java.lang.String _fontColor;

    /**
     * Field _backgroundColor
     */
    private java.lang.String _backgroundColor = "#FFFFFF";

    /**
     * Field _useBackgroundColor
     */
    private boolean _useBackgroundColor = false;

    /**
     * keeps track of state for field: _useBackgroundColor
     */
    private boolean _has_useBackgroundColor;

    /**
     * Field _groupFooterBackgroundColor
     */
    private java.lang.String _groupFooterBackgroundColor = "#c0d0e0";

    /**
     * Field _useGroupFooterBackgroundColor
     */
    private boolean _useGroupFooterBackgroundColor = true;

    /**
     * keeps track of state for field: _useGroupFooterBackgroundColo
     */
    private boolean _has_useGroupFooterBackgroundColor;

    /**
     * Field _groupPageBreak
     */
    private boolean _groupPageBreak;

    /**
     * keeps track of state for field: _groupPageBreak
     */
    private boolean _has_groupPageBreak;

    /**
     * Field _pageBreakBeforeGroup
     */
    private boolean _pageBreakBeforeGroup;

    /**
     * keeps track of state for field: _pageBreakBeforeGroup
     */
    private boolean _has_pageBreakBeforeGroup;

    /**
     * Field _pageBreakAfterGroup
     */
    private boolean _pageBreakAfterGroup;

    /**
     * keeps track of state for field: _pageBreakAfterGroup
     */
    private boolean _has_pageBreakAfterGroup;

    /**
     * Field _pageBreakBeforeHeader
     */
    private boolean _pageBreakBeforeHeader = false;

    /**
     * keeps track of state for field: _pageBreakBeforeHeader
     */
    private boolean _has_pageBreakBeforeHeader;

    /**
     * Field _pageBreakAfterHeader
     */
    private boolean _pageBreakAfterHeader = false;

    /**
     * keeps track of state for field: _pageBreakAfterHeader
     */
    private boolean _has_pageBreakAfterHeader;

    /**
     * Field _pageBreakBeforeFooter
     */
    private boolean _pageBreakBeforeFooter = false;

    /**
     * keeps track of state for field: _pageBreakBeforeFooter
     */
    private boolean _has_pageBreakBeforeFooter;

    /**
     * Field _pageBreakAfterFooter
     */
    private boolean _pageBreakAfterFooter = false;

    /**
     * keeps track of state for field: _pageBreakAfterFooter
     */
    private boolean _has_pageBreakAfterFooter;

    /**
     * Field _repeatGroupHeader
     */
    private boolean _repeatGroupHeader = false;

    /**
     * keeps track of state for field: _repeatGroupHeader
     */
    private boolean _has_repeatGroupHeader;

    /**
     * Field _useTrafficLighting
     */
    private boolean _useTrafficLighting = false;

    /**
     * keeps track of state for field: _useTrafficLighting
     */
    private boolean _has_useTrafficLighting;

    /**
     * Field _trafficLightingUseAbsoluteValue
     */
    private boolean _trafficLightingUseAbsoluteValue = false;

    /**
     * keeps track of state for field:
     * _trafficLightingUseAbsoluteValue
     */
    private boolean _has_trafficLightingUseAbsoluteValue;

    /**
     * Field _trafficLightingUseOppositeLogic
     */
    private boolean _trafficLightingUseOppositeLogic = false;

    /**
     * keeps track of state for field:
     * _trafficLightingUseOppositeLogic
     */
    private boolean _has_trafficLightingUseOppositeLogic;

    /**
     * Field _trafficLightingRedColor
     */
    private java.lang.String _trafficLightingRedColor = "#FF0000";

    /**
     * Field _trafficLightingYellowColor
     */
    private java.lang.String _trafficLightingYellowColor = "#FFFF00";

    /**
     * Field _trafficLightingGreenColor
     */
    private java.lang.String _trafficLightingGreenColor = "#00FF00";

    /**
     * Field _trafficLightingRedValue
     */
    private double _trafficLightingRedValue = 250000;

    /**
     * keeps track of state for field: _trafficLightingRedValue
     */
    private boolean _has_trafficLightingRedValue;

    /**
     * Field _trafficLightingYellowValue
     */
    private double _trafficLightingYellowValue = 500000;

    /**
     * keeps track of state for field: _trafficLightingYellowValue
     */
    private boolean _has_trafficLightingYellowValue;

    /**
     * Field _trafficLightingGreenValue
     */
    private double _trafficLightingGreenValue = 750000;

    /**
     * keeps track of state for field: _trafficLightingGreenValue
     */
    private boolean _has_trafficLightingGreenValue;

    /**
     * Field _chart
     */
    private org.pentaho.jfreereport.castormodel.reportspec.Chart _chart;

    /**
     * Field _calculatedColumnsList
     */
    private java.util.List _calculatedColumnsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Field() 
     {
        super();
        setCalculatedColumnFunction("sum");
        setNullString("-");
        setWidth(new java.math.BigDecimal("15"));
        setHorizontalAlignment("center");
        setVerticalAlignment("middle");
        setFormat("");
        setExpression("none");
        setGroupTotalsLabel("Total");
        setGroupTotalsHorizontalAlignment("left");
        setBackgroundColor("#FFFFFF");
        setGroupFooterBackgroundColor("#c0d0e0");
        setTrafficLightingRedColor("#FF0000");
        setTrafficLightingYellowColor("#FFFF00");
        setTrafficLightingGreenColor("#00FF00");
        this._calculatedColumnsList = new java.util.ArrayList();
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Field()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCalculatedColumns
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCalculatedColumns(java.lang.String vCalculatedColumns)
        throws java.lang.IndexOutOfBoundsException
    {
        this._calculatedColumnsList.add(vCalculatedColumns);
    } //-- void addCalculatedColumns(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vCalculatedColumns
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCalculatedColumns(int index, java.lang.String vCalculatedColumns)
        throws java.lang.IndexOutOfBoundsException
    {
        this._calculatedColumnsList.add(index, vCalculatedColumns);
    } //-- void addCalculatedColumns(int, java.lang.String) 

    /**
     */
    public void deleteCalculateGroupTotals()
    {
        this._has_calculateGroupTotals= false;
    } //-- void deleteCalculateGroupTotals() 

    /**
     */
    public void deleteCreateGroupHeader()
    {
        this._has_createGroupHeader= false;
    } //-- void deleteCreateGroupHeader() 

    /**
     */
    public void deleteFontSize()
    {
        this._has_fontSize= false;
    } //-- void deleteFontSize() 

    /**
     */
    public void deleteFontStyle()
    {
        this._has_fontStyle= false;
    } //-- void deleteFontStyle() 

    /**
     */
    public void deleteGroupPageBreak()
    {
        this._has_groupPageBreak= false;
    } //-- void deleteGroupPageBreak() 

    /**
     */
    public void deleteIsCalculatedColumn()
    {
        this._has_isCalculatedColumn= false;
    } //-- void deleteIsCalculatedColumn() 

    /**
     */
    public void deleteIsDetail()
    {
        this._has_isDetail= false;
    } //-- void deleteIsDetail() 

    /**
     */
    public void deleteIsRowHeader()
    {
        this._has_isRowHeader= false;
    } //-- void deleteIsRowHeader() 

    /**
     */
    public void deleteIsWidthPercent()
    {
        this._has_isWidthPercent= false;
    } //-- void deleteIsWidthPercent() 

    /**
     */
    public void deletePageBreakAfterFooter()
    {
        this._has_pageBreakAfterFooter= false;
    } //-- void deletePageBreakAfterFooter() 

    /**
     */
    public void deletePageBreakAfterGroup()
    {
        this._has_pageBreakAfterGroup= false;
    } //-- void deletePageBreakAfterGroup() 

    /**
     */
    public void deletePageBreakAfterHeader()
    {
        this._has_pageBreakAfterHeader= false;
    } //-- void deletePageBreakAfterHeader() 

    /**
     */
    public void deletePageBreakBeforeFooter()
    {
        this._has_pageBreakBeforeFooter= false;
    } //-- void deletePageBreakBeforeFooter() 

    /**
     */
    public void deletePageBreakBeforeGroup()
    {
        this._has_pageBreakBeforeGroup= false;
    } //-- void deletePageBreakBeforeGroup() 

    /**
     */
    public void deletePageBreakBeforeHeader()
    {
        this._has_pageBreakBeforeHeader= false;
    } //-- void deletePageBreakBeforeHeader() 

    /**
     */
    public void deleteRepeatGroupHeader()
    {
        this._has_repeatGroupHeader= false;
    } //-- void deleteRepeatGroupHeader() 

    /**
     */
    public void deleteShowChartAboveGroupHeader()
    {
        this._has_showChartAboveGroupHeader= false;
    } //-- void deleteShowChartAboveGroupHeader() 

    /**
     */
    public void deleteTrafficLightingGreenValue()
    {
        this._has_trafficLightingGreenValue= false;
    } //-- void deleteTrafficLightingGreenValue() 

    /**
     */
    public void deleteTrafficLightingRedValue()
    {
        this._has_trafficLightingRedValue= false;
    } //-- void deleteTrafficLightingRedValue() 

    /**
     */
    public void deleteTrafficLightingUseAbsoluteValue()
    {
        this._has_trafficLightingUseAbsoluteValue= false;
    } //-- void deleteTrafficLightingUseAbsoluteValue() 

    /**
     */
    public void deleteTrafficLightingUseOppositeLogic()
    {
        this._has_trafficLightingUseOppositeLogic= false;
    } //-- void deleteTrafficLightingUseOppositeLogic() 

    /**
     */
    public void deleteTrafficLightingYellowValue()
    {
        this._has_trafficLightingYellowValue= false;
    } //-- void deleteTrafficLightingYellowValue() 

    /**
     */
    public void deleteType()
    {
        this._has_type= false;
    } //-- void deleteType() 

    /**
     */
    public void deleteUseBackgroundColor()
    {
        this._has_useBackgroundColor= false;
    } //-- void deleteUseBackgroundColor() 

    /**
     */
    public void deleteUseChart()
    {
        this._has_useChart= false;
    } //-- void deleteUseChart() 

    /**
     */
    public void deleteUseGroupFooterBackgroundColor()
    {
        this._has_useGroupFooterBackgroundColor= false;
    } //-- void deleteUseGroupFooterBackgroundColor() 

    /**
     */
    public void deleteUseItemHide()
    {
        this._has_useItemHide= false;
    } //-- void deleteUseItemHide() 

    /**
     */
    public void deleteUseTrafficLighting()
    {
        this._has_useTrafficLighting= false;
    } //-- void deleteUseTrafficLighting() 

    /**
     */
    public void deleteWidthLocked()
    {
        this._has_widthLocked= false;
    } //-- void deleteWidthLocked() 

    /**
     * Method enumerateCalculatedColumns
     * 
     * 
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateCalculatedColumns()
    {
        return java.util.Collections.enumeration(this._calculatedColumnsList);
    } //-- java.util.Enumeration enumerateCalculatedColumns() 

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
     * Returns the value of field 'calculateGroupTotals'.
     * 
     * @return the value of field 'CalculateGroupTotals'.
     */
    public boolean getCalculateGroupTotals()
    {
        return this._calculateGroupTotals;
    } //-- boolean getCalculateGroupTotals() 

    /**
     * Returns the value of field 'calculatedColumnFunction'.
     * 
     * @return the value of field 'CalculatedColumnFunction'.
     */
    public java.lang.String getCalculatedColumnFunction()
    {
        return this._calculatedColumnFunction;
    } //-- java.lang.String getCalculatedColumnFunction() 

    /**
     * Method getCalculatedColumns
     * 
     * 
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getCalculatedColumns(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._calculatedColumnsList.size()) {
            throw new IndexOutOfBoundsException("getCalculatedColumns: Index value '" + index + "' not in range [0.." + (this._calculatedColumnsList.size() - 1) + "]");
        }
        
        return (String)_calculatedColumnsList.get(index);
    } //-- java.lang.String getCalculatedColumns(int) 

    /**
     * Method getCalculatedColumns
     * 
     * 
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getCalculatedColumns()
    {
        int size = this._calculatedColumnsList.size();
        java.lang.String[] array = new java.lang.String[size];
        for (int index = 0; index < size; index++){
            array[index] = (String)_calculatedColumnsList.get(index);
        }
        
        return array;
    } //-- java.lang.String[] getCalculatedColumns() 

    /**
     * Method getCalculatedColumnsCount
     * 
     * 
     * 
     * @return the size of this collection
     */
    public int getCalculatedColumnsCount()
    {
        return this._calculatedColumnsList.size();
    } //-- int getCalculatedColumnsCount() 

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
     * Returns the value of field 'createGroupHeader'.
     * 
     * @return the value of field 'CreateGroupHeader'.
     */
    public boolean getCreateGroupHeader()
    {
        return this._createGroupHeader;
    } //-- boolean getCreateGroupHeader() 

    /**
     * Returns the value of field 'displayName'.
     * 
     * @return the value of field 'DisplayName'.
     */
    public java.lang.String getDisplayName()
    {
        return this._displayName;
    } //-- java.lang.String getDisplayName() 

    /**
     * Returns the value of field 'expression'.
     * 
     * @return the value of field 'Expression'.
     */
    public java.lang.String getExpression()
    {
        return this._expression;
    } //-- java.lang.String getExpression() 

    /**
     * Returns the value of field 'fontColor'.
     * 
     * @return the value of field 'FontColor'.
     */
    public java.lang.String getFontColor()
    {
        return this._fontColor;
    } //-- java.lang.String getFontColor() 

    /**
     * Returns the value of field 'fontName'.
     * 
     * @return the value of field 'FontName'.
     */
    public java.lang.String getFontName()
    {
        return this._fontName;
    } //-- java.lang.String getFontName() 

    /**
     * Returns the value of field 'fontSize'.
     * 
     * @return the value of field 'FontSize'.
     */
    public int getFontSize()
    {
        return this._fontSize;
    } //-- int getFontSize() 

    /**
     * Returns the value of field 'fontStyle'.
     * 
     * @return the value of field 'FontStyle'.
     */
    public int getFontStyle()
    {
        return this._fontStyle;
    } //-- int getFontStyle() 

    /**
     * Returns the value of field 'format'.
     * 
     * @return the value of field 'Format'.
     */
    public java.lang.String getFormat()
    {
        return this._format;
    } //-- java.lang.String getFormat() 

    /**
     * Returns the value of field 'groupFooterBackgroundColor'.
     * 
     * @return the value of field 'GroupFooterBackgroundColor'.
     */
    public java.lang.String getGroupFooterBackgroundColor()
    {
        return this._groupFooterBackgroundColor;
    } //-- java.lang.String getGroupFooterBackgroundColor() 

    /**
     * Returns the value of field 'groupPageBreak'.
     * 
     * @return the value of field 'GroupPageBreak'.
     */
    public boolean getGroupPageBreak()
    {
        return this._groupPageBreak;
    } //-- boolean getGroupPageBreak() 

    /**
     * Returns the value of field 'groupTotalsHorizontalAlignment'.
     * 
     * @return the value of field 'GroupTotalsHorizontalAlignment'.
     */
    public java.lang.String getGroupTotalsHorizontalAlignment()
    {
        return this._groupTotalsHorizontalAlignment;
    } //-- java.lang.String getGroupTotalsHorizontalAlignment() 

    /**
     * Returns the value of field 'groupTotalsLabel'.
     * 
     * @return the value of field 'GroupTotalsLabel'.
     */
    public java.lang.String getGroupTotalsLabel()
    {
        return this._groupTotalsLabel;
    } //-- java.lang.String getGroupTotalsLabel() 

    /**
     * Returns the value of field 'horizontalAlignment'.
     * 
     * @return the value of field 'HorizontalAlignment'.
     */
    public java.lang.String getHorizontalAlignment()
    {
        return this._horizontalAlignment;
    } //-- java.lang.String getHorizontalAlignment() 

    /**
     * Returns the value of field 'isCalculatedColumn'.
     * 
     * @return the value of field 'IsCalculatedColumn'.
     */
    public boolean getIsCalculatedColumn()
    {
        return this._isCalculatedColumn;
    } //-- boolean getIsCalculatedColumn() 

    /**
     * Returns the value of field 'isDetail'.
     * 
     * @return the value of field 'IsDetail'.
     */
    public boolean getIsDetail()
    {
        return this._isDetail;
    } //-- boolean getIsDetail() 

    /**
     * Returns the value of field 'isRowHeader'.
     * 
     * @return the value of field 'IsRowHeader'.
     */
    public boolean getIsRowHeader()
    {
        return this._isRowHeader;
    } //-- boolean getIsRowHeader() 

    /**
     * Returns the value of field 'isWidthPercent'.
     * 
     * @return the value of field 'IsWidthPercent'.
     */
    public boolean getIsWidthPercent()
    {
        return this._isWidthPercent;
    } //-- boolean getIsWidthPercent() 

    /**
     * Returns the value of field 'levelName'.
     * 
     * @return the value of field 'LevelName'.
     */
    public java.lang.String getLevelName()
    {
        return this._levelName;
    } //-- java.lang.String getLevelName() 

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
     * Returns the value of field 'nullString'.
     * 
     * @return the value of field 'NullString'.
     */
    public java.lang.String getNullString()
    {
        return this._nullString;
    } //-- java.lang.String getNullString() 

    /**
     * Returns the value of field 'pageBreakAfterFooter'.
     * 
     * @return the value of field 'PageBreakAfterFooter'.
     */
    public boolean getPageBreakAfterFooter()
    {
        return this._pageBreakAfterFooter;
    } //-- boolean getPageBreakAfterFooter() 

    /**
     * Returns the value of field 'pageBreakAfterGroup'.
     * 
     * @return the value of field 'PageBreakAfterGroup'.
     */
    public boolean getPageBreakAfterGroup()
    {
        return this._pageBreakAfterGroup;
    } //-- boolean getPageBreakAfterGroup() 

    /**
     * Returns the value of field 'pageBreakAfterHeader'.
     * 
     * @return the value of field 'PageBreakAfterHeader'.
     */
    public boolean getPageBreakAfterHeader()
    {
        return this._pageBreakAfterHeader;
    } //-- boolean getPageBreakAfterHeader() 

    /**
     * Returns the value of field 'pageBreakBeforeFooter'.
     * 
     * @return the value of field 'PageBreakBeforeFooter'.
     */
    public boolean getPageBreakBeforeFooter()
    {
        return this._pageBreakBeforeFooter;
    } //-- boolean getPageBreakBeforeFooter() 

    /**
     * Returns the value of field 'pageBreakBeforeGroup'.
     * 
     * @return the value of field 'PageBreakBeforeGroup'.
     */
    public boolean getPageBreakBeforeGroup()
    {
        return this._pageBreakBeforeGroup;
    } //-- boolean getPageBreakBeforeGroup() 

    /**
     * Returns the value of field 'pageBreakBeforeHeader'.
     * 
     * @return the value of field 'PageBreakBeforeHeader'.
     */
    public boolean getPageBreakBeforeHeader()
    {
        return this._pageBreakBeforeHeader;
    } //-- boolean getPageBreakBeforeHeader() 

    /**
     * Returns the value of field 'repeatGroupHeader'.
     * 
     * @return the value of field 'RepeatGroupHeader'.
     */
    public boolean getRepeatGroupHeader()
    {
        return this._repeatGroupHeader;
    } //-- boolean getRepeatGroupHeader() 

    /**
     * Returns the value of field 'showChartAboveGroupHeader'.
     * 
     * @return the value of field 'ShowChartAboveGroupHeader'.
     */
    public boolean getShowChartAboveGroupHeader()
    {
        return this._showChartAboveGroupHeader;
    } //-- boolean getShowChartAboveGroupHeader() 

    /**
     * Returns the value of field 'trafficLightingGreenColor'.
     * 
     * @return the value of field 'TrafficLightingGreenColor'.
     */
    public java.lang.String getTrafficLightingGreenColor()
    {
        return this._trafficLightingGreenColor;
    } //-- java.lang.String getTrafficLightingGreenColor() 

    /**
     * Returns the value of field 'trafficLightingGreenValue'.
     * 
     * @return the value of field 'TrafficLightingGreenValue'.
     */
    public double getTrafficLightingGreenValue()
    {
        return this._trafficLightingGreenValue;
    } //-- double getTrafficLightingGreenValue() 

    /**
     * Returns the value of field 'trafficLightingRedColor'.
     * 
     * @return the value of field 'TrafficLightingRedColor'.
     */
    public java.lang.String getTrafficLightingRedColor()
    {
        return this._trafficLightingRedColor;
    } //-- java.lang.String getTrafficLightingRedColor() 

    /**
     * Returns the value of field 'trafficLightingRedValue'.
     * 
     * @return the value of field 'TrafficLightingRedValue'.
     */
    public double getTrafficLightingRedValue()
    {
        return this._trafficLightingRedValue;
    } //-- double getTrafficLightingRedValue() 

    /**
     * Returns the value of field
     * 'trafficLightingUseAbsoluteValue'.
     * 
     * @return the value of field 'TrafficLightingUseAbsoluteValue'.
     */
    public boolean getTrafficLightingUseAbsoluteValue()
    {
        return this._trafficLightingUseAbsoluteValue;
    } //-- boolean getTrafficLightingUseAbsoluteValue() 

    /**
     * Returns the value of field
     * 'trafficLightingUseOppositeLogic'.
     * 
     * @return the value of field 'TrafficLightingUseOppositeLogic'.
     */
    public boolean getTrafficLightingUseOppositeLogic()
    {
        return this._trafficLightingUseOppositeLogic;
    } //-- boolean getTrafficLightingUseOppositeLogic() 

    /**
     * Returns the value of field 'trafficLightingYellowColor'.
     * 
     * @return the value of field 'TrafficLightingYellowColor'.
     */
    public java.lang.String getTrafficLightingYellowColor()
    {
        return this._trafficLightingYellowColor;
    } //-- java.lang.String getTrafficLightingYellowColor() 

    /**
     * Returns the value of field 'trafficLightingYellowValue'.
     * 
     * @return the value of field 'TrafficLightingYellowValue'.
     */
    public double getTrafficLightingYellowValue()
    {
        return this._trafficLightingYellowValue;
    } //-- double getTrafficLightingYellowValue() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public int getType()
    {
        return this._type;
    } //-- int getType() 

    /**
     * Returns the value of field 'useBackgroundColor'.
     * 
     * @return the value of field 'UseBackgroundColor'.
     */
    public boolean getUseBackgroundColor()
    {
        return this._useBackgroundColor;
    } //-- boolean getUseBackgroundColor() 

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
     * Returns the value of field 'useGroupFooterBackgroundColor'.
     * 
     * @return the value of field 'UseGroupFooterBackgroundColor'.
     */
    public boolean getUseGroupFooterBackgroundColor()
    {
        return this._useGroupFooterBackgroundColor;
    } //-- boolean getUseGroupFooterBackgroundColor() 

    /**
     * Returns the value of field 'useItemHide'.
     * 
     * @return the value of field 'UseItemHide'.
     */
    public boolean getUseItemHide()
    {
        return this._useItemHide;
    } //-- boolean getUseItemHide() 

    /**
     * Returns the value of field 'useTrafficLighting'.
     * 
     * @return the value of field 'UseTrafficLighting'.
     */
    public boolean getUseTrafficLighting()
    {
        return this._useTrafficLighting;
    } //-- boolean getUseTrafficLighting() 

    /**
     * Returns the value of field 'verticalAlignment'.
     * 
     * @return the value of field 'VerticalAlignment'.
     */
    public java.lang.String getVerticalAlignment()
    {
        return this._verticalAlignment;
    } //-- java.lang.String getVerticalAlignment() 

    /**
     * Returns the value of field 'width'.
     * 
     * @return the value of field 'Width'.
     */
    public java.math.BigDecimal getWidth()
    {
        return this._width;
    } //-- java.math.BigDecimal getWidth() 

    /**
     * Returns the value of field 'widthLocked'.
     * 
     * @return the value of field 'WidthLocked'.
     */
    public boolean getWidthLocked()
    {
        return this._widthLocked;
    } //-- boolean getWidthLocked() 

    /**
     * Method hasCalculateGroupTotals
     * 
     * 
     * 
     * @return true if at least one CalculateGroupTotals has been
     * added
     */
    public boolean hasCalculateGroupTotals()
    {
        return this._has_calculateGroupTotals;
    } //-- boolean hasCalculateGroupTotals() 

    /**
     * Method hasCreateGroupHeader
     * 
     * 
     * 
     * @return true if at least one CreateGroupHeader has been added
     */
    public boolean hasCreateGroupHeader()
    {
        return this._has_createGroupHeader;
    } //-- boolean hasCreateGroupHeader() 

    /**
     * Method hasFontSize
     * 
     * 
     * 
     * @return true if at least one FontSize has been added
     */
    public boolean hasFontSize()
    {
        return this._has_fontSize;
    } //-- boolean hasFontSize() 

    /**
     * Method hasFontStyle
     * 
     * 
     * 
     * @return true if at least one FontStyle has been added
     */
    public boolean hasFontStyle()
    {
        return this._has_fontStyle;
    } //-- boolean hasFontStyle() 

    /**
     * Method hasGroupPageBreak
     * 
     * 
     * 
     * @return true if at least one GroupPageBreak has been added
     */
    public boolean hasGroupPageBreak()
    {
        return this._has_groupPageBreak;
    } //-- boolean hasGroupPageBreak() 

    /**
     * Method hasIsCalculatedColumn
     * 
     * 
     * 
     * @return true if at least one IsCalculatedColumn has been adde
     */
    public boolean hasIsCalculatedColumn()
    {
        return this._has_isCalculatedColumn;
    } //-- boolean hasIsCalculatedColumn() 

    /**
     * Method hasIsDetail
     * 
     * 
     * 
     * @return true if at least one IsDetail has been added
     */
    public boolean hasIsDetail()
    {
        return this._has_isDetail;
    } //-- boolean hasIsDetail() 

    /**
     * Method hasIsRowHeader
     * 
     * 
     * 
     * @return true if at least one IsRowHeader has been added
     */
    public boolean hasIsRowHeader()
    {
        return this._has_isRowHeader;
    } //-- boolean hasIsRowHeader() 

    /**
     * Method hasIsWidthPercent
     * 
     * 
     * 
     * @return true if at least one IsWidthPercent has been added
     */
    public boolean hasIsWidthPercent()
    {
        return this._has_isWidthPercent;
    } //-- boolean hasIsWidthPercent() 

    /**
     * Method hasPageBreakAfterFooter
     * 
     * 
     * 
     * @return true if at least one PageBreakAfterFooter has been
     * added
     */
    public boolean hasPageBreakAfterFooter()
    {
        return this._has_pageBreakAfterFooter;
    } //-- boolean hasPageBreakAfterFooter() 

    /**
     * Method hasPageBreakAfterGroup
     * 
     * 
     * 
     * @return true if at least one PageBreakAfterGroup has been
     * added
     */
    public boolean hasPageBreakAfterGroup()
    {
        return this._has_pageBreakAfterGroup;
    } //-- boolean hasPageBreakAfterGroup() 

    /**
     * Method hasPageBreakAfterHeader
     * 
     * 
     * 
     * @return true if at least one PageBreakAfterHeader has been
     * added
     */
    public boolean hasPageBreakAfterHeader()
    {
        return this._has_pageBreakAfterHeader;
    } //-- boolean hasPageBreakAfterHeader() 

    /**
     * Method hasPageBreakBeforeFooter
     * 
     * 
     * 
     * @return true if at least one PageBreakBeforeFooter has been
     * added
     */
    public boolean hasPageBreakBeforeFooter()
    {
        return this._has_pageBreakBeforeFooter;
    } //-- boolean hasPageBreakBeforeFooter() 

    /**
     * Method hasPageBreakBeforeGroup
     * 
     * 
     * 
     * @return true if at least one PageBreakBeforeGroup has been
     * added
     */
    public boolean hasPageBreakBeforeGroup()
    {
        return this._has_pageBreakBeforeGroup;
    } //-- boolean hasPageBreakBeforeGroup() 

    /**
     * Method hasPageBreakBeforeHeader
     * 
     * 
     * 
     * @return true if at least one PageBreakBeforeHeader has been
     * added
     */
    public boolean hasPageBreakBeforeHeader()
    {
        return this._has_pageBreakBeforeHeader;
    } //-- boolean hasPageBreakBeforeHeader() 

    /**
     * Method hasRepeatGroupHeader
     * 
     * 
     * 
     * @return true if at least one RepeatGroupHeader has been added
     */
    public boolean hasRepeatGroupHeader()
    {
        return this._has_repeatGroupHeader;
    } //-- boolean hasRepeatGroupHeader() 

    /**
     * Method hasShowChartAboveGroupHeader
     * 
     * 
     * 
     * @return true if at least one ShowChartAboveGroupHeader has
     * been added
     */
    public boolean hasShowChartAboveGroupHeader()
    {
        return this._has_showChartAboveGroupHeader;
    } //-- boolean hasShowChartAboveGroupHeader() 

    /**
     * Method hasTrafficLightingGreenValue
     * 
     * 
     * 
     * @return true if at least one TrafficLightingGreenValue has
     * been added
     */
    public boolean hasTrafficLightingGreenValue()
    {
        return this._has_trafficLightingGreenValue;
    } //-- boolean hasTrafficLightingGreenValue() 

    /**
     * Method hasTrafficLightingRedValue
     * 
     * 
     * 
     * @return true if at least one TrafficLightingRedValue has
     * been added
     */
    public boolean hasTrafficLightingRedValue()
    {
        return this._has_trafficLightingRedValue;
    } //-- boolean hasTrafficLightingRedValue() 

    /**
     * Method hasTrafficLightingUseAbsoluteValue
     * 
     * 
     * 
     * @return true if at least one TrafficLightingUseAbsoluteValue
     * has been added
     */
    public boolean hasTrafficLightingUseAbsoluteValue()
    {
        return this._has_trafficLightingUseAbsoluteValue;
    } //-- boolean hasTrafficLightingUseAbsoluteValue() 

    /**
     * Method hasTrafficLightingUseOppositeLogic
     * 
     * 
     * 
     * @return true if at least one TrafficLightingUseOppositeLogic
     * has been added
     */
    public boolean hasTrafficLightingUseOppositeLogic()
    {
        return this._has_trafficLightingUseOppositeLogic;
    } //-- boolean hasTrafficLightingUseOppositeLogic() 

    /**
     * Method hasTrafficLightingYellowValue
     * 
     * 
     * 
     * @return true if at least one TrafficLightingYellowValue has
     * been added
     */
    public boolean hasTrafficLightingYellowValue()
    {
        return this._has_trafficLightingYellowValue;
    } //-- boolean hasTrafficLightingYellowValue() 

    /**
     * Method hasType
     * 
     * 
     * 
     * @return true if at least one Type has been added
     */
    public boolean hasType()
    {
        return this._has_type;
    } //-- boolean hasType() 

    /**
     * Method hasUseBackgroundColor
     * 
     * 
     * 
     * @return true if at least one UseBackgroundColor has been adde
     */
    public boolean hasUseBackgroundColor()
    {
        return this._has_useBackgroundColor;
    } //-- boolean hasUseBackgroundColor() 

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
     * Method hasUseGroupFooterBackgroundColor
     * 
     * 
     * 
     * @return true if at least one UseGroupFooterBackgroundColor
     * has been added
     */
    public boolean hasUseGroupFooterBackgroundColor()
    {
        return this._has_useGroupFooterBackgroundColor;
    } //-- boolean hasUseGroupFooterBackgroundColor() 

    /**
     * Method hasUseItemHide
     * 
     * 
     * 
     * @return true if at least one UseItemHide has been added
     */
    public boolean hasUseItemHide()
    {
        return this._has_useItemHide;
    } //-- boolean hasUseItemHide() 

    /**
     * Method hasUseTrafficLighting
     * 
     * 
     * 
     * @return true if at least one UseTrafficLighting has been adde
     */
    public boolean hasUseTrafficLighting()
    {
        return this._has_useTrafficLighting;
    } //-- boolean hasUseTrafficLighting() 

    /**
     * Method hasWidthLocked
     * 
     * 
     * 
     * @return true if at least one WidthLocked has been added
     */
    public boolean hasWidthLocked()
    {
        return this._has_widthLocked;
    } //-- boolean hasWidthLocked() 

    /**
     * Returns the value of field 'calculateGroupTotals'.
     * 
     * @return the value of field 'CalculateGroupTotals'.
     */
    public boolean isCalculateGroupTotals()
    {
        return this._calculateGroupTotals;
    } //-- boolean isCalculateGroupTotals() 

    /**
     * Returns the value of field 'createGroupHeader'.
     * 
     * @return the value of field 'CreateGroupHeader'.
     */
    public boolean isCreateGroupHeader()
    {
        return this._createGroupHeader;
    } //-- boolean isCreateGroupHeader() 

    /**
     * Returns the value of field 'groupPageBreak'.
     * 
     * @return the value of field 'GroupPageBreak'.
     */
    public boolean isGroupPageBreak()
    {
        return this._groupPageBreak;
    } //-- boolean isGroupPageBreak() 

    /**
     * Returns the value of field 'isCalculatedColumn'.
     * 
     * @return the value of field 'IsCalculatedColumn'.
     */
    public boolean isIsCalculatedColumn()
    {
        return this._isCalculatedColumn;
    } //-- boolean isIsCalculatedColumn() 

    /**
     * Returns the value of field 'isDetail'.
     * 
     * @return the value of field 'IsDetail'.
     */
    public boolean isIsDetail()
    {
        return this._isDetail;
    } //-- boolean isIsDetail() 

    /**
     * Returns the value of field 'isRowHeader'.
     * 
     * @return the value of field 'IsRowHeader'.
     */
    public boolean isIsRowHeader()
    {
        return this._isRowHeader;
    } //-- boolean isIsRowHeader() 

    /**
     * Returns the value of field 'isWidthPercent'.
     * 
     * @return the value of field 'IsWidthPercent'.
     */
    public boolean isIsWidthPercent()
    {
        return this._isWidthPercent;
    } //-- boolean isIsWidthPercent() 

    /**
     * Returns the value of field 'pageBreakAfterFooter'.
     * 
     * @return the value of field 'PageBreakAfterFooter'.
     */
    public boolean isPageBreakAfterFooter()
    {
        return this._pageBreakAfterFooter;
    } //-- boolean isPageBreakAfterFooter() 

    /**
     * Returns the value of field 'pageBreakAfterGroup'.
     * 
     * @return the value of field 'PageBreakAfterGroup'.
     */
    public boolean isPageBreakAfterGroup()
    {
        return this._pageBreakAfterGroup;
    } //-- boolean isPageBreakAfterGroup() 

    /**
     * Returns the value of field 'pageBreakAfterHeader'.
     * 
     * @return the value of field 'PageBreakAfterHeader'.
     */
    public boolean isPageBreakAfterHeader()
    {
        return this._pageBreakAfterHeader;
    } //-- boolean isPageBreakAfterHeader() 

    /**
     * Returns the value of field 'pageBreakBeforeFooter'.
     * 
     * @return the value of field 'PageBreakBeforeFooter'.
     */
    public boolean isPageBreakBeforeFooter()
    {
        return this._pageBreakBeforeFooter;
    } //-- boolean isPageBreakBeforeFooter() 

    /**
     * Returns the value of field 'pageBreakBeforeGroup'.
     * 
     * @return the value of field 'PageBreakBeforeGroup'.
     */
    public boolean isPageBreakBeforeGroup()
    {
        return this._pageBreakBeforeGroup;
    } //-- boolean isPageBreakBeforeGroup() 

    /**
     * Returns the value of field 'pageBreakBeforeHeader'.
     * 
     * @return the value of field 'PageBreakBeforeHeader'.
     */
    public boolean isPageBreakBeforeHeader()
    {
        return this._pageBreakBeforeHeader;
    } //-- boolean isPageBreakBeforeHeader() 

    /**
     * Returns the value of field 'repeatGroupHeader'.
     * 
     * @return the value of field 'RepeatGroupHeader'.
     */
    public boolean isRepeatGroupHeader()
    {
        return this._repeatGroupHeader;
    } //-- boolean isRepeatGroupHeader() 

    /**
     * Returns the value of field 'showChartAboveGroupHeader'.
     * 
     * @return the value of field 'ShowChartAboveGroupHeader'.
     */
    public boolean isShowChartAboveGroupHeader()
    {
        return this._showChartAboveGroupHeader;
    } //-- boolean isShowChartAboveGroupHeader() 

    /**
     * Returns the value of field
     * 'trafficLightingUseAbsoluteValue'.
     * 
     * @return the value of field 'TrafficLightingUseAbsoluteValue'.
     */
    public boolean isTrafficLightingUseAbsoluteValue()
    {
        return this._trafficLightingUseAbsoluteValue;
    } //-- boolean isTrafficLightingUseAbsoluteValue() 

    /**
     * Returns the value of field
     * 'trafficLightingUseOppositeLogic'.
     * 
     * @return the value of field 'TrafficLightingUseOppositeLogic'.
     */
    public boolean isTrafficLightingUseOppositeLogic()
    {
        return this._trafficLightingUseOppositeLogic;
    } //-- boolean isTrafficLightingUseOppositeLogic() 

    /**
     * Returns the value of field 'useBackgroundColor'.
     * 
     * @return the value of field 'UseBackgroundColor'.
     */
    public boolean isUseBackgroundColor()
    {
        return this._useBackgroundColor;
    } //-- boolean isUseBackgroundColor() 

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
     * Returns the value of field 'useGroupFooterBackgroundColor'.
     * 
     * @return the value of field 'UseGroupFooterBackgroundColor'.
     */
    public boolean isUseGroupFooterBackgroundColor()
    {
        return this._useGroupFooterBackgroundColor;
    } //-- boolean isUseGroupFooterBackgroundColor() 

    /**
     * Returns the value of field 'useItemHide'.
     * 
     * @return the value of field 'UseItemHide'.
     */
    public boolean isUseItemHide()
    {
        return this._useItemHide;
    } //-- boolean isUseItemHide() 

    /**
     * Returns the value of field 'useTrafficLighting'.
     * 
     * @return the value of field 'UseTrafficLighting'.
     */
    public boolean isUseTrafficLighting()
    {
        return this._useTrafficLighting;
    } //-- boolean isUseTrafficLighting() 

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
     * Returns the value of field 'widthLocked'.
     * 
     * @return the value of field 'WidthLocked'.
     */
    public boolean isWidthLocked()
    {
        return this._widthLocked;
    } //-- boolean isWidthLocked() 

    /**
     * Method iterateCalculatedColumns
     * 
     * 
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateCalculatedColumns()
    {
        return this._calculatedColumnsList.iterator();
    } //-- java.util.Iterator iterateCalculatedColumns() 

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
    public void removeAllCalculatedColumns()
    {
        this._calculatedColumnsList.clear();
    } //-- void removeAllCalculatedColumns() 

    /**
     * Method removeCalculatedColumns
     * 
     * 
     * 
     * @param vCalculatedColumns
     * @return true if the object was removed from the collection.
     */
    public boolean removeCalculatedColumns(java.lang.String vCalculatedColumns)
    {
        boolean removed = _calculatedColumnsList.remove(vCalculatedColumns);
        return removed;
    } //-- boolean removeCalculatedColumns(java.lang.String) 

    /**
     * Method removeCalculatedColumnsAt
     * 
     * 
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeCalculatedColumnsAt(int index)
    {
        Object obj = this._calculatedColumnsList.remove(index);
        return (String)obj;
    } //-- java.lang.String removeCalculatedColumnsAt(int) 

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
     * Sets the value of field 'calculateGroupTotals'.
     * 
     * @param calculateGroupTotals the value of field
     * 'calculateGroupTotals'.
     */
    public void setCalculateGroupTotals(boolean calculateGroupTotals)
    {
        this._calculateGroupTotals = calculateGroupTotals;
        this._has_calculateGroupTotals = true;
    } //-- void setCalculateGroupTotals(boolean) 

    /**
     * Sets the value of field 'calculatedColumnFunction'.
     * 
     * @param calculatedColumnFunction the value of field
     * 'calculatedColumnFunction'.
     */
    public void setCalculatedColumnFunction(java.lang.String calculatedColumnFunction)
    {
        this._calculatedColumnFunction = calculatedColumnFunction;
    } //-- void setCalculatedColumnFunction(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vCalculatedColumns
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCalculatedColumns(int index, java.lang.String vCalculatedColumns)
        throws java.lang.IndexOutOfBoundsException
    {
        // check bounds for index
        if (index < 0 || index >= this._calculatedColumnsList.size()) {
            throw new IndexOutOfBoundsException("setCalculatedColumns: Index value '" + index + "' not in range [0.." + (this._calculatedColumnsList.size() - 1) + "]");
        }
        
        this._calculatedColumnsList.set(index, vCalculatedColumns);
    } //-- void setCalculatedColumns(int, java.lang.String) 

    /**
     * 
     * 
     * @param vCalculatedColumnsArray
     */
    public void setCalculatedColumns(java.lang.String[] vCalculatedColumnsArray)
    {
        //-- copy array
        _calculatedColumnsList.clear();
        
        for (int i = 0; i < vCalculatedColumnsArray.length; i++) {
                this._calculatedColumnsList.add(vCalculatedColumnsArray[i]);
        }
    } //-- void setCalculatedColumns(java.lang.String) 

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
     * Sets the value of field 'createGroupHeader'.
     * 
     * @param createGroupHeader the value of field
     * 'createGroupHeader'.
     */
    public void setCreateGroupHeader(boolean createGroupHeader)
    {
        this._createGroupHeader = createGroupHeader;
        this._has_createGroupHeader = true;
    } //-- void setCreateGroupHeader(boolean) 

    /**
     * Sets the value of field 'displayName'.
     * 
     * @param displayName the value of field 'displayName'.
     */
    public void setDisplayName(java.lang.String displayName)
    {
        this._displayName = displayName;
    } //-- void setDisplayName(java.lang.String) 

    /**
     * Sets the value of field 'expression'.
     * 
     * @param expression the value of field 'expression'.
     */
    public void setExpression(java.lang.String expression)
    {
        this._expression = expression;
    } //-- void setExpression(java.lang.String) 

    /**
     * Sets the value of field 'fontColor'.
     * 
     * @param fontColor the value of field 'fontColor'.
     */
    public void setFontColor(java.lang.String fontColor)
    {
        this._fontColor = fontColor;
    } //-- void setFontColor(java.lang.String) 

    /**
     * Sets the value of field 'fontName'.
     * 
     * @param fontName the value of field 'fontName'.
     */
    public void setFontName(java.lang.String fontName)
    {
        this._fontName = fontName;
    } //-- void setFontName(java.lang.String) 

    /**
     * Sets the value of field 'fontSize'.
     * 
     * @param fontSize the value of field 'fontSize'.
     */
    public void setFontSize(int fontSize)
    {
        this._fontSize = fontSize;
        this._has_fontSize = true;
    } //-- void setFontSize(int) 

    /**
     * Sets the value of field 'fontStyle'.
     * 
     * @param fontStyle the value of field 'fontStyle'.
     */
    public void setFontStyle(int fontStyle)
    {
        this._fontStyle = fontStyle;
        this._has_fontStyle = true;
    } //-- void setFontStyle(int) 

    /**
     * Sets the value of field 'format'.
     * 
     * @param format the value of field 'format'.
     */
    public void setFormat(java.lang.String format)
    {
        this._format = format;
    } //-- void setFormat(java.lang.String) 

    /**
     * Sets the value of field 'groupFooterBackgroundColor'.
     * 
     * @param groupFooterBackgroundColor the value of field
     * 'groupFooterBackgroundColor'.
     */
    public void setGroupFooterBackgroundColor(java.lang.String groupFooterBackgroundColor)
    {
        this._groupFooterBackgroundColor = groupFooterBackgroundColor;
    } //-- void setGroupFooterBackgroundColor(java.lang.String) 

    /**
     * Sets the value of field 'groupPageBreak'.
     * 
     * @param groupPageBreak the value of field 'groupPageBreak'.
     */
    public void setGroupPageBreak(boolean groupPageBreak)
    {
        this._groupPageBreak = groupPageBreak;
        this._has_groupPageBreak = true;
    } //-- void setGroupPageBreak(boolean) 

    /**
     * Sets the value of field 'groupTotalsHorizontalAlignment'.
     * 
     * @param groupTotalsHorizontalAlignment the value of field
     * 'groupTotalsHorizontalAlignment'.
     */
    public void setGroupTotalsHorizontalAlignment(java.lang.String groupTotalsHorizontalAlignment)
    {
        this._groupTotalsHorizontalAlignment = groupTotalsHorizontalAlignment;
    } //-- void setGroupTotalsHorizontalAlignment(java.lang.String) 

    /**
     * Sets the value of field 'groupTotalsLabel'.
     * 
     * @param groupTotalsLabel the value of field 'groupTotalsLabel'
     */
    public void setGroupTotalsLabel(java.lang.String groupTotalsLabel)
    {
        this._groupTotalsLabel = groupTotalsLabel;
    } //-- void setGroupTotalsLabel(java.lang.String) 

    /**
     * Sets the value of field 'horizontalAlignment'.
     * 
     * @param horizontalAlignment the value of field
     * 'horizontalAlignment'.
     */
    public void setHorizontalAlignment(java.lang.String horizontalAlignment)
    {
        this._horizontalAlignment = horizontalAlignment;
    } //-- void setHorizontalAlignment(java.lang.String) 

    /**
     * Sets the value of field 'isCalculatedColumn'.
     * 
     * @param isCalculatedColumn the value of field
     * 'isCalculatedColumn'.
     */
    public void setIsCalculatedColumn(boolean isCalculatedColumn)
    {
        this._isCalculatedColumn = isCalculatedColumn;
        this._has_isCalculatedColumn = true;
    } //-- void setIsCalculatedColumn(boolean) 

    /**
     * Sets the value of field 'isDetail'.
     * 
     * @param isDetail the value of field 'isDetail'.
     */
    public void setIsDetail(boolean isDetail)
    {
        this._isDetail = isDetail;
        this._has_isDetail = true;
    } //-- void setIsDetail(boolean) 

    /**
     * Sets the value of field 'isRowHeader'.
     * 
     * @param isRowHeader the value of field 'isRowHeader'.
     */
    public void setIsRowHeader(boolean isRowHeader)
    {
        this._isRowHeader = isRowHeader;
        this._has_isRowHeader = true;
    } //-- void setIsRowHeader(boolean) 

    /**
     * Sets the value of field 'isWidthPercent'.
     * 
     * @param isWidthPercent the value of field 'isWidthPercent'.
     */
    public void setIsWidthPercent(boolean isWidthPercent)
    {
        this._isWidthPercent = isWidthPercent;
        this._has_isWidthPercent = true;
    } //-- void setIsWidthPercent(boolean) 

    /**
     * Sets the value of field 'levelName'.
     * 
     * @param levelName the value of field 'levelName'.
     */
    public void setLevelName(java.lang.String levelName)
    {
        this._levelName = levelName;
    } //-- void setLevelName(java.lang.String) 

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
     * Sets the value of field 'nullString'.
     * 
     * @param nullString the value of field 'nullString'.
     */
    public void setNullString(java.lang.String nullString)
    {
        this._nullString = nullString;
    } //-- void setNullString(java.lang.String) 

    /**
     * Sets the value of field 'pageBreakAfterFooter'.
     * 
     * @param pageBreakAfterFooter the value of field
     * 'pageBreakAfterFooter'.
     */
    public void setPageBreakAfterFooter(boolean pageBreakAfterFooter)
    {
        this._pageBreakAfterFooter = pageBreakAfterFooter;
        this._has_pageBreakAfterFooter = true;
    } //-- void setPageBreakAfterFooter(boolean) 

    /**
     * Sets the value of field 'pageBreakAfterGroup'.
     * 
     * @param pageBreakAfterGroup the value of field
     * 'pageBreakAfterGroup'.
     */
    public void setPageBreakAfterGroup(boolean pageBreakAfterGroup)
    {
        this._pageBreakAfterGroup = pageBreakAfterGroup;
        this._has_pageBreakAfterGroup = true;
    } //-- void setPageBreakAfterGroup(boolean) 

    /**
     * Sets the value of field 'pageBreakAfterHeader'.
     * 
     * @param pageBreakAfterHeader the value of field
     * 'pageBreakAfterHeader'.
     */
    public void setPageBreakAfterHeader(boolean pageBreakAfterHeader)
    {
        this._pageBreakAfterHeader = pageBreakAfterHeader;
        this._has_pageBreakAfterHeader = true;
    } //-- void setPageBreakAfterHeader(boolean) 

    /**
     * Sets the value of field 'pageBreakBeforeFooter'.
     * 
     * @param pageBreakBeforeFooter the value of field
     * 'pageBreakBeforeFooter'.
     */
    public void setPageBreakBeforeFooter(boolean pageBreakBeforeFooter)
    {
        this._pageBreakBeforeFooter = pageBreakBeforeFooter;
        this._has_pageBreakBeforeFooter = true;
    } //-- void setPageBreakBeforeFooter(boolean) 

    /**
     * Sets the value of field 'pageBreakBeforeGroup'.
     * 
     * @param pageBreakBeforeGroup the value of field
     * 'pageBreakBeforeGroup'.
     */
    public void setPageBreakBeforeGroup(boolean pageBreakBeforeGroup)
    {
        this._pageBreakBeforeGroup = pageBreakBeforeGroup;
        this._has_pageBreakBeforeGroup = true;
    } //-- void setPageBreakBeforeGroup(boolean) 

    /**
     * Sets the value of field 'pageBreakBeforeHeader'.
     * 
     * @param pageBreakBeforeHeader the value of field
     * 'pageBreakBeforeHeader'.
     */
    public void setPageBreakBeforeHeader(boolean pageBreakBeforeHeader)
    {
        this._pageBreakBeforeHeader = pageBreakBeforeHeader;
        this._has_pageBreakBeforeHeader = true;
    } //-- void setPageBreakBeforeHeader(boolean) 

    /**
     * Sets the value of field 'repeatGroupHeader'.
     * 
     * @param repeatGroupHeader the value of field
     * 'repeatGroupHeader'.
     */
    public void setRepeatGroupHeader(boolean repeatGroupHeader)
    {
        this._repeatGroupHeader = repeatGroupHeader;
        this._has_repeatGroupHeader = true;
    } //-- void setRepeatGroupHeader(boolean) 

    /**
     * Sets the value of field 'showChartAboveGroupHeader'.
     * 
     * @param showChartAboveGroupHeader the value of field
     * 'showChartAboveGroupHeader'.
     */
    public void setShowChartAboveGroupHeader(boolean showChartAboveGroupHeader)
    {
        this._showChartAboveGroupHeader = showChartAboveGroupHeader;
        this._has_showChartAboveGroupHeader = true;
    } //-- void setShowChartAboveGroupHeader(boolean) 

    /**
     * Sets the value of field 'trafficLightingGreenColor'.
     * 
     * @param trafficLightingGreenColor the value of field
     * 'trafficLightingGreenColor'.
     */
    public void setTrafficLightingGreenColor(java.lang.String trafficLightingGreenColor)
    {
        this._trafficLightingGreenColor = trafficLightingGreenColor;
    } //-- void setTrafficLightingGreenColor(java.lang.String) 

    /**
     * Sets the value of field 'trafficLightingGreenValue'.
     * 
     * @param trafficLightingGreenValue the value of field
     * 'trafficLightingGreenValue'.
     */
    public void setTrafficLightingGreenValue(double trafficLightingGreenValue)
    {
        this._trafficLightingGreenValue = trafficLightingGreenValue;
        this._has_trafficLightingGreenValue = true;
    } //-- void setTrafficLightingGreenValue(double) 

    /**
     * Sets the value of field 'trafficLightingRedColor'.
     * 
     * @param trafficLightingRedColor the value of field
     * 'trafficLightingRedColor'.
     */
    public void setTrafficLightingRedColor(java.lang.String trafficLightingRedColor)
    {
        this._trafficLightingRedColor = trafficLightingRedColor;
    } //-- void setTrafficLightingRedColor(java.lang.String) 

    /**
     * Sets the value of field 'trafficLightingRedValue'.
     * 
     * @param trafficLightingRedValue the value of field
     * 'trafficLightingRedValue'.
     */
    public void setTrafficLightingRedValue(double trafficLightingRedValue)
    {
        this._trafficLightingRedValue = trafficLightingRedValue;
        this._has_trafficLightingRedValue = true;
    } //-- void setTrafficLightingRedValue(double) 

    /**
     * Sets the value of field 'trafficLightingUseAbsoluteValue'.
     * 
     * @param trafficLightingUseAbsoluteValue the value of field
     * 'trafficLightingUseAbsoluteValue'.
     */
    public void setTrafficLightingUseAbsoluteValue(boolean trafficLightingUseAbsoluteValue)
    {
        this._trafficLightingUseAbsoluteValue = trafficLightingUseAbsoluteValue;
        this._has_trafficLightingUseAbsoluteValue = true;
    } //-- void setTrafficLightingUseAbsoluteValue(boolean) 

    /**
     * Sets the value of field 'trafficLightingUseOppositeLogic'.
     * 
     * @param trafficLightingUseOppositeLogic the value of field
     * 'trafficLightingUseOppositeLogic'.
     */
    public void setTrafficLightingUseOppositeLogic(boolean trafficLightingUseOppositeLogic)
    {
        this._trafficLightingUseOppositeLogic = trafficLightingUseOppositeLogic;
        this._has_trafficLightingUseOppositeLogic = true;
    } //-- void setTrafficLightingUseOppositeLogic(boolean) 

    /**
     * Sets the value of field 'trafficLightingYellowColor'.
     * 
     * @param trafficLightingYellowColor the value of field
     * 'trafficLightingYellowColor'.
     */
    public void setTrafficLightingYellowColor(java.lang.String trafficLightingYellowColor)
    {
        this._trafficLightingYellowColor = trafficLightingYellowColor;
    } //-- void setTrafficLightingYellowColor(java.lang.String) 

    /**
     * Sets the value of field 'trafficLightingYellowValue'.
     * 
     * @param trafficLightingYellowValue the value of field
     * 'trafficLightingYellowValue'.
     */
    public void setTrafficLightingYellowValue(double trafficLightingYellowValue)
    {
        this._trafficLightingYellowValue = trafficLightingYellowValue;
        this._has_trafficLightingYellowValue = true;
    } //-- void setTrafficLightingYellowValue(double) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(int type)
    {
        this._type = type;
        this._has_type = true;
    } //-- void setType(int) 

    /**
     * Sets the value of field 'useBackgroundColor'.
     * 
     * @param useBackgroundColor the value of field
     * 'useBackgroundColor'.
     */
    public void setUseBackgroundColor(boolean useBackgroundColor)
    {
        this._useBackgroundColor = useBackgroundColor;
        this._has_useBackgroundColor = true;
    } //-- void setUseBackgroundColor(boolean) 

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
     * Sets the value of field 'useGroupFooterBackgroundColor'.
     * 
     * @param useGroupFooterBackgroundColor the value of field
     * 'useGroupFooterBackgroundColor'.
     */
    public void setUseGroupFooterBackgroundColor(boolean useGroupFooterBackgroundColor)
    {
        this._useGroupFooterBackgroundColor = useGroupFooterBackgroundColor;
        this._has_useGroupFooterBackgroundColor = true;
    } //-- void setUseGroupFooterBackgroundColor(boolean) 

    /**
     * Sets the value of field 'useItemHide'.
     * 
     * @param useItemHide the value of field 'useItemHide'.
     */
    public void setUseItemHide(boolean useItemHide)
    {
        this._useItemHide = useItemHide;
        this._has_useItemHide = true;
    } //-- void setUseItemHide(boolean) 

    /**
     * Sets the value of field 'useTrafficLighting'.
     * 
     * @param useTrafficLighting the value of field
     * 'useTrafficLighting'.
     */
    public void setUseTrafficLighting(boolean useTrafficLighting)
    {
        this._useTrafficLighting = useTrafficLighting;
        this._has_useTrafficLighting = true;
    } //-- void setUseTrafficLighting(boolean) 

    /**
     * Sets the value of field 'verticalAlignment'.
     * 
     * @param verticalAlignment the value of field
     * 'verticalAlignment'.
     */
    public void setVerticalAlignment(java.lang.String verticalAlignment)
    {
        this._verticalAlignment = verticalAlignment;
    } //-- void setVerticalAlignment(java.lang.String) 

    /**
     * Sets the value of field 'width'.
     * 
     * @param width the value of field 'width'.
     */
    public void setWidth(java.math.BigDecimal width)
    {
        this._width = width;
    } //-- void setWidth(java.math.BigDecimal) 

    /**
     * Sets the value of field 'widthLocked'.
     * 
     * @param widthLocked the value of field 'widthLocked'.
     */
    public void setWidthLocked(boolean widthLocked)
    {
        this._widthLocked = widthLocked;
        this._has_widthLocked = true;
    } //-- void setWidthLocked(boolean) 

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
     * org.pentaho.jfreereport.castormodel.reportspec.Field
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.Field unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.pentaho.jfreereport.castormodel.reportspec.Field) Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.Field.class, reader);
    } //-- org.pentaho.jfreereport.castormodel.reportspec.Field unmarshal(java.io.Reader) 

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
