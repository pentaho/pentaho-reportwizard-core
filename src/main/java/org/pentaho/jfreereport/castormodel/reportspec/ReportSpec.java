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
public class ReportSpec implements java.io.Serializable {

    /**
     * Field tool.
     */
    private java.lang.String tool;

    /**
     * Field toolVersion.
     */
    private java.lang.String toolVersion;

    /**
     * Field templateName.
     */
    private java.lang.String templateName;

    /**
     * Field reportSpecChoice.
     */
    private org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice reportSpecChoice;

    /**
     * Field chart.
     */
    private org.pentaho.jfreereport.castormodel.reportspec.Chart chart;

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
     * Field reportName.
     */
    private java.lang.String reportName = "JFreeReport-WizardReport";

    /**
     * Field reportDesc.
     */
    private java.lang.String reportDesc = "Description";

    /**
     * Field isMQL.
     */
    private boolean isMQL = false;

    /**
     * Keeps track of whether primitive field isMQL has been set
     * already.
     */
    private boolean _hasisMQL;

    /**
     * Field xmiPath.
     */
    private java.lang.String xmiPath;

    /**
     * Field isMDX.
     */
    private boolean isMDX = false;

    /**
     * Keeps track of whether primitive field isMDX has been set
     * already.
     */
    private boolean _hasisMDX;

    /**
     * Field mondrianCubeDefinitionPath.
     */
    private java.lang.String mondrianCubeDefinitionPath;

    /**
     * Field kettleStep.
     */
    private java.lang.String kettleStep;

    /**
     * Field query.
     */
    private java.lang.String query = "";

    /**
     * Field mqlQuery.
     */
    private java.lang.String mqlQuery = "";

    /**
     * Field includeSrc.
     */
    private java.lang.String includeSrc;

    /**
     * Field templateSrc.
     */
    private java.lang.String templateSrc;

    private java.util.List<org.pentaho.jfreereport.castormodel.reportspec.FieldMapping> fieldMappingList;

    /**
     * Field watermark.
     */
    private org.pentaho.jfreereport.castormodel.reportspec.Watermark watermark;

    /**
     * Field pageFormat.
     */
    private java.lang.String pageFormat = "LETTER";

    /**
     * Field useCustomPageFormat.
     */
    private boolean useCustomPageFormat = false;

    /**
     * Keeps track of whether primitive field useCustomPageFormat
     * has been set already.
     */
    private boolean _hasuseCustomPageFormat;

    /**
     * Field customPageFormatWidth.
     */
    private int customPageFormatWidth;

    /**
     * Keeps track of whether primitive field customPageFormatWidth
     * has been set already.
     */
    private boolean _hascustomPageFormatWidth;

    /**
     * Field customPageFormatHeight.
     */
    private int customPageFormatHeight;

    /**
     * Keeps track of whether primitive field
     * customPageFormatHeight has been set already.
     */
    private boolean _hascustomPageFormatHeight;

    /**
     * Field orientation.
     */
    private java.lang.String orientation = "landscape";

    /**
     * Field useRowBanding.
     */
    private boolean useRowBanding = true;

    /**
     * Keeps track of whether primitive field useRowBanding has
     * been set already.
     */
    private boolean _hasuseRowBanding;

    /**
     * Field rowBandingColor.
     */
    private java.lang.String rowBandingColor = "#E0E0E0";

    /**
     * Field rowBandingInitialState.
     */
    private boolean rowBandingInitialState = true;

    /**
     * Keeps track of whether primitive field
     * rowBandingInitialState has been set already.
     */
    private boolean _hasrowBandingInitialState;

    /**
     * Field useExpressionUnderlining.
     */
    private boolean useExpressionUnderlining;

    /**
     * Keeps track of whether primitive field
     * useExpressionUnderlining has been set already.
     */
    private boolean _hasuseExpressionUnderlining;

    /**
     * Field doubleUnderlineExpression.
     */
    private boolean doubleUnderlineExpression;

    /**
     * Keeps track of whether primitive field
     * doubleUnderlineExpression has been set already.
     */
    private boolean _hasdoubleUnderlineExpression;

    /**
     * Field useMasterDetail.
     */
    private boolean useMasterDetail = false;

    /**
     * Keeps track of whether primitive field useMasterDetail has
     * been set already.
     */
    private boolean _hasuseMasterDetail;

    /**
     * Field useMasterDetailGridlines.
     */
    private boolean useMasterDetailGridlines = true;

    /**
     * Keeps track of whether primitive field
     * useMasterDetailGridlines has been set already.
     */
    private boolean _hasuseMasterDetailGridlines;

    /**
     * Field useMasterDetailBanding.
     */
    private boolean useMasterDetailBanding = true;

    /**
     * Keeps track of whether primitive field
     * useMasterDetailBanding has been set already.
     */
    private boolean _hasuseMasterDetailBanding;

    /**
     * Field generateReportLevelColumnHeaders.
     */
    private boolean generateReportLevelColumnHeaders = false;

    /**
     * Keeps track of whether primitive field
     * generateReportLevelColumnHeaders has been set already.
     */
    private boolean _hasgenerateReportLevelColumnHeaders;

    /**
     * Field useColumnHeaderBackgroundColor.
     */
    private boolean useColumnHeaderBackgroundColor = true;

    /**
     * Keeps track of whether primitive field
     * useColumnHeaderBackgroundColor has been set already.
     */
    private boolean _hasuseColumnHeaderBackgroundColor;

    /**
     * Field columnHeaderBackgroundColor.
     */
    private java.lang.String columnHeaderBackgroundColor = "#C0C0C0";

    /**
     * Field columnHeaderHeight.
     */
    private int columnHeaderHeight = 18;

    /**
     * Keeps track of whether primitive field columnHeaderHeight
     * has been set already.
     */
    private boolean _hascolumnHeaderHeight;

    /**
     * Field calculateGrandTotals.
     */
    private boolean calculateGrandTotals = true;

    /**
     * Keeps track of whether primitive field calculateGrandTotals
     * has been set already.
     */
    private boolean _hascalculateGrandTotals;

    /**
     * Field grandTotalsLabel.
     */
    private java.lang.String grandTotalsLabel = "Grand Total";

    /**
     * Field grandTotalsHorizontalAlignment.
     */
    private java.lang.String grandTotalsHorizontalAlignment = "left";

    /**
     * Field useDummyGroupFooterBackgroundColor.
     */
    private boolean useDummyGroupFooterBackgroundColor = true;

    /**
     * Keeps track of whether primitive field
     * useDummyGroupFooterBackgroundColor has been set already.
     */
    private boolean _hasuseDummyGroupFooterBackgroundColor;

    /**
     * Field dummyGroupFooterBackgroundColor.
     */
    private java.lang.String dummyGroupFooterBackgroundColor = "#e0d0c0";

    /**
     * Field useHorizontalGridlines.
     */
    private boolean useHorizontalGridlines = false;

    /**
     * Keeps track of whether primitive field
     * useHorizontalGridlines has been set already.
     */
    private boolean _hasuseHorizontalGridlines;

    /**
     * Field useVerticalGridlines.
     */
    private boolean useVerticalGridlines = false;

    /**
     * Keeps track of whether primitive field useVerticalGridlines
     * has been set already.
     */
    private boolean _hasuseVerticalGridlines;

    /**
     * Field horizontalGridlinesColor.
     */
    private java.lang.String horizontalGridlinesColor = "#000000";

    /**
     * Field verticalGridlinesColor.
     */
    private java.lang.String verticalGridlinesColor = "#000000";

    /**
     * Field groupHeaderFontName.
     */
    private java.lang.String groupHeaderFontName = "SansSerif";

    /**
     * Field groupHeaderFontStyle.
     */
    private int groupHeaderFontStyle = 1;

    /**
     * Keeps track of whether primitive field groupHeaderFontStyle
     * has been set already.
     */
    private boolean _hasgroupHeaderFontStyle;

    /**
     * Field groupHeaderFontSize.
     */
    private int groupHeaderFontSize = 11;

    /**
     * Keeps track of whether primitive field groupHeaderFontSize
     * has been set already.
     */
    private boolean _hasgroupHeaderFontSize;

    /**
     * Field groupHeaderFontColor.
     */
    private java.lang.String groupHeaderFontColor = "#000000";

    /**
     * Field groupFooterFontName.
     */
    private java.lang.String groupFooterFontName = "SansSerif";

    /**
     * Field groupFooterFontStyle.
     */
    private int groupFooterFontStyle = 1;

    /**
     * Keeps track of whether primitive field groupFooterFontStyle
     * has been set already.
     */
    private boolean _hasgroupFooterFontStyle;

    /**
     * Field groupFooterFontSize.
     */
    private int groupFooterFontSize = 11;

    /**
     * Keeps track of whether primitive field groupFooterFontSize
     * has been set already.
     */
    private boolean _hasgroupFooterFontSize;

    /**
     * Field groupFooterFontColor.
     */
    private java.lang.String groupFooterFontColor = "#000000";

    /**
     * Field columnHeaderFontName.
     */
    private java.lang.String columnHeaderFontName = "SansSerif";

    /**
     * Field columnHeaderFontStyle.
     */
    private int columnHeaderFontStyle = 1;

    /**
     * Keeps track of whether primitive field columnHeaderFontStyle
     * has been set already.
     */
    private boolean _hascolumnHeaderFontStyle;

    /**
     * Field columnHeaderFontSize.
     */
    private int columnHeaderFontSize = 12;

    /**
     * Keeps track of whether primitive field columnHeaderFontSize
     * has been set already.
     */
    private boolean _hascolumnHeaderFontSize;

    /**
     * Field columnHeaderFontColor.
     */
    private java.lang.String columnHeaderFontColor = "#000000";

    /**
     * Field columnHeaderGap.
     */
    private int columnHeaderGap = 2;

    /**
     * Keeps track of whether primitive field columnHeaderGap has
     * been set already.
     */
    private boolean _hascolumnHeaderGap;

    /**
     * Field columnHeaderTopGap.
     */
    private int columnHeaderTopGap = 2;

    /**
     * Keeps track of whether primitive field columnHeaderTopGap
     * has been set already.
     */
    private boolean _hascolumnHeaderTopGap;

    /**
     * Field itemsFontName.
     */
    private java.lang.String itemsFontName = "SansSerif";

    /**
     * Field itemsFontStyle.
     */
    private int itemsFontStyle = 1;

    /**
     * Keeps track of whether primitive field itemsFontStyle has
     * been set already.
     */
    private boolean _hasitemsFontStyle;

    /**
     * Field itemsFontSize.
     */
    private int itemsFontSize = 9;

    /**
     * Keeps track of whether primitive field itemsFontSize has
     * been set already.
     */
    private boolean _hasitemsFontSize;

    /**
     * Field itemsFontColor.
     */
    private java.lang.String itemsFontColor = "#000000";

    /**
     * Field horizontalOffset.
     */
    private int horizontalOffset = 0;

    /**
     * Keeps track of whether primitive field horizontalOffset has
     * been set already.
     */
    private boolean _hashorizontalOffset;

    /**
     * Field leftMargin.
     */
    private int leftMargin = 10;

    /**
     * Keeps track of whether primitive field leftMargin has been
     * set already.
     */
    private boolean _hasleftMargin;

    /**
     * Field rightMargin.
     */
    private int rightMargin = 10;

    /**
     * Keeps track of whether primitive field rightMargin has been
     * set already.
     */
    private boolean _hasrightMargin;

    /**
     * Field topMargin.
     */
    private int topMargin = 10;

    /**
     * Keeps track of whether primitive field topMargin has been
     * set already.
     */
    private boolean _hastopMargin;

    /**
     * Field bottomMargin.
     */
    private int bottomMargin = 10;

    /**
     * Keeps track of whether primitive field bottomMargin has been
     * set already.
     */
    private boolean _hasbottomMargin;

    private java.util.List<org.pentaho.jfreereport.castormodel.reportspec.Field> fieldList;

    public ReportSpec() {
        super();
        setReportName("JFreeReport-WizardReport");
        setReportDesc("Description");
        setQuery("");
        setMqlQuery("");
        this.fieldMappingList = new java.util.ArrayList<org.pentaho.jfreereport.castormodel.reportspec.FieldMapping>();
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
        this.fieldList = new java.util.ArrayList<org.pentaho.jfreereport.castormodel.reportspec.Field>();
    }

    /**
     * 
     * 
     * @param vField
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addField(final org.pentaho.jfreereport.castormodel.reportspec.Field vField) throws java.lang.IndexOutOfBoundsException {
        this.fieldList.add(vField);
    }

    /**
     * 
     * 
     * @param index
     * @param vField
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addField(final int index,final org.pentaho.jfreereport.castormodel.reportspec.Field vField) throws java.lang.IndexOutOfBoundsException {
        this.fieldList.add(index, vField);
    }

    /**
     * 
     * 
     * @param vFieldMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFieldMapping(final org.pentaho.jfreereport.castormodel.reportspec.FieldMapping vFieldMapping) throws java.lang.IndexOutOfBoundsException {
        this.fieldMappingList.add(vFieldMapping);
    }

    /**
     * 
     * 
     * @param index
     * @param vFieldMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFieldMapping(final int index,final org.pentaho.jfreereport.castormodel.reportspec.FieldMapping vFieldMapping) throws java.lang.IndexOutOfBoundsException {
        this.fieldMappingList.add(index, vFieldMapping);
    }

    /**
     */
    public void deleteBottomMargin() {
        this._hasbottomMargin= false;
    }

    /**
     */
    public void deleteCalculateGrandTotals() {
        this._hascalculateGrandTotals= false;
    }

    /**
     */
    public void deleteColumnHeaderFontSize() {
        this._hascolumnHeaderFontSize= false;
    }

    /**
     */
    public void deleteColumnHeaderFontStyle() {
        this._hascolumnHeaderFontStyle= false;
    }

    /**
     */
    public void deleteColumnHeaderGap() {
        this._hascolumnHeaderGap= false;
    }

    /**
     */
    public void deleteColumnHeaderHeight() {
        this._hascolumnHeaderHeight= false;
    }

    /**
     */
    public void deleteColumnHeaderTopGap() {
        this._hascolumnHeaderTopGap= false;
    }

    /**
     */
    public void deleteCustomPageFormatHeight() {
        this._hascustomPageFormatHeight= false;
    }

    /**
     */
    public void deleteCustomPageFormatWidth() {
        this._hascustomPageFormatWidth= false;
    }

    /**
     */
    public void deleteDoubleUnderlineExpression() {
        this._hasdoubleUnderlineExpression= false;
    }

    /**
     */
    public void deleteGenerateReportLevelColumnHeaders() {
        this._hasgenerateReportLevelColumnHeaders= false;
    }

    /**
     */
    public void deleteGroupFooterFontSize() {
        this._hasgroupFooterFontSize= false;
    }

    /**
     */
    public void deleteGroupFooterFontStyle() {
        this._hasgroupFooterFontStyle= false;
    }

    /**
     */
    public void deleteGroupHeaderFontSize() {
        this._hasgroupHeaderFontSize= false;
    }

    /**
     */
    public void deleteGroupHeaderFontStyle() {
        this._hasgroupHeaderFontStyle= false;
    }

    /**
     */
    public void deleteHorizontalOffset() {
        this._hashorizontalOffset= false;
    }

    /**
     */
    public void deleteIsMDX() {
        this._hasisMDX= false;
    }

    /**
     */
    public void deleteIsMQL() {
        this._hasisMQL= false;
    }

    /**
     */
    public void deleteItemsFontSize() {
        this._hasitemsFontSize= false;
    }

    /**
     */
    public void deleteItemsFontStyle() {
        this._hasitemsFontStyle= false;
    }

    /**
     */
    public void deleteLeftMargin() {
        this._hasleftMargin= false;
    }

    /**
     */
    public void deleteRightMargin() {
        this._hasrightMargin= false;
    }

    /**
     */
    public void deleteRowBandingInitialState() {
        this._hasrowBandingInitialState= false;
    }

    /**
     */
    public void deleteTopMargin() {
        this._hastopMargin= false;
    }

    /**
     */
    public void deleteUseChart() {
        this._hasuseChart= false;
    }

    /**
     */
    public void deleteUseColumnHeaderBackgroundColor() {
        this._hasuseColumnHeaderBackgroundColor= false;
    }

    /**
     */
    public void deleteUseCustomPageFormat() {
        this._hasuseCustomPageFormat= false;
    }

    /**
     */
    public void deleteUseDummyGroupFooterBackgroundColor() {
        this._hasuseDummyGroupFooterBackgroundColor= false;
    }

    /**
     */
    public void deleteUseExpressionUnderlining() {
        this._hasuseExpressionUnderlining= false;
    }

    /**
     */
    public void deleteUseHorizontalGridlines() {
        this._hasuseHorizontalGridlines= false;
    }

    /**
     */
    public void deleteUseMasterDetail() {
        this._hasuseMasterDetail= false;
    }

    /**
     */
    public void deleteUseMasterDetailBanding() {
        this._hasuseMasterDetailBanding= false;
    }

    /**
     */
    public void deleteUseMasterDetailGridlines() {
        this._hasuseMasterDetailGridlines= false;
    }

    /**
     */
    public void deleteUseRowBanding() {
        this._hasuseRowBanding= false;
    }

    /**
     */
    public void deleteUseVerticalGridlines() {
        this._hasuseVerticalGridlines= false;
    }

    /**
     * Method enumerateField.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.pentaho.jfreereport.castormodel.reportspec.Field> enumerateField() {
        return java.util.Collections.enumeration(this.fieldList);
    }

    /**
     * Method enumerateFieldMapping.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.pentaho.jfreereport.castormodel.reportspec.FieldMapping> enumerateFieldMapping() {
        return java.util.Collections.enumeration(this.fieldMappingList);
    }

    /**
     * Returns the value of field 'bottomMargin'.
     * 
     * @return the value of field 'BottomMargin'.
     */
    public int getBottomMargin() {
        return this.bottomMargin;
    }

    /**
     * Returns the value of field 'calculateGrandTotals'.
     * 
     * @return the value of field 'CalculateGrandTotals'.
     */
    public boolean getCalculateGrandTotals() {
        return this.calculateGrandTotals;
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
     * Returns the value of field 'columnHeaderBackgroundColor'.
     * 
     * @return the value of field 'ColumnHeaderBackgroundColor'.
     */
    public java.lang.String getColumnHeaderBackgroundColor() {
        return this.columnHeaderBackgroundColor;
    }

    /**
     * Returns the value of field 'columnHeaderFontColor'.
     * 
     * @return the value of field 'ColumnHeaderFontColor'.
     */
    public java.lang.String getColumnHeaderFontColor() {
        return this.columnHeaderFontColor;
    }

    /**
     * Returns the value of field 'columnHeaderFontName'.
     * 
     * @return the value of field 'ColumnHeaderFontName'.
     */
    public java.lang.String getColumnHeaderFontName() {
        return this.columnHeaderFontName;
    }

    /**
     * Returns the value of field 'columnHeaderFontSize'.
     * 
     * @return the value of field 'ColumnHeaderFontSize'.
     */
    public int getColumnHeaderFontSize() {
        return this.columnHeaderFontSize;
    }

    /**
     * Returns the value of field 'columnHeaderFontStyle'.
     * 
     * @return the value of field 'ColumnHeaderFontStyle'.
     */
    public int getColumnHeaderFontStyle() {
        return this.columnHeaderFontStyle;
    }

    /**
     * Returns the value of field 'columnHeaderGap'.
     * 
     * @return the value of field 'ColumnHeaderGap'.
     */
    public int getColumnHeaderGap() {
        return this.columnHeaderGap;
    }

    /**
     * Returns the value of field 'columnHeaderHeight'.
     * 
     * @return the value of field 'ColumnHeaderHeight'.
     */
    public int getColumnHeaderHeight() {
        return this.columnHeaderHeight;
    }

    /**
     * Returns the value of field 'columnHeaderTopGap'.
     * 
     * @return the value of field 'ColumnHeaderTopGap'.
     */
    public int getColumnHeaderTopGap() {
        return this.columnHeaderTopGap;
    }

    /**
     * Returns the value of field 'customPageFormatHeight'.
     * 
     * @return the value of field 'CustomPageFormatHeight'.
     */
    public int getCustomPageFormatHeight() {
        return this.customPageFormatHeight;
    }

    /**
     * Returns the value of field 'customPageFormatWidth'.
     * 
     * @return the value of field 'CustomPageFormatWidth'.
     */
    public int getCustomPageFormatWidth() {
        return this.customPageFormatWidth;
    }

    /**
     * Returns the value of field 'doubleUnderlineExpression'.
     * 
     * @return the value of field 'DoubleUnderlineExpression'.
     */
    public boolean getDoubleUnderlineExpression() {
        return this.doubleUnderlineExpression;
    }

    /**
     * Returns the value of field
     * 'dummyGroupFooterBackgroundColor'.
     * 
     * @return the value of field 'DummyGroupFooterBackgroundColor'.
     */
    public java.lang.String getDummyGroupFooterBackgroundColor() {
        return this.dummyGroupFooterBackgroundColor;
    }

    /**
     * Method getField.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.pentaho.jfreereport.castormodel.reportspec.Field at the
     * given index
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Field getField(final int index) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.fieldList.size()) {
            throw new IndexOutOfBoundsException("getField: Index value '" + index + "' not in range [0.." + (this.fieldList.size() - 1) + "]");
        }

        return fieldList.get(index);
    }

    /**
     * Method getField.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Field[] getField() {
        org.pentaho.jfreereport.castormodel.reportspec.Field[] array = new org.pentaho.jfreereport.castormodel.reportspec.Field[0];
        return this.fieldList.toArray(array);
    }

    /**
     * Method getFieldCount.
     * 
     * @return the size of this collection
     */
    public int getFieldCount() {
        return this.fieldList.size();
    }

    /**
     * Method getFieldMapping.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.pentaho.jfreereport.castormodel.reportspec.FieldMapping
     * at the given index
     */
    public org.pentaho.jfreereport.castormodel.reportspec.FieldMapping getFieldMapping(final int index) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.fieldMappingList.size()) {
            throw new IndexOutOfBoundsException("getFieldMapping: Index value '" + index + "' not in range [0.." + (this.fieldMappingList.size() - 1) + "]");
        }

        return fieldMappingList.get(index);
    }

    /**
     * Method getFieldMapping.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.pentaho.jfreereport.castormodel.reportspec.FieldMapping[] getFieldMapping() {
        org.pentaho.jfreereport.castormodel.reportspec.FieldMapping[] array = new org.pentaho.jfreereport.castormodel.reportspec.FieldMapping[0];
        return this.fieldMappingList.toArray(array);
    }

    /**
     * Method getFieldMappingCount.
     * 
     * @return the size of this collection
     */
    public int getFieldMappingCount() {
        return this.fieldMappingList.size();
    }

    /**
     * Returns the value of field
     * 'generateReportLevelColumnHeaders'.
     * 
     * @return the value of field 'GenerateReportLevelColumnHeaders'
     */
    public boolean getGenerateReportLevelColumnHeaders() {
        return this.generateReportLevelColumnHeaders;
    }

    /**
     * Returns the value of field 'grandTotalsHorizontalAlignment'.
     * 
     * @return the value of field 'GrandTotalsHorizontalAlignment'.
     */
    public java.lang.String getGrandTotalsHorizontalAlignment() {
        return this.grandTotalsHorizontalAlignment;
    }

    /**
     * Returns the value of field 'grandTotalsLabel'.
     * 
     * @return the value of field 'GrandTotalsLabel'.
     */
    public java.lang.String getGrandTotalsLabel() {
        return this.grandTotalsLabel;
    }

    /**
     * Returns the value of field 'groupFooterFontColor'.
     * 
     * @return the value of field 'GroupFooterFontColor'.
     */
    public java.lang.String getGroupFooterFontColor() {
        return this.groupFooterFontColor;
    }

    /**
     * Returns the value of field 'groupFooterFontName'.
     * 
     * @return the value of field 'GroupFooterFontName'.
     */
    public java.lang.String getGroupFooterFontName() {
        return this.groupFooterFontName;
    }

    /**
     * Returns the value of field 'groupFooterFontSize'.
     * 
     * @return the value of field 'GroupFooterFontSize'.
     */
    public int getGroupFooterFontSize() {
        return this.groupFooterFontSize;
    }

    /**
     * Returns the value of field 'groupFooterFontStyle'.
     * 
     * @return the value of field 'GroupFooterFontStyle'.
     */
    public int getGroupFooterFontStyle() {
        return this.groupFooterFontStyle;
    }

    /**
     * Returns the value of field 'groupHeaderFontColor'.
     * 
     * @return the value of field 'GroupHeaderFontColor'.
     */
    public java.lang.String getGroupHeaderFontColor() {
        return this.groupHeaderFontColor;
    }

    /**
     * Returns the value of field 'groupHeaderFontName'.
     * 
     * @return the value of field 'GroupHeaderFontName'.
     */
    public java.lang.String getGroupHeaderFontName() {
        return this.groupHeaderFontName;
    }

    /**
     * Returns the value of field 'groupHeaderFontSize'.
     * 
     * @return the value of field 'GroupHeaderFontSize'.
     */
    public int getGroupHeaderFontSize() {
        return this.groupHeaderFontSize;
    }

    /**
     * Returns the value of field 'groupHeaderFontStyle'.
     * 
     * @return the value of field 'GroupHeaderFontStyle'.
     */
    public int getGroupHeaderFontStyle() {
        return this.groupHeaderFontStyle;
    }

    /**
     * Returns the value of field 'horizontalGridlinesColor'.
     * 
     * @return the value of field 'HorizontalGridlinesColor'.
     */
    public java.lang.String getHorizontalGridlinesColor() {
        return this.horizontalGridlinesColor;
    }

    /**
     * Returns the value of field 'horizontalOffset'.
     * 
     * @return the value of field 'HorizontalOffset'.
     */
    public int getHorizontalOffset() {
        return this.horizontalOffset;
    }

    /**
     * Returns the value of field 'includeSrc'.
     * 
     * @return the value of field 'IncludeSrc'.
     */
    public java.lang.String getIncludeSrc() {
        return this.includeSrc;
    }

    /**
     * Returns the value of field 'isMDX'.
     * 
     * @return the value of field 'IsMDX'.
     */
    public boolean getIsMDX() {
        return this.isMDX;
    }

    /**
     * Returns the value of field 'isMQL'.
     * 
     * @return the value of field 'IsMQL'.
     */
    public boolean getIsMQL() {
        return this.isMQL;
    }

    /**
     * Returns the value of field 'itemsFontColor'.
     * 
     * @return the value of field 'ItemsFontColor'.
     */
    public java.lang.String getItemsFontColor() {
        return this.itemsFontColor;
    }

    /**
     * Returns the value of field 'itemsFontName'.
     * 
     * @return the value of field 'ItemsFontName'.
     */
    public java.lang.String getItemsFontName() {
        return this.itemsFontName;
    }

    /**
     * Returns the value of field 'itemsFontSize'.
     * 
     * @return the value of field 'ItemsFontSize'.
     */
    public int getItemsFontSize() {
        return this.itemsFontSize;
    }

    /**
     * Returns the value of field 'itemsFontStyle'.
     * 
     * @return the value of field 'ItemsFontStyle'.
     */
    public int getItemsFontStyle() {
        return this.itemsFontStyle;
    }

    /**
     * Returns the value of field 'kettleStep'.
     * 
     * @return the value of field 'KettleStep'.
     */
    public java.lang.String getKettleStep() {
        return this.kettleStep;
    }

    /**
     * Returns the value of field 'leftMargin'.
     * 
     * @return the value of field 'LeftMargin'.
     */
    public int getLeftMargin() {
        return this.leftMargin;
    }

    /**
     * Returns the value of field 'mondrianCubeDefinitionPath'.
     * 
     * @return the value of field 'MondrianCubeDefinitionPath'.
     */
    public java.lang.String getMondrianCubeDefinitionPath() {
        return this.mondrianCubeDefinitionPath;
    }

    /**
     * Returns the value of field 'mqlQuery'.
     * 
     * @return the value of field 'MqlQuery'.
     */
    public java.lang.String getMqlQuery() {
        return this.mqlQuery;
    }

    /**
     * Returns the value of field 'orientation'.
     * 
     * @return the value of field 'Orientation'.
     */
    public java.lang.String getOrientation() {
        return this.orientation;
    }

    /**
     * Returns the value of field 'pageFormat'.
     * 
     * @return the value of field 'PageFormat'.
     */
    public java.lang.String getPageFormat() {
        return this.pageFormat;
    }

    /**
     * Returns the value of field 'query'.
     * 
     * @return the value of field 'Query'.
     */
    public java.lang.String getQuery() {
        return this.query;
    }

    /**
     * Returns the value of field 'reportDesc'.
     * 
     * @return the value of field 'ReportDesc'.
     */
    public java.lang.String getReportDesc() {
        return this.reportDesc;
    }

    /**
     * Returns the value of field 'reportName'.
     * 
     * @return the value of field 'ReportName'.
     */
    public java.lang.String getReportName() {
        return this.reportName;
    }

    /**
     * Returns the value of field 'reportSpecChoice'.
     * 
     * @return the value of field 'ReportSpecChoice'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice getReportSpecChoice() {
        return this.reportSpecChoice;
    }

    /**
     * Returns the value of field 'rightMargin'.
     * 
     * @return the value of field 'RightMargin'.
     */
    public int getRightMargin() {
        return this.rightMargin;
    }

    /**
     * Returns the value of field 'rowBandingColor'.
     * 
     * @return the value of field 'RowBandingColor'.
     */
    public java.lang.String getRowBandingColor() {
        return this.rowBandingColor;
    }

    /**
     * Returns the value of field 'rowBandingInitialState'.
     * 
     * @return the value of field 'RowBandingInitialState'.
     */
    public boolean getRowBandingInitialState() {
        return this.rowBandingInitialState;
    }

    /**
     * Returns the value of field 'templateName'.
     * 
     * @return the value of field 'TemplateName'.
     */
    public java.lang.String getTemplateName() {
        return this.templateName;
    }

    /**
     * Returns the value of field 'templateSrc'.
     * 
     * @return the value of field 'TemplateSrc'.
     */
    public java.lang.String getTemplateSrc() {
        return this.templateSrc;
    }

    /**
     * Returns the value of field 'tool'.
     * 
     * @return the value of field 'Tool'.
     */
    public java.lang.String getTool() {
        return this.tool;
    }

    /**
     * Returns the value of field 'toolVersion'.
     * 
     * @return the value of field 'ToolVersion'.
     */
    public java.lang.String getToolVersion() {
        return this.toolVersion;
    }

    /**
     * Returns the value of field 'topMargin'.
     * 
     * @return the value of field 'TopMargin'.
     */
    public int getTopMargin() {
        return this.topMargin;
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
     * Returns the value of field 'useColumnHeaderBackgroundColor'.
     * 
     * @return the value of field 'UseColumnHeaderBackgroundColor'.
     */
    public boolean getUseColumnHeaderBackgroundColor() {
        return this.useColumnHeaderBackgroundColor;
    }

    /**
     * Returns the value of field 'useCustomPageFormat'.
     * 
     * @return the value of field 'UseCustomPageFormat'.
     */
    public boolean getUseCustomPageFormat() {
        return this.useCustomPageFormat;
    }

    /**
     * Returns the value of field
     * 'useDummyGroupFooterBackgroundColor'.
     * 
     * @return the value of field
     * 'UseDummyGroupFooterBackgroundColor'.
     */
    public boolean getUseDummyGroupFooterBackgroundColor() {
        return this.useDummyGroupFooterBackgroundColor;
    }

    /**
     * Returns the value of field 'useExpressionUnderlining'.
     * 
     * @return the value of field 'UseExpressionUnderlining'.
     */
    public boolean getUseExpressionUnderlining() {
        return this.useExpressionUnderlining;
    }

    /**
     * Returns the value of field 'useHorizontalGridlines'.
     * 
     * @return the value of field 'UseHorizontalGridlines'.
     */
    public boolean getUseHorizontalGridlines() {
        return this.useHorizontalGridlines;
    }

    /**
     * Returns the value of field 'useMasterDetail'.
     * 
     * @return the value of field 'UseMasterDetail'.
     */
    public boolean getUseMasterDetail() {
        return this.useMasterDetail;
    }

    /**
     * Returns the value of field 'useMasterDetailBanding'.
     * 
     * @return the value of field 'UseMasterDetailBanding'.
     */
    public boolean getUseMasterDetailBanding() {
        return this.useMasterDetailBanding;
    }

    /**
     * Returns the value of field 'useMasterDetailGridlines'.
     * 
     * @return the value of field 'UseMasterDetailGridlines'.
     */
    public boolean getUseMasterDetailGridlines() {
        return this.useMasterDetailGridlines;
    }

    /**
     * Returns the value of field 'useRowBanding'.
     * 
     * @return the value of field 'UseRowBanding'.
     */
    public boolean getUseRowBanding() {
        return this.useRowBanding;
    }

    /**
     * Returns the value of field 'useVerticalGridlines'.
     * 
     * @return the value of field 'UseVerticalGridlines'.
     */
    public boolean getUseVerticalGridlines() {
        return this.useVerticalGridlines;
    }

    /**
     * Returns the value of field 'verticalGridlinesColor'.
     * 
     * @return the value of field 'VerticalGridlinesColor'.
     */
    public java.lang.String getVerticalGridlinesColor() {
        return this.verticalGridlinesColor;
    }

    /**
     * Returns the value of field 'watermark'.
     * 
     * @return the value of field 'Watermark'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Watermark getWatermark() {
        return this.watermark;
    }

    /**
     * Returns the value of field 'xmiPath'.
     * 
     * @return the value of field 'XmiPath'.
     */
    public java.lang.String getXmiPath() {
        return this.xmiPath;
    }

    /**
     * Method hasBottomMargin.
     * 
     * @return true if at least one BottomMargin has been added
     */
    public boolean hasBottomMargin() {
        return this._hasbottomMargin;
    }

    /**
     * Method hasCalculateGrandTotals.
     * 
     * @return true if at least one CalculateGrandTotals has been
     * added
     */
    public boolean hasCalculateGrandTotals() {
        return this._hascalculateGrandTotals;
    }

    /**
     * Method hasColumnHeaderFontSize.
     * 
     * @return true if at least one ColumnHeaderFontSize has been
     * added
     */
    public boolean hasColumnHeaderFontSize() {
        return this._hascolumnHeaderFontSize;
    }

    /**
     * Method hasColumnHeaderFontStyle.
     * 
     * @return true if at least one ColumnHeaderFontStyle has been
     * added
     */
    public boolean hasColumnHeaderFontStyle() {
        return this._hascolumnHeaderFontStyle;
    }

    /**
     * Method hasColumnHeaderGap.
     * 
     * @return true if at least one ColumnHeaderGap has been added
     */
    public boolean hasColumnHeaderGap() {
        return this._hascolumnHeaderGap;
    }

    /**
     * Method hasColumnHeaderHeight.
     * 
     * @return true if at least one ColumnHeaderHeight has been adde
     */
    public boolean hasColumnHeaderHeight() {
        return this._hascolumnHeaderHeight;
    }

    /**
     * Method hasColumnHeaderTopGap.
     * 
     * @return true if at least one ColumnHeaderTopGap has been adde
     */
    public boolean hasColumnHeaderTopGap() {
        return this._hascolumnHeaderTopGap;
    }

    /**
     * Method hasCustomPageFormatHeight.
     * 
     * @return true if at least one CustomPageFormatHeight has been
     * added
     */
    public boolean hasCustomPageFormatHeight() {
        return this._hascustomPageFormatHeight;
    }

    /**
     * Method hasCustomPageFormatWidth.
     * 
     * @return true if at least one CustomPageFormatWidth has been
     * added
     */
    public boolean hasCustomPageFormatWidth() {
        return this._hascustomPageFormatWidth;
    }

    /**
     * Method hasDoubleUnderlineExpression.
     * 
     * @return true if at least one DoubleUnderlineExpression has
     * been added
     */
    public boolean hasDoubleUnderlineExpression() {
        return this._hasdoubleUnderlineExpression;
    }

    /**
     * Method hasGenerateReportLevelColumnHeaders.
     * 
     * @return true if at least one
     * GenerateReportLevelColumnHeaders has been added
     */
    public boolean hasGenerateReportLevelColumnHeaders() {
        return this._hasgenerateReportLevelColumnHeaders;
    }

    /**
     * Method hasGroupFooterFontSize.
     * 
     * @return true if at least one GroupFooterFontSize has been
     * added
     */
    public boolean hasGroupFooterFontSize() {
        return this._hasgroupFooterFontSize;
    }

    /**
     * Method hasGroupFooterFontStyle.
     * 
     * @return true if at least one GroupFooterFontStyle has been
     * added
     */
    public boolean hasGroupFooterFontStyle() {
        return this._hasgroupFooterFontStyle;
    }

    /**
     * Method hasGroupHeaderFontSize.
     * 
     * @return true if at least one GroupHeaderFontSize has been
     * added
     */
    public boolean hasGroupHeaderFontSize() {
        return this._hasgroupHeaderFontSize;
    }

    /**
     * Method hasGroupHeaderFontStyle.
     * 
     * @return true if at least one GroupHeaderFontStyle has been
     * added
     */
    public boolean hasGroupHeaderFontStyle() {
        return this._hasgroupHeaderFontStyle;
    }

    /**
     * Method hasHorizontalOffset.
     * 
     * @return true if at least one HorizontalOffset has been added
     */
    public boolean hasHorizontalOffset() {
        return this._hashorizontalOffset;
    }

    /**
     * Method hasIsMDX.
     * 
     * @return true if at least one IsMDX has been added
     */
    public boolean hasIsMDX() {
        return this._hasisMDX;
    }

    /**
     * Method hasIsMQL.
     * 
     * @return true if at least one IsMQL has been added
     */
    public boolean hasIsMQL() {
        return this._hasisMQL;
    }

    /**
     * Method hasItemsFontSize.
     * 
     * @return true if at least one ItemsFontSize has been added
     */
    public boolean hasItemsFontSize() {
        return this._hasitemsFontSize;
    }

    /**
     * Method hasItemsFontStyle.
     * 
     * @return true if at least one ItemsFontStyle has been added
     */
    public boolean hasItemsFontStyle() {
        return this._hasitemsFontStyle;
    }

    /**
     * Method hasLeftMargin.
     * 
     * @return true if at least one LeftMargin has been added
     */
    public boolean hasLeftMargin() {
        return this._hasleftMargin;
    }

    /**
     * Method hasRightMargin.
     * 
     * @return true if at least one RightMargin has been added
     */
    public boolean hasRightMargin() {
        return this._hasrightMargin;
    }

    /**
     * Method hasRowBandingInitialState.
     * 
     * @return true if at least one RowBandingInitialState has been
     * added
     */
    public boolean hasRowBandingInitialState() {
        return this._hasrowBandingInitialState;
    }

    /**
     * Method hasTopMargin.
     * 
     * @return true if at least one TopMargin has been added
     */
    public boolean hasTopMargin() {
        return this._hastopMargin;
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
     * Method hasUseColumnHeaderBackgroundColor.
     * 
     * @return true if at least one UseColumnHeaderBackgroundColor
     * has been added
     */
    public boolean hasUseColumnHeaderBackgroundColor() {
        return this._hasuseColumnHeaderBackgroundColor;
    }

    /**
     * Method hasUseCustomPageFormat.
     * 
     * @return true if at least one UseCustomPageFormat has been
     * added
     */
    public boolean hasUseCustomPageFormat() {
        return this._hasuseCustomPageFormat;
    }

    /**
     * Method hasUseDummyGroupFooterBackgroundColor.
     * 
     * @return true if at least one
     * UseDummyGroupFooterBackgroundColor has been added
     */
    public boolean hasUseDummyGroupFooterBackgroundColor() {
        return this._hasuseDummyGroupFooterBackgroundColor;
    }

    /**
     * Method hasUseExpressionUnderlining.
     * 
     * @return true if at least one UseExpressionUnderlining has
     * been added
     */
    public boolean hasUseExpressionUnderlining() {
        return this._hasuseExpressionUnderlining;
    }

    /**
     * Method hasUseHorizontalGridlines.
     * 
     * @return true if at least one UseHorizontalGridlines has been
     * added
     */
    public boolean hasUseHorizontalGridlines() {
        return this._hasuseHorizontalGridlines;
    }

    /**
     * Method hasUseMasterDetail.
     * 
     * @return true if at least one UseMasterDetail has been added
     */
    public boolean hasUseMasterDetail() {
        return this._hasuseMasterDetail;
    }

    /**
     * Method hasUseMasterDetailBanding.
     * 
     * @return true if at least one UseMasterDetailBanding has been
     * added
     */
    public boolean hasUseMasterDetailBanding() {
        return this._hasuseMasterDetailBanding;
    }

    /**
     * Method hasUseMasterDetailGridlines.
     * 
     * @return true if at least one UseMasterDetailGridlines has
     * been added
     */
    public boolean hasUseMasterDetailGridlines() {
        return this._hasuseMasterDetailGridlines;
    }

    /**
     * Method hasUseRowBanding.
     * 
     * @return true if at least one UseRowBanding has been added
     */
    public boolean hasUseRowBanding() {
        return this._hasuseRowBanding;
    }

    /**
     * Method hasUseVerticalGridlines.
     * 
     * @return true if at least one UseVerticalGridlines has been
     * added
     */
    public boolean hasUseVerticalGridlines() {
        return this._hasuseVerticalGridlines;
    }

    /**
     * Returns the value of field 'calculateGrandTotals'.
     * 
     * @return the value of field 'CalculateGrandTotals'.
     */
    public boolean isCalculateGrandTotals() {
        return this.calculateGrandTotals;
    }

    /**
     * Returns the value of field 'doubleUnderlineExpression'.
     * 
     * @return the value of field 'DoubleUnderlineExpression'.
     */
    public boolean isDoubleUnderlineExpression() {
        return this.doubleUnderlineExpression;
    }

    /**
     * Returns the value of field
     * 'generateReportLevelColumnHeaders'.
     * 
     * @return the value of field 'GenerateReportLevelColumnHeaders'
     */
    public boolean isGenerateReportLevelColumnHeaders() {
        return this.generateReportLevelColumnHeaders;
    }

    /**
     * Returns the value of field 'isMDX'.
     * 
     * @return the value of field 'IsMDX'.
     */
    public boolean isIsMDX() {
        return this.isMDX;
    }

    /**
     * Returns the value of field 'isMQL'.
     * 
     * @return the value of field 'IsMQL'.
     */
    public boolean isIsMQL() {
        return this.isMQL;
    }

    /**
     * Returns the value of field 'rowBandingInitialState'.
     * 
     * @return the value of field 'RowBandingInitialState'.
     */
    public boolean isRowBandingInitialState() {
        return this.rowBandingInitialState;
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
     * Returns the value of field 'useColumnHeaderBackgroundColor'.
     * 
     * @return the value of field 'UseColumnHeaderBackgroundColor'.
     */
    public boolean isUseColumnHeaderBackgroundColor() {
        return this.useColumnHeaderBackgroundColor;
    }

    /**
     * Returns the value of field 'useCustomPageFormat'.
     * 
     * @return the value of field 'UseCustomPageFormat'.
     */
    public boolean isUseCustomPageFormat() {
        return this.useCustomPageFormat;
    }

    /**
     * Returns the value of field
     * 'useDummyGroupFooterBackgroundColor'.
     * 
     * @return the value of field
     * 'UseDummyGroupFooterBackgroundColor'.
     */
    public boolean isUseDummyGroupFooterBackgroundColor() {
        return this.useDummyGroupFooterBackgroundColor;
    }

    /**
     * Returns the value of field 'useExpressionUnderlining'.
     * 
     * @return the value of field 'UseExpressionUnderlining'.
     */
    public boolean isUseExpressionUnderlining() {
        return this.useExpressionUnderlining;
    }

    /**
     * Returns the value of field 'useHorizontalGridlines'.
     * 
     * @return the value of field 'UseHorizontalGridlines'.
     */
    public boolean isUseHorizontalGridlines() {
        return this.useHorizontalGridlines;
    }

    /**
     * Returns the value of field 'useMasterDetail'.
     * 
     * @return the value of field 'UseMasterDetail'.
     */
    public boolean isUseMasterDetail() {
        return this.useMasterDetail;
    }

    /**
     * Returns the value of field 'useMasterDetailBanding'.
     * 
     * @return the value of field 'UseMasterDetailBanding'.
     */
    public boolean isUseMasterDetailBanding() {
        return this.useMasterDetailBanding;
    }

    /**
     * Returns the value of field 'useMasterDetailGridlines'.
     * 
     * @return the value of field 'UseMasterDetailGridlines'.
     */
    public boolean isUseMasterDetailGridlines() {
        return this.useMasterDetailGridlines;
    }

    /**
     * Returns the value of field 'useRowBanding'.
     * 
     * @return the value of field 'UseRowBanding'.
     */
    public boolean isUseRowBanding() {
        return this.useRowBanding;
    }

    /**
     * Returns the value of field 'useVerticalGridlines'.
     * 
     * @return the value of field 'UseVerticalGridlines'.
     */
    public boolean isUseVerticalGridlines() {
        return this.useVerticalGridlines;
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
     * Method iterateField.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.pentaho.jfreereport.castormodel.reportspec.Field> iterateField() {
        return this.fieldList.iterator();
    }

    /**
     * Method iterateFieldMapping.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.pentaho.jfreereport.castormodel.reportspec.FieldMapping> iterateFieldMapping() {
        return this.fieldMappingList.iterator();
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
    public void removeAllField() {
        this.fieldList.clear();
    }

    /**
     */
    public void removeAllFieldMapping() {
        this.fieldMappingList.clear();
    }

    /**
     * Method removeField.
     * 
     * @param vField
     * @return true if the object was removed from the collection.
     */
    public boolean removeField(final org.pentaho.jfreereport.castormodel.reportspec.Field vField) {
        boolean removed = fieldList.remove(vField);
        return removed;
    }

    /**
     * Method removeFieldAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Field removeFieldAt(final int index) {
        java.lang.Object obj = this.fieldList.remove(index);
        return (org.pentaho.jfreereport.castormodel.reportspec.Field) obj;
    }

    /**
     * Method removeFieldMapping.
     * 
     * @param vFieldMapping
     * @return true if the object was removed from the collection.
     */
    public boolean removeFieldMapping(final org.pentaho.jfreereport.castormodel.reportspec.FieldMapping vFieldMapping) {
        boolean removed = fieldMappingList.remove(vFieldMapping);
        return removed;
    }

    /**
     * Method removeFieldMappingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.pentaho.jfreereport.castormodel.reportspec.FieldMapping removeFieldMappingAt(final int index) {
        java.lang.Object obj = this.fieldMappingList.remove(index);
        return (org.pentaho.jfreereport.castormodel.reportspec.FieldMapping) obj;
    }

    /**
     * Sets the value of field 'bottomMargin'.
     * 
     * @param bottomMargin the value of field 'bottomMargin'.
     */
    public void setBottomMargin(final int bottomMargin) {
        this.bottomMargin = bottomMargin;
        this._hasbottomMargin = true;
    }

    /**
     * Sets the value of field 'calculateGrandTotals'.
     * 
     * @param calculateGrandTotals the value of field
     * 'calculateGrandTotals'.
     */
    public void setCalculateGrandTotals(final boolean calculateGrandTotals) {
        this.calculateGrandTotals = calculateGrandTotals;
        this._hascalculateGrandTotals = true;
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
     * Sets the value of field 'columnHeaderBackgroundColor'.
     * 
     * @param columnHeaderBackgroundColor the value of field
     * 'columnHeaderBackgroundColor'.
     */
    public void setColumnHeaderBackgroundColor(final java.lang.String columnHeaderBackgroundColor) {
        this.columnHeaderBackgroundColor = columnHeaderBackgroundColor;
    }

    /**
     * Sets the value of field 'columnHeaderFontColor'.
     * 
     * @param columnHeaderFontColor the value of field
     * 'columnHeaderFontColor'.
     */
    public void setColumnHeaderFontColor(final java.lang.String columnHeaderFontColor) {
        this.columnHeaderFontColor = columnHeaderFontColor;
    }

    /**
     * Sets the value of field 'columnHeaderFontName'.
     * 
     * @param columnHeaderFontName the value of field
     * 'columnHeaderFontName'.
     */
    public void setColumnHeaderFontName(final java.lang.String columnHeaderFontName) {
        this.columnHeaderFontName = columnHeaderFontName;
    }

    /**
     * Sets the value of field 'columnHeaderFontSize'.
     * 
     * @param columnHeaderFontSize the value of field
     * 'columnHeaderFontSize'.
     */
    public void setColumnHeaderFontSize(final int columnHeaderFontSize) {
        this.columnHeaderFontSize = columnHeaderFontSize;
        this._hascolumnHeaderFontSize = true;
    }

    /**
     * Sets the value of field 'columnHeaderFontStyle'.
     * 
     * @param columnHeaderFontStyle the value of field
     * 'columnHeaderFontStyle'.
     */
    public void setColumnHeaderFontStyle(final int columnHeaderFontStyle) {
        this.columnHeaderFontStyle = columnHeaderFontStyle;
        this._hascolumnHeaderFontStyle = true;
    }

    /**
     * Sets the value of field 'columnHeaderGap'.
     * 
     * @param columnHeaderGap the value of field 'columnHeaderGap'.
     */
    public void setColumnHeaderGap(final int columnHeaderGap) {
        this.columnHeaderGap = columnHeaderGap;
        this._hascolumnHeaderGap = true;
    }

    /**
     * Sets the value of field 'columnHeaderHeight'.
     * 
     * @param columnHeaderHeight the value of field
     * 'columnHeaderHeight'.
     */
    public void setColumnHeaderHeight(final int columnHeaderHeight) {
        this.columnHeaderHeight = columnHeaderHeight;
        this._hascolumnHeaderHeight = true;
    }

    /**
     * Sets the value of field 'columnHeaderTopGap'.
     * 
     * @param columnHeaderTopGap the value of field
     * 'columnHeaderTopGap'.
     */
    public void setColumnHeaderTopGap(final int columnHeaderTopGap) {
        this.columnHeaderTopGap = columnHeaderTopGap;
        this._hascolumnHeaderTopGap = true;
    }

    /**
     * Sets the value of field 'customPageFormatHeight'.
     * 
     * @param customPageFormatHeight the value of field
     * 'customPageFormatHeight'.
     */
    public void setCustomPageFormatHeight(final int customPageFormatHeight) {
        this.customPageFormatHeight = customPageFormatHeight;
        this._hascustomPageFormatHeight = true;
    }

    /**
     * Sets the value of field 'customPageFormatWidth'.
     * 
     * @param customPageFormatWidth the value of field
     * 'customPageFormatWidth'.
     */
    public void setCustomPageFormatWidth(final int customPageFormatWidth) {
        this.customPageFormatWidth = customPageFormatWidth;
        this._hascustomPageFormatWidth = true;
    }

    /**
     * Sets the value of field 'doubleUnderlineExpression'.
     * 
     * @param doubleUnderlineExpression the value of field
     * 'doubleUnderlineExpression'.
     */
    public void setDoubleUnderlineExpression(final boolean doubleUnderlineExpression) {
        this.doubleUnderlineExpression = doubleUnderlineExpression;
        this._hasdoubleUnderlineExpression = true;
    }

    /**
     * Sets the value of field 'dummyGroupFooterBackgroundColor'.
     * 
     * @param dummyGroupFooterBackgroundColor the value of field
     * 'dummyGroupFooterBackgroundColor'.
     */
    public void setDummyGroupFooterBackgroundColor(final java.lang.String dummyGroupFooterBackgroundColor) {
        this.dummyGroupFooterBackgroundColor = dummyGroupFooterBackgroundColor;
    }

    /**
     * 
     * 
     * @param index
     * @param vField
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setField(final int index,final org.pentaho.jfreereport.castormodel.reportspec.Field vField) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.fieldList.size()) {
            throw new IndexOutOfBoundsException("setField: Index value '" + index + "' not in range [0.." + (this.fieldList.size() - 1) + "]");
        }

        this.fieldList.set(index, vField);
    }

    /**
     * 
     * 
     * @param vFieldArray
     */
    public void setField(final org.pentaho.jfreereport.castormodel.reportspec.Field[] vFieldArray) {
        //-- copy array
        fieldList.clear();

        for (int i = 0; i < vFieldArray.length; i++) {
                this.fieldList.add(vFieldArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vFieldMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setFieldMapping(final int index,final org.pentaho.jfreereport.castormodel.reportspec.FieldMapping vFieldMapping) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.fieldMappingList.size()) {
            throw new IndexOutOfBoundsException("setFieldMapping: Index value '" + index + "' not in range [0.." + (this.fieldMappingList.size() - 1) + "]");
        }

        this.fieldMappingList.set(index, vFieldMapping);
    }

    /**
     * 
     * 
     * @param vFieldMappingArray
     */
    public void setFieldMapping(final org.pentaho.jfreereport.castormodel.reportspec.FieldMapping[] vFieldMappingArray) {
        //-- copy array
        fieldMappingList.clear();

        for (int i = 0; i < vFieldMappingArray.length; i++) {
                this.fieldMappingList.add(vFieldMappingArray[i]);
        }
    }

    /**
     * Sets the value of field 'generateReportLevelColumnHeaders'.
     * 
     * @param generateReportLevelColumnHeaders the value of field
     * 'generateReportLevelColumnHeaders'.
     */
    public void setGenerateReportLevelColumnHeaders(final boolean generateReportLevelColumnHeaders) {
        this.generateReportLevelColumnHeaders = generateReportLevelColumnHeaders;
        this._hasgenerateReportLevelColumnHeaders = true;
    }

    /**
     * Sets the value of field 'grandTotalsHorizontalAlignment'.
     * 
     * @param grandTotalsHorizontalAlignment the value of field
     * 'grandTotalsHorizontalAlignment'.
     */
    public void setGrandTotalsHorizontalAlignment(final java.lang.String grandTotalsHorizontalAlignment) {
        this.grandTotalsHorizontalAlignment = grandTotalsHorizontalAlignment;
    }

    /**
     * Sets the value of field 'grandTotalsLabel'.
     * 
     * @param grandTotalsLabel the value of field 'grandTotalsLabel'
     */
    public void setGrandTotalsLabel(final java.lang.String grandTotalsLabel) {
        this.grandTotalsLabel = grandTotalsLabel;
    }

    /**
     * Sets the value of field 'groupFooterFontColor'.
     * 
     * @param groupFooterFontColor the value of field
     * 'groupFooterFontColor'.
     */
    public void setGroupFooterFontColor(final java.lang.String groupFooterFontColor) {
        this.groupFooterFontColor = groupFooterFontColor;
    }

    /**
     * Sets the value of field 'groupFooterFontName'.
     * 
     * @param groupFooterFontName the value of field
     * 'groupFooterFontName'.
     */
    public void setGroupFooterFontName(final java.lang.String groupFooterFontName) {
        this.groupFooterFontName = groupFooterFontName;
    }

    /**
     * Sets the value of field 'groupFooterFontSize'.
     * 
     * @param groupFooterFontSize the value of field
     * 'groupFooterFontSize'.
     */
    public void setGroupFooterFontSize(final int groupFooterFontSize) {
        this.groupFooterFontSize = groupFooterFontSize;
        this._hasgroupFooterFontSize = true;
    }

    /**
     * Sets the value of field 'groupFooterFontStyle'.
     * 
     * @param groupFooterFontStyle the value of field
     * 'groupFooterFontStyle'.
     */
    public void setGroupFooterFontStyle(final int groupFooterFontStyle) {
        this.groupFooterFontStyle = groupFooterFontStyle;
        this._hasgroupFooterFontStyle = true;
    }

    /**
     * Sets the value of field 'groupHeaderFontColor'.
     * 
     * @param groupHeaderFontColor the value of field
     * 'groupHeaderFontColor'.
     */
    public void setGroupHeaderFontColor(final java.lang.String groupHeaderFontColor) {
        this.groupHeaderFontColor = groupHeaderFontColor;
    }

    /**
     * Sets the value of field 'groupHeaderFontName'.
     * 
     * @param groupHeaderFontName the value of field
     * 'groupHeaderFontName'.
     */
    public void setGroupHeaderFontName(final java.lang.String groupHeaderFontName) {
        this.groupHeaderFontName = groupHeaderFontName;
    }

    /**
     * Sets the value of field 'groupHeaderFontSize'.
     * 
     * @param groupHeaderFontSize the value of field
     * 'groupHeaderFontSize'.
     */
    public void setGroupHeaderFontSize(final int groupHeaderFontSize) {
        this.groupHeaderFontSize = groupHeaderFontSize;
        this._hasgroupHeaderFontSize = true;
    }

    /**
     * Sets the value of field 'groupHeaderFontStyle'.
     * 
     * @param groupHeaderFontStyle the value of field
     * 'groupHeaderFontStyle'.
     */
    public void setGroupHeaderFontStyle(final int groupHeaderFontStyle) {
        this.groupHeaderFontStyle = groupHeaderFontStyle;
        this._hasgroupHeaderFontStyle = true;
    }

    /**
     * Sets the value of field 'horizontalGridlinesColor'.
     * 
     * @param horizontalGridlinesColor the value of field
     * 'horizontalGridlinesColor'.
     */
    public void setHorizontalGridlinesColor(final java.lang.String horizontalGridlinesColor) {
        this.horizontalGridlinesColor = horizontalGridlinesColor;
    }

    /**
     * Sets the value of field 'horizontalOffset'.
     * 
     * @param horizontalOffset the value of field 'horizontalOffset'
     */
    public void setHorizontalOffset(final int horizontalOffset) {
        this.horizontalOffset = horizontalOffset;
        this._hashorizontalOffset = true;
    }

    /**
     * Sets the value of field 'includeSrc'.
     * 
     * @param includeSrc the value of field 'includeSrc'.
     */
    public void setIncludeSrc(final java.lang.String includeSrc) {
        this.includeSrc = includeSrc;
    }

    /**
     * Sets the value of field 'isMDX'.
     * 
     * @param isMDX the value of field 'isMDX'.
     */
    public void setIsMDX(final boolean isMDX) {
        this.isMDX = isMDX;
        this._hasisMDX = true;
    }

    /**
     * Sets the value of field 'isMQL'.
     * 
     * @param isMQL the value of field 'isMQL'.
     */
    public void setIsMQL(final boolean isMQL) {
        this.isMQL = isMQL;
        this._hasisMQL = true;
    }

    /**
     * Sets the value of field 'itemsFontColor'.
     * 
     * @param itemsFontColor the value of field 'itemsFontColor'.
     */
    public void setItemsFontColor(final java.lang.String itemsFontColor) {
        this.itemsFontColor = itemsFontColor;
    }

    /**
     * Sets the value of field 'itemsFontName'.
     * 
     * @param itemsFontName the value of field 'itemsFontName'.
     */
    public void setItemsFontName(final java.lang.String itemsFontName) {
        this.itemsFontName = itemsFontName;
    }

    /**
     * Sets the value of field 'itemsFontSize'.
     * 
     * @param itemsFontSize the value of field 'itemsFontSize'.
     */
    public void setItemsFontSize(final int itemsFontSize) {
        this.itemsFontSize = itemsFontSize;
        this._hasitemsFontSize = true;
    }

    /**
     * Sets the value of field 'itemsFontStyle'.
     * 
     * @param itemsFontStyle the value of field 'itemsFontStyle'.
     */
    public void setItemsFontStyle(final int itemsFontStyle) {
        this.itemsFontStyle = itemsFontStyle;
        this._hasitemsFontStyle = true;
    }

    /**
     * Sets the value of field 'kettleStep'.
     * 
     * @param kettleStep the value of field 'kettleStep'.
     */
    public void setKettleStep(final java.lang.String kettleStep) {
        this.kettleStep = kettleStep;
    }

    /**
     * Sets the value of field 'leftMargin'.
     * 
     * @param leftMargin the value of field 'leftMargin'.
     */
    public void setLeftMargin(final int leftMargin) {
        this.leftMargin = leftMargin;
        this._hasleftMargin = true;
    }

    /**
     * Sets the value of field 'mondrianCubeDefinitionPath'.
     * 
     * @param mondrianCubeDefinitionPath the value of field
     * 'mondrianCubeDefinitionPath'.
     */
    public void setMondrianCubeDefinitionPath(final java.lang.String mondrianCubeDefinitionPath) {
        this.mondrianCubeDefinitionPath = mondrianCubeDefinitionPath;
    }

    /**
     * Sets the value of field 'mqlQuery'.
     * 
     * @param mqlQuery the value of field 'mqlQuery'.
     */
    public void setMqlQuery(final java.lang.String mqlQuery) {
        this.mqlQuery = mqlQuery;
    }

    /**
     * Sets the value of field 'orientation'.
     * 
     * @param orientation the value of field 'orientation'.
     */
    public void setOrientation(final java.lang.String orientation) {
        this.orientation = orientation;
    }

    /**
     * Sets the value of field 'pageFormat'.
     * 
     * @param pageFormat the value of field 'pageFormat'.
     */
    public void setPageFormat(final java.lang.String pageFormat) {
        this.pageFormat = pageFormat;
    }

    /**
     * Sets the value of field 'query'.
     * 
     * @param query the value of field 'query'.
     */
    public void setQuery(final java.lang.String query) {
        this.query = query;
    }

    /**
     * Sets the value of field 'reportDesc'.
     * 
     * @param reportDesc the value of field 'reportDesc'.
     */
    public void setReportDesc(final java.lang.String reportDesc) {
        this.reportDesc = reportDesc;
    }

    /**
     * Sets the value of field 'reportName'.
     * 
     * @param reportName the value of field 'reportName'.
     */
    public void setReportName(final java.lang.String reportName) {
        this.reportName = reportName;
    }

    /**
     * Sets the value of field 'reportSpecChoice'.
     * 
     * @param reportSpecChoice the value of field 'reportSpecChoice'
     */
    public void setReportSpecChoice(final org.pentaho.jfreereport.castormodel.reportspec.ReportSpecChoice reportSpecChoice) {
        this.reportSpecChoice = reportSpecChoice;
    }

    /**
     * Sets the value of field 'rightMargin'.
     * 
     * @param rightMargin the value of field 'rightMargin'.
     */
    public void setRightMargin(final int rightMargin) {
        this.rightMargin = rightMargin;
        this._hasrightMargin = true;
    }

    /**
     * Sets the value of field 'rowBandingColor'.
     * 
     * @param rowBandingColor the value of field 'rowBandingColor'.
     */
    public void setRowBandingColor(final java.lang.String rowBandingColor) {
        this.rowBandingColor = rowBandingColor;
    }

    /**
     * Sets the value of field 'rowBandingInitialState'.
     * 
     * @param rowBandingInitialState the value of field
     * 'rowBandingInitialState'.
     */
    public void setRowBandingInitialState(final boolean rowBandingInitialState) {
        this.rowBandingInitialState = rowBandingInitialState;
        this._hasrowBandingInitialState = true;
    }

    /**
     * Sets the value of field 'templateName'.
     * 
     * @param templateName the value of field 'templateName'.
     */
    public void setTemplateName(final java.lang.String templateName) {
        this.templateName = templateName;
    }

    /**
     * Sets the value of field 'templateSrc'.
     * 
     * @param templateSrc the value of field 'templateSrc'.
     */
    public void setTemplateSrc(final java.lang.String templateSrc) {
        this.templateSrc = templateSrc;
    }

    /**
     * Sets the value of field 'tool'.
     * 
     * @param tool the value of field 'tool'.
     */
    public void setTool(final java.lang.String tool) {
        this.tool = tool;
    }

    /**
     * Sets the value of field 'toolVersion'.
     * 
     * @param toolVersion the value of field 'toolVersion'.
     */
    public void setToolVersion(final java.lang.String toolVersion) {
        this.toolVersion = toolVersion;
    }

    /**
     * Sets the value of field 'topMargin'.
     * 
     * @param topMargin the value of field 'topMargin'.
     */
    public void setTopMargin(final int topMargin) {
        this.topMargin = topMargin;
        this._hastopMargin = true;
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
     * Sets the value of field 'useColumnHeaderBackgroundColor'.
     * 
     * @param useColumnHeaderBackgroundColor the value of field
     * 'useColumnHeaderBackgroundColor'.
     */
    public void setUseColumnHeaderBackgroundColor(final boolean useColumnHeaderBackgroundColor) {
        this.useColumnHeaderBackgroundColor = useColumnHeaderBackgroundColor;
        this._hasuseColumnHeaderBackgroundColor = true;
    }

    /**
     * Sets the value of field 'useCustomPageFormat'.
     * 
     * @param useCustomPageFormat the value of field
     * 'useCustomPageFormat'.
     */
    public void setUseCustomPageFormat(final boolean useCustomPageFormat) {
        this.useCustomPageFormat = useCustomPageFormat;
        this._hasuseCustomPageFormat = true;
    }

    /**
     * Sets the value of field
     * 'useDummyGroupFooterBackgroundColor'.
     * 
     * @param useDummyGroupFooterBackgroundColor the value of field
     * 'useDummyGroupFooterBackgroundColor'.
     */
    public void setUseDummyGroupFooterBackgroundColor(final boolean useDummyGroupFooterBackgroundColor) {
        this.useDummyGroupFooterBackgroundColor = useDummyGroupFooterBackgroundColor;
        this._hasuseDummyGroupFooterBackgroundColor = true;
    }

    /**
     * Sets the value of field 'useExpressionUnderlining'.
     * 
     * @param useExpressionUnderlining the value of field
     * 'useExpressionUnderlining'.
     */
    public void setUseExpressionUnderlining(final boolean useExpressionUnderlining) {
        this.useExpressionUnderlining = useExpressionUnderlining;
        this._hasuseExpressionUnderlining = true;
    }

    /**
     * Sets the value of field 'useHorizontalGridlines'.
     * 
     * @param useHorizontalGridlines the value of field
     * 'useHorizontalGridlines'.
     */
    public void setUseHorizontalGridlines(final boolean useHorizontalGridlines) {
        this.useHorizontalGridlines = useHorizontalGridlines;
        this._hasuseHorizontalGridlines = true;
    }

    /**
     * Sets the value of field 'useMasterDetail'.
     * 
     * @param useMasterDetail the value of field 'useMasterDetail'.
     */
    public void setUseMasterDetail(final boolean useMasterDetail) {
        this.useMasterDetail = useMasterDetail;
        this._hasuseMasterDetail = true;
    }

    /**
     * Sets the value of field 'useMasterDetailBanding'.
     * 
     * @param useMasterDetailBanding the value of field
     * 'useMasterDetailBanding'.
     */
    public void setUseMasterDetailBanding(final boolean useMasterDetailBanding) {
        this.useMasterDetailBanding = useMasterDetailBanding;
        this._hasuseMasterDetailBanding = true;
    }

    /**
     * Sets the value of field 'useMasterDetailGridlines'.
     * 
     * @param useMasterDetailGridlines the value of field
     * 'useMasterDetailGridlines'.
     */
    public void setUseMasterDetailGridlines(final boolean useMasterDetailGridlines) {
        this.useMasterDetailGridlines = useMasterDetailGridlines;
        this._hasuseMasterDetailGridlines = true;
    }

    /**
     * Sets the value of field 'useRowBanding'.
     * 
     * @param useRowBanding the value of field 'useRowBanding'.
     */
    public void setUseRowBanding(final boolean useRowBanding) {
        this.useRowBanding = useRowBanding;
        this._hasuseRowBanding = true;
    }

    /**
     * Sets the value of field 'useVerticalGridlines'.
     * 
     * @param useVerticalGridlines the value of field
     * 'useVerticalGridlines'.
     */
    public void setUseVerticalGridlines(final boolean useVerticalGridlines) {
        this.useVerticalGridlines = useVerticalGridlines;
        this._hasuseVerticalGridlines = true;
    }

    /**
     * Sets the value of field 'verticalGridlinesColor'.
     * 
     * @param verticalGridlinesColor the value of field
     * 'verticalGridlinesColor'.
     */
    public void setVerticalGridlinesColor(final java.lang.String verticalGridlinesColor) {
        this.verticalGridlinesColor = verticalGridlinesColor;
    }

    /**
     * Sets the value of field 'watermark'.
     * 
     * @param watermark the value of field 'watermark'.
     */
    public void setWatermark(final org.pentaho.jfreereport.castormodel.reportspec.Watermark watermark) {
        this.watermark = watermark;
    }

    /**
     * Sets the value of field 'xmiPath'.
     * 
     * @param xmiPath the value of field 'xmiPath'.
     */
    public void setXmiPath(final java.lang.String xmiPath) {
        this.xmiPath = xmiPath;
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
     * org.pentaho.jfreereport.castormodel.reportspec.ReportSpec
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.ReportSpec unmarshal(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.pentaho.jfreereport.castormodel.reportspec.ReportSpec) org.exolab.castor.xml.Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.ReportSpec.class, reader);
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
