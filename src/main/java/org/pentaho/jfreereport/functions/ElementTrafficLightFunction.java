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
* (C) Copyright 2000-2003, by Simba Management Limited and Contributors.
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
* -------------------------
* ElementTrafficLightFunction
* -------------------------
* (C)opyright 2003, by Thomas Morgner and Contributors.
*
* Original Author:  Thomas Morgner;
* Contributor(s):   David Gilbert (for Simba Management Limited);
*
*/

package org.pentaho.jfreereport.functions;

import java.awt.Color;

import org.pentaho.reporting.engine.classic.core.ReportElement;
import org.pentaho.reporting.engine.classic.core.function.AbstractElementFormatFunction;
import org.pentaho.reporting.engine.classic.core.style.ElementStyleKeys;

/**
 * A function that performs basic traffic lighting based on a range of values
 * and a given set of colors to use.  The default colors are for red/yellow/green 
 * and may be overridden.  This function respects absolute values when flagged.  The
 * default behavior is that "bigger is better." There may be times when bigger is not
 * better (eg. variance calculation), in this case useOppositeLogic must be set to
 * true.  This will turn large values red and small (acceptable) values green.
 * 
 * @author Michael D'Amour
 */
public class ElementTrafficLightFunction extends AbstractElementFormatFunction {
  
  private static final long serialVersionUID = -6498098209717367376L;
  
  /**
   * the color if the field is TRUE.
   */
  private transient Color colorGreen = new Color(0, 255, 0);
  private transient Color colorYellow = new Color(0, 255, 255);
  private transient Color colorRed = new Color(255, 0, 0);
  private transient double greenValue = 50;
  private transient double redValue = 0;
  private transient boolean useAbsoluteValue = false;
  private transient boolean useOppositeLogic = false;
  private String field;

  /**
   * Default constructor.
   */
  public ElementTrafficLightFunction() {
  }

  @Override
  protected boolean evaluateElement(ReportElement element) {
    Color color = colorYellow;
    if (getDataRow().get(field) instanceof Number) {
      Number n = (Number) getDataRow().get(field);
      double d = n.doubleValue();
      if (useAbsoluteValue) {
        d = Math.abs(d);
      }
      if (useOppositeLogic) {
        if (d >= redValue) {
          color = colorRed;
        } else if (d < greenValue) {
          color = colorGreen;
        }
      } else {
        if (d >= greenValue) {
          color = colorGreen;
        } else if (d < redValue) {
          color = colorRed;
        }
      }
    }
    element.getStyle().setStyleProperty(ElementStyleKeys.PAINT, color);
    return true;
  }
  
  /**
   * Returns the field used by the function.
   * <P>
   * The field name corresponds to a column name in the report's TableModel.
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
    if (field == null) {
      throw new NullPointerException();
    }
    this.field = field;
  }

  /**
   * @return Returns the colorGreen.
   */
  public Color getColorGreen() {
    return colorGreen;
  }

  /**
   * @param colorGreen
   *          The colorGreen to set.
   */
  public void setColorGreen(Color colorGreen) {
    this.colorGreen = colorGreen;
  }

  /**
   * @return Returns the colorRed.
   */
  public Color getColorRed() {
    return colorRed;
  }

  /**
   * @param colorRed
   *          The colorRed to set.
   */
  public void setColorRed(Color colorRed) {
    this.colorRed = colorRed;
  }

  /**
   * @return Returns the colorYellow.
   */
  public Color getColorYellow() {
    return colorYellow;
  }

  /**
   * @param colorYellow
   *          The colorYellow to set.
   */
  public void setColorYellow(Color colorYellow) {
    this.colorYellow = colorYellow;
  }

  /**
   * @return Returns the greenValue.
   */
  public double getGreenValue() {
    return greenValue;
  }

  /**
   * @param greenValue
   *          The greenValue to set.
   */
  public void setGreenValue(double greenValue) {
    this.greenValue = greenValue;
  }

  /**
   * @return Returns the redValue.
   */
  public double getRedValue() {
    return redValue;
  }

  /**
   * @param redValue
   *          The redValue to set.
   */
  public void setRedValue(double redValue) {
    this.redValue = redValue;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.jfree.report.function.Expression#getValue()
   */
  public Object getValue() {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * @return Returns the useAbsoluteValue.
   */
  public boolean isUseAbsoluteValue() {
    return useAbsoluteValue;
  }

  /**
   * @param useAbsoluteValue
   *          The useAbsoluteValue to set.
   */
  public void setUseAbsoluteValue(boolean useAbsoluteValue) {
    this.useAbsoluteValue = useAbsoluteValue;
  }

  /**
   * @return Returns the useOppositeLogic.
   */
  public boolean isUseOppositeLogic() {
    return useOppositeLogic;
  }

  /**
   * @param useOppositeLogic
   *          The useOppositeLogic to set.
   */
  public void setUseOppositeLogic(boolean useOppositeLogic) {
    this.useOppositeLogic = useOppositeLogic;
  }
}
