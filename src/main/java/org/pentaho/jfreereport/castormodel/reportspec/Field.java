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
public class Field implements java.io.Serializable {

    /**
     * Field useChart.
     */
    private boolean useChart = false;

    /**
     * Keeps track of whether primitive field useChart has been set
     * already.
     */
    private boolean _hasuseChart;

    /**
     * Field showChartAboveGroupHeader.
     */
    private boolean showChartAboveGroupHeader = false;

    /**
     * Keeps track of whether primitive field
     * showChartAboveGroupHeader has been set already.
     */
    private boolean _hasshowChartAboveGroupHeader;

    /**
     * Field isCalculatedColumn.
     */
    private boolean isCalculatedColumn = false;

    /**
     * Keeps track of whether primitive field isCalculatedColumn
     * has been set already.
     */
    private boolean _hasisCalculatedColumn;

    /**
     * Field calculatedColumnFunction.
     */
    private java.lang.String calculatedColumnFunction = "sum";

    /**
     * Field isDetail.
     */
    private boolean isDetail = true;

    /**
     * Keeps track of whether primitive field isDetail has been set
     * already.
     */
    private boolean _hasisDetail;

    /**
     * Field isRowHeader.
     */
    private boolean isRowHeader = false;

    /**
     * Keeps track of whether primitive field isRowHeader has been
     * set already.
     */
    private boolean _hasisRowHeader;

    /**
     * Field name.
     */
    private java.lang.String name;

    /**
     * Field levelName.
     */
    private java.lang.String levelName;

    /**
     * Field createGroupHeader.
     */
    private boolean createGroupHeader = true;

    /**
     * Keeps track of whether primitive field createGroupHeader has
     * been set already.
     */
    private boolean _hascreateGroupHeader;

    /**
     * Field displayName.
     */
    private java.lang.String displayName;

    /**
     * Field nullString.
     */
    private java.lang.String nullString = "-";

    /**
     * Field width.
     */
    private java.math.BigDecimal width = new java.math.BigDecimal("15");

    /**
     * Field widthLocked.
     */
    private boolean widthLocked = false;

    /**
     * Keeps track of whether primitive field widthLocked has been
     * set already.
     */
    private boolean _haswidthLocked;

    /**
     * Field isWidthPercent.
     */
    private boolean isWidthPercent = true;

    /**
     * Keeps track of whether primitive field isWidthPercent has
     * been set already.
     */
    private boolean _hasisWidthPercent;

    /**
     * Field horizontalAlignment.
     */
    private java.lang.String horizontalAlignment = "center";

    /**
     * Field verticalAlignment.
     */
    private java.lang.String verticalAlignment = "middle";

    /**
     * Field type.
     */
    private int type = 12;

    /**
     * Keeps track of whether primitive field type has been set
     * already.
     */
    private boolean _hastype;

    /**
     * Field format.
     */
    private java.lang.String format = "";

    /**
     * Field expression.
     */
    private java.lang.String expression = "none";

    /**
     * Field useItemHide.
     */
    private boolean useItemHide = false;

    /**
     * Keeps track of whether primitive field useItemHide has been
     * set already.
     */
    private boolean _hasuseItemHide;

    /**
     * Field calculateGroupTotals.
     */
    private boolean calculateGroupTotals = true;

    /**
     * Keeps track of whether primitive field calculateGroupTotals
     * has been set already.
     */
    private boolean _hascalculateGroupTotals;

    /**
     * Field groupTotalsLabel.
     */
    private java.lang.String groupTotalsLabel = "Total";

    /**
     * Field groupTotalsHorizontalAlignment.
     */
    private java.lang.String groupTotalsHorizontalAlignment = "left";

    /**
     * Field fontName.
     */
    private java.lang.String fontName;

    /**
     * Field fontStyle.
     */
    private int fontStyle = -1;

    /**
     * Keeps track of whether primitive field fontStyle has been
     * set already.
     */
    private boolean _hasfontStyle;

    /**
     * Field fontSize.
     */
    private int fontSize = -1;

    /**
     * Keeps track of whether primitive field fontSize has been set
     * already.
     */
    private boolean _hasfontSize;

    /**
     * Field fontColor.
     */
    private java.lang.String fontColor;

    /**
     * Field backgroundColor.
     */
    private java.lang.String backgroundColor = "#FFFFFF";

    /**
     * Field useBackgroundColor.
     */
    private boolean useBackgroundColor = false;

    /**
     * Keeps track of whether primitive field useBackgroundColor
     * has been set already.
     */
    private boolean _hasuseBackgroundColor;

    /**
     * Field groupFooterBackgroundColor.
     */
    private java.lang.String groupFooterBackgroundColor = "#c0d0e0";

    /**
     * Field useGroupFooterBackgroundColor.
     */
    private boolean useGroupFooterBackgroundColor = true;

    /**
     * Keeps track of whether primitive field
     * useGroupFooterBackgroundColor has been set already.
     */
    private boolean _hasuseGroupFooterBackgroundColor;

    /**
     * Field groupPageBreak.
     */
    private boolean groupPageBreak;

    /**
     * Keeps track of whether primitive field groupPageBreak has
     * been set already.
     */
    private boolean _hasgroupPageBreak;

    /**
     * Field pageBreakBeforeGroup.
     */
    private boolean pageBreakBeforeGroup;

    /**
     * Keeps track of whether primitive field pageBreakBeforeGroup
     * has been set already.
     */
    private boolean _haspageBreakBeforeGroup;

    /**
     * Field pageBreakAfterGroup.
     */
    private boolean pageBreakAfterGroup;

    /**
     * Keeps track of whether primitive field pageBreakAfterGroup
     * has been set already.
     */
    private boolean _haspageBreakAfterGroup;

    /**
     * Field pageBreakBeforeHeader.
     */
    private boolean pageBreakBeforeHeader = false;

    /**
     * Keeps track of whether primitive field pageBreakBeforeHeader
     * has been set already.
     */
    private boolean _haspageBreakBeforeHeader;

    /**
     * Field pageBreakAfterHeader.
     */
    private boolean pageBreakAfterHeader = false;

    /**
     * Keeps track of whether primitive field pageBreakAfterHeader
     * has been set already.
     */
    private boolean _haspageBreakAfterHeader;

    /**
     * Field pageBreakBeforeFooter.
     */
    private boolean pageBreakBeforeFooter = false;

    /**
     * Keeps track of whether primitive field pageBreakBeforeFooter
     * has been set already.
     */
    private boolean _haspageBreakBeforeFooter;

    /**
     * Field pageBreakAfterFooter.
     */
    private boolean pageBreakAfterFooter = false;

    /**
     * Keeps track of whether primitive field pageBreakAfterFooter
     * has been set already.
     */
    private boolean _haspageBreakAfterFooter;

    /**
     * Field repeatGroupHeader.
     */
    private boolean repeatGroupHeader = false;

    /**
     * Keeps track of whether primitive field repeatGroupHeader has
     * been set already.
     */
    private boolean _hasrepeatGroupHeader;

    /**
     * Field useTrafficLighting.
     */
    private boolean useTrafficLighting = false;

    /**
     * Keeps track of whether primitive field useTrafficLighting
     * has been set already.
     */
    private boolean _hasuseTrafficLighting;

    /**
     * Field trafficLightingUseAbsoluteValue.
     */
    private boolean trafficLightingUseAbsoluteValue = false;

    /**
     * Keeps track of whether primitive field
     * trafficLightingUseAbsoluteValue has been set already.
     */
    private boolean _hastrafficLightingUseAbsoluteValue;

    /**
     * Field trafficLightingUseOppositeLogic.
     */
    private boolean trafficLightingUseOppositeLogic = false;

    /**
     * Keeps track of whether primitive field
     * trafficLightingUseOppositeLogic has been set already.
     */
    private boolean _hastrafficLightingUseOppositeLogic;

    /**
     * Field trafficLightingRedColor.
     */
    private java.lang.String trafficLightingRedColor = "#FF0000";

    /**
     * Field trafficLightingYellowColor.
     */
    private java.lang.String trafficLightingYellowColor = "#FFFF00";

    /**
     * Field trafficLightingGreenColor.
     */
    private java.lang.String trafficLightingGreenColor = "#00FF00";

    /**
     * Field trafficLightingRedValue.
     */
    private double trafficLightingRedValue = 250000;

    /**
     * Keeps track of whether primitive field
     * trafficLightingRedValue has been set already.
     */
    private boolean _hastrafficLightingRedValue;

    /**
     * Field trafficLightingYellowValue.
     */
    private double trafficLightingYellowValue = 500000;

    /**
     * Keeps track of whether primitive field
     * trafficLightingYellowValue has been set already.
     */
    private boolean _hastrafficLightingYellowValue;

    /**
     * Field trafficLightingGreenValue.
     */
    private double trafficLightingGreenValue = 750000;

    /**
     * Keeps track of whether primitive field
     * trafficLightingGreenValue has been set already.
     */
    private boolean _hastrafficLightingGreenValue;

    /**
     * Field chart.
     */
    private org.pentaho.jfreereport.castormodel.reportspec.Chart chart;

    private java.util.List<java.lang.String> calculatedColumnsList;

    public Field() {
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
        this.calculatedColumnsList = new java.util.ArrayList<java.lang.String>();
    }

    /**
     * 
     * 
     * @param vCalculatedColumns
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCalculatedColumns(final java.lang.String vCalculatedColumns) throws java.lang.IndexOutOfBoundsException {
        this.calculatedColumnsList.add(vCalculatedColumns);
    }

    /**
     * 
     * 
     * @param index
     * @param vCalculatedColumns
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCalculatedColumns(final int index,final java.lang.String vCalculatedColumns) throws java.lang.IndexOutOfBoundsException {
        this.calculatedColumnsList.add(index, vCalculatedColumns);
    }

    /**
     */
    public void deleteCalculateGroupTotals() {
        this._hascalculateGroupTotals= false;
    }

    /**
     */
    public void deleteCreateGroupHeader() {
        this._hascreateGroupHeader= false;
    }

    /**
     */
    public void deleteFontSize() {
        this._hasfontSize= false;
    }

    /**
     */
    public void deleteFontStyle() {
        this._hasfontStyle= false;
    }

    /**
     */
    public void deleteGroupPageBreak() {
        this._hasgroupPageBreak= false;
    }

    /**
     */
    public void deleteIsCalculatedColumn() {
        this._hasisCalculatedColumn= false;
    }

    /**
     */
    public void deleteIsDetail() {
        this._hasisDetail= false;
    }

    /**
     */
    public void deleteIsRowHeader() {
        this._hasisRowHeader= false;
    }

    /**
     */
    public void deleteIsWidthPercent() {
        this._hasisWidthPercent= false;
    }

    /**
     */
    public void deletePageBreakAfterFooter() {
        this._haspageBreakAfterFooter= false;
    }

    /**
     */
    public void deletePageBreakAfterGroup() {
        this._haspageBreakAfterGroup= false;
    }

    /**
     */
    public void deletePageBreakAfterHeader() {
        this._haspageBreakAfterHeader= false;
    }

    /**
     */
    public void deletePageBreakBeforeFooter() {
        this._haspageBreakBeforeFooter= false;
    }

    /**
     */
    public void deletePageBreakBeforeGroup() {
        this._haspageBreakBeforeGroup= false;
    }

    /**
     */
    public void deletePageBreakBeforeHeader() {
        this._haspageBreakBeforeHeader= false;
    }

    /**
     */
    public void deleteRepeatGroupHeader() {
        this._hasrepeatGroupHeader= false;
    }

    /**
     */
    public void deleteShowChartAboveGroupHeader() {
        this._hasshowChartAboveGroupHeader= false;
    }

    /**
     */
    public void deleteTrafficLightingGreenValue() {
        this._hastrafficLightingGreenValue= false;
    }

    /**
     */
    public void deleteTrafficLightingRedValue() {
        this._hastrafficLightingRedValue= false;
    }

    /**
     */
    public void deleteTrafficLightingUseAbsoluteValue() {
        this._hastrafficLightingUseAbsoluteValue= false;
    }

    /**
     */
    public void deleteTrafficLightingUseOppositeLogic() {
        this._hastrafficLightingUseOppositeLogic= false;
    }

    /**
     */
    public void deleteTrafficLightingYellowValue() {
        this._hastrafficLightingYellowValue= false;
    }

    /**
     */
    public void deleteType() {
        this._hastype= false;
    }

    /**
     */
    public void deleteUseBackgroundColor() {
        this._hasuseBackgroundColor= false;
    }

    /**
     */
    public void deleteUseChart() {
        this._hasuseChart= false;
    }

    /**
     */
    public void deleteUseGroupFooterBackgroundColor() {
        this._hasuseGroupFooterBackgroundColor= false;
    }

    /**
     */
    public void deleteUseItemHide() {
        this._hasuseItemHide= false;
    }

    /**
     */
    public void deleteUseTrafficLighting() {
        this._hasuseTrafficLighting= false;
    }

    /**
     */
    public void deleteWidthLocked() {
        this._haswidthLocked= false;
    }

    /**
     * Method enumerateCalculatedColumns.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateCalculatedColumns() {
        return java.util.Collections.enumeration(this.calculatedColumnsList);
    }

    /**
     * Returns the value of field 'backgroundColor'.
     * 
     * @return the value of field 'BackgroundColor'.
     */
    public java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * Returns the value of field 'calculateGroupTotals'.
     * 
     * @return the value of field 'CalculateGroupTotals'.
     */
    public boolean getCalculateGroupTotals() {
        return this.calculateGroupTotals;
    }

    /**
     * Returns the value of field 'calculatedColumnFunction'.
     * 
     * @return the value of field 'CalculatedColumnFunction'.
     */
    public java.lang.String getCalculatedColumnFunction() {
        return this.calculatedColumnFunction;
    }

    /**
     * Method getCalculatedColumns.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getCalculatedColumns(final int index) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.calculatedColumnsList.size()) {
            throw new IndexOutOfBoundsException("getCalculatedColumns: Index value '" + index + "' not in range [0.." + (this.calculatedColumnsList.size() - 1) + "]");
        }

        return (java.lang.String) calculatedColumnsList.get(index);
    }

    /**
     * Method getCalculatedColumns.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getCalculatedColumns() {
        java.lang.String[] array = new java.lang.String[0];
        return this.calculatedColumnsList.toArray(array);
    }

    /**
     * Method getCalculatedColumnsCount.
     * 
     * @return the size of this collection
     */
    public int getCalculatedColumnsCount() {
        return this.calculatedColumnsList.size();
    }

    /**
     * Returns the value of field 'chart'.
     * 
     * @return the value of field 'Chart'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Chart getChart() {
        return this.chart;
    }

    /**
     * Returns the value of field 'createGroupHeader'.
     * 
     * @return the value of field 'CreateGroupHeader'.
     */
    public boolean getCreateGroupHeader() {
        return this.createGroupHeader;
    }

    /**
     * Returns the value of field 'displayName'.
     * 
     * @return the value of field 'DisplayName'.
     */
    public java.lang.String getDisplayName() {
        return this.displayName;
    }

    /**
     * Returns the value of field 'expression'.
     * 
     * @return the value of field 'Expression'.
     */
    public java.lang.String getExpression() {
        return this.expression;
    }

    /**
     * Returns the value of field 'fontColor'.
     * 
     * @return the value of field 'FontColor'.
     */
    public java.lang.String getFontColor() {
        return this.fontColor;
    }

    /**
     * Returns the value of field 'fontName'.
     * 
     * @return the value of field 'FontName'.
     */
    public java.lang.String getFontName() {
        return this.fontName;
    }

    /**
     * Returns the value of field 'fontSize'.
     * 
     * @return the value of field 'FontSize'.
     */
    public int getFontSize() {
        return this.fontSize;
    }

    /**
     * Returns the value of field 'fontStyle'.
     * 
     * @return the value of field 'FontStyle'.
     */
    public int getFontStyle() {
        return this.fontStyle;
    }

    /**
     * Returns the value of field 'format'.
     * 
     * @return the value of field 'Format'.
     */
    public java.lang.String getFormat() {
        return this.format;
    }

    /**
     * Returns the value of field 'groupFooterBackgroundColor'.
     * 
     * @return the value of field 'GroupFooterBackgroundColor'.
     */
    public java.lang.String getGroupFooterBackgroundColor() {
        return this.groupFooterBackgroundColor;
    }

    /**
     * Returns the value of field 'groupPageBreak'.
     * 
     * @return the value of field 'GroupPageBreak'.
     */
    public boolean getGroupPageBreak() {
        return this.groupPageBreak;
    }

    /**
     * Returns the value of field 'groupTotalsHorizontalAlignment'.
     * 
     * @return the value of field 'GroupTotalsHorizontalAlignment'.
     */
    public java.lang.String getGroupTotalsHorizontalAlignment() {
        return this.groupTotalsHorizontalAlignment;
    }

    /**
     * Returns the value of field 'groupTotalsLabel'.
     * 
     * @return the value of field 'GroupTotalsLabel'.
     */
    public java.lang.String getGroupTotalsLabel() {
        return this.groupTotalsLabel;
    }

    /**
     * Returns the value of field 'horizontalAlignment'.
     * 
     * @return the value of field 'HorizontalAlignment'.
     */
    public java.lang.String getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /**
     * Returns the value of field 'isCalculatedColumn'.
     * 
     * @return the value of field 'IsCalculatedColumn'.
     */
    public boolean getIsCalculatedColumn() {
        return this.isCalculatedColumn;
    }

    /**
     * Returns the value of field 'isDetail'.
     * 
     * @return the value of field 'IsDetail'.
     */
    public boolean getIsDetail() {
        return this.isDetail;
    }

    /**
     * Returns the value of field 'isRowHeader'.
     * 
     * @return the value of field 'IsRowHeader'.
     */
    public boolean getIsRowHeader() {
        return this.isRowHeader;
    }

    /**
     * Returns the value of field 'isWidthPercent'.
     * 
     * @return the value of field 'IsWidthPercent'.
     */
    public boolean getIsWidthPercent() {
        return this.isWidthPercent;
    }

    /**
     * Returns the value of field 'levelName'.
     * 
     * @return the value of field 'LevelName'.
     */
    public java.lang.String getLevelName() {
        return this.levelName;
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
     * Returns the value of field 'nullString'.
     * 
     * @return the value of field 'NullString'.
     */
    public java.lang.String getNullString() {
        return this.nullString;
    }

    /**
     * Returns the value of field 'pageBreakAfterFooter'.
     * 
     * @return the value of field 'PageBreakAfterFooter'.
     */
    public boolean getPageBreakAfterFooter() {
        return this.pageBreakAfterFooter;
    }

    /**
     * Returns the value of field 'pageBreakAfterGroup'.
     * 
     * @return the value of field 'PageBreakAfterGroup'.
     */
    public boolean getPageBreakAfterGroup() {
        return this.pageBreakAfterGroup;
    }

    /**
     * Returns the value of field 'pageBreakAfterHeader'.
     * 
     * @return the value of field 'PageBreakAfterHeader'.
     */
    public boolean getPageBreakAfterHeader() {
        return this.pageBreakAfterHeader;
    }

    /**
     * Returns the value of field 'pageBreakBeforeFooter'.
     * 
     * @return the value of field 'PageBreakBeforeFooter'.
     */
    public boolean getPageBreakBeforeFooter() {
        return this.pageBreakBeforeFooter;
    }

    /**
     * Returns the value of field 'pageBreakBeforeGroup'.
     * 
     * @return the value of field 'PageBreakBeforeGroup'.
     */
    public boolean getPageBreakBeforeGroup() {
        return this.pageBreakBeforeGroup;
    }

    /**
     * Returns the value of field 'pageBreakBeforeHeader'.
     * 
     * @return the value of field 'PageBreakBeforeHeader'.
     */
    public boolean getPageBreakBeforeHeader() {
        return this.pageBreakBeforeHeader;
    }

    /**
     * Returns the value of field 'repeatGroupHeader'.
     * 
     * @return the value of field 'RepeatGroupHeader'.
     */
    public boolean getRepeatGroupHeader() {
        return this.repeatGroupHeader;
    }

    /**
     * Returns the value of field 'showChartAboveGroupHeader'.
     * 
     * @return the value of field 'ShowChartAboveGroupHeader'.
     */
    public boolean getShowChartAboveGroupHeader() {
        return this.showChartAboveGroupHeader;
    }

    /**
     * Returns the value of field 'trafficLightingGreenColor'.
     * 
     * @return the value of field 'TrafficLightingGreenColor'.
     */
    public java.lang.String getTrafficLightingGreenColor() {
        return this.trafficLightingGreenColor;
    }

    /**
     * Returns the value of field 'trafficLightingGreenValue'.
     * 
     * @return the value of field 'TrafficLightingGreenValue'.
     */
    public double getTrafficLightingGreenValue() {
        return this.trafficLightingGreenValue;
    }

    /**
     * Returns the value of field 'trafficLightingRedColor'.
     * 
     * @return the value of field 'TrafficLightingRedColor'.
     */
    public java.lang.String getTrafficLightingRedColor() {
        return this.trafficLightingRedColor;
    }

    /**
     * Returns the value of field 'trafficLightingRedValue'.
     * 
     * @return the value of field 'TrafficLightingRedValue'.
     */
    public double getTrafficLightingRedValue() {
        return this.trafficLightingRedValue;
    }

    /**
     * Returns the value of field
     * 'trafficLightingUseAbsoluteValue'.
     * 
     * @return the value of field 'TrafficLightingUseAbsoluteValue'.
     */
    public boolean getTrafficLightingUseAbsoluteValue() {
        return this.trafficLightingUseAbsoluteValue;
    }

    /**
     * Returns the value of field
     * 'trafficLightingUseOppositeLogic'.
     * 
     * @return the value of field 'TrafficLightingUseOppositeLogic'.
     */
    public boolean getTrafficLightingUseOppositeLogic() {
        return this.trafficLightingUseOppositeLogic;
    }

    /**
     * Returns the value of field 'trafficLightingYellowColor'.
     * 
     * @return the value of field 'TrafficLightingYellowColor'.
     */
    public java.lang.String getTrafficLightingYellowColor() {
        return this.trafficLightingYellowColor;
    }

    /**
     * Returns the value of field 'trafficLightingYellowValue'.
     * 
     * @return the value of field 'TrafficLightingYellowValue'.
     */
    public double getTrafficLightingYellowValue() {
        return this.trafficLightingYellowValue;
    }

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public int getType() {
        return this.type;
    }

    /**
     * Returns the value of field 'useBackgroundColor'.
     * 
     * @return the value of field 'UseBackgroundColor'.
     */
    public boolean getUseBackgroundColor() {
        return this.useBackgroundColor;
    }

    /**
     * Returns the value of field 'useChart'.
     * 
     * @return the value of field 'UseChart'.
     */
    public boolean getUseChart() {
        return this.useChart;
    }

    /**
     * Returns the value of field 'useGroupFooterBackgroundColor'.
     * 
     * @return the value of field 'UseGroupFooterBackgroundColor'.
     */
    public boolean getUseGroupFooterBackgroundColor() {
        return this.useGroupFooterBackgroundColor;
    }

    /**
     * Returns the value of field 'useItemHide'.
     * 
     * @return the value of field 'UseItemHide'.
     */
    public boolean getUseItemHide() {
        return this.useItemHide;
    }

    /**
     * Returns the value of field 'useTrafficLighting'.
     * 
     * @return the value of field 'UseTrafficLighting'.
     */
    public boolean getUseTrafficLighting() {
        return this.useTrafficLighting;
    }

    /**
     * Returns the value of field 'verticalAlignment'.
     * 
     * @return the value of field 'VerticalAlignment'.
     */
    public java.lang.String getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /**
     * Returns the value of field 'width'.
     * 
     * @return the value of field 'Width'.
     */
    public java.math.BigDecimal getWidth() {
        return this.width;
    }

    /**
     * Returns the value of field 'widthLocked'.
     * 
     * @return the value of field 'WidthLocked'.
     */
    public boolean getWidthLocked() {
        return this.widthLocked;
    }

    /**
     * Method hasCalculateGroupTotals.
     * 
     * @return true if at least one CalculateGroupTotals has been
     * added
     */
    public boolean hasCalculateGroupTotals() {
        return this._hascalculateGroupTotals;
    }

    /**
     * Method hasCreateGroupHeader.
     * 
     * @return true if at least one CreateGroupHeader has been added
     */
    public boolean hasCreateGroupHeader() {
        return this._hascreateGroupHeader;
    }

    /**
     * Method hasFontSize.
     * 
     * @return true if at least one FontSize has been added
     */
    public boolean hasFontSize() {
        return this._hasfontSize;
    }

    /**
     * Method hasFontStyle.
     * 
     * @return true if at least one FontStyle has been added
     */
    public boolean hasFontStyle() {
        return this._hasfontStyle;
    }

    /**
     * Method hasGroupPageBreak.
     * 
     * @return true if at least one GroupPageBreak has been added
     */
    public boolean hasGroupPageBreak() {
        return this._hasgroupPageBreak;
    }

    /**
     * Method hasIsCalculatedColumn.
     * 
     * @return true if at least one IsCalculatedColumn has been adde
     */
    public boolean hasIsCalculatedColumn() {
        return this._hasisCalculatedColumn;
    }

    /**
     * Method hasIsDetail.
     * 
     * @return true if at least one IsDetail has been added
     */
    public boolean hasIsDetail() {
        return this._hasisDetail;
    }

    /**
     * Method hasIsRowHeader.
     * 
     * @return true if at least one IsRowHeader has been added
     */
    public boolean hasIsRowHeader() {
        return this._hasisRowHeader;
    }

    /**
     * Method hasIsWidthPercent.
     * 
     * @return true if at least one IsWidthPercent has been added
     */
    public boolean hasIsWidthPercent() {
        return this._hasisWidthPercent;
    }

    /**
     * Method hasPageBreakAfterFooter.
     * 
     * @return true if at least one PageBreakAfterFooter has been
     * added
     */
    public boolean hasPageBreakAfterFooter() {
        return this._haspageBreakAfterFooter;
    }

    /**
     * Method hasPageBreakAfterGroup.
     * 
     * @return true if at least one PageBreakAfterGroup has been
     * added
     */
    public boolean hasPageBreakAfterGroup() {
        return this._haspageBreakAfterGroup;
    }

    /**
     * Method hasPageBreakAfterHeader.
     * 
     * @return true if at least one PageBreakAfterHeader has been
     * added
     */
    public boolean hasPageBreakAfterHeader() {
        return this._haspageBreakAfterHeader;
    }

    /**
     * Method hasPageBreakBeforeFooter.
     * 
     * @return true if at least one PageBreakBeforeFooter has been
     * added
     */
    public boolean hasPageBreakBeforeFooter() {
        return this._haspageBreakBeforeFooter;
    }

    /**
     * Method hasPageBreakBeforeGroup.
     * 
     * @return true if at least one PageBreakBeforeGroup has been
     * added
     */
    public boolean hasPageBreakBeforeGroup() {
        return this._haspageBreakBeforeGroup;
    }

    /**
     * Method hasPageBreakBeforeHeader.
     * 
     * @return true if at least one PageBreakBeforeHeader has been
     * added
     */
    public boolean hasPageBreakBeforeHeader() {
        return this._haspageBreakBeforeHeader;
    }

    /**
     * Method hasRepeatGroupHeader.
     * 
     * @return true if at least one RepeatGroupHeader has been added
     */
    public boolean hasRepeatGroupHeader() {
        return this._hasrepeatGroupHeader;
    }

    /**
     * Method hasShowChartAboveGroupHeader.
     * 
     * @return true if at least one ShowChartAboveGroupHeader has
     * been added
     */
    public boolean hasShowChartAboveGroupHeader() {
        return this._hasshowChartAboveGroupHeader;
    }

    /**
     * Method hasTrafficLightingGreenValue.
     * 
     * @return true if at least one TrafficLightingGreenValue has
     * been added
     */
    public boolean hasTrafficLightingGreenValue() {
        return this._hastrafficLightingGreenValue;
    }

    /**
     * Method hasTrafficLightingRedValue.
     * 
     * @return true if at least one TrafficLightingRedValue has
     * been added
     */
    public boolean hasTrafficLightingRedValue() {
        return this._hastrafficLightingRedValue;
    }

    /**
     * Method hasTrafficLightingUseAbsoluteValue.
     * 
     * @return true if at least one TrafficLightingUseAbsoluteValue
     * has been added
     */
    public boolean hasTrafficLightingUseAbsoluteValue() {
        return this._hastrafficLightingUseAbsoluteValue;
    }

    /**
     * Method hasTrafficLightingUseOppositeLogic.
     * 
     * @return true if at least one TrafficLightingUseOppositeLogic
     * has been added
     */
    public boolean hasTrafficLightingUseOppositeLogic() {
        return this._hastrafficLightingUseOppositeLogic;
    }

    /**
     * Method hasTrafficLightingYellowValue.
     * 
     * @return true if at least one TrafficLightingYellowValue has
     * been added
     */
    public boolean hasTrafficLightingYellowValue() {
        return this._hastrafficLightingYellowValue;
    }

    /**
     * Method hasType.
     * 
     * @return true if at least one Type has been added
     */
    public boolean hasType() {
        return this._hastype;
    }

    /**
     * Method hasUseBackgroundColor.
     * 
     * @return true if at least one UseBackgroundColor has been adde
     */
    public boolean hasUseBackgroundColor() {
        return this._hasuseBackgroundColor;
    }

    /**
     * Method hasUseChart.
     * 
     * @return true if at least one UseChart has been added
     */
    public boolean hasUseChart() {
        return this._hasuseChart;
    }

    /**
     * Method hasUseGroupFooterBackgroundColor.
     * 
     * @return true if at least one UseGroupFooterBackgroundColor
     * has been added
     */
    public boolean hasUseGroupFooterBackgroundColor() {
        return this._hasuseGroupFooterBackgroundColor;
    }

    /**
     * Method hasUseItemHide.
     * 
     * @return true if at least one UseItemHide has been added
     */
    public boolean hasUseItemHide() {
        return this._hasuseItemHide;
    }

    /**
     * Method hasUseTrafficLighting.
     * 
     * @return true if at least one UseTrafficLighting has been adde
     */
    public boolean hasUseTrafficLighting() {
        return this._hasuseTrafficLighting;
    }

    /**
     * Method hasWidthLocked.
     * 
     * @return true if at least one WidthLocked has been added
     */
    public boolean hasWidthLocked() {
        return this._haswidthLocked;
    }

    /**
     * Returns the value of field 'calculateGroupTotals'.
     * 
     * @return the value of field 'CalculateGroupTotals'.
     */
    public boolean isCalculateGroupTotals() {
        return this.calculateGroupTotals;
    }

    /**
     * Returns the value of field 'createGroupHeader'.
     * 
     * @return the value of field 'CreateGroupHeader'.
     */
    public boolean isCreateGroupHeader() {
        return this.createGroupHeader;
    }

    /**
     * Returns the value of field 'groupPageBreak'.
     * 
     * @return the value of field 'GroupPageBreak'.
     */
    public boolean isGroupPageBreak() {
        return this.groupPageBreak;
    }

    /**
     * Returns the value of field 'isCalculatedColumn'.
     * 
     * @return the value of field 'IsCalculatedColumn'.
     */
    public boolean isIsCalculatedColumn() {
        return this.isCalculatedColumn;
    }

    /**
     * Returns the value of field 'isDetail'.
     * 
     * @return the value of field 'IsDetail'.
     */
    public boolean isIsDetail() {
        return this.isDetail;
    }

    /**
     * Returns the value of field 'isRowHeader'.
     * 
     * @return the value of field 'IsRowHeader'.
     */
    public boolean isIsRowHeader() {
        return this.isRowHeader;
    }

    /**
     * Returns the value of field 'isWidthPercent'.
     * 
     * @return the value of field 'IsWidthPercent'.
     */
    public boolean isIsWidthPercent() {
        return this.isWidthPercent;
    }

    /**
     * Returns the value of field 'pageBreakAfterFooter'.
     * 
     * @return the value of field 'PageBreakAfterFooter'.
     */
    public boolean isPageBreakAfterFooter() {
        return this.pageBreakAfterFooter;
    }

    /**
     * Returns the value of field 'pageBreakAfterGroup'.
     * 
     * @return the value of field 'PageBreakAfterGroup'.
     */
    public boolean isPageBreakAfterGroup() {
        return this.pageBreakAfterGroup;
    }

    /**
     * Returns the value of field 'pageBreakAfterHeader'.
     * 
     * @return the value of field 'PageBreakAfterHeader'.
     */
    public boolean isPageBreakAfterHeader() {
        return this.pageBreakAfterHeader;
    }

    /**
     * Returns the value of field 'pageBreakBeforeFooter'.
     * 
     * @return the value of field 'PageBreakBeforeFooter'.
     */
    public boolean isPageBreakBeforeFooter() {
        return this.pageBreakBeforeFooter;
    }

    /**
     * Returns the value of field 'pageBreakBeforeGroup'.
     * 
     * @return the value of field 'PageBreakBeforeGroup'.
     */
    public boolean isPageBreakBeforeGroup() {
        return this.pageBreakBeforeGroup;
    }

    /**
     * Returns the value of field 'pageBreakBeforeHeader'.
     * 
     * @return the value of field 'PageBreakBeforeHeader'.
     */
    public boolean isPageBreakBeforeHeader() {
        return this.pageBreakBeforeHeader;
    }

    /**
     * Returns the value of field 'repeatGroupHeader'.
     * 
     * @return the value of field 'RepeatGroupHeader'.
     */
    public boolean isRepeatGroupHeader() {
        return this.repeatGroupHeader;
    }

    /**
     * Returns the value of field 'showChartAboveGroupHeader'.
     * 
     * @return the value of field 'ShowChartAboveGroupHeader'.
     */
    public boolean isShowChartAboveGroupHeader() {
        return this.showChartAboveGroupHeader;
    }

    /**
     * Returns the value of field
     * 'trafficLightingUseAbsoluteValue'.
     * 
     * @return the value of field 'TrafficLightingUseAbsoluteValue'.
     */
    public boolean isTrafficLightingUseAbsoluteValue() {
        return this.trafficLightingUseAbsoluteValue;
    }

    /**
     * Returns the value of field
     * 'trafficLightingUseOppositeLogic'.
     * 
     * @return the value of field 'TrafficLightingUseOppositeLogic'.
     */
    public boolean isTrafficLightingUseOppositeLogic() {
        return this.trafficLightingUseOppositeLogic;
    }

    /**
     * Returns the value of field 'useBackgroundColor'.
     * 
     * @return the value of field 'UseBackgroundColor'.
     */
    public boolean isUseBackgroundColor() {
        return this.useBackgroundColor;
    }

    /**
     * Returns the value of field 'useChart'.
     * 
     * @return the value of field 'UseChart'.
     */
    public boolean isUseChart() {
        return this.useChart;
    }

    /**
     * Returns the value of field 'useGroupFooterBackgroundColor'.
     * 
     * @return the value of field 'UseGroupFooterBackgroundColor'.
     */
    public boolean isUseGroupFooterBackgroundColor() {
        return this.useGroupFooterBackgroundColor;
    }

    /**
     * Returns the value of field 'useItemHide'.
     * 
     * @return the value of field 'UseItemHide'.
     */
    public boolean isUseItemHide() {
        return this.useItemHide;
    }

    /**
     * Returns the value of field 'useTrafficLighting'.
     * 
     * @return the value of field 'UseTrafficLighting'.
     */
    public boolean isUseTrafficLighting() {
        return this.useTrafficLighting;
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
     * Returns the value of field 'widthLocked'.
     * 
     * @return the value of field 'WidthLocked'.
     */
    public boolean isWidthLocked() {
        return this.widthLocked;
    }

    /**
     * Method iterateCalculatedColumns.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateCalculatedColumns() {
        return this.calculatedColumnsList.iterator();
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
     */
    public void removeAllCalculatedColumns() {
        this.calculatedColumnsList.clear();
    }

    /**
     * Method removeCalculatedColumns.
     * 
     * @param vCalculatedColumns
     * @return true if the object was removed from the collection.
     */
    public boolean removeCalculatedColumns(final java.lang.String vCalculatedColumns) {
        boolean removed = calculatedColumnsList.remove(vCalculatedColumns);
        return removed;
    }

    /**
     * Method removeCalculatedColumnsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeCalculatedColumnsAt(final int index) {
        java.lang.Object obj = this.calculatedColumnsList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'backgroundColor'.
     * 
     * @param backgroundColor the value of field 'backgroundColor'.
     */
    public void setBackgroundColor(final java.lang.String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * Sets the value of field 'calculateGroupTotals'.
     * 
     * @param calculateGroupTotals the value of field
     * 'calculateGroupTotals'.
     */
    public void setCalculateGroupTotals(final boolean calculateGroupTotals) {
        this.calculateGroupTotals = calculateGroupTotals;
        this._hascalculateGroupTotals = true;
    }

    /**
     * Sets the value of field 'calculatedColumnFunction'.
     * 
     * @param calculatedColumnFunction the value of field
     * 'calculatedColumnFunction'.
     */
    public void setCalculatedColumnFunction(final java.lang.String calculatedColumnFunction) {
        this.calculatedColumnFunction = calculatedColumnFunction;
    }

    /**
     * 
     * 
     * @param index
     * @param vCalculatedColumns
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCalculatedColumns(final int index,final java.lang.String vCalculatedColumns) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.calculatedColumnsList.size()) {
            throw new IndexOutOfBoundsException("setCalculatedColumns: Index value '" + index + "' not in range [0.." + (this.calculatedColumnsList.size() - 1) + "]");
        }

        this.calculatedColumnsList.set(index, vCalculatedColumns);
    }

    /**
     * 
     * 
     * @param vCalculatedColumnsArray
     */
    public void setCalculatedColumns(final java.lang.String[] vCalculatedColumnsArray) {
        //-- copy array
        calculatedColumnsList.clear();

        for (int i = 0; i < vCalculatedColumnsArray.length; i++) {
                this.calculatedColumnsList.add(vCalculatedColumnsArray[i]);
        }
    }

    /**
     * Sets the value of field 'chart'.
     * 
     * @param chart the value of field 'chart'.
     */
    public void setChart(final org.pentaho.jfreereport.castormodel.reportspec.Chart chart) {
        this.chart = chart;
    }

    /**
     * Sets the value of field 'createGroupHeader'.
     * 
     * @param createGroupHeader the value of field
     * 'createGroupHeader'.
     */
    public void setCreateGroupHeader(final boolean createGroupHeader) {
        this.createGroupHeader = createGroupHeader;
        this._hascreateGroupHeader = true;
    }

    /**
     * Sets the value of field 'displayName'.
     * 
     * @param displayName the value of field 'displayName'.
     */
    public void setDisplayName(final java.lang.String displayName) {
        this.displayName = displayName;
    }

    /**
     * Sets the value of field 'expression'.
     * 
     * @param expression the value of field 'expression'.
     */
    public void setExpression(final java.lang.String expression) {
        this.expression = expression;
    }

    /**
     * Sets the value of field 'fontColor'.
     * 
     * @param fontColor the value of field 'fontColor'.
     */
    public void setFontColor(final java.lang.String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * Sets the value of field 'fontName'.
     * 
     * @param fontName the value of field 'fontName'.
     */
    public void setFontName(final java.lang.String fontName) {
        this.fontName = fontName;
    }

    /**
     * Sets the value of field 'fontSize'.
     * 
     * @param fontSize the value of field 'fontSize'.
     */
    public void setFontSize(final int fontSize) {
        this.fontSize = fontSize;
        this._hasfontSize = true;
    }

    /**
     * Sets the value of field 'fontStyle'.
     * 
     * @param fontStyle the value of field 'fontStyle'.
     */
    public void setFontStyle(final int fontStyle) {
        this.fontStyle = fontStyle;
        this._hasfontStyle = true;
    }

    /**
     * Sets the value of field 'format'.
     * 
     * @param format the value of field 'format'.
     */
    public void setFormat(final java.lang.String format) {
        this.format = format;
    }

    /**
     * Sets the value of field 'groupFooterBackgroundColor'.
     * 
     * @param groupFooterBackgroundColor the value of field
     * 'groupFooterBackgroundColor'.
     */
    public void setGroupFooterBackgroundColor(final java.lang.String groupFooterBackgroundColor) {
        this.groupFooterBackgroundColor = groupFooterBackgroundColor;
    }

    /**
     * Sets the value of field 'groupPageBreak'.
     * 
     * @param groupPageBreak the value of field 'groupPageBreak'.
     */
    public void setGroupPageBreak(final boolean groupPageBreak) {
        this.groupPageBreak = groupPageBreak;
        this._hasgroupPageBreak = true;
    }

    /**
     * Sets the value of field 'groupTotalsHorizontalAlignment'.
     * 
     * @param groupTotalsHorizontalAlignment the value of field
     * 'groupTotalsHorizontalAlignment'.
     */
    public void setGroupTotalsHorizontalAlignment(final java.lang.String groupTotalsHorizontalAlignment) {
        this.groupTotalsHorizontalAlignment = groupTotalsHorizontalAlignment;
    }

    /**
     * Sets the value of field 'groupTotalsLabel'.
     * 
     * @param groupTotalsLabel the value of field 'groupTotalsLabel'
     */
    public void setGroupTotalsLabel(final java.lang.String groupTotalsLabel) {
        this.groupTotalsLabel = groupTotalsLabel;
    }

    /**
     * Sets the value of field 'horizontalAlignment'.
     * 
     * @param horizontalAlignment the value of field
     * 'horizontalAlignment'.
     */
    public void setHorizontalAlignment(final java.lang.String horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }

    /**
     * Sets the value of field 'isCalculatedColumn'.
     * 
     * @param isCalculatedColumn the value of field
     * 'isCalculatedColumn'.
     */
    public void setIsCalculatedColumn(final boolean isCalculatedColumn) {
        this.isCalculatedColumn = isCalculatedColumn;
        this._hasisCalculatedColumn = true;
    }

    /**
     * Sets the value of field 'isDetail'.
     * 
     * @param isDetail the value of field 'isDetail'.
     */
    public void setIsDetail(final boolean isDetail) {
        this.isDetail = isDetail;
        this._hasisDetail = true;
    }

    /**
     * Sets the value of field 'isRowHeader'.
     * 
     * @param isRowHeader the value of field 'isRowHeader'.
     */
    public void setIsRowHeader(final boolean isRowHeader) {
        this.isRowHeader = isRowHeader;
        this._hasisRowHeader = true;
    }

    /**
     * Sets the value of field 'isWidthPercent'.
     * 
     * @param isWidthPercent the value of field 'isWidthPercent'.
     */
    public void setIsWidthPercent(final boolean isWidthPercent) {
        this.isWidthPercent = isWidthPercent;
        this._hasisWidthPercent = true;
    }

    /**
     * Sets the value of field 'levelName'.
     * 
     * @param levelName the value of field 'levelName'.
     */
    public void setLevelName(final java.lang.String levelName) {
        this.levelName = levelName;
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
     * Sets the value of field 'nullString'.
     * 
     * @param nullString the value of field 'nullString'.
     */
    public void setNullString(final java.lang.String nullString) {
        this.nullString = nullString;
    }

    /**
     * Sets the value of field 'pageBreakAfterFooter'.
     * 
     * @param pageBreakAfterFooter the value of field
     * 'pageBreakAfterFooter'.
     */
    public void setPageBreakAfterFooter(final boolean pageBreakAfterFooter) {
        this.pageBreakAfterFooter = pageBreakAfterFooter;
        this._haspageBreakAfterFooter = true;
    }

    /**
     * Sets the value of field 'pageBreakAfterGroup'.
     * 
     * @param pageBreakAfterGroup the value of field
     * 'pageBreakAfterGroup'.
     */
    public void setPageBreakAfterGroup(final boolean pageBreakAfterGroup) {
        this.pageBreakAfterGroup = pageBreakAfterGroup;
        this._haspageBreakAfterGroup = true;
    }

    /**
     * Sets the value of field 'pageBreakAfterHeader'.
     * 
     * @param pageBreakAfterHeader the value of field
     * 'pageBreakAfterHeader'.
     */
    public void setPageBreakAfterHeader(final boolean pageBreakAfterHeader) {
        this.pageBreakAfterHeader = pageBreakAfterHeader;
        this._haspageBreakAfterHeader = true;
    }

    /**
     * Sets the value of field 'pageBreakBeforeFooter'.
     * 
     * @param pageBreakBeforeFooter the value of field
     * 'pageBreakBeforeFooter'.
     */
    public void setPageBreakBeforeFooter(final boolean pageBreakBeforeFooter) {
        this.pageBreakBeforeFooter = pageBreakBeforeFooter;
        this._haspageBreakBeforeFooter = true;
    }

    /**
     * Sets the value of field 'pageBreakBeforeGroup'.
     * 
     * @param pageBreakBeforeGroup the value of field
     * 'pageBreakBeforeGroup'.
     */
    public void setPageBreakBeforeGroup(final boolean pageBreakBeforeGroup) {
        this.pageBreakBeforeGroup = pageBreakBeforeGroup;
        this._haspageBreakBeforeGroup = true;
    }

    /**
     * Sets the value of field 'pageBreakBeforeHeader'.
     * 
     * @param pageBreakBeforeHeader the value of field
     * 'pageBreakBeforeHeader'.
     */
    public void setPageBreakBeforeHeader(final boolean pageBreakBeforeHeader) {
        this.pageBreakBeforeHeader = pageBreakBeforeHeader;
        this._haspageBreakBeforeHeader = true;
    }

    /**
     * Sets the value of field 'repeatGroupHeader'.
     * 
     * @param repeatGroupHeader the value of field
     * 'repeatGroupHeader'.
     */
    public void setRepeatGroupHeader(final boolean repeatGroupHeader) {
        this.repeatGroupHeader = repeatGroupHeader;
        this._hasrepeatGroupHeader = true;
    }

    /**
     * Sets the value of field 'showChartAboveGroupHeader'.
     * 
     * @param showChartAboveGroupHeader the value of field
     * 'showChartAboveGroupHeader'.
     */
    public void setShowChartAboveGroupHeader(final boolean showChartAboveGroupHeader) {
        this.showChartAboveGroupHeader = showChartAboveGroupHeader;
        this._hasshowChartAboveGroupHeader = true;
    }

    /**
     * Sets the value of field 'trafficLightingGreenColor'.
     * 
     * @param trafficLightingGreenColor the value of field
     * 'trafficLightingGreenColor'.
     */
    public void setTrafficLightingGreenColor(final java.lang.String trafficLightingGreenColor) {
        this.trafficLightingGreenColor = trafficLightingGreenColor;
    }

    /**
     * Sets the value of field 'trafficLightingGreenValue'.
     * 
     * @param trafficLightingGreenValue the value of field
     * 'trafficLightingGreenValue'.
     */
    public void setTrafficLightingGreenValue(final double trafficLightingGreenValue) {
        this.trafficLightingGreenValue = trafficLightingGreenValue;
        this._hastrafficLightingGreenValue = true;
    }

    /**
     * Sets the value of field 'trafficLightingRedColor'.
     * 
     * @param trafficLightingRedColor the value of field
     * 'trafficLightingRedColor'.
     */
    public void setTrafficLightingRedColor(final java.lang.String trafficLightingRedColor) {
        this.trafficLightingRedColor = trafficLightingRedColor;
    }

    /**
     * Sets the value of field 'trafficLightingRedValue'.
     * 
     * @param trafficLightingRedValue the value of field
     * 'trafficLightingRedValue'.
     */
    public void setTrafficLightingRedValue(final double trafficLightingRedValue) {
        this.trafficLightingRedValue = trafficLightingRedValue;
        this._hastrafficLightingRedValue = true;
    }

    /**
     * Sets the value of field 'trafficLightingUseAbsoluteValue'.
     * 
     * @param trafficLightingUseAbsoluteValue the value of field
     * 'trafficLightingUseAbsoluteValue'.
     */
    public void setTrafficLightingUseAbsoluteValue(final boolean trafficLightingUseAbsoluteValue) {
        this.trafficLightingUseAbsoluteValue = trafficLightingUseAbsoluteValue;
        this._hastrafficLightingUseAbsoluteValue = true;
    }

    /**
     * Sets the value of field 'trafficLightingUseOppositeLogic'.
     * 
     * @param trafficLightingUseOppositeLogic the value of field
     * 'trafficLightingUseOppositeLogic'.
     */
    public void setTrafficLightingUseOppositeLogic(final boolean trafficLightingUseOppositeLogic) {
        this.trafficLightingUseOppositeLogic = trafficLightingUseOppositeLogic;
        this._hastrafficLightingUseOppositeLogic = true;
    }

    /**
     * Sets the value of field 'trafficLightingYellowColor'.
     * 
     * @param trafficLightingYellowColor the value of field
     * 'trafficLightingYellowColor'.
     */
    public void setTrafficLightingYellowColor(final java.lang.String trafficLightingYellowColor) {
        this.trafficLightingYellowColor = trafficLightingYellowColor;
    }

    /**
     * Sets the value of field 'trafficLightingYellowValue'.
     * 
     * @param trafficLightingYellowValue the value of field
     * 'trafficLightingYellowValue'.
     */
    public void setTrafficLightingYellowValue(final double trafficLightingYellowValue) {
        this.trafficLightingYellowValue = trafficLightingYellowValue;
        this._hastrafficLightingYellowValue = true;
    }

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(final int type) {
        this.type = type;
        this._hastype = true;
    }

    /**
     * Sets the value of field 'useBackgroundColor'.
     * 
     * @param useBackgroundColor the value of field
     * 'useBackgroundColor'.
     */
    public void setUseBackgroundColor(final boolean useBackgroundColor) {
        this.useBackgroundColor = useBackgroundColor;
        this._hasuseBackgroundColor = true;
    }

    /**
     * Sets the value of field 'useChart'.
     * 
     * @param useChart the value of field 'useChart'.
     */
    public void setUseChart(final boolean useChart) {
        this.useChart = useChart;
        this._hasuseChart = true;
    }

    /**
     * Sets the value of field 'useGroupFooterBackgroundColor'.
     * 
     * @param useGroupFooterBackgroundColor the value of field
     * 'useGroupFooterBackgroundColor'.
     */
    public void setUseGroupFooterBackgroundColor(final boolean useGroupFooterBackgroundColor) {
        this.useGroupFooterBackgroundColor = useGroupFooterBackgroundColor;
        this._hasuseGroupFooterBackgroundColor = true;
    }

    /**
     * Sets the value of field 'useItemHide'.
     * 
     * @param useItemHide the value of field 'useItemHide'.
     */
    public void setUseItemHide(final boolean useItemHide) {
        this.useItemHide = useItemHide;
        this._hasuseItemHide = true;
    }

    /**
     * Sets the value of field 'useTrafficLighting'.
     * 
     * @param useTrafficLighting the value of field
     * 'useTrafficLighting'.
     */
    public void setUseTrafficLighting(final boolean useTrafficLighting) {
        this.useTrafficLighting = useTrafficLighting;
        this._hasuseTrafficLighting = true;
    }

    /**
     * Sets the value of field 'verticalAlignment'.
     * 
     * @param verticalAlignment the value of field
     * 'verticalAlignment'.
     */
    public void setVerticalAlignment(final java.lang.String verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }

    /**
     * Sets the value of field 'width'.
     * 
     * @param width the value of field 'width'.
     */
    public void setWidth(final java.math.BigDecimal width) {
        this.width = width;
    }

    /**
     * Sets the value of field 'widthLocked'.
     * 
     * @param widthLocked the value of field 'widthLocked'.
     */
    public void setWidthLocked(final boolean widthLocked) {
        this.widthLocked = widthLocked;
        this._haswidthLocked = true;
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
     * org.pentaho.jfreereport.castormodel.reportspec.Field
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.Field unmarshal(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.pentaho.jfreereport.castormodel.reportspec.Field) org.exolab.castor.xml.Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.Field.class, reader);
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
