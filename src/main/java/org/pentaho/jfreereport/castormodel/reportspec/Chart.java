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
public class Chart implements java.io.Serializable {

    /**
     * Field type.
     */
    private org.pentaho.jfreereport.castormodel.reportspec.types.ChartType type = org.pentaho.jfreereport.castormodel.reportspec.types.ChartType.fromValue("bar");

    /**
     * Field categoryColumn.
     */
    private java.lang.String categoryColumn;

    /**
     * Field group.
     */
    private java.lang.String group;

    /**
     * Field resetGroup.
     */
    private java.lang.String resetGroup;

    /**
     * Field title.
     */
    private java.lang.String title = "Chart Title";

    /**
     * Field backgroundColor.
     */
    private java.lang.String backgroundColor = "#FFFFFF";

    /**
     * Field isThreeDimensional.
     */
    private boolean isThreeDimensional = true;

    /**
     * Keeps track of whether primitive field isThreeDimensional
     * has been set already.
     */
    private boolean _hasisThreeDimensional;

    /**
     * Field isStacked.
     */
    private boolean isStacked = false;

    /**
     * Keeps track of whether primitive field isStacked has been
     * set already.
     */
    private boolean _hasisStacked;

    /**
     * Field isSummaryOnly.
     */
    private boolean isSummaryOnly = false;

    /**
     * Keeps track of whether primitive field isSummaryOnly has
     * been set already.
     */
    private boolean _hasisSummaryOnly;

    /**
     * Field showLegend.
     */
    private boolean showLegend = true;

    /**
     * Keeps track of whether primitive field showLegend has been
     * set already.
     */
    private boolean _hasshowLegend;

    /**
     * Field drawLegendBorder.
     */
    private boolean drawLegendBorder = true;

    /**
     * Keeps track of whether primitive field drawLegendBorder has
     * been set already.
     */
    private boolean _hasdrawLegendBorder;

    /**
     * Field legendLocation.
     */
    private org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation legendLocation = org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation.fromValue("bottom");

    /**
     * Field labelRotation.
     */
    private int labelRotation = 7;

    /**
     * Keeps track of whether primitive field labelRotation has
     * been set already.
     */
    private boolean _haslabelRotation;

    /**
     * Field showBorder.
     */
    private boolean showBorder = false;

    /**
     * Keeps track of whether primitive field showBorder has been
     * set already.
     */
    private boolean _hasshowBorder;

    /**
     * Field isHorizontal.
     */
    private boolean isHorizontal = false;

    /**
     * Keeps track of whether primitive field isHorizontal has been
     * set already.
     */
    private boolean _hasisHorizontal;

    /**
     * Field height.
     */
    private int height = 400;

    /**
     * Keeps track of whether primitive field height has been set
     * already.
     */
    private boolean _hasheight;

    /**
     * Field width.
     */
    private int width = 600;

    /**
     * Keeps track of whether primitive field width has been set
     * already.
     */
    private boolean _haswidth;

    /**
     * Field horizontalOffset.
     */
    private int horizontalOffset = 0;

    /**
     * Keeps track of whether primitive field horizontalOffset has
     * been set already.
     */
    private boolean _hashorizontalOffset;

    private java.util.List<org.pentaho.jfreereport.castormodel.reportspec.Series> seriesList;

    private java.util.List<java.lang.String> valuesColumnList;

    public Chart() {
        super();
        setType(org.pentaho.jfreereport.castormodel.reportspec.types.ChartType.fromValue("bar"));
        setTitle("Chart Title");
        setBackgroundColor("#FFFFFF");
        setLegendLocation(org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation.fromValue("bottom"));
        this.seriesList = new java.util.ArrayList<org.pentaho.jfreereport.castormodel.reportspec.Series>();
        this.valuesColumnList = new java.util.ArrayList<java.lang.String>();
    }

    /**
     * 
     * 
     * @param vSeries
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSeries(final org.pentaho.jfreereport.castormodel.reportspec.Series vSeries) throws java.lang.IndexOutOfBoundsException {
        this.seriesList.add(vSeries);
    }

    /**
     * 
     * 
     * @param index
     * @param vSeries
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSeries(final int index,final org.pentaho.jfreereport.castormodel.reportspec.Series vSeries) throws java.lang.IndexOutOfBoundsException {
        this.seriesList.add(index, vSeries);
    }

    /**
     * 
     * 
     * @param vValuesColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValuesColumn(final java.lang.String vValuesColumn) throws java.lang.IndexOutOfBoundsException {
        this.valuesColumnList.add(vValuesColumn);
    }

    /**
     * 
     * 
     * @param index
     * @param vValuesColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValuesColumn(final int index,final java.lang.String vValuesColumn) throws java.lang.IndexOutOfBoundsException {
        this.valuesColumnList.add(index, vValuesColumn);
    }

    /**
     */
    public void deleteDrawLegendBorder() {
        this._hasdrawLegendBorder= false;
    }

    /**
     */
    public void deleteHeight() {
        this._hasheight= false;
    }

    /**
     */
    public void deleteHorizontalOffset() {
        this._hashorizontalOffset= false;
    }

    /**
     */
    public void deleteIsHorizontal() {
        this._hasisHorizontal= false;
    }

    /**
     */
    public void deleteIsStacked() {
        this._hasisStacked= false;
    }

    /**
     */
    public void deleteIsSummaryOnly() {
        this._hasisSummaryOnly= false;
    }

    /**
     */
    public void deleteIsThreeDimensional() {
        this._hasisThreeDimensional= false;
    }

    /**
     */
    public void deleteLabelRotation() {
        this._haslabelRotation= false;
    }

    /**
     */
    public void deleteShowBorder() {
        this._hasshowBorder= false;
    }

    /**
     */
    public void deleteShowLegend() {
        this._hasshowLegend= false;
    }

    /**
     */
    public void deleteWidth() {
        this._haswidth= false;
    }

    /**
     * Method enumerateSeries.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.pentaho.jfreereport.castormodel.reportspec.Series> enumerateSeries() {
        return java.util.Collections.enumeration(this.seriesList);
    }

    /**
     * Method enumerateValuesColumn.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateValuesColumn() {
        return java.util.Collections.enumeration(this.valuesColumnList);
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
     * Returns the value of field 'categoryColumn'.
     * 
     * @return the value of field 'CategoryColumn'.
     */
    public java.lang.String getCategoryColumn() {
        return this.categoryColumn;
    }

    /**
     * Returns the value of field 'drawLegendBorder'.
     * 
     * @return the value of field 'DrawLegendBorder'.
     */
    public boolean getDrawLegendBorder() {
        return this.drawLegendBorder;
    }

    /**
     * Returns the value of field 'group'.
     * 
     * @return the value of field 'Group'.
     */
    public java.lang.String getGroup() {
        return this.group;
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
     * Returns the value of field 'horizontalOffset'.
     * 
     * @return the value of field 'HorizontalOffset'.
     */
    public int getHorizontalOffset() {
        return this.horizontalOffset;
    }

    /**
     * Returns the value of field 'isHorizontal'.
     * 
     * @return the value of field 'IsHorizontal'.
     */
    public boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    /**
     * Returns the value of field 'isStacked'.
     * 
     * @return the value of field 'IsStacked'.
     */
    public boolean getIsStacked() {
        return this.isStacked;
    }

    /**
     * Returns the value of field 'isSummaryOnly'.
     * 
     * @return the value of field 'IsSummaryOnly'.
     */
    public boolean getIsSummaryOnly() {
        return this.isSummaryOnly;
    }

    /**
     * Returns the value of field 'isThreeDimensional'.
     * 
     * @return the value of field 'IsThreeDimensional'.
     */
    public boolean getIsThreeDimensional() {
        return this.isThreeDimensional;
    }

    /**
     * Returns the value of field 'labelRotation'.
     * 
     * @return the value of field 'LabelRotation'.
     */
    public int getLabelRotation() {
        return this.labelRotation;
    }

    /**
     * Returns the value of field 'legendLocation'.
     * 
     * @return the value of field 'LegendLocation'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation getLegendLocation() {
        return this.legendLocation;
    }

    /**
     * Returns the value of field 'resetGroup'.
     * 
     * @return the value of field 'ResetGroup'.
     */
    public java.lang.String getResetGroup() {
        return this.resetGroup;
    }

    /**
     * Method getSeries.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.pentaho.jfreereport.castormodel.reportspec.Series at the
     * given index
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Series getSeries(final int index) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.seriesList.size()) {
            throw new IndexOutOfBoundsException("getSeries: Index value '" + index + "' not in range [0.." + (this.seriesList.size() - 1) + "]");
        }

        return seriesList.get(index);
    }

    /**
     * Method getSeries.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Series[] getSeries() {
        org.pentaho.jfreereport.castormodel.reportspec.Series[] array = new org.pentaho.jfreereport.castormodel.reportspec.Series[0];
        return this.seriesList.toArray(array);
    }

    /**
     * Method getSeriesCount.
     * 
     * @return the size of this collection
     */
    public int getSeriesCount() {
        return this.seriesList.size();
    }

    /**
     * Returns the value of field 'showBorder'.
     * 
     * @return the value of field 'ShowBorder'.
     */
    public boolean getShowBorder() {
        return this.showBorder;
    }

    /**
     * Returns the value of field 'showLegend'.
     * 
     * @return the value of field 'ShowLegend'.
     */
    public boolean getShowLegend() {
        return this.showLegend;
    }

    /**
     * Returns the value of field 'title'.
     * 
     * @return the value of field 'Title'.
     */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public org.pentaho.jfreereport.castormodel.reportspec.types.ChartType getType() {
        return this.type;
    }

    /**
     * Method getValuesColumn.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getValuesColumn(final int index) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.valuesColumnList.size()) {
            throw new IndexOutOfBoundsException("getValuesColumn: Index value '" + index + "' not in range [0.." + (this.valuesColumnList.size() - 1) + "]");
        }

        return (java.lang.String) valuesColumnList.get(index);
    }

    /**
     * Method getValuesColumn.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getValuesColumn() {
        java.lang.String[] array = new java.lang.String[0];
        return this.valuesColumnList.toArray(array);
    }

    /**
     * Method getValuesColumnCount.
     * 
     * @return the size of this collection
     */
    public int getValuesColumnCount() {
        return this.valuesColumnList.size();
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
     * Method hasDrawLegendBorder.
     * 
     * @return true if at least one DrawLegendBorder has been added
     */
    public boolean hasDrawLegendBorder() {
        return this._hasdrawLegendBorder;
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
     * Method hasHorizontalOffset.
     * 
     * @return true if at least one HorizontalOffset has been added
     */
    public boolean hasHorizontalOffset() {
        return this._hashorizontalOffset;
    }

    /**
     * Method hasIsHorizontal.
     * 
     * @return true if at least one IsHorizontal has been added
     */
    public boolean hasIsHorizontal() {
        return this._hasisHorizontal;
    }

    /**
     * Method hasIsStacked.
     * 
     * @return true if at least one IsStacked has been added
     */
    public boolean hasIsStacked() {
        return this._hasisStacked;
    }

    /**
     * Method hasIsSummaryOnly.
     * 
     * @return true if at least one IsSummaryOnly has been added
     */
    public boolean hasIsSummaryOnly() {
        return this._hasisSummaryOnly;
    }

    /**
     * Method hasIsThreeDimensional.
     * 
     * @return true if at least one IsThreeDimensional has been adde
     */
    public boolean hasIsThreeDimensional() {
        return this._hasisThreeDimensional;
    }

    /**
     * Method hasLabelRotation.
     * 
     * @return true if at least one LabelRotation has been added
     */
    public boolean hasLabelRotation() {
        return this._haslabelRotation;
    }

    /**
     * Method hasShowBorder.
     * 
     * @return true if at least one ShowBorder has been added
     */
    public boolean hasShowBorder() {
        return this._hasshowBorder;
    }

    /**
     * Method hasShowLegend.
     * 
     * @return true if at least one ShowLegend has been added
     */
    public boolean hasShowLegend() {
        return this._hasshowLegend;
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
     * Returns the value of field 'drawLegendBorder'.
     * 
     * @return the value of field 'DrawLegendBorder'.
     */
    public boolean isDrawLegendBorder() {
        return this.drawLegendBorder;
    }

    /**
     * Returns the value of field 'isHorizontal'.
     * 
     * @return the value of field 'IsHorizontal'.
     */
    public boolean isIsHorizontal() {
        return this.isHorizontal;
    }

    /**
     * Returns the value of field 'isStacked'.
     * 
     * @return the value of field 'IsStacked'.
     */
    public boolean isIsStacked() {
        return this.isStacked;
    }

    /**
     * Returns the value of field 'isSummaryOnly'.
     * 
     * @return the value of field 'IsSummaryOnly'.
     */
    public boolean isIsSummaryOnly() {
        return this.isSummaryOnly;
    }

    /**
     * Returns the value of field 'isThreeDimensional'.
     * 
     * @return the value of field 'IsThreeDimensional'.
     */
    public boolean isIsThreeDimensional() {
        return this.isThreeDimensional;
    }

    /**
     * Returns the value of field 'showBorder'.
     * 
     * @return the value of field 'ShowBorder'.
     */
    public boolean isShowBorder() {
        return this.showBorder;
    }

    /**
     * Returns the value of field 'showLegend'.
     * 
     * @return the value of field 'ShowLegend'.
     */
    public boolean isShowLegend() {
        return this.showLegend;
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
     * Method iterateSeries.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.pentaho.jfreereport.castormodel.reportspec.Series> iterateSeries() {
        return this.seriesList.iterator();
    }

    /**
     * Method iterateValuesColumn.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateValuesColumn() {
        return this.valuesColumnList.iterator();
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
    public void removeAllSeries() {
        this.seriesList.clear();
    }

    /**
     */
    public void removeAllValuesColumn() {
        this.valuesColumnList.clear();
    }

    /**
     * Method removeSeries.
     * 
     * @param vSeries
     * @return true if the object was removed from the collection.
     */
    public boolean removeSeries(final org.pentaho.jfreereport.castormodel.reportspec.Series vSeries) {
        boolean removed = seriesList.remove(vSeries);
        return removed;
    }

    /**
     * Method removeSeriesAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.pentaho.jfreereport.castormodel.reportspec.Series removeSeriesAt(final int index) {
        java.lang.Object obj = this.seriesList.remove(index);
        return (org.pentaho.jfreereport.castormodel.reportspec.Series) obj;
    }

    /**
     * Method removeValuesColumn.
     * 
     * @param vValuesColumn
     * @return true if the object was removed from the collection.
     */
    public boolean removeValuesColumn(final java.lang.String vValuesColumn) {
        boolean removed = valuesColumnList.remove(vValuesColumn);
        return removed;
    }

    /**
     * Method removeValuesColumnAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeValuesColumnAt(final int index) {
        java.lang.Object obj = this.valuesColumnList.remove(index);
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
     * Sets the value of field 'categoryColumn'.
     * 
     * @param categoryColumn the value of field 'categoryColumn'.
     */
    public void setCategoryColumn(final java.lang.String categoryColumn) {
        this.categoryColumn = categoryColumn;
    }

    /**
     * Sets the value of field 'drawLegendBorder'.
     * 
     * @param drawLegendBorder the value of field 'drawLegendBorder'
     */
    public void setDrawLegendBorder(final boolean drawLegendBorder) {
        this.drawLegendBorder = drawLegendBorder;
        this._hasdrawLegendBorder = true;
    }

    /**
     * Sets the value of field 'group'.
     * 
     * @param group the value of field 'group'.
     */
    public void setGroup(final java.lang.String group) {
        this.group = group;
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
     * Sets the value of field 'horizontalOffset'.
     * 
     * @param horizontalOffset the value of field 'horizontalOffset'
     */
    public void setHorizontalOffset(final int horizontalOffset) {
        this.horizontalOffset = horizontalOffset;
        this._hashorizontalOffset = true;
    }

    /**
     * Sets the value of field 'isHorizontal'.
     * 
     * @param isHorizontal the value of field 'isHorizontal'.
     */
    public void setIsHorizontal(final boolean isHorizontal) {
        this.isHorizontal = isHorizontal;
        this._hasisHorizontal = true;
    }

    /**
     * Sets the value of field 'isStacked'.
     * 
     * @param isStacked the value of field 'isStacked'.
     */
    public void setIsStacked(final boolean isStacked) {
        this.isStacked = isStacked;
        this._hasisStacked = true;
    }

    /**
     * Sets the value of field 'isSummaryOnly'.
     * 
     * @param isSummaryOnly the value of field 'isSummaryOnly'.
     */
    public void setIsSummaryOnly(final boolean isSummaryOnly) {
        this.isSummaryOnly = isSummaryOnly;
        this._hasisSummaryOnly = true;
    }

    /**
     * Sets the value of field 'isThreeDimensional'.
     * 
     * @param isThreeDimensional the value of field
     * 'isThreeDimensional'.
     */
    public void setIsThreeDimensional(final boolean isThreeDimensional) {
        this.isThreeDimensional = isThreeDimensional;
        this._hasisThreeDimensional = true;
    }

    /**
     * Sets the value of field 'labelRotation'.
     * 
     * @param labelRotation the value of field 'labelRotation'.
     */
    public void setLabelRotation(final int labelRotation) {
        this.labelRotation = labelRotation;
        this._haslabelRotation = true;
    }

    /**
     * Sets the value of field 'legendLocation'.
     * 
     * @param legendLocation the value of field 'legendLocation'.
     */
    public void setLegendLocation(final org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation legendLocation) {
        this.legendLocation = legendLocation;
    }

    /**
     * Sets the value of field 'resetGroup'.
     * 
     * @param resetGroup the value of field 'resetGroup'.
     */
    public void setResetGroup(final java.lang.String resetGroup) {
        this.resetGroup = resetGroup;
    }

    /**
     * 
     * 
     * @param index
     * @param vSeries
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSeries(final int index,final org.pentaho.jfreereport.castormodel.reportspec.Series vSeries) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.seriesList.size()) {
            throw new IndexOutOfBoundsException("setSeries: Index value '" + index + "' not in range [0.." + (this.seriesList.size() - 1) + "]");
        }

        this.seriesList.set(index, vSeries);
    }

    /**
     * 
     * 
     * @param vSeriesArray
     */
    public void setSeries(final org.pentaho.jfreereport.castormodel.reportspec.Series[] vSeriesArray) {
        //-- copy array
        seriesList.clear();

        for (int i = 0; i < vSeriesArray.length; i++) {
                this.seriesList.add(vSeriesArray[i]);
        }
    }

    /**
     * Sets the value of field 'showBorder'.
     * 
     * @param showBorder the value of field 'showBorder'.
     */
    public void setShowBorder(final boolean showBorder) {
        this.showBorder = showBorder;
        this._hasshowBorder = true;
    }

    /**
     * Sets the value of field 'showLegend'.
     * 
     * @param showLegend the value of field 'showLegend'.
     */
    public void setShowLegend(final boolean showLegend) {
        this.showLegend = showLegend;
        this._hasshowLegend = true;
    }

    /**
     * Sets the value of field 'title'.
     * 
     * @param title the value of field 'title'.
     */
    public void setTitle(final java.lang.String title) {
        this.title = title;
    }

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(final org.pentaho.jfreereport.castormodel.reportspec.types.ChartType type) {
        this.type = type;
    }

    /**
     * 
     * 
     * @param index
     * @param vValuesColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setValuesColumn(final int index,final java.lang.String vValuesColumn) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.valuesColumnList.size()) {
            throw new IndexOutOfBoundsException("setValuesColumn: Index value '" + index + "' not in range [0.." + (this.valuesColumnList.size() - 1) + "]");
        }

        this.valuesColumnList.set(index, vValuesColumn);
    }

    /**
     * 
     * 
     * @param vValuesColumnArray
     */
    public void setValuesColumn(final java.lang.String[] vValuesColumnArray) {
        //-- copy array
        valuesColumnList.clear();

        for (int i = 0; i < vValuesColumnArray.length; i++) {
                this.valuesColumnList.add(vValuesColumnArray[i]);
        }
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.pentaho.jfreereport.castormodel.reportspec.Chart
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.Chart unmarshal(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.pentaho.jfreereport.castormodel.reportspec.Chart) org.exolab.castor.xml.Unmarshaller.unmarshal(org.pentaho.jfreereport.castormodel.reportspec.Chart.class, reader);
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
