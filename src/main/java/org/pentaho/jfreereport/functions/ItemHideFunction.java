/*
* Copyright 2002 - 2017 Hitachi Vantara.  All rights reserved.
* 
* This software was developed by Hitachi Vantara and is provided under the terms
* of the Mozilla Public License, Version 1.1, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to http://www.mozilla.org/MPL/MPL-1.1.txt. TThe Initial Developer is Pentaho Corporation.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

/**
* ========================================
* JFreeReport : a free Java report library
* ========================================
*
* Project Info:  http://www.jfree.org/jfreereport/index.html
* Project Lead:  Thomas Morgner;
*
* (C) Copyright 2000-2002, by Simba Management Limited and Contributors.
*
* This library is free software; you can redistribute it and/or modify it under the terms
* of the GNU Lesser General Public License as published by the Free Software Foundation;
* either version 2.1 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
* Boston, MA 02111-1307, USA.
*
* ---------------------
* ItemHideFunction.java
* ---------------------
* (C)opyright 2000-2002, by Thomas Morgner and Contributors.
*
* Original Author:  Thomas Morgner;
* Contributor(s):   David Gilbert (for Simba Management Limited);
*
*
* Changes
* -------
* 27-Aug-2002 : Initial version
*/

package org.pentaho.jfreereport.functions;

import java.io.Serializable;

import org.pentaho.reporting.engine.classic.core.DataRow;
import org.pentaho.reporting.engine.classic.core.Element;
import org.pentaho.reporting.engine.classic.core.event.PageEventListener;
import org.pentaho.reporting.engine.classic.core.event.ReportEvent;
import org.pentaho.reporting.engine.classic.core.function.AbstractFunction;
import org.pentaho.reporting.engine.classic.core.function.Expression;
import org.pentaho.reporting.libraries.base.util.ObjectUtilities;

/**
 * The ItemHideFunction hides equal values in a group. Only the first changed value is printed. This function uses the property <code>element</code> to define the name of the element in the ItemBand that should be made visible or
 * invisible by this function. The property <code>field</code> defines the field in the datasource or the expression which should be used to determine the visibility.
 * 
 * @author Thomas Morgner
 */
public class ItemHideFunction extends AbstractFunction implements Serializable, PageEventListener {
  /**
   * The last object.
   */
  private transient Object lastObject;
  /**
   * The 'visible' flag.
   */
  private transient boolean visible;
  /**
   * The 'first-in-group' flag.
   */
  private transient boolean firstInGroup = true;
  private boolean ignoreGroupBreaks = false;
  private boolean ignorePageBreaks = false;
  private String element;
  private String field;

  /**
   * Constructs an unnamed function.
   * <P>
   * Make sure to set the function name before it is used, or function initialisation will fail.
   */
  public ItemHideFunction() {
  }

  /**
   * Constructs a named function.
   * <P>
   * The field must be defined before using the function.
   * 
   * @param name
   *          The function name.
   */
  public ItemHideFunction(final String name) {
    this();
    setName(name);
  }

  /**
   * Returns the name of the element in the item band that should be set visible/invisible.
   * 
   * @return The element name.
   */
  public String getElement() {
    return element;
  }

  /**
   * Sets the name of the element in the item band that should be set visible/invisible.
   * 
   * @param name
   *          the element name (must not be null).
   */
  public void setElement(final String name) {
    this.element = name;
  }

  /**
   * Returns the field used by the function.
   * <P>
   * The field name corresponds to a column name in the report's TableModel or to an expression.
   * 
   * @return The field name.
   */
  public String getField() {
    return field;
  }

  /**
   * Sets the field name for the function.
   * <P>
   * The field name corresponds to a column name in the report's TableModel.
   * 
   * @param field
   *          the field name (null not permitted).
   */
  public void setField(final String field) {
    this.field = field;
  }

  /**
   * Receives notification that a row of data is being processed. Reads the data from the field defined for this function and hides the field if the value is equal to the last value and the this is not the first row of the item group.
   * 
   * @param event
   *          Information about the event.
   */
  public void itemsAdvanced(final ReportEvent event) {
    DataRow dataRow = event.getDataRow();
    final Object fieldValue = dataRow.get(getField());
    // is visible when last and current object are not equal
    // first element in group is always visible
    if (firstInGroup == true) {
      visible = true;
      firstInGroup = false;
    } else {
      visible = (ObjectUtilities.equal(lastObject, fieldValue) == false);
    }
    lastObject = fieldValue;
    final Element e = event.getReport().getItemBand().getElement(getElement());
    if (e != null) {
      e.setVisible(visible);
    }
  }

  /**
   * Resets the state of the function when a new ItemGroup has started.
   * 
   * @param event
   *          the report event.
   */
  public void itemsStarted(final ReportEvent event) {
    if (!ignoreGroupBreaks) {
      lastObject = null;
      firstInGroup = true;
    }
  }

  /**
   * Returns the function value, in this case the visibility of the defined element.
   * 
   * @return The function value.
   */
  public Object getValue() {
    if (visible) {
      return Boolean.TRUE;
    }
    return Boolean.FALSE;
  }

  /**
   * Receives notification that a page was canceled by the ReportProcessor. This method is called, when a page was removed from the report after it was generated.
   * 
   * @param event
   *          The event.
   */
  public void pageCanceled(final ReportEvent event) {
  }

  /**
   * Receives notification that a page is completed.
   * 
   * @param event
   *          The event.
   */
  public void pageFinished(final ReportEvent event) {
  }

  /**
   * Receives notification that a new page is being started.
   * 
   * @param event
   *          The event.
   */
  public void pageStarted(final ReportEvent event) {
    if (!ignorePageBreaks) {
      final Object fieldValue = event.getDataRow().get(getField());
      // is visible when last and current object are not equal
      // first element in group is always visible
      // after a page start, reset the function ...
      visible = true;
      firstInGroup = true;
      lastObject = fieldValue;
      final Element e = event.getReport().getItemBand().getElement(getElement());
      if (e != null) {
        e.setVisible(visible);
      }
    }
  }

  /**
   * Return a completly separated copy of this function. The copy does no longer share any changeable objects with the original function.
   * 
   * @return a copy of this function.
   */
  public Expression getInstance() {
    final ItemHideFunction ih = (ItemHideFunction) super.getInstance();
    ih.lastObject = null;
    return ih;
  }

  public void reportStarted(ReportEvent event) {
    final Object fieldValue = event.getDataRow().get(getField());
    // is visible when last and current object are not equal
    // first element in group is always visible
    // after a page start, reset the function ...
    visible = true;
    firstInGroup = true;
    lastObject = fieldValue;
    final Element e = event.getReport().getItemBand().getElement(getElement());
    if (e != null) {
      e.setVisible(visible);
    }
  }

  
  /**
   * This event is fired, whenever an automatic pagebreak has been detected and the report state had been reverted to the previous state.
   * 
   * @param event
   */
  public void pageRolledBack(final ReportEvent event) {
  }

  public boolean isIgnoreGroupBreaks() {
    return ignoreGroupBreaks;
  }

  public void setIgnoreGroupBreaks(boolean ignoreGroupBreaks) {
    this.ignoreGroupBreaks = ignoreGroupBreaks;
  }

  public boolean isIgnorePageBreaks() {
    return ignorePageBreaks;
  }

  public void setIgnorePageBreaks(boolean ignorePageBreaks) {
    this.ignorePageBreaks = ignorePageBreaks;
  }
}
