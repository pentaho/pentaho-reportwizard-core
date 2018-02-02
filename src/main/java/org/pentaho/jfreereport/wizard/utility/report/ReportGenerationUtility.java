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

package org.pentaho.jfreereport.wizard.utility.report;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.sql.Types;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.dom.DOMDocumentFactory;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.pentaho.jfreereport.castormodel.reportspec.Chart;
import org.pentaho.jfreereport.castormodel.reportspec.Field;
import org.pentaho.jfreereport.castormodel.reportspec.FieldMapping;
import org.pentaho.jfreereport.castormodel.reportspec.ReportSpec;
import org.pentaho.jfreereport.castormodel.reportspec.Series;
import org.pentaho.jfreereport.castormodel.reportspec.types.ChartType;

public class ReportGenerationUtility {

  private static final String PROPERTY_ELEMENT_NAME = "property"; //$NON-NLS-1$
  private static final String CONFIGURATION_ELEMENT_NAME = "configuration"; //$NON-NLS-1$
  private static final String NAME_ATTRIBUTE_NAME = "name"; //$NON-NLS-1$

  public static Log getLogger() {
    return LogFactory.getLog( ReportGenerationUtility.class );
  }

  public static void setGroupHeaderFont( ReportSpec reportSpec, org.dom4j.Element groupHeader, boolean setHeight ) {
    groupHeader.addAttribute( "color", reportSpec.getGroupHeaderFontColor() ); //$NON-NLS-1$
    groupHeader.addAttribute( "fontname", reportSpec.getGroupHeaderFontName() ); //$NON-NLS-1$
    groupHeader.addAttribute( "fontsize", reportSpec.getGroupHeaderFontSize() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    groupHeader.addAttribute( "fontstyle",
      ReportSpecUtility.getFontStyleString( reportSpec.getGroupHeaderFontStyle() ) ); //$NON-NLS-1$
    if ( setHeight ) {
      groupHeader.addAttribute( "height",
        ( reportSpec.getColumnHeaderHeight() + reportSpec.getColumnHeaderGap() ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  public static void setGroupFooterFont( ReportSpec reportSpec, org.dom4j.Element groupFooter ) {
    groupFooter.addAttribute( "color", reportSpec.getGroupFooterFontColor() ); //$NON-NLS-1$
    groupFooter.addAttribute( "fontname", reportSpec.getGroupFooterFontName() ); //$NON-NLS-1$
    groupFooter.addAttribute( "fontsize", reportSpec.getGroupFooterFontSize() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    groupFooter.addAttribute( "fontstyle",
      ReportSpecUtility.getFontStyleString( reportSpec.getGroupFooterFontStyle() ) ); //$NON-NLS-1$
  }

  public static void setColumnHeaderFont( ReportSpec reportSpec, org.dom4j.Element columnHeader ) {
    columnHeader.addAttribute( "color", reportSpec.getColumnHeaderFontColor() ); //$NON-NLS-1$
    columnHeader.addAttribute( "fontname", reportSpec.getColumnHeaderFontName() ); //$NON-NLS-1$
    columnHeader.addAttribute( "fontsize", reportSpec.getColumnHeaderFontSize() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    columnHeader.addAttribute( "fontstyle",
      ReportSpecUtility.getFontStyleString( reportSpec.getColumnHeaderFontStyle() ) ); //$NON-NLS-1$
  }

  public static void setItemsFont( ReportSpec reportSpec, org.dom4j.Element items ) {
    items.addAttribute( "color", reportSpec.getItemsFontColor() ); //$NON-NLS-1$
    items.addAttribute( "fontname", reportSpec.getItemsFontName() ); //$NON-NLS-1$
    items.addAttribute( "fontsize", reportSpec.getItemsFontSize() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    items.addAttribute( "fontstyle",
      ReportSpecUtility.getFontStyleString( reportSpec.getItemsFontStyle() ) ); //$NON-NLS-1$
  }

  public static void setItemFont( ReportSpec reportSpec, Field itemField, Element itemElement ) {
    if ( itemField.getIsRowHeader() ) {
      // use column header specifics
      itemElement.addAttribute( "color", reportSpec.getColumnHeaderFontColor() ); //$NON-NLS-1$
      itemElement.addAttribute( "fontname", reportSpec.getColumnHeaderFontName() ); //$NON-NLS-1$
      itemElement.addAttribute( "fontsize", reportSpec.getColumnHeaderFontSize() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      itemElement
        .addAttribute( "fontstyle",
          ReportSpecUtility.getFontStyleString( reportSpec.getColumnHeaderFontStyle() ) ); //$NON-NLS-1$
    } else {
      if ( itemField.getFontColor() != null ) {
        itemElement.addAttribute( "color", itemField.getFontColor() ); //$NON-NLS-1$
      } else {
        itemElement.addAttribute( "color", reportSpec.getItemsFontColor() ); //$NON-NLS-1$
      }
      if ( itemField.getFontName() != null ) {
        itemElement.addAttribute( "fontname", itemField.getFontName() ); //$NON-NLS-1$
      } else {
        itemElement.addAttribute( "fontname", reportSpec.getItemsFontName() ); //$NON-NLS-1$
      }
      if ( itemField.getFontSize() != -1 ) {
        itemElement.addAttribute( "fontsize", itemField.getFontSize() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      } else {
        itemElement.addAttribute( "fontsize", reportSpec.getItemsFontSize() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      }
      int style = ( itemField.getFontStyle() != -1 )
        ? itemField.getFontStyle()
        : reportSpec.getItemsFontStyle();
      itemElement.addAttribute( "fontstyle", ReportSpecUtility.getFontStyleString( style ) );
    }
  }

  public static void setAttributeWithRequiredValue( Element element, String attribute, String value ) {
    // only set the attribute if the value is not null and not the empty
    // string
    if ( element != null && attribute != null && value != null && !value.equals( "" ) ) { //$NON-NLS-1$
      element.addAttribute( attribute, value );
    }
  }

  public static void addTrafficLighting( ReportSpec reportSpec, Field f, String trafficLightElementName,
                                         Element functionNode ) {
    Element trafficLightFunctionNode = functionNode.addElement( "expression" ); //$NON-NLS-1$
    trafficLightFunctionNode
      .addAttribute( "class", "org.jfree.report.function.ElementTrafficLightFunction" ); //$NON-NLS-1$ //$NON-NLS-2$
    trafficLightFunctionNode.addAttribute( NAME_ATTRIBUTE_NAME, "trafficLight" + f.getName() ); //$NON-NLS-1$
    Element propertiesNode = trafficLightFunctionNode.addElement( "properties" ); //$NON-NLS-1$
    Element property = propertiesNode.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "element" ); //$NON-NLS-1$
    property.setText( trafficLightElementName );
    property = propertiesNode.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "field" ); //$NON-NLS-1$
    property.setText( f.getName() );
    property = propertiesNode.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "color[0]" ); //$NON-NLS-1$
    property.setText( f.getTrafficLightingRedColor() );
    property = propertiesNode.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "color[1]" ); //$NON-NLS-1$
    property.setText( f.getTrafficLightingYellowColor() );
    property = propertiesNode.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "color[2]" ); //$NON-NLS-1$
    property.setText( f.getTrafficLightingGreenColor() );
    // property = propertiesNode.addElement(PROPERTY_ELEMENT_NAME); //$NON-NLS-1$
    // property.addAttribute(NAME_ATTRIBUTE_NAME, "limit[0]"); //$NON-NLS-1$ //$NON-NLS-2$
    // property.setText(String.valueOf(f.getTrafficLightingRedValue()));
    property = propertiesNode.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "limit[0]" ); //$NON-NLS-1$
    property.setText( String.valueOf( f.getTrafficLightingYellowValue() ) );
    property = propertiesNode.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "limit[1]" ); //$NON-NLS-1$
    property.setText( String.valueOf( f.getTrafficLightingGreenValue() ) );
    property = propertiesNode.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "useAbsoluteValue" ); //$NON-NLS-1$
    property.setText( String.valueOf( f.getTrafficLightingUseAbsoluteValue() ) );
    property = propertiesNode.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "useOppositeLogic" ); //$NON-NLS-1$
    property.setText( String.valueOf( f.getTrafficLightingUseOppositeLogic() ) );
  }

  public static void addHorizontalGridLines( ReportSpec reportSpec, Field[] groups, Field[] details, Element itemsNode,
                                             int itemRowHeight ) {
    if ( reportSpec.getUseHorizontalGridlines() ) {
      int percentSum = 0;
      // top line
      org.dom4j.Element lineElement = itemsNode.addElement( "line" ); //$NON-NLS-1$
      lineElement.addAttribute( "color", reportSpec.getHorizontalGridlinesColor() ); //$NON-NLS-1$
      lineElement.addAttribute( "weight", ".5" ); //$NON-NLS-1$ //$NON-NLS-2$
      if ( details[ 0 ].getIsWidthPercent() ) {
        lineElement
          .addAttribute( "x1", ( reportSpec.getHorizontalOffset() + percentSum ) + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
      } else {
        lineElement
          .addAttribute( "x1", ( reportSpec.getHorizontalOffset() + percentSum ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      }
      lineElement.addAttribute( "y1", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
      lineElement.addAttribute( "x2", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
      lineElement.addAttribute( "y2", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
      // bottom line
      lineElement = itemsNode.addElement( "line" ); //$NON-NLS-1$
      lineElement.addAttribute( "color", reportSpec.getHorizontalGridlinesColor() ); //$NON-NLS-1$
      lineElement.addAttribute( "weight", ".5" ); //$NON-NLS-1$ //$NON-NLS-2$
      //$NON-NLS-1$ //$NON-NLS-2$
      if ( details[ 0 ].getIsWidthPercent() ) {
        lineElement
          .addAttribute( "x1", ( reportSpec.getHorizontalOffset() + percentSum ) + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
      } else {
        lineElement
          .addAttribute( "x1", ( reportSpec.getHorizontalOffset() + percentSum ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      }
      lineElement.addAttribute( "y1", itemRowHeight + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      lineElement.addAttribute( "x2", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
      lineElement.addAttribute( "y2", itemRowHeight + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  public static void addVerticalGridLines( ReportSpec reportSpec, Field[] groups, Field[] details, Element itemsNode,
                                           int itemRowHeight ) {
    if ( reportSpec.getUseVerticalGridlines() ) {
      double percentSum = 0;
      for ( int i = 0; i < details.length; i++ ) {
        Field f = details[ i ];
        BigDecimal width = f.getWidth();
        if ( i == 0 ) {
          // first one, draw left line
          org.dom4j.Element lineElement = itemsNode.addElement( "line" ); //$NON-NLS-1$
          lineElement.addAttribute( "color", reportSpec.getVerticalGridlinesColor() ); //$NON-NLS-1$
          lineElement.addAttribute( "weight", ".5" ); //$NON-NLS-1$ //$NON-NLS-2$
          lineElement.addAttribute(
            "x1", ( reportSpec.getHorizontalOffset() + percentSum ) + ( f.getIsWidthPercent() ? "%" :
              "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          lineElement.addAttribute( "y1", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
          lineElement.addAttribute(
            "x2", ( reportSpec.getHorizontalOffset() + percentSum ) + ( f.getIsWidthPercent() ? "%" :
              "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          lineElement.addAttribute( "y2", itemRowHeight + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        percentSum += width.doubleValue();
        // right line
        org.dom4j.Element lineElement = itemsNode.addElement( "line" ); //$NON-NLS-1$
        lineElement.addAttribute( "color", reportSpec.getVerticalGridlinesColor() ); //$NON-NLS-1$
        lineElement.addAttribute( "weight", ".5" ); //$NON-NLS-1$ //$NON-NLS-2$
        if ( i == details.length - 1 ) {
          // last right line
          lineElement.addAttribute( "x1", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
        } else {
          lineElement.addAttribute(
            "x1", ( reportSpec.getHorizontalOffset() + percentSum ) + ( f.getIsWidthPercent() ? "%" :
              "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }
        lineElement.addAttribute( "y1", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
        if ( i == details.length - 1 ) {
          // last right line
          lineElement.addAttribute( "x2", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
        } else {
          lineElement.addAttribute(
            "x2", ( reportSpec.getHorizontalOffset() + percentSum ) + ( f.getIsWidthPercent() ? "%" :
              "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }
        lineElement.addAttribute( "y2", itemRowHeight + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      }
    }
  }

  public static void createColumnHeaders( ReportSpec reportSpec, Field[] groups, Field[] details,
                                          Element columnHeaderElement, double startingX, int startingY ) {
    double percentSum = startingX;
    if ( reportSpec.getIsMDX() ) {
      // determine "depth" of column headers
      int depth = 0;
      int height = reportSpec.getColumnHeaderFontSize() + 2;
      for ( int i = 0; i < details.length; i++ ) {
        StringTokenizer st = new StringTokenizer( details[ i ].getName(), "/" ); //$NON-NLS-1$
        depth = Math.max( depth, st.countTokens() - 1 );
      }
      if ( depth == 1 ) {
        height = reportSpec.getColumnHeaderHeight();
      }
      // depth is number of rows of headers to build, start from innermost
      // (easiest)
      for ( int row = 0; row < depth; row++ ) {
        percentSum = startingX;
        for ( int i = 0; i < details.length; i++ ) {
          Field f = details[ i ];
          BigDecimal width = f.getWidth();
          String horizontalAlignment = f.getHorizontalAlignment();
          StringTokenizer st = new StringTokenizer( details[ i ].getName(), "/" ); //$NON-NLS-1$
          String displayName = f.getDisplayName();
          if ( !f.getIsRowHeader() ) {
            for ( int x = 0; x < depth - row; x++ ) {
              displayName = st.nextToken();
            }
          }
          // System.out.println(displayName);
          int spanAmount = 1;
          double spanWidth = width.doubleValue();
          for ( int spanCounter = i + 1; spanCounter < details.length; spanCounter++ ) {
            Field spanField = details[ spanCounter ];
            st = new StringTokenizer( spanField.getName(), "/" ); //$NON-NLS-1$
            String spanDisplayName = spanField.getDisplayName();
            if ( !spanField.getIsRowHeader() ) {
              for ( int x = 0; x < depth - row; x++ ) {
                spanDisplayName = st.nextToken();
              }
            }
            if ( spanDisplayName.equals( displayName ) ) {
              spanAmount++;
              spanWidth += spanField.getWidth().doubleValue();
              i++;
            } else {
              break;
            }
          }
          org.dom4j.Element label = columnHeaderElement.addElement( "label" ); //$NON-NLS-1$
          setColumnHeaderFont( reportSpec, label );
          label.addAttribute( "height", String.valueOf( height ) ); //$NON-NLS-1$
          label.addAttribute( "vertical-alignment", f.getVerticalAlignment() ); //$NON-NLS-1$
          label.addAttribute( "alignment", horizontalAlignment ); //$NON-NLS-1$
          label.addAttribute( "width", String.valueOf( spanWidth ) + ( f.getIsWidthPercent() ? "%" :
            "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          label.addAttribute( "x", reportSpec.getHorizontalOffset() + percentSum + ( f.getIsWidthPercent() ? "%" :
            "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          int y = ( ( depth - row - 1 ) * height );
          if ( groups != null && groups.length > 0 ) {
            label.addAttribute( "y", ( y + reportSpec.getGroupHeaderFontSize() + 5 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          } else {
            label.addAttribute( "y", y + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          }
          // System.out.println("y = " + ((depth-row-1) * height) +
          // "");
          if ( !f.getIsRowHeader() ) {
            label.setText( displayName );
          } else if ( row == 0 ) {
            label.setText( f.getDisplayName() );
          }
          percentSum += spanWidth;
        }
      }
    } else {
      for ( int j = 0; j < details.length; j++ ) {
        Field f = details[ j ];
        double width = f.getWidth().doubleValue();
        org.dom4j.Element label = columnHeaderElement.addElement( "label" ); //$NON-NLS-1$
        setColumnHeaderFont( reportSpec, label );
        label.addAttribute( "height", String.valueOf( reportSpec.getColumnHeaderHeight() ) ); //$NON-NLS-1$
        label.addAttribute( "vertical-alignment", f.getVerticalAlignment() ); //$NON-NLS-1$
        label.addAttribute( "alignment", f.getHorizontalAlignment() ); //$NON-NLS-1$
        label.addAttribute( "width",
          String.valueOf( width ) + ( f.getIsWidthPercent() ? "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        label.addAttribute( "x", reportSpec.getHorizontalOffset() + percentSum + ( f.getIsWidthPercent() ? "%" :
          "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        label.addAttribute( "y", startingY + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        label.setText( f.getDisplayName() );
        percentSum += width;
      }
    }
  }

  public static void mergeTemplate( File templateFile, File generatedJFreeReportFile, OutputStream mergeStream ) {
    if ( !templateFile.exists() || !generatedJFreeReportFile.exists() ) {
      return;
    }
    SAXReader reader = new SAXReader( false );
    try {
      Document templateDoc = reader.read( templateFile );
      Document generatedDoc = reader.read( generatedJFreeReportFile );
      mergeTemplate( templateDoc, generatedDoc, mergeStream );
    } catch ( Exception e ) {
      getLogger().error( e.getMessage(), e );
    }
  }

  public static void mergeTemplateAsStream( Document templateDoc, Document generatedDoc,
                                            OutputStream jfreeMergedOutputStream ) {
    mergeTemplate( templateDoc, generatedDoc, jfreeMergedOutputStream );
  }

  /**
   * NOTE: the templateDoc is the target of the merge.
   *
   * @param templateDoc
   * @param generatedDoc
   * @param mergeStream
   */
  public static void mergeTemplate( Document templateDoc, Document generatedDoc, OutputStream mergeStream ) {
    try {
      // replace parser-config settings in templateDoc from generatedDoc
      Element templateReportNode = ( (Element) templateDoc.selectSingleNode( "/report" ) ); //$NON-NLS-1$
      Element generatedReportNode = ( (Element) generatedDoc.selectSingleNode( "/report" ) ); //$NON-NLS-1$
      // move attributes from generated to template
      // blow away existing attributes first
      List templateAttributes = templateReportNode.attributes();
      for ( int i = templateAttributes.size() - 1; i >= 0; i-- ) {
        Attribute attribute = (Attribute) templateAttributes.get( i );
        templateReportNode.remove( attribute );
      }
      // now move generated into template
      List generatedAttributes = generatedReportNode.attributes();
      for ( int i = generatedAttributes.size() - 1; i >= 0; i-- ) {
        Attribute attribute = (Attribute) generatedAttributes.get( i );
        generatedReportNode.remove( attribute );
        templateReportNode.add( attribute );
      }
      List templateParserConfigProps = templateReportNode.selectNodes( "parser-config/*" ); //$NON-NLS-1$
      List generatedParserConfigProps = generatedReportNode.selectNodes( "parser-config/*" ); //$NON-NLS-1$
      Element templateParserConfigElement =
        (Element) templateReportNode.selectSingleNode( "parser-config" ); //$NON-NLS-1$
      Element generatedParserConfigElement =
        (Element) generatedReportNode.selectSingleNode( "parser-config" ); //$NON-NLS-1$
      // replace any empty elements in the generated doc with the corresponding contents of the template doc
      for ( int i = 0; i < generatedParserConfigProps.size(); i++ ) {
        Element generatedParserConfigProp = (Element) generatedParserConfigProps.get( i );
        Element templateParserConfigProp = (Element) templateParserConfigProps.get( i );

        String generatedText = generatedParserConfigProp.getText();
        if ( !StringUtils.isEmpty( generatedText ) ) {
          generatedParserConfigElement.remove( generatedParserConfigProp );
          templateParserConfigElement.remove( templateParserConfigProp );
          templateParserConfigElement.add( generatedParserConfigProp );
        }
      }

      // replace items section in templateDoc from generatedDoc
      if ( templateReportNode.selectSingleNode( "items" ) != null ) { //$NON-NLS-1$
        templateReportNode.remove( templateReportNode.selectSingleNode( "items" ) ); //$NON-NLS-1$
      }
      Element itemsElement = (Element) generatedReportNode.selectSingleNode( "items" ); //$NON-NLS-1$
      if ( itemsElement != null ) {
        generatedReportNode.remove( itemsElement );
        templateReportNode.add( itemsElement );
      }
      // GROUP MERGING
      List groups = templateReportNode.selectNodes( "groups/*" ); //$NON-NLS-1$
      // if groups has no elements, then we're just going to straight copy
      // the groups from the generated version
      // this is a new requirement per Kurtis Cruzada
      if ( ReportSpecUtility.getNumberOfGroupsInTemplate( templateDoc ) == 0 ) {
        // replace groups section in templateDoc from generatedDoc
        if ( templateReportNode.selectSingleNode( "groups" ) != null ) { //$NON-NLS-1$
          templateReportNode.remove( templateReportNode.selectSingleNode( "groups" ) ); //$NON-NLS-1$
        }
        // might not have a top level groups node, add it
        if ( generatedReportNode.selectSingleNode( "groups" ) == null ) { //$NON-NLS-1$
          generatedReportNode.addElement( "groups" ); //$NON-NLS-1$
        }
        Element groupElement = (Element) generatedReportNode.selectSingleNode( "groups" ); //$NON-NLS-1$
        if ( groupElement != null ) {
          generatedReportNode.remove( groupElement );
          templateReportNode.add( groupElement );
        }
      } else {
        // both sets of groups should be identical in number
        // each group based on index should correspond
        // for all group headers, append new content
        // for all group footers insert new content, push down old
        // both lists must have the same # of groups (this is a
        // requirement)
        List generatedGroups = generatedReportNode.selectNodes( "groups/*" ); //$NON-NLS-1$
        for ( int i = 0; i < groups.size(); i++ ) {
          Element templateGroup = (Element) groups.get( i );
          for ( int j = i + 1; j < generatedGroups.size(); j++ ) {
            Element generatedGroup = (Element) generatedGroups.get( j );
            Element templateGroupHeader = (Element) templateGroup.selectSingleNode( "groupheader" ); //$NON-NLS-1$
            Element generatedGroupHeader = (Element) generatedGroup.selectSingleNode( "groupheader" ); //$NON-NLS-1$
            Element templateGroupFooter = (Element) templateGroup.selectSingleNode( "groupfooter" ); //$NON-NLS-1$
            Element generatedGroupFooter = (Element) generatedGroup.selectSingleNode( "groupfooter" ); //$NON-NLS-1$
            try {
              if ( templateGroupHeader.attribute( "pagebreak-before-print" ) != null ) { //$NON-NLS-1$
                templateGroupHeader.attribute( "pagebreak-before-print" ).detach(); //$NON-NLS-1$
              }
              templateGroupHeader.addAttribute(
                "pagebreak-before-print", ( generatedGroupHeader.attributeValue( "pagebreak-before-print" ) )
                  + "" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            } catch ( Exception e ) {
              // e.printStackTrace();
            }
            try {
              if ( templateGroupHeader.attribute( "pagebreak-after-print" ) != null ) { //$NON-NLS-1$
                templateGroupHeader.attribute( "pagebreak-after-print" ).detach(); //$NON-NLS-1$
              }
              templateGroupHeader.addAttribute(
                "pagebreak-after-print", ( generatedGroupHeader.attributeValue( "pagebreak-after-print" ) )
                  + "" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            } catch ( Exception e ) {
              // e.printStackTrace();
            }
            try {
              if ( templateGroupFooter.attribute( "pagebreak-before-print" ) != null ) { //$NON-NLS-1$
                templateGroupFooter.attribute( "pagebreak-before-print" ).detach(); //$NON-NLS-1$
              }
              templateGroupFooter.addAttribute(
                "pagebreak-before-print", ( generatedGroupFooter.attributeValue( "pagebreak-before-print" ) )
                  + "" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            } catch ( Exception e ) {
              // e.printStackTrace();
            }
            try {
              if ( templateGroupFooter.attribute( "pagebreak-after-print" ) != null ) { //$NON-NLS-1$
                templateGroupFooter.attribute( "pagebreak-after-print" ).detach(); //$NON-NLS-1$
              }
              templateGroupFooter.addAttribute(
                "pagebreak-after-print", ( generatedGroupFooter.attributeValue( "pagebreak-after-print" ) )
                  + "" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            } catch ( Exception e ) {
              // e.printStackTrace();
            }
            try {
              if ( templateGroupHeader.attribute( "repeat" ) != null ) { //$NON-NLS-1$
                templateGroupHeader.attribute( "repeat" ).detach(); //$NON-NLS-1$
              }
              templateGroupHeader.addAttribute( "repeat",
                ( generatedGroupHeader.attributeValue( "repeat" ) ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            } catch ( Exception e ) {
              // e.printStackTrace();
            }
          }
        }
        if ( groups != null ) {
          Element innermostGroup = null;
          int innermostFieldsInGroup = 0;
          for ( int i = 0; i < groups.size(); i++ ) {
            Element groupElement = (Element) groups.get( i );
            List fields = groupElement.selectNodes( "fields/*" ); //$NON-NLS-1$
            if ( fields != null && fields.size() > 0 && fields.size() > innermostFieldsInGroup ) {
              innermostFieldsInGroup = fields.size();
              innermostGroup = groupElement;
            }
          }
          Element generatedInnermostGroup = null;
          if ( generatedGroups != null ) {
            int generatedInnermostFieldsInGroup = 0;
            for ( int i = 0; i < generatedGroups.size(); i++ ) {
              Element groupElement = (Element) generatedGroups.get( i );
              List fields = groupElement.selectNodes( "fields/*" ); //$NON-NLS-1$
              if ( fields != null && fields.size() > 0 && fields.size() > generatedInnermostFieldsInGroup ) {
                generatedInnermostFieldsInGroup = fields.size();
                generatedInnermostGroup = groupElement;
              }
            }
          }
          // at this point we have found the innermost group
          // this will be used for updating the group header/footer
          if ( innermostGroup != null ) {
            // handle headers: append header if header exists, else
            // create
            Element groupHeader = (Element) innermostGroup.selectSingleNode( "groupheader" ); //$NON-NLS-1$
            if ( groupHeader == null ) {
              // direct header replacement with
              // generatedInnermostGroup header
              Element headerElement = (Element) generatedInnermostGroup.selectSingleNode( "groupheader" ); //$NON-NLS-1$
              if ( headerElement != null ) {
                generatedInnermostGroup.remove( headerElement );
                innermostGroup.add( headerElement );
              }
            } else {
              // insertion: loop through elements of generated,
              // append to header
              List groupHeaderNodes = innermostGroup.selectNodes( "groupheader/*" ); //$NON-NLS-1$
              List generatedGroupHeaderNodes = generatedInnermostGroup.selectNodes( "groupheader/*" ); //$NON-NLS-1$
              Element generatedGroupHeader =
                (Element) generatedInnermostGroup.selectSingleNode( "groupheader" ); //$NON-NLS-1$
              // fix up header/footer breaking for innermost group
              int y = 0;
              for ( int i = 0; i < groupHeaderNodes.size(); i++ ) {
                Element element = (Element) groupHeaderNodes.get( i );
                try {
                  y = Math
                    .max(
                      y,
                      Integer.parseInt( element.attributeValue( "y" ) ) + Integer
                        .parseInt( element.attributeValue( "height" ) ) ); //$NON-NLS-1$ //$NON-NLS-2$
                } catch ( Exception e ) {
                  // NumberFormat exceptions, ignore
                }
                try {
                  y = Math
                    .max(
                      y,
                      Integer.parseInt( element.attributeValue( "y1" ) ) + Integer
                        .parseInt( element.attributeValue( "height" ) ) ); //$NON-NLS-1$ //$NON-NLS-2$
                } catch ( Exception e ) {
                  // NumberFormat exceptions, ignore
                }
                try {
                  y = Math
                    .max(
                      y,
                      Integer.parseInt( element.attributeValue( "y2" ) ) + Integer
                        .parseInt( element.attributeValue( "height" ) ) ); //$NON-NLS-1$ //$NON-NLS-2$
                } catch ( Exception e ) {
                  // NumberFormat exceptions, ignore
                }
              }
              for ( int i = 0; i < generatedGroupHeaderNodes.size(); i++ ) {
                Element element = (Element) generatedGroupHeaderNodes.get( i );
                generatedGroupHeader.remove( element );
                if ( element.attribute( "y" ) != null ) { //$NON-NLS-1$
                  int yValue = Integer.parseInt( element.attributeValue( "y" ) ); //$NON-NLS-1$
                  element.attribute( "y" ).detach(); //$NON-NLS-1$
                  element.addAttribute( "y", ( y + yValue ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
                } else if ( element.attribute( "y1" ) != null ) { //$NON-NLS-1$
                  int yValue = Integer.parseInt( element.attributeValue( "y1" ) ); //$NON-NLS-1$
                  element.attribute( "y1" ).detach(); //$NON-NLS-1$
                  element.addAttribute( "y1", ( y + yValue ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
                } else if ( element.attribute( "y2" ) != null ) { //$NON-NLS-1$
                  int yValue = Integer.parseInt( element.attributeValue( "y2" ) ); //$NON-NLS-1$
                  element.attribute( "y2" ).detach(); //$NON-NLS-1$
                  element.addAttribute( "y2", ( y + yValue ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
                }
                groupHeader.add( element );
              }
            }
            // handle footers:
            Element groupFooter = (Element) innermostGroup.selectSingleNode( "groupfooter" ); //$NON-NLS-1$
            if ( groupFooter == null ) {
              // direct footer replacement with
              // generatedInnermostGroup footer
              Element footerElement = (Element) generatedInnermostGroup.selectSingleNode( "groupfooter" ); //$NON-NLS-1$
              if ( footerElement != null ) {
                generatedInnermostGroup.remove( footerElement );
                innermostGroup.add( footerElement );
              }
            } else {
              // insertion: loop through elements of generated,
              // inserting to
              // template footer top (remove existing, add new,
              // add existing back)
              List groupFooterNodes = groupFooter.selectNodes( "*" ); //$NON-NLS-1$
              // remove existing
              for ( int i = 0; i < groupFooterNodes.size(); i++ ) {
                groupFooter.remove( (Element) groupFooterNodes.get( i ) );
              }
              // add new
              List generatedGroupFooterNodes = generatedInnermostGroup.selectNodes( "groupfooter/*" ); //$NON-NLS-1$
              Element generatedGroupFooter =
                (Element) generatedInnermostGroup.selectSingleNode( "groupfooter" ); //$NON-NLS-1$
              int y = 0;
              for ( int i = 0; i < generatedGroupFooterNodes.size(); i++ ) {
                Element element = (Element) generatedGroupFooterNodes.get( i );
                generatedGroupFooter.remove( element );
                groupFooter.add( element );
                try {
                  y = Math
                    .max(
                      y,
                      Integer.parseInt( element.attributeValue( "y" ) ) + Integer
                        .parseInt( element.attributeValue( "height" ) ) ); //$NON-NLS-1$ //$NON-NLS-2$
                } catch ( Exception e ) {
                  // NumberFormat exceptions, ignore
                }
                try {
                  y = Math
                    .max(
                      y,
                      Integer.parseInt( element.attributeValue( "y1" ) ) + Integer
                        .parseInt( element.attributeValue( "height" ) ) ); //$NON-NLS-1$ //$NON-NLS-2$
                } catch ( Exception e ) {
                  // NumberFormat exceptions, ignore
                }
                try {
                  y = Math
                    .max(
                      y,
                      Integer.parseInt( element.attributeValue( "y2" ) ) + Integer
                        .parseInt( element.attributeValue( "height" ) ) ); //$NON-NLS-1$ //$NON-NLS-2$
                } catch ( Exception e ) {
                  // NumberFormat exceptions, ignore
                }
              }
              // add existing back, pushed down
              for ( int i = 0; i < groupFooterNodes.size(); i++ ) {
                Element element = (Element) groupFooterNodes.get( i );
                if ( element.attribute( "y" ) != null ) { //$NON-NLS-1$
                  int yValue = Integer.parseInt( element.attributeValue( "y" ) ); //$NON-NLS-1$
                  element.attribute( "y" ).detach(); //$NON-NLS-1$
                  element.addAttribute( "y", ( y + yValue ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
                } else if ( element.attribute( "y1" ) != null ) { //$NON-NLS-1$
                  int yValue = Integer.parseInt( element.attributeValue( "y1" ) ); //$NON-NLS-1$
                  element.attribute( "y1" ).detach(); //$NON-NLS-1$
                  element.addAttribute( "y1", ( y + yValue ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
                } else if ( element.attribute( "y2" ) != null ) { //$NON-NLS-1$
                  int yValue = Integer.parseInt( element.attributeValue( "y2" ) ); //$NON-NLS-1$
                  element.attribute( "y2" ).detach(); //$NON-NLS-1$
                  element.addAttribute( "y2", ( y + yValue ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
                }
                groupFooter.add( (Element) groupFooterNodes.get( i ) );
              }
            }
          }
        }
        // need to merge 'dummy' group if we're doing grand totals
        for ( int i = 0; i < generatedGroups.size(); i++ ) {
          Element generatedGroup = (Element) generatedGroups.get( i );
          if ( generatedGroup.attributeValue( NAME_ATTRIBUTE_NAME ).equals( "dummy" ) ) { //$NON-NLS-1$
            for ( int j = 0; j < groups.size(); j++ ) {
              Element group = (Element) groups.get( j );
              if ( group.attributeValue( NAME_ATTRIBUTE_NAME ).equals( "dummy" ) ) { //$NON-NLS-1$
                Element groupsElement = (Element) templateReportNode.selectSingleNode( "groups" ); //$NON-NLS-1$
                generatedGroup.detach();
                group.detach();
                groupsElement.add( generatedGroup );
              }
            }
          }
        }
      }
      // 'merge' functions section in templateDoc from generatedDoc
      Element functionsElement = (Element) templateReportNode.selectSingleNode( "functions" ); //$NON-NLS-1$
      Element generatedFunctionsElement = (Element) generatedReportNode.selectSingleNode( "functions" ); //$NON-NLS-1$
      if ( generatedFunctionsElement != null ) {
        List functionList = generatedFunctionsElement.selectNodes( "function" ); //$NON-NLS-1$
        for ( int i = 0; i < functionList.size(); i++ ) {
          Element functionElement = (Element) functionList.get( i );
          generatedFunctionsElement.remove( functionElement );
          functionsElement.add( functionElement );
        }
      }
      // 'merge' expression section in templateDoc from generatedDoc
      Element expressionsElement = (Element) templateReportNode.selectSingleNode( "functions" ); //$NON-NLS-1$
      Element generatedExpressionsElement = (Element) generatedReportNode.selectSingleNode( "functions" ); //$NON-NLS-1$
      if ( generatedExpressionsElement != null ) {
        List expressionsList = generatedExpressionsElement.selectNodes( "expression" ); //$NON-NLS-1$
        for ( int i = 0; i < expressionsList.size(); i++ ) {
          Element expressionElement = (Element) expressionsList.get( i );
          generatedExpressionsElement.remove( expressionElement );
          expressionsElement.add( expressionElement );
        }
      }
      // pump watermark if exists
      if ( generatedReportNode.selectSingleNode( "watermark" ) != null ) { //$NON-NLS-1$
        Element watermarkNode = (Element) generatedReportNode.selectSingleNode( "watermark" ); //$NON-NLS-1$
        Element templateWatermarkNode = (Element) templateReportNode.selectSingleNode( "watermark" ); //$NON-NLS-1$
        if ( templateWatermarkNode != null ) {
          templateWatermarkNode.detach();
        }
        if ( watermarkNode != null ) {
          watermarkNode.detach();
        }
        templateReportNode.add( watermarkNode );
      }
      // push generatedDoc changes into templateDoc and write result to
      // mergeStream
      OutputFormat format = OutputFormat.createPrettyPrint();
      XMLWriter writer = new XMLWriter( mergeStream, format );
      writer.write( templateDoc );
      writer.close();
    } catch ( Exception e ) {
      getLogger().error( e.getMessage(), e );
    }
  }

  public static void addParserConfig( ReportSpec reportSpec, Element reportNode ) {
    FieldMapping fieldMappings[] = reportSpec.getFieldMapping();
    if ( fieldMappings != null ) {
      Element parserConfigElement = reportNode.addElement( "parser-config" ); //$NON-NLS-1$
      for ( int i = 0; i < fieldMappings.length; i++ ) {
        FieldMapping fieldMap = fieldMappings[ i ];
        Element property = parserConfigElement.addElement( PROPERTY_ELEMENT_NAME );
        property.addAttribute( NAME_ATTRIBUTE_NAME, fieldMap.getKey() );
        // property.addComment(fieldMap.getType());
        property.setText( fieldMap.getValue() );
      }
    }
  }

  public static void addChartElement( ReportSpec reportSpec, Field groupField, Element functionNode,
                                      Element parentElement, int y ) {
    // image url
    Chart chart = reportSpec.getChart();
    if ( groupField != null ) {
      chart = groupField.getChart();
    }
    // <drawable-field x="0" y="0" fieldname="BarChart" width="600"
    // height="400"/>
    Element drawableField = parentElement.addElement( "drawable-field" ); //$NON-NLS-1$
    drawableField.addAttribute( "x",
      ( reportSpec.getHorizontalOffset() + chart.getHorizontalOffset() ) + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
    drawableField.addAttribute( "y", y + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    drawableField.addAttribute( "height", chart.getHeight() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    drawableField.addAttribute( "width", chart.getWidth() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    String chartName = groupField != null ? groupField.getName() + "Chart" : "ReportChart"; //$NON-NLS-1$ //$NON-NLS-2$
    String dataSourceName = groupField != null ? groupField.getName() + "ChartDataSource" :
      "ReportChartDataSource"; //$NON-NLS-1$ //$NON-NLS-2$
    drawableField.addAttribute( "fieldname", chartName ); //$NON-NLS-1$
    // drawableField.addAttribute("dynamic", "true"); //$NON-NLS-1$
    // //$NON-NLS-2$
    // imageurl.addAttribute("scale", "true");
    // imageurl.addAttribute("keepAspectRatio", "true"); //$NON-NLS-1$
    // //$NON-NLS-2$
    // collector
    Element collectorFunctionElement = functionNode.addElement( "expression" ); //$NON-NLS-1$
    collectorFunctionElement.addAttribute( NAME_ATTRIBUTE_NAME, dataSourceName );
    Element collectorFunctionProperties = collectorFunctionElement.addElement( "properties" ); //$NON-NLS-1$
    // expression
    Element chartExpressionElement = functionNode.addElement( "expression" ); //$NON-NLS-1$
    chartExpressionElement.addAttribute( NAME_ATTRIBUTE_NAME, chartName );
    Element chartFunctionProperties = chartExpressionElement.addElement( "properties" ); //$NON-NLS-1$
    ChartType type = chart.getType();
    if ( type == ChartType.AREA || type == ChartType.BAR || type == ChartType.LINE
      || type == ChartType.PIE_MULTI || type == ChartType.WATERFALL ) {
      collectorFunctionElement.addAttribute(
        "class",
        "org.pentaho.plugin.jfreereport.reportcharts.CategorySetCollectorFunction" ); //$NON-NLS-1$ //$NON-NLS-2$
      Element categoryColumnProperty = collectorFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
      categoryColumnProperty.addAttribute( NAME_ATTRIBUTE_NAME, "categoryColumn" ); //$NON-NLS-1$
      categoryColumnProperty.setText( chart.getCategoryColumn() );
      String series[] = ReportSpecUtility.getSeriesColumns( chart );
      for ( int i = 0; i < series.length; i++ ) {
        Element seriesProperty = collectorFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
        seriesProperty.addAttribute( NAME_ATTRIBUTE_NAME, "seriesName[" + i + "]" ); //$NON-NLS-1$ //$NON-NLS-2$
        seriesProperty.setText( series[ i ] );
      }
      String values[] = chart.getValuesColumn();
      for ( int i = 0; i < values.length; i++ ) {
        Element valuesProperty = collectorFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
        valuesProperty.addAttribute( NAME_ATTRIBUTE_NAME, "valueColumn[" + i + "]" ); //$NON-NLS-1$ //$NON-NLS-2$
        valuesProperty.setText( values[ i ] );
      }
      if ( type == ChartType.AREA || type == ChartType.BAR) {
        // stacked (only allowed on area/bar
        Element stackedProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
        stackedProperty.addAttribute( NAME_ATTRIBUTE_NAME, "stacked" ); //$NON-NLS-1$
        stackedProperty.setText( chart.getIsStacked() + "" ); //$NON-NLS-1$
      }
      if ( type != ChartType.PIE_MULTI) {
        // horizontal
        Element isHorizontalProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
        isHorizontalProperty.addAttribute( NAME_ATTRIBUTE_NAME, "horizontal" ); //$NON-NLS-1$
        isHorizontalProperty.setText( chart.getIsHorizontal() + "" ); //$NON-NLS-1$
        // label rotation
        Element labelRotationProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
        labelRotationProperty.addAttribute( NAME_ATTRIBUTE_NAME, "labelRotation" ); //$NON-NLS-1$
        labelRotationProperty.setText( chart.getLabelRotation() + "" ); //$NON-NLS-1$
      }
      Series seriesArray[] = chart.getSeries();
      for ( int i = 0; i < seriesArray.length; i++ ) {
        if ( seriesArray[ i ].getSeriesColor() != null && !seriesArray[ i ].getSeriesColor()
          .equals( "" ) ) { //$NON-NLS-1$
          Element seriesProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
          seriesProperty.addAttribute( NAME_ATTRIBUTE_NAME, "seriesColor[" + i + "]" ); //$NON-NLS-1$ //$NON-NLS-2$
          seriesProperty.setText( seriesArray[ i ].getSeriesColor() );
        }
      }
      if ( type == ChartType.AREA ) {
        chartExpressionElement.addAttribute( "class",
          "org.pentaho.plugin.jfreereport.reportcharts.AreaChartExpression" ); //$NON-NLS-1$ //$NON-NLS-2$
      } else if ( type == ChartType.BAR ) {
        chartExpressionElement.addAttribute( "class",
          "org.pentaho.plugin.jfreereport.reportcharts.BarChartExpression" ); //$NON-NLS-1$ //$NON-NLS-2$
      } else if ( type == ChartType.LINE ) {
        chartExpressionElement.addAttribute( "class",
          "org.pentaho.plugin.jfreereport.reportcharts.LineChartExpression" ); //$NON-NLS-1$ //$NON-NLS-2$
      } else if ( type == ChartType.PIE_MULTI ) {
        chartExpressionElement.addAttribute(
          "class", "org.pentaho.plugin.jfreereport.reportcharts.MultiPieChartExpression" ); //$NON-NLS-1$ //$NON-NLS-2$
      } else if ( type == ChartType.WATERFALL) {
        chartExpressionElement.addAttribute(
          "class",
          "org.pentaho.plugin.jfreereport.reportcharts.WaterfallChartExpressions" ); //$NON-NLS-1$ //$NON-NLS-2$
      } else {
        // so on and so forth
      }
    }
    if ( type == ChartType.PIE || type == ChartType.RING ) {
      collectorFunctionElement.addAttribute(
        "class", "org.pentaho.plugin.jfreereport.reportcharts.PieSetCollectorFunction" ); //$NON-NLS-1$ //$NON-NLS-2$
      if ( type == ChartType.PIE ) {
        chartExpressionElement.addAttribute( "class",
          "org.pentaho.plugin.jfreereport.reportcharts.PieChartExpression" ); //$NON-NLS-1$ //$NON-NLS-2$
      } else {
        chartExpressionElement.addAttribute( "class",
          "org.pentaho.plugin.jfreereport.reportcharts.RingChartExpression" ); //$NON-NLS-1$ //$NON-NLS-2$
      }
      String[] series = ReportSpecUtility.getSeriesColumns( chart );
      if ( series.length > 0 ) {
        Element seriesProperty = collectorFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
        seriesProperty.addAttribute( NAME_ATTRIBUTE_NAME, "seriesColumn" ); //$NON-NLS-1$
        seriesProperty.setText( series[ 0 ] );
      }
      String[] values = chart.getValuesColumn();
      if ( values.length > 0 ) {
        Element valuesProperty = collectorFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
        valuesProperty.addAttribute( NAME_ATTRIBUTE_NAME, "valueColumn" ); //$NON-NLS-1$
        valuesProperty.setText( values[ 0 ] );
      }
      // ignoreNulls
      Element ignoreNullsProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
      ignoreNullsProperty.addAttribute( NAME_ATTRIBUTE_NAME, "ignoreNulls" ); //$NON-NLS-1$
      ignoreNullsProperty.setText( "true" ); //$NON-NLS-1$
      // ignoreZeros
      Element ignoreZerosProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
      ignoreZerosProperty.addAttribute( NAME_ATTRIBUTE_NAME, "ignoreZeros" ); //$NON-NLS-1$
      ignoreZerosProperty.setText( "true" ); //$NON-NLS-1$
    } else if ( chart.getType() == ChartType.PIE_MULTI ) {
      Element multipieByRowProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
      multipieByRowProperty.addAttribute( NAME_ATTRIBUTE_NAME, "multipieByRow" ); //$NON-NLS-1$
      multipieByRowProperty.setText( "false" ); //$NON-NLS-1$
      // <property name="multipieByRow">false</property>
      // <property name="multipieLabelFormat">{2}</property>
    }
    if ( groupField != null ) {
      Element groupProperty = collectorFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
      groupProperty.addAttribute( NAME_ATTRIBUTE_NAME, "group" ); //$NON-NLS-1$
      groupProperty.setText( groupField.getName() );
    }
    if ( chart.getResetGroup() != null && !chart.getResetGroup().equals( "" ) ) { //$NON-NLS-1$
      Element resetGroupProperty = collectorFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
      resetGroupProperty.addAttribute( NAME_ATTRIBUTE_NAME, "resetGroup" ); //$NON-NLS-1$
      resetGroupProperty.setText( chart.getResetGroup() );
    }
    // 3-D
    Element is3DProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    is3DProperty.addAttribute( NAME_ATTRIBUTE_NAME, "threeD" ); //$NON-NLS-1$
    is3DProperty.setText( chart.getIsThreeDimensional() + "" ); //$NON-NLS-1$
    // summary only
    Element summaryOnlyProperty = collectorFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    summaryOnlyProperty.addAttribute( NAME_ATTRIBUTE_NAME, "summaryOnly" ); //$NON-NLS-1$
    summaryOnlyProperty.setText( chart.getIsSummaryOnly() + "" ); //$NON-NLS-1$
    // data source
    Element datasourceProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    datasourceProperty.addAttribute( NAME_ATTRIBUTE_NAME, "dataSource" ); //$NON-NLS-1$
    datasourceProperty.setText( dataSourceName );
    // title
    Element titleProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    titleProperty.addAttribute( NAME_ATTRIBUTE_NAME, "title" ); //$NON-NLS-1$
    titleProperty.setText( chart.getTitle() );
    // background
    Element backgroundColorProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    backgroundColorProperty.addAttribute( NAME_ATTRIBUTE_NAME, "backgroundColor" ); //$NON-NLS-1$
    backgroundColorProperty.setText( chart.getBackgroundColor() );
    // show border
    Element showBorderProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    showBorderProperty.addAttribute( NAME_ATTRIBUTE_NAME, "showBorder" ); //$NON-NLS-1$
    showBorderProperty.setText( chart.getShowBorder() + "" ); //$NON-NLS-1$
    // show legend
    Element showLegendProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    showLegendProperty.addAttribute( NAME_ATTRIBUTE_NAME, "showLegend" ); //$NON-NLS-1$
    showLegendProperty.setText( chart.getShowLegend() + "" ); //$NON-NLS-1$
    // draw legend border
    Element drawLegendBorderProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    drawLegendBorderProperty.addAttribute( NAME_ATTRIBUTE_NAME, "drawLegendBorder" ); //$NON-NLS-1$
    drawLegendBorderProperty.setText( chart.getDrawLegendBorder() + "" ); //$NON-NLS-1$
    // legend location
    Element legendLocationProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    legendLocationProperty.addAttribute( NAME_ATTRIBUTE_NAME, "legendLocation" ); //$NON-NLS-1$
    legendLocationProperty.setText( chart.getLegendLocation().toString() );
    // height
    Element heightProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    heightProperty.addAttribute( NAME_ATTRIBUTE_NAME, "chartHeight" ); //$NON-NLS-1$
    heightProperty.setText( chart.getHeight() + "" ); //$NON-NLS-1$
    // width
    Element widthProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    widthProperty.addAttribute( NAME_ATTRIBUTE_NAME, "chartWidth" ); //$NON-NLS-1$
    widthProperty.setText( chart.getWidth() + "" ); //$NON-NLS-1$
    // useDrawable
    Element useDrawableProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    useDrawableProperty.addAttribute( NAME_ATTRIBUTE_NAME, "useDrawable" ); //$NON-NLS-1$
    useDrawableProperty.setText( "true" ); //$NON-NLS-1$
    Element titleFontProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    titleFontProperty.addAttribute( NAME_ATTRIBUTE_NAME, "titleFont" ); //$NON-NLS-1$
    titleFontProperty.setText( "Arial-BOLD-14" ); //$NON-NLS-1$
    Element labelFontProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    labelFontProperty.addAttribute( NAME_ATTRIBUTE_NAME, "labelFont" ); //$NON-NLS-1$
    labelFontProperty.setText( "Arial--8" ); //$NON-NLS-1$
    Element legendFontProperty = chartFunctionProperties.addElement( PROPERTY_ELEMENT_NAME );
    legendFontProperty.addAttribute( NAME_ATTRIBUTE_NAME, "legendFont" ); //$NON-NLS-1$
    legendFontProperty.setText( "Arial--6" ); //$NON-NLS-1$
    // Element drawBarOutlineProperty =
    // chartFunctionProperties.addElement(PROPERTY_ELEMENT_NAME);
    // drawBarOutlineProperty.addAttribute(NAME_ATTRIBUTE_NAME, "drawBarOutline");
    // drawBarOutlineProperty.setText("false");
  }

  public static void setupDetailFieldWidths( ReportSpec reportSpec, Field details[] ) {
    // number of details set to "auto" (not locked)
    // add up all locked widths
    int numAutoWidthDetails = 0;
    double totalWidth = reportSpec.getHorizontalOffset();
    for ( int i = 0; i < details.length; i++ ) {
      Field f = details[ i ];
      if ( f.getWidthLocked() ) {
        totalWidth += f.getWidth().doubleValue();
      } else {
        numAutoWidthDetails++;
      }
    }
    // subtract total locked widths from 100
    double remainderWidth = 100 - totalWidth;
    // divide total by the number of "auto" fields
    double autoWidth = 0;
    if ( numAutoWidthDetails > 0 ) {
      autoWidth = remainderWidth / numAutoWidthDetails;
    }
    double finalTotalWidth = 0;
    // assign all auto-widths to this result
    for ( int i = 0; i < details.length; i++ ) {
      Field f = details[ i ];
      if ( !f.getWidthLocked() ) {
        if ( i == details.length - 1 ) {
          // remaining space
          f.setWidth( new BigDecimal( 100 - finalTotalWidth - reportSpec.getHorizontalOffset() ) );
        } else {
          f.setWidth( new BigDecimal( autoWidth ) );
          finalTotalWidth += autoWidth;
        }
      } else {
        finalTotalWidth += f.getWidth().doubleValue();
      }
    }
  }

  public static List setupSpaceFields( Field fields[] ) {
    List spaceFields = new LinkedList();
    for ( int i = 0; i < fields.length; i++ ) {
      Field f = fields[ i ];
      if ( f.getName().startsWith( "_SPACE_" ) ) { //$NON-NLS-1$
        f.setName( "" ); //$NON-NLS-1$
        f.setDisplayName( "" ); //$NON-NLS-1$
        spaceFields.add( f );
      }
    }
    return spaceFields;
  }

  public static void setPageFormat( ReportSpec reportSpec, Element reportNode, int pageWidth, int pageHeight ) {
    if ( reportSpec.getPageFormat() != null && !reportSpec.getUseCustomPageFormat() ) {
      reportNode.addAttribute( "pageformat", reportSpec.getPageFormat() ); //$NON-NLS-1$
    } else if ( reportSpec.getUseCustomPageFormat() ) {
      reportNode.addAttribute( "width", String.valueOf( reportSpec.getCustomPageFormatWidth() ) ); //$NON-NLS-1$
      reportNode.addAttribute( "height", String.valueOf( reportSpec.getCustomPageFormatHeight() ) ); //$NON-NLS-1$
    } else {
      reportNode.addAttribute( "width", String.valueOf( pageWidth ) ); //$NON-NLS-1$
      reportNode.addAttribute( "height", String.valueOf( pageHeight ) ); //$NON-NLS-1$
    }
  }

  public static void setMargins( ReportSpec reportSpec, Element reportNode ) {
    reportNode.addAttribute( "leftmargin", String.valueOf( reportSpec.getLeftMargin() ) ); //$NON-NLS-1$
    reportNode.addAttribute( "rightmargin", String.valueOf( reportSpec.getRightMargin() ) ); //$NON-NLS-1$
    reportNode.addAttribute( "topmargin", String.valueOf( reportSpec.getTopMargin() ) ); //$NON-NLS-1$
    reportNode.addAttribute( "bottommargin", String.valueOf( reportSpec.getBottomMargin() ) ); //$NON-NLS-1$
  }

  public static void setWatermark( ReportSpec reportSpec, Element reportNode ) {
    if ( reportSpec.getWatermark() != null && reportSpec.getWatermark().getUseWatermark()
      && reportSpec.getWatermark().getSrc() != null && !reportSpec.getWatermark().getSrc()
      .equals( "" ) ) { //$NON-NLS-1$
      org.dom4j.Element watermarkElement = reportNode.addElement( "watermark" ); //$NON-NLS-1$
      org.dom4j.Element imagerefElement = watermarkElement.addElement( "imageref" ); //$NON-NLS-1$
      imagerefElement.addAttribute( "width", reportSpec.getWatermark().getWidth() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
      imagerefElement.addAttribute( "height", reportSpec.getWatermark().getHeight() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
      imagerefElement.addAttribute( "x", reportSpec.getWatermark().getX() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
      imagerefElement.addAttribute( "y", reportSpec.getWatermark().getY() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
      imagerefElement.addAttribute( "scale", String.valueOf( reportSpec.getWatermark().getScale() ) ); //$NON-NLS-1$
      imagerefElement.addAttribute( "keepAspectRatio",
        String.valueOf( reportSpec.getWatermark().getKeepAspectRatio() ) ); //$NON-NLS-1$
      imagerefElement.addAttribute( NAME_ATTRIBUTE_NAME, "watermark" ); //$NON-NLS-1$
      File wmf = new File( reportSpec.getWatermark().getSrc() );
      try {
        String watermarkSrc = "file://" + wmf.getCanonicalPath().replace( '\\', '/' ); //$NON-NLS-1$
        imagerefElement.addAttribute( "src", watermarkSrc ); //$NON-NLS-1$
      } catch ( Exception e ) {
      }
    }
  }

  public static void createRowBanding( ReportSpec reportSpec, Field details[], Element itemsNode, Element functionNode,
                                       int itemRowHeight ) {
    if ( reportSpec.getUseRowBanding() && details.length > 0 ) {
      org.dom4j.Element rectangleElement = itemsNode.addElement( "rectangle" ); //$NON-NLS-1$
      rectangleElement.addAttribute( NAME_ATTRIBUTE_NAME, "rowBandingElement" ); //$NON-NLS-1$
      rectangleElement.addAttribute( "color", reportSpec.getRowBandingColor() ); //$NON-NLS-1$
      rectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
      rectangleElement.addAttribute( "fill", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
      rectangleElement.addAttribute( "height", itemRowHeight + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      rectangleElement.addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
      rectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
      rectangleElement.addAttribute( "y", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
      org.dom4j.Element bandingFunctionField = functionNode.addElement( "function" ); //$NON-NLS-1$
      bandingFunctionField.addAttribute( NAME_ATTRIBUTE_NAME, "backgroundTrigger" ); //$NON-NLS-1$
      bandingFunctionField.addAttribute( "class",
        "org.jfree.report.function.ElementVisibilitySwitchFunction" ); //$NON-NLS-1$ //$NON-NLS-2$
      org.dom4j.Element properties = bandingFunctionField.addElement( "properties" ); //$NON-NLS-1$
      org.dom4j.Element property = properties.addElement( PROPERTY_ELEMENT_NAME );
      property.addAttribute( NAME_ATTRIBUTE_NAME, "element" ); //$NON-NLS-1$
      property.setText( "rowBandingElement" ); //$NON-NLS-1$
      property = properties.addElement( PROPERTY_ELEMENT_NAME );
      property.addAttribute( NAME_ATTRIBUTE_NAME, "numberOfElements" ); //$NON-NLS-1$
      property.setText( "1" ); //$NON-NLS-1$
      property = properties.addElement( PROPERTY_ELEMENT_NAME );
      property.addAttribute( NAME_ATTRIBUTE_NAME, "initialState" ); //$NON-NLS-1$
      property.setText( reportSpec.getRowBandingInitialState() ? "true" : "false" ); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  public static void processDetailsSection( ReportSpec reportSpec, Field details[], Field groups[], Element itemsNode,
                                            Element functionNode, int itemRowHeight ) {
    double percentSum = 0;
    // create item background rectangle + item label itself
    for ( int i = 0; i < details.length; i++ ) {
      Field f = details[ i ];
      String detailFieldName = f.getName();
      if ( f.getIsCalculatedColumn() ) {
        createCalculatedColumnExpression( reportSpec, functionNode, f );
        detailFieldName = f.getName() + "_calc_column_expression"; //$NON-NLS-1$
      }
      double width = f.getWidth().doubleValue();
      if ( f.getUseBackgroundColor() || f.getUseTrafficLighting() ) {
        org.dom4j.Element rectangleElement = itemsNode.addElement( "rectangle" ); //$NON-NLS-1$
        rectangleElement.addAttribute( NAME_ATTRIBUTE_NAME, f.getName() + "BackgroundElement" ); //$NON-NLS-1$
        if ( !f.getUseTrafficLighting() ) {
          rectangleElement.addAttribute( "color", f.getBackgroundColor() ); //$NON-NLS-1$
        }
        rectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
        rectangleElement.addAttribute( "fill", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        rectangleElement.addAttribute( "height", itemRowHeight + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        rectangleElement.addAttribute(
          "x", reportSpec.getHorizontalOffset() + percentSum + ( f.getIsWidthPercent() ? "%" :
            "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        rectangleElement.addAttribute( "width",
          width + ( f.getIsWidthPercent() ? "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        rectangleElement.addAttribute( "y", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
        // traffic lighting
        if ( f.getUseTrafficLighting() ) {
          addTrafficLighting( reportSpec, f, f.getName() + "BackgroundElement", functionNode ); //$NON-NLS-1$
        }
      }

      String elementType = StringUtils.isEmpty( f.getName() )
        ? ReportSpecUtility.MESSAGE_FIELD
        : ReportSpecUtility.getFieldType( f.getType() );
      org.dom4j.Element detailField = itemsNode.addElement( elementType );
      detailField.addAttribute( NAME_ATTRIBUTE_NAME, f.getName() + "Element" ); //$NON-NLS-1$
      detailField.addAttribute( "nullstring", f.getNullString() ); //$NON-NLS-1$

      if ( elementType != ReportSpecUtility.MESSAGE_FIELD ) {
        detailField.addAttribute( "fieldname", detailFieldName ); //$NON-NLS-1$
        String format = details[ i ].getFormat();
        setAttributeWithRequiredValue( detailField, "format", format ); //$NON-NLS-1$
      } else {
        detailField.setText( "" ); //$NON-NLS-1$
      }
      detailField.addAttribute( "vertical-alignment", f.getVerticalAlignment() ); //$NON-NLS-1$
      detailField.addAttribute( "alignment", f.getHorizontalAlignment() ); //$NON-NLS-1$
      detailField.addAttribute( "width",
        width + ( f.getIsWidthPercent() ? "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      detailField.addAttribute(
        "x", reportSpec.getHorizontalOffset() + percentSum + ( f.getIsWidthPercent() ? "%" :
          "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      detailField.addAttribute( "y", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
      detailField.addAttribute( "height", itemRowHeight + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      setItemFont( reportSpec, f, detailField );
      if ( f.getUseItemHide() ) {
        org.dom4j.Element functionField = functionNode.addElement( "function" ); //$NON-NLS-1$
        functionField.addAttribute( NAME_ATTRIBUTE_NAME, "headerEVSF_" + f.getName() ); //$NON-NLS-1$
        functionField.addAttribute( "class", "org.jfree.report.function.ItemHideFunction" ); //$NON-NLS-1$ //$NON-NLS-2$
        org.dom4j.Element properties = functionField.addElement( "properties" ); //$NON-NLS-1$
        org.dom4j.Element elementProperty = properties.addElement( PROPERTY_ELEMENT_NAME );
        elementProperty.addAttribute( NAME_ATTRIBUTE_NAME, "element" ); //$NON-NLS-1$
        elementProperty.setText( f.getName() + "Element" ); //$NON-NLS-1$
        org.dom4j.Element fieldProperty = properties.addElement( PROPERTY_ELEMENT_NAME );
        fieldProperty.addAttribute( NAME_ATTRIBUTE_NAME, "field" ); //$NON-NLS-1$
        fieldProperty.setText( detailFieldName );
        org.dom4j.Element ignoreGroupBreaksProperty = properties.addElement( PROPERTY_ELEMENT_NAME );
        ignoreGroupBreaksProperty.addAttribute( NAME_ATTRIBUTE_NAME, "ignoreGroupBreaks" ); //$NON-NLS-1$
        ignoreGroupBreaksProperty.setText( "true" ); //$NON-NLS-1$
        org.dom4j.Element ignorePageBreaksProperty = properties.addElement( PROPERTY_ELEMENT_NAME );
        ignorePageBreaksProperty.addAttribute( NAME_ATTRIBUTE_NAME, "ignorePageBreaks" ); //$NON-NLS-1$
        ignorePageBreaksProperty.setText( "true" ); //$NON-NLS-1$
      }
      percentSum += width;
    }
    // draw lines on details
    if ( details.length > 0 ) {
      addVerticalGridLines( reportSpec, groups, details, itemsNode, itemRowHeight );
      addHorizontalGridLines( reportSpec, groups, details, itemsNode, itemRowHeight );
    }
  }

  public static void processDummyGroup( ReportSpec reportSpec, Field details[], Field groups[], Element groupsNode,
                                        Element functionNode, int itemRowHeight, boolean expressionExists,
                                        int spacerWidth ) {
    org.dom4j.Element groupElement = groupsNode.addElement( "group" ); //$NON-NLS-1$
    groupElement.addAttribute( NAME_ATTRIBUTE_NAME, "dummy" ); //$NON-NLS-1$
    // header
    org.dom4j.Element dummyGroupHeader = groupElement.addElement( "groupheader" ); //$NON-NLS-1$
    Element noDataBandElement = dummyGroupHeader.addElement( "band" ); //$NON-NLS-1$
    noDataBandElement.addAttribute( NAME_ATTRIBUTE_NAME, "DummyGroupNoDataBandElement" ); //$NON-NLS-1$
    Element noDataLabelElement = noDataBandElement.addElement( "label" ); //$NON-NLS-1$
    noDataLabelElement.addAttribute( "height", itemRowHeight + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "vertical-alignment", "middle" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "alignment", "left" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "y", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.setText( "No Data Available" ); //$NON-NLS-1$
    addShowIfNoData( noDataBandElement, functionNode );
    Element dataBandElement = dummyGroupHeader.addElement( "band" ); //$NON-NLS-1$
    dataBandElement.addAttribute( NAME_ATTRIBUTE_NAME, "DummyGroupDataBandElement" ); //$NON-NLS-1$
    dataBandElement.addAttribute( "y", reportSpec.getColumnHeaderTopGap() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    dataBandElement.addAttribute(
      "height",
      ( reportSpec.getColumnHeaderHeight() + reportSpec.getColumnHeaderGap() ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    addHideIfNoData( "DummyGroupDataBandElement", functionNode ); //$NON-NLS-1$
    org.dom4j.Element rectangleElement = dataBandElement.addElement( "rectangle" ); //$NON-NLS-1$
    rectangleElement.addAttribute( "color", reportSpec.getColumnHeaderBackgroundColor() ); //$NON-NLS-1$
    rectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
    rectangleElement.addAttribute( "fill",
      reportSpec.getUseColumnHeaderBackgroundColor() ? "true" : "false" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    rectangleElement.addAttribute( "height", String.valueOf( reportSpec.getColumnHeaderHeight() ) ); //$NON-NLS-1$
    rectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
    rectangleElement.addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
    rectangleElement.addAttribute( "y", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
    createColumnHeaders( reportSpec, groups, details, dataBandElement, 0, 0 );
    dummyGroupHeader.addAttribute( "repeat", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
    dummyGroupHeader
      .addAttribute(
        "height",
        ( reportSpec.getColumnHeaderTopGap() + reportSpec.getColumnHeaderHeight() + reportSpec.getColumnHeaderGap() )
          + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    setGroupHeaderFont( reportSpec, dummyGroupHeader, true );
    // footer
    org.dom4j.Element dummyGroupFooter = groupElement.addElement( "groupfooter" ); //$NON-NLS-1$
    dummyGroupFooter.addAttribute( NAME_ATTRIBUTE_NAME, "dummyGroupFooter" ); //$NON-NLS-1$
    addHideIfNoData( "dummyGroupFooter", functionNode ); //$NON-NLS-1$
    setGroupFooterFont( reportSpec, dummyGroupFooter );
    if ( expressionExists && reportSpec.getCalculateGrandTotals() ) {
      Element dummyFooterRectangleElement = null;
      if ( reportSpec.getUseDummyGroupFooterBackgroundColor() ) {
        dummyFooterRectangleElement = dummyGroupFooter.addElement( "rectangle" ); //$NON-NLS-1$
        dummyFooterRectangleElement
          .addAttribute( "color", reportSpec.getDummyGroupFooterBackgroundColor() ); //$NON-NLS-1$
        dummyFooterRectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
        dummyFooterRectangleElement.addAttribute( "fill", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        dummyFooterRectangleElement
          .addAttribute( "height", ( reportSpec.getGroupFooterFontSize() + 5 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        dummyFooterRectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
        dummyFooterRectangleElement.addAttribute( "y", "1" ); //$NON-NLS-1$ //$NON-NLS-2$
      }
      String xStr = addExpressions( reportSpec, details, groups, null, -1, dummyGroupFooter, functionNode, true, 0 );
      if ( dummyFooterRectangleElement != null ) {
        dummyFooterRectangleElement.addAttribute( "x", xStr ); //$NON-NLS-1$
      }
    }
  }

  public static void processNormalGroups( ReportSpec reportSpec, Field details[], Field groups[], Element groupsNode,
                                          Element functionNode, int itemRowHeight, boolean expressionExists,
                                          int spacerWidth ) {
    org.dom4j.Element groupElement = groupsNode.addElement( "group" ); //$NON-NLS-1$
    groupElement.addAttribute( NAME_ATTRIBUTE_NAME, "dummy" ); //$NON-NLS-1$
    org.dom4j.Element dummyGroupHeader = groupElement.addElement( "groupheader" ); //$NON-NLS-1$
    dummyGroupHeader.addAttribute( NAME_ATTRIBUTE_NAME, "dummyGroupHeader" ); //$NON-NLS-1$
    Element noDataLabelElement = dummyGroupHeader.addElement( "label" ); //$NON-NLS-1$
    noDataLabelElement.addAttribute( NAME_ATTRIBUTE_NAME, "noDataLabelElement" ); //$NON-NLS-1$
    noDataLabelElement.addAttribute( "height", itemRowHeight + "" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "vertical-alignment", "middle" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "alignment", "left" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "y", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.addAttribute( "visible", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
    noDataLabelElement.setText( "No Data Available" ); //$NON-NLS-1$
    addShowIfNoData( noDataLabelElement, functionNode );
    setGroupHeaderFont( reportSpec, dummyGroupHeader, false );
    dummyGroupHeader.addAttribute( "repeat", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
    org.dom4j.Element dummyGroupFooter = groupElement.addElement( "groupfooter" ); //$NON-NLS-1$
    dummyGroupFooter.addAttribute( NAME_ATTRIBUTE_NAME, "dummyGroupFooter" ); //$NON-NLS-1$
    addHideIfNoData( "dummyGroupFooter", functionNode ); //$NON-NLS-1$
    setGroupFooterFont( reportSpec, dummyGroupFooter );
    // if page break after group on first group (outermost), dummy
    // group to
    // have column header in its footer, above calcs
    Field innermostGroupField = groups[ 0 ];
    Field outermostGroupField = groups[ groups.length - 1 ];
    int yShift = 0;
    if ( outermostGroupField.getPageBreakAfterFooter() || innermostGroupField.getPageBreakAfterFooter() ) {
      yShift = reportSpec.getColumnHeaderHeight();
      org.dom4j.Element rectangleElement = dummyGroupFooter.addElement( "rectangle" ); //$NON-NLS-1$
      rectangleElement.addAttribute( "color", reportSpec.getColumnHeaderBackgroundColor() ); //$NON-NLS-1$
      rectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
      rectangleElement.addAttribute( "fill",
        reportSpec.getUseColumnHeaderBackgroundColor() ? "true" : "false" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      rectangleElement.addAttribute( "height", String.valueOf( reportSpec.getColumnHeaderHeight() ) ); //$NON-NLS-1$
      rectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
      rectangleElement.addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
      rectangleElement.addAttribute( "y", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
      createColumnHeaders( reportSpec, groups, details, dummyGroupFooter, 0, 0 );
    }
    if ( expressionExists && reportSpec.getCalculateGrandTotals() ) {
      Element dummyFooterRectangleElement = null;
      if ( reportSpec.getUseDummyGroupFooterBackgroundColor() ) {
        dummyFooterRectangleElement = dummyGroupFooter.addElement( "rectangle" ); //$NON-NLS-1$
        dummyFooterRectangleElement
          .addAttribute( "color", reportSpec.getDummyGroupFooterBackgroundColor() ); //$NON-NLS-1$
        dummyFooterRectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
        dummyFooterRectangleElement.addAttribute( "fill", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        dummyFooterRectangleElement
          .addAttribute( "height", ( reportSpec.getGroupFooterFontSize() + 5 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        dummyFooterRectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
        dummyFooterRectangleElement.addAttribute( "y", "1" ); //$NON-NLS-1$ //$NON-NLS-2$
      }
      String xStr = addExpressions( reportSpec, details, groups, null, -1, dummyGroupFooter, functionNode, true,
        yShift );
      if ( dummyFooterRectangleElement != null ) {
        dummyFooterRectangleElement.addAttribute( "x", xStr ); //$NON-NLS-1$
      }
    }
    for ( int i = 0; i < groups.length; i++ ) {
      Field group = groups[ i ];
      groupElement = groupsNode.addElement( "group" ); //$NON-NLS-1$
      groupElement.addAttribute( NAME_ATTRIBUTE_NAME, group.getName() );
      org.dom4j.Element fieldsElement = groupElement.addElement( "fields" ); //$NON-NLS-1$
      for ( int j = 0; j <= i; j++ ) {
        org.dom4j.Element fieldElement = fieldsElement.addElement( "field" ); //$NON-NLS-1$
        fieldElement.setText( groups[ j ].getName() );
      }
      org.dom4j.Element groupHeader = null;
      groupHeader = groupElement.addElement( "groupheader" ); //$NON-NLS-1$
      groupHeader.addAttribute( NAME_ATTRIBUTE_NAME, group.getName() + "GroupHeader" ); //$NON-NLS-1$
      addHideIfNoData( group.getName() + "GroupHeader", functionNode ); //$NON-NLS-1$
      groupHeader.addAttribute( "repeat",
        group.getRepeatGroupHeader() ? "true" : "false" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      groupHeader
        .addAttribute( "pagebreak-before-print", String.valueOf( group.getPageBreakBeforeHeader() ) ); //$NON-NLS-1$
      groupHeader
        .addAttribute( "pagebreak-after-print", String.valueOf( group.getPageBreakAfterHeader() ) ); //$NON-NLS-1$
      // add chart (if exists)
      int chartHeight = 0;
      boolean chartAboveHeader = group.getShowChartAboveGroupHeader();
      if ( group.getUseChart() && group.getChart() != null ) {
        chartHeight = group.getChart().getHeight();
      }
      int lineHeight = reportSpec.getGroupHeaderFontSize() + 5;
      if ( i == groups.length - 1 ) {
        int y = 0;
        int x = 0;
        setGroupHeaderFont( reportSpec, groupHeader, false );
        int groupHeaderHeight = chartHeight + reportSpec.getColumnHeaderHeight();
        if ( group.getUseChart() && group.getChart() != null && chartAboveHeader ) {
          addChartElement( reportSpec, group, functionNode, groupHeader, 0 );
        }
        if ( group.getCreateGroupHeader() ) {
          // group header background
          groupHeaderHeight += lineHeight;
          if ( !StringUtils.isEmpty( group.getLevelName() ) ) {
            addLevelField( groupHeader, group, reportSpec.getHorizontalOffset() + spacerWidth + "%",
              Integer //$NON-NLS-1$
                .toString( chartAboveHeader ? chartHeight : y ), "100%", Integer.toString( lineHeight ) ); //$NON-NLS-1$
            y += lineHeight;
          }
          org.dom4j.Element rectangleElement = groupHeader.addElement( "rectangle" ); //$NON-NLS-1$
          rectangleElement.addAttribute( "color", group.getBackgroundColor() ); //$NON-NLS-1$
          rectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "fill",
            group.getUseBackgroundColor() ? "true" : "false" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          rectangleElement.addAttribute( "height", String.valueOf( lineHeight ) ); //$NON-NLS-1$
          rectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "y", ( chartAboveHeader ? chartHeight : y ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          // display field for group
          addGroupHeaderField( groupHeader, group, reportSpec.getHorizontalOffset() + spacerWidth + "%", //$NON-NLS-1$
            Integer.toString( chartAboveHeader ? chartHeight : y ), "100%",
            Integer.toString( lineHeight ) ); //$NON-NLS-1$
          // column header background
          Element topGapRectangleElement = null;
          if ( reportSpec.getGenerateReportLevelColumnHeaders() ) {
            rectangleElement = dummyGroupHeader.addElement( "rectangle" ); //$NON-NLS-1$
            topGapRectangleElement = dummyGroupHeader.addElement( "rectangle" ); //$NON-NLS-1$
          } else {
            rectangleElement = groupHeader.addElement( "rectangle" ); //$NON-NLS-1$
            topGapRectangleElement = groupHeader.addElement( "rectangle" ); //$NON-NLS-1$
          }
          topGapRectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
          topGapRectangleElement.addAttribute( "fill", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
          topGapRectangleElement
            .addAttribute( "height", reportSpec.getColumnHeaderTopGap() + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          topGapRectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
          topGapRectangleElement
            .addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
          if ( reportSpec.getGenerateReportLevelColumnHeaders() ) {
            topGapRectangleElement
              .addAttribute( "y", ( chartAboveHeader ? chartHeight : y ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          } else {
            topGapRectangleElement.addAttribute(
              "y", ( ( chartAboveHeader ? chartHeight : y ) + reportSpec.getGroupHeaderFontSize() + 5 )
                + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          }
          rectangleElement.addAttribute( "color", reportSpec.getColumnHeaderBackgroundColor() ); //$NON-NLS-1$
          rectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "fill", reportSpec.getUseColumnHeaderBackgroundColor() ? "true" :
            "false" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          rectangleElement.addAttribute( "height", String.valueOf( reportSpec.getColumnHeaderHeight() ) ); //$NON-NLS-1$
          rectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
          if ( reportSpec.getGenerateReportLevelColumnHeaders() ) {
            rectangleElement.addAttribute(
              "y", reportSpec.getColumnHeaderTopGap() + ( chartAboveHeader ? chartHeight : y )
                + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          } else {
            rectangleElement
              .addAttribute(
                "y", reportSpec.getColumnHeaderTopGap() + ( ( chartAboveHeader ? chartHeight : y ) + reportSpec
                  .getGroupHeaderFontSize() + 5 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            y += reportSpec.getColumnHeaderTopGap() + ( chartAboveHeader ? chartHeight : 0 )
              + reportSpec.getGroupHeaderFontSize() + 5;
          }
        } else {
          // column header background
          Element rectangleElement = null;
          if ( reportSpec.getGenerateReportLevelColumnHeaders() ) {
            rectangleElement = dummyGroupHeader.addElement( "rectangle" ); //$NON-NLS-1$
          } else {
            rectangleElement = groupHeader.addElement( "rectangle" ); //$NON-NLS-1$
          }
          rectangleElement.addAttribute( "color", reportSpec.getColumnHeaderBackgroundColor() ); //$NON-NLS-1$
          rectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "fill", reportSpec.getUseColumnHeaderBackgroundColor() ? "true" :
            "false" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          rectangleElement.addAttribute( "height", String.valueOf( reportSpec.getColumnHeaderHeight() ) ); //$NON-NLS-1$
          rectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "y", ( chartAboveHeader ? chartHeight : y ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( group.getUseChart() && group.getChart() != null && !chartAboveHeader ) {
          addChartElement( reportSpec, group, functionNode, groupHeader, groupHeaderHeight - chartHeight );
        }
        if ( reportSpec.getGenerateReportLevelColumnHeaders() ) {
          createColumnHeaders( reportSpec, groups, details, dummyGroupHeader, x, y );
          dummyGroupHeader
            .addAttribute(
              "height", reportSpec.getColumnHeaderTopGap() + groupHeaderHeight + reportSpec.getColumnHeaderGap()
                + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        } else {
          createColumnHeaders( reportSpec, groups, details, groupHeader, x, y );
          groupHeader
            .addAttribute(
              "height", reportSpec.getColumnHeaderTopGap() + groupHeaderHeight + reportSpec.getColumnHeaderGap()
                + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
      } else if ( group.getCreateGroupHeader() ) {
        int y = 0;
        setGroupHeaderFont( reportSpec, groupHeader, false );
        if ( !StringUtils.isEmpty( group.getLevelName() ) ) {
          addLevelField( groupHeader, group, reportSpec.getHorizontalOffset() + spacerWidth + "%", Integer //$NON-NLS-1$
            .toString( chartAboveHeader ? chartHeight : y ), "100%", Integer.toString( lineHeight ) );  //$NON-NLS-1$
          y += lineHeight;
        }
        Element rectangleElement = groupHeader.addElement( "rectangle" ); //$NON-NLS-1$
        rectangleElement.addAttribute( "color", group.getBackgroundColor() ); //$NON-NLS-1$
        rectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
        rectangleElement.addAttribute( "fill",
          group.getUseBackgroundColor() ? "true" : "false" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        rectangleElement.addAttribute( "height", ( lineHeight ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        rectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
        rectangleElement.addAttribute( "x", reportSpec.getHorizontalOffset() + "%" ); //$NON-NLS-1$ //$NON-NLS-2$
        rectangleElement.addAttribute( "y", ( chartAboveHeader ? chartHeight : y ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        // display field for group
        addGroupHeaderField( groupHeader, group, reportSpec.getHorizontalOffset() + spacerWidth + "%",  //$NON-NLS-1$
          Integer.toString( chartAboveHeader ? chartHeight : y ), "100%",
          Integer.toString( lineHeight ) );  //$NON-NLS-1$
        if ( group.getUseChart() && group.getChart() != null && chartAboveHeader ) {
          addChartElement( reportSpec, group, functionNode, groupHeader, 0 );
        } else if ( group.getUseChart() && group.getChart() != null && !chartAboveHeader ) {
          addChartElement( reportSpec, group, functionNode, groupHeader, reportSpec.getGroupHeaderFontSize() + 5 );
        }
      }
      Element groupFooter = groupElement.addElement( "groupfooter" ); //$NON-NLS-1$
      groupFooter.addAttribute( NAME_ATTRIBUTE_NAME, group.getName() + "GroupFooter" ); //$NON-NLS-1$
      addHideIfNoData( group.getName() + "GroupFooter", functionNode ); //$NON-NLS-1$
      setGroupFooterFont( reportSpec, groupFooter );
      groupFooter
        .addAttribute( "pagebreak-before-print", String.valueOf( group.getPageBreakBeforeFooter() ) ); //$NON-NLS-1$
      groupFooter
        .addAttribute( "pagebreak-after-print", String.valueOf( group.getPageBreakAfterFooter() ) ); //$NON-NLS-1$
      // add rectangle for group-footer background color, if
      // desired
      if ( expressionExists && group.getCalculateGroupTotals() ) {
        Element rectangleElement = null;
        if ( group.getUseGroupFooterBackgroundColor() ) {
          rectangleElement = groupFooter.addElement( "rectangle" ); //$NON-NLS-1$
          rectangleElement.addAttribute( "color", group.getGroupFooterBackgroundColor() ); //$NON-NLS-1$
          rectangleElement.addAttribute( "draw", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "fill", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement
            .addAttribute( "height", ( reportSpec.getGroupFooterFontSize() + 5 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "width", "100%" ); //$NON-NLS-1$ //$NON-NLS-2$
          rectangleElement.addAttribute( "y", "1" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        String xStr = addExpressions( reportSpec, details, groups, group, i, groupFooter, functionNode, false, 0 );
        if ( rectangleElement != null ) {
          rectangleElement.addAttribute( "x", xStr ); //$NON-NLS-1$
        }
      }
    } // end for groups
  }

  public static void processGroupsSection( ReportSpec reportSpec, Field details[], Field groups[], Element groupsNode,
                                           Element functionNode, int itemRowHeight, boolean expressionExists,
                                           int spacerWidth ) {
    if ( groups.length == 0 ) {
      // create dummy group for header/footer, there are no groups but we need
      // to create a group to stuff the column headers and group calculations in
      processDummyGroup( reportSpec, details, groups, groupsNode, functionNode, itemRowHeight, expressionExists,
        spacerWidth );
    } else {
      // process normal groups
      processNormalGroups( reportSpec, details, groups, groupsNode, functionNode, itemRowHeight, expressionExists,
        spacerWidth );
    }
  }

  /**
   * Regular Expression to break a String that looks like: "myLabel $(myColumn)" into
   * "myLabel" and "myColumn".
   * <p>
   * first group is zero or more of any non-$ character
   * second group is "$(" followed by one or more word characters followed by ")"
   */
  private static String RE_DISPLAY_NAME_PARTS = "^([^$]*)\\$\\((\\w+)\\)$"; //$NON-NLS-1$
  private static final Pattern DISPLAY_NAME_PARTS_PATTERN =
    Pattern.compile( ReportGenerationUtility.RE_DISPLAY_NAME_PARTS );

  /**
   * Get the String representing the format-type associated with the value in <param>fieldType</param>.
   * This method will return the appropriate type String based in the input <param>fieldType</param>.
   * See the documentation for getGroupMessageFieldFormatText() for more information.
   *
   * @param fieldType int one of the values in java.sql.Types. Currently the only values that return non-null are
   *                  Types.DATE and Types.NUMERIC
   * @return String null if fieldType is a value that does not support formatting, otherwise a String specifying the
   * type of the field.
   * @throws RuntimeException if fieldType is not recognized. Currently the only recognized types are Types.DATE,
   *                          Types.NUMBER, Types.VARCHAR.
   */
  private static String getFormatTypeAsString( int fieldType ) {
    switch ( fieldType ) {
      case Types.DATE:
        return "date"; //$NON-NLS-1$
      case Types.NUMERIC:
        return "number"; //$NON-NLS-1$
      case Types.VARCHAR:
        return null;
      default:
        // TODO sbarkdull, should be internationalized
        throw new RuntimeException( "Invalid field type: " + "(" + String.valueOf( fieldType ) + ")" );
    }
  }

  /**
   * Get the String for the MessageField's text property, for a MessageField
   * that will represent a group item in the report.
   * <p>
   * A MessageField's text property can include a reference to a column value, that looks like this:
   * $(COLUMN_NAME), where COLUMN_NAME is the name of a column. The MessageField's text property
   * can supply formatting information for the the column value, by modifying the text property
   * to look like: $(COLUMN_NAME, type, format), where type is one of either "number" or "date",
   * and format is a valid Java formatting string. For instance:
   * $(BC_DATE, date, MMM/dd/yyyy) or $(BC_NUMBER, number, #,###;-#,###).
   * <p>
   * If the type of the group field is not numeric or date, simply return the group's displayName.
   *
   * @param group
   * @return
   */
  private static String getGroupMessageFieldFormatText( Field group ) {
    String text = group.getDisplayName();
    int intFieldType = group.getType();
    String strFormatType = getFormatTypeAsString( intFieldType );
    if ( null != strFormatType ) // if the type is NUMERIC or DATE
    {
      String format = group.getFormat();
      if ( !StringUtils.isEmpty( format ) ) {
        Matcher m = DISPLAY_NAME_PARTS_PATTERN.matcher( group.getDisplayName() );
        if ( m.matches() && m.groupCount() == 2 ) {
          String label = m.group( 1 );
          String columnValue = m.group( 2 );
          if ( !StringUtils.isEmpty( columnValue ) ) {
            text = label + "$(" + columnValue + ","  //$NON-NLS-1$ //$NON-NLS-2$
              + strFormatType
              + "," + format + ")"; //$NON-NLS-1$ //$NON-NLS-2$
          }
        }
      }
    }

    return text;
  }

  /**
   * Add a MessageField to represent a group header in the report.
   *
   * @param ownerElement
   * @param group
   * @param x
   * @param y
   * @param width
   * @param height
   */
  private static void addGroupHeaderField( org.dom4j.Element ownerElement, Field group, String x, String y,
                                           String width, String height ) {

    String msgText = getGroupMessageFieldFormatText( group );
    org.dom4j.Element messageField = ownerElement.addElement( ReportSpecUtility.MESSAGE_FIELD );
    initMessageField( messageField, msgText,
      x, y, width, height, group.getHorizontalAlignment(), group.getVerticalAlignment(),
      group.getNullString() );
  }

  /**
   * Add a MessageField to represent a Level Name in the report.
   *
   * @param ownerElement
   * @param group
   * @param x
   * @param y
   * @param width
   * @param height
   */
  private static void addLevelField( org.dom4j.Element ownerElement, Field group, String x, String y, String width,
                                     String height ) {
    org.dom4j.Element messageField = ownerElement.addElement( ReportSpecUtility.MESSAGE_FIELD );

    initMessageField( messageField, group.getLevelName(),
      x, y, width, height, group.getHorizontalAlignment(), group.getVerticalAlignment(),
      group.getNullString() );
  }

  /**
   * Initialize a MessageFields most common properties.
   *
   * @param messageField
   * @param text
   * @param x
   * @param y
   * @param width
   * @param height
   * @param horizontalAlignment
   * @param verticalAlignment
   * @param nullString
   */
  private static void initMessageField( org.dom4j.Element messageField, String text,
                                        String x, String y, String width, String height,
                                        String horizontalAlignment, String verticalAlignment, String nullString ) {
    messageField.setText( text );

    messageField.addAttribute( "height", height );                        //$NON-NLS-1$
    messageField.addAttribute( "vertical-alignment", verticalAlignment ); //$NON-NLS-1$
    messageField.addAttribute( "alignment", horizontalAlignment );          //$NON-NLS-1$
    messageField.addAttribute( "width", width );                          //$NON-NLS-1$
    messageField.addAttribute( "x", x );                                  //$NON-NLS-1$
    messageField.addAttribute( "y", y );                                  //$NON-NLS-1$
    messageField.addAttribute( "nullstring", nullString );                //$NON-NLS-1$
  }

  public static void createCalculatedColumnExpression( ReportSpec reportSpec, Element functionNode, Field f ) {
    Element expression = functionNode.addElement( "expression" ); //$NON-NLS-1$
    expression
      .addAttribute( "class", "org.jfree.report.modules.misc.beanshell.BSHExpression" ); //$NON-NLS-1$ //$NON-NLS-2$
    expression.addAttribute( NAME_ATTRIBUTE_NAME, f.getName() + "_calc_column_expression" ); //$NON-NLS-1$
    Element properties = expression.addElement( "properties" ); //$NON-NLS-1$
    Element property = properties.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "expression" ); //$NON-NLS-1$
    StringBuffer nameArrayStrBuf = new StringBuffer();
    nameArrayStrBuf.append( "{" ); //$NON-NLS-1$
    for ( int i = 0; i < f.getCalculatedColumnsCount(); i++ ) {
      String column = f.getCalculatedColumns()[ i ];
      nameArrayStrBuf.append( "\"" + column + "\"" );  //$NON-NLS-1$//$NON-NLS-2$
      if ( i < f.getCalculatedColumnsCount() - 1 ) {
        nameArrayStrBuf.append( ", " ); //$NON-NLS-1$
      }
    }
    nameArrayStrBuf.append( "}" ); //$NON-NLS-1$
    if ( "sum".equals( f.getCalculatedColumnFunction() ) ) { //$NON-NLS-1$
      String calcString = "calc += ((Number)value).doubleValue();"; //$NON-NLS-1$
      String text = "Object getValue() { " + "String[] names = " //$NON-NLS-1$ //$NON-NLS-2$
        + nameArrayStrBuf.toString()
        + ";" //$NON-NLS-1$
        +
        // "double calc = ((Number)dataRow.get(names[0])).doubleValue(); " +
        "double calc = 0; " + "try { " + "  for (int x=0;x < names.length; x++) { "
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "    Object value = dataRow.get(names[x]); " //$NON-NLS-1$
        + "    if (value != null && value instanceof Number) { " + calcString + "    } " + "  }"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "  return new Double(calc);" + "} catch (Exception e) { " + "  e.prinStackTrace();" + "}"
        + "}"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
      property.addCDATA( text );
    } else if ( "diff".equals( f.getCalculatedColumnFunction() ) ) { //$NON-NLS-1$
      String calcString = "calc -= ((Number)value).doubleValue();"; //$NON-NLS-1$
      String text = "Object getValue() { " + "String[] names = " + nameArrayStrBuf.toString() + ";"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "double calc = ((Number)dataRow.get(names[0])).doubleValue(); " + "try { " //$NON-NLS-1$ //$NON-NLS-2$
        + "  for (int x=1;x < names.length; x++) { " + "    Object value = dataRow.get(names[x]); "
        //$NON-NLS-1$ //$NON-NLS-2$
        + "    if (value != null && value instanceof Number) { " + calcString + "    } " + "  }"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "  return new Double(calc);" + "} catch (Exception e) { " + "  e.prinStackTrace();" + "}"
        + "}"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
      property.addCDATA( text );
    } else if ( "absdiff".equals( f.getCalculatedColumnFunction() ) ) { //$NON-NLS-1$
      String calcString = "calc -= ((Number)value).doubleValue();"; //$NON-NLS-1$
      String text = "Object getValue() { " + "String[] names = " + nameArrayStrBuf.toString() + ";"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "double calc = ((Number)dataRow.get(names[0])).doubleValue(); " + "try { " //$NON-NLS-1$ //$NON-NLS-2$
        + "  for (int x=1;x < names.length; x++) { " + "    Object value = dataRow.get(names[x]); "
        //$NON-NLS-1$ //$NON-NLS-2$
        + "    if (value != null && value instanceof Number) { " + calcString + "    } " + "  }"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "  return new Double(Math.abs(calc));" + "} catch (Exception e) { " + "  e.prinStackTrace();" + "}"
        + "}"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
      property.addCDATA( text );
    } else if ( "mult".equals( f.getCalculatedColumnFunction() ) ) { //$NON-NLS-1$
      String calcString = "calc *= ((Number)value).doubleValue();"; //$NON-NLS-1$
      String text = "Object getValue() { " + "String[] names = " + nameArrayStrBuf.toString() + ";"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "double calc = ((Number)dataRow.get(names[0])).doubleValue(); " + "try { " //$NON-NLS-1$ //$NON-NLS-2$
        + "  for (int x=1;x < names.length; x++) { " + "    Object value = dataRow.get(names[x]); "
        //$NON-NLS-1$ //$NON-NLS-2$
        + "    if (value != null && value instanceof Number) { " + calcString + "    } " + "  }"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "  return new Double(calc);" + "} catch (Exception e) { " + "  e.prinStackTrace();" + "}"
        + "}"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
      property.addCDATA( text );
    } else if ( "avg".equals( f.getCalculatedColumnFunction() ) ) { //$NON-NLS-1$
      String calcString = "calc += ((Number)value).doubleValue();"; //$NON-NLS-1$
      String text = "Object getValue() { " + "String[] names = " + nameArrayStrBuf.toString() + ";" + "int numSum = 0;"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        + "double calc = 0; " + "try { " + "  for (int x=0;x < names.length; x++) { "
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "    Object value = dataRow.get(names[x]); " //$NON-NLS-1$
        + "    if (value != null && value instanceof Number) { " + "      numSum++;" + calcString + "    } "
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "  }" + "  return new Double(calc / numSum);" + "} catch (Exception e) { " + "  e.prinStackTrace();" + "}"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        + "}"; //$NON-NLS-1$
      property.addCDATA( text );
    } else if ( "min".equals( f.getCalculatedColumnFunction() ) ) { //$NON-NLS-1$
      String text = "Object getValue() { " + "String[] names = " + nameArrayStrBuf.toString() + ";"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "double min = Double.MAX_VALUE;" + "try { " + "  for (int x=0;x < names.length; x++) { "
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "    Object value = dataRow.get(names[x]); " //$NON-NLS-1$
        + "    if (value != null && value instanceof Number) { " //$NON-NLS-1$
        + "      min = Math.min(min, ((Number)value).doubleValue());" + "    } " + "  }"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "  return new Double(min);" + "} catch (Exception e) { " + "  e.prinStackTrace();" + "}"
        + "}"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
      property.addCDATA( text );
    } else if ( "max".equals( f.getCalculatedColumnFunction() ) ) { //$NON-NLS-1$
      String text = "Object getValue() { " + "String[] names = " + nameArrayStrBuf.toString() + ";"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "double max = Double.MIN_VALUE;" + "try { " + "  for (int x=0;x < names.length; x++) { "
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "    Object value = dataRow.get(names[x]); " //$NON-NLS-1$
        + "    if (value != null && value instanceof Number) { " //$NON-NLS-1$
        + "      max = Math.max(max, ((Number)value).doubleValue());" + "    } " + "  }"
        //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        + "  return new Double(max);" + "} catch (Exception e) { " + "  e.prinStackTrace();" + "}"
        + "}"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
      property.addCDATA( text );
    }
  }

  public static void addHideIfNoData( String elementName, Element functionNode ) {
    // add expression to hide groupfooter if there is no data
    Element hideIfNullTriggerExpressionField = functionNode.addElement( "expression" ); //$NON-NLS-1$
    hideIfNullTriggerExpressionField.addAttribute(
      "class", "org.jfree.report.function.ShowElementIfDataAvailableExpression" ); //$NON-NLS-1$ //$NON-NLS-2$
    hideIfNullTriggerExpressionField
      .addAttribute( NAME_ATTRIBUTE_NAME, elementName + "HideIfNullTrigger" ); //$NON-NLS-1$
    Element hideIfNullTriggerProperties = hideIfNullTriggerExpressionField.addElement( "properties" ); //$NON-NLS-1$
    Element hideIfNullTriggerProperty = hideIfNullTriggerProperties.addElement( PROPERTY_ELEMENT_NAME );
    hideIfNullTriggerProperty.addAttribute( NAME_ATTRIBUTE_NAME, "element" ); //$NON-NLS-1$
    hideIfNullTriggerProperty.setText( elementName );
  }

  public static void addShowIfNoData( Element element, Element functionNode ) {
    // show element if no data
    Element showIfNullTriggerExpressionField = functionNode.addElement( "expression" ); //$NON-NLS-1$
    showIfNullTriggerExpressionField.addAttribute(
      "class", "org.jfree.report.function.HideElementIfDataAvailableExpression" ); //$NON-NLS-1$ //$NON-NLS-2$
    showIfNullTriggerExpressionField.addAttribute( NAME_ATTRIBUTE_NAME,
      element.attributeValue( NAME_ATTRIBUTE_NAME ) + "HideIfNullTrigger" ); //$NON-NLS-1$
    Element showIfNullTriggerProperties = showIfNullTriggerExpressionField.addElement( "properties" ); //$NON-NLS-1$
    Element showIfNullTriggerProperty = showIfNullTriggerProperties.addElement( PROPERTY_ELEMENT_NAME );
    showIfNullTriggerProperty.addAttribute( NAME_ATTRIBUTE_NAME, "element" ); //$NON-NLS-1$
    showIfNullTriggerProperty.setText( element.attributeValue( NAME_ATTRIBUTE_NAME ) );
  }

  public static String addExpressions( ReportSpec reportSpec, Field details[], Field groups[], Field group, int i,
                                       Element groupFooter, Element functionNode, boolean isSummary, int yShift ) {
    double width = 0;
    double widthSum = 0;
    // get font size
    int fontSize = reportSpec.getGroupFooterFontSize();
    String totalHorizontalAlignment = null;
    double totalLabelWidth = widthSum;
    boolean foundCalc = false;
    for ( int j = 0; j < details.length; j++ ) {
      String expressionName = details[ j ].getExpression();
      Field f = details[ j ];
      width = f.getWidth().doubleValue();
      if ( expressionName == null || expressionName.equals( "none" ) ) { //$NON-NLS-1$
        if ( totalHorizontalAlignment == null ) {
          totalHorizontalAlignment = f.getHorizontalAlignment();
        }
        if ( !foundCalc ) {
          totalLabelWidth += width;
        }
      } else {
        foundCalc = true;
        String fieldName = ( isSummary ? "Summary_" : group == null ? "dummy" : group.getName() ) + f.getName()
          + "Expression"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        Element numberField = groupFooter.addElement( ReportSpecUtility.NUMBER_FIELD );
        numberField.addAttribute( "fieldname", fieldName ); //$NON-NLS-1$
        numberField.addAttribute( "height", ( fontSize + 4 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        numberField.addAttribute( "vertical-alignment", f.getVerticalAlignment() ); //$NON-NLS-1$
        numberField.addAttribute( "alignment", f.getHorizontalAlignment() ); //$NON-NLS-1$
        numberField.addAttribute( "width",
          width + ( f.getIsWidthPercent() ? "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        numberField.addAttribute( "x", reportSpec.getHorizontalOffset() + widthSum + ( f.getIsWidthPercent() ? "%" :
          "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        numberField.addAttribute( "y", yShift + 2 + "" ); //$NON-NLS-1$ //$NON-NLS-2$
        // add expression to functions
        Element expressionField = functionNode.addElement( "expression" ); //$NON-NLS-1$
        expressionField
          .addAttribute( "class", ReportSpecUtility.getJFreeExpressionClass( expressionName ) ); //$NON-NLS-1$
        expressionField.addAttribute( NAME_ATTRIBUTE_NAME, fieldName );
        Element properties = expressionField.addElement( "properties" ); //$NON-NLS-1$
        if ( expressionName.equals( "group-count" ) ) { //$NON-NLS-1$
          Element groupProperty = properties.addElement( PROPERTY_ELEMENT_NAME );
          groupProperty.addAttribute( NAME_ATTRIBUTE_NAME, "group" ); //$NON-NLS-1$
          groupProperty.setText( group == null ? "dummy" : group.getName() ); //$NON-NLS-1$
          if ( i > 0 ) {
            Element parentProperty = properties.addElement( PROPERTY_ELEMENT_NAME );
            parentProperty.addAttribute( NAME_ATTRIBUTE_NAME, "parentGroup" ); //$NON-NLS-1$
            parentProperty.setText( group == null ? "dummy" : group.getName() ); //$NON-NLS-1$
          }
        } else if ( expressionName.equals( "item-count" ) ) { //$NON-NLS-1$
          Element groupProperty = properties.addElement( PROPERTY_ELEMENT_NAME );
          groupProperty.addAttribute( NAME_ATTRIBUTE_NAME, "group" ); //$NON-NLS-1$
          groupProperty.setText( group == null ? "dummy" : group.getName() ); //$NON-NLS-1$
        } else {
          String format = f.getFormat();
          setAttributeWithRequiredValue( numberField, "format", format ); //$NON-NLS-1$
          Element fieldProperty = properties.addElement( PROPERTY_ELEMENT_NAME );
          fieldProperty.addAttribute( NAME_ATTRIBUTE_NAME, "field" ); //$NON-NLS-1$
          if ( f.getIsCalculatedColumn() ) {
            fieldProperty.setText( f.getName() + "_calc_column_expression" ); //$NON-NLS-1$
          } else {
            fieldProperty.setText( f.getName() );
          }
          if ( !isSummary ) {
            Element groupProperty = properties.addElement( PROPERTY_ELEMENT_NAME );
            groupProperty.addAttribute( NAME_ATTRIBUTE_NAME, "group" ); //$NON-NLS-1$
            groupProperty.setText( group == null ? "dummy" : group.getName() ); //$NON-NLS-1$
          }
        }
        if ( reportSpec.getUseExpressionUnderlining() ) {
          String hAlign = details[ j ].getHorizontalAlignment();
          if ( groups.length > 0 && i == groups.length - 1 ) {
            Element lineElement = groupFooter.addElement( "line" ); //$NON-NLS-1$
            lineElement.addAttribute( "color", "black" ); //$NON-NLS-1$ //$NON-NLS-2$
            lineElement.addAttribute( "weight", ".5" ); //$NON-NLS-1$ //$NON-NLS-2$
            if ( hAlign.equals( "left" ) ) { //$NON-NLS-1$
              lineElement.addAttribute(
                "x1", reportSpec.getHorizontalOffset() + widthSum + ( f.getIsWidthPercent() ? "%" :
                  "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y1", yShift + 1 + "" ); //$NON-NLS-1$ //$NON-NLS-2$
              lineElement
                .addAttribute(
                  "x2", (int) ( ( reportSpec.getHorizontalOffset() + widthSum + ( width * .90 ) ) ) + (
                    f.getIsWidthPercent() ? "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y2", yShift + 1 + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            } else if ( hAlign.equals( "center" ) ) { //$NON-NLS-1$
              lineElement
                .addAttribute(
                  "x1",
                  (int) ( reportSpec.getHorizontalOffset() + widthSum + ( width * .10 ) ) + ( f.getIsWidthPercent() ?
                    "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y1", yShift + 1 + "" ); //$NON-NLS-1$ //$NON-NLS-2$
              lineElement
                .addAttribute(
                  "x2", (int) ( ( reportSpec.getHorizontalOffset() + widthSum + ( width * 0.90 ) ) ) + (
                    f.getIsWidthPercent() ? "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y2", yShift + 1 + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            } else if ( hAlign.equals( "right" ) ) { //$NON-NLS-1$
              lineElement
                .addAttribute(
                  "x1",
                  (int) ( reportSpec.getHorizontalOffset() + widthSum + ( width * .10 ) ) + ( f.getIsWidthPercent() ?
                    "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y1", yShift + 1 + "" ); //$NON-NLS-1$ //$NON-NLS-2$
              lineElement.addAttribute(
                "x2", ( reportSpec.getHorizontalOffset() + widthSum + width ) + ( f.getIsWidthPercent() ? "%" :
                  "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y2", yShift + 1 + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            }
          }
          Element lineElement = groupFooter.addElement( "line" ); //$NON-NLS-1$
          lineElement.addAttribute( "color", "black" ); //$NON-NLS-1$ //$NON-NLS-2$
          lineElement.addAttribute( "weight", ".5" ); //$NON-NLS-1$ //$NON-NLS-2$
          if ( hAlign.equals( "left" ) ) { //$NON-NLS-1$
            lineElement.addAttribute(
              "x1", reportSpec.getHorizontalOffset() + widthSum + ( f.getIsWidthPercent() ? "%" :
                "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            lineElement.addAttribute( "y1", ( yShift + fontSize + 6 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            lineElement
              .addAttribute(
                "x2",
                (int) ( ( reportSpec.getHorizontalOffset() + widthSum + ( width * .90 ) ) ) + ( f.getIsWidthPercent() ?
                  "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            lineElement.addAttribute( "y2", ( yShift + fontSize + 6 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          } else if ( hAlign.equals( "center" ) ) { //$NON-NLS-1$
            lineElement
              .addAttribute(
                "x1",
                (int) ( reportSpec.getHorizontalOffset() + widthSum + ( width * .10 ) ) + ( f.getIsWidthPercent() ?
                  "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            lineElement.addAttribute( "y1", ( yShift + fontSize + 6 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            lineElement
              .addAttribute(
                "x2",
                (int) ( ( reportSpec.getHorizontalOffset() + widthSum + ( width * 0.90 ) ) ) + ( f.getIsWidthPercent() ?
                  "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            lineElement.addAttribute( "y2", ( yShift + fontSize + 6 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          } else if ( hAlign.equals( "right" ) ) { //$NON-NLS-1$
            lineElement
              .addAttribute(
                "x1",
                (int) ( reportSpec.getHorizontalOffset() + widthSum + ( width * .10 ) ) + ( f.getIsWidthPercent() ?
                  "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            lineElement.addAttribute( "y1", ( yShift + fontSize + 6 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            lineElement.addAttribute(
              "x2", ( reportSpec.getHorizontalOffset() + widthSum + width ) + ( f.getIsWidthPercent() ? "%" :
                "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            lineElement.addAttribute( "y2", ( yShift + fontSize + 6 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
          }
          if ( reportSpec.getDoubleUnderlineExpression() ) {
            lineElement = groupFooter.addElement( "line" ); //$NON-NLS-1$
            lineElement.addAttribute( "color", "black" ); //$NON-NLS-1$ //$NON-NLS-2$
            lineElement.addAttribute( "weight", ".5" ); //$NON-NLS-1$ //$NON-NLS-2$
            if ( hAlign.equals( "left" ) ) { //$NON-NLS-1$
              lineElement.addAttribute(
                "x1", reportSpec.getHorizontalOffset() + widthSum + ( f.getIsWidthPercent() ? "%" :
                  "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y1", ( yShift + fontSize + 8 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
              lineElement
                .addAttribute(
                  "x2", (int) ( ( reportSpec.getHorizontalOffset() + widthSum + ( width * .90 ) ) ) + (
                    f.getIsWidthPercent() ? "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y2", ( yShift + fontSize + 8 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            } else if ( hAlign.equals( "center" ) ) { //$NON-NLS-1$
              lineElement
                .addAttribute(
                  "x1",
                  (int) ( reportSpec.getHorizontalOffset() + widthSum + ( width * .10 ) ) + ( f.getIsWidthPercent() ?
                    "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y1", ( yShift + fontSize + 8 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
              lineElement
                .addAttribute(
                  "x2", (int) ( ( reportSpec.getHorizontalOffset() + widthSum + ( width * 0.90 ) ) ) + (
                    f.getIsWidthPercent() ? "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y2", ( yShift + fontSize + 8 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            } else if ( hAlign.equals( "right" ) ) { //$NON-NLS-1$
              lineElement
                .addAttribute(
                  "x1",
                  (int) ( reportSpec.getHorizontalOffset() + widthSum + ( width * .10 ) ) + ( f.getIsWidthPercent() ?
                    "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y1", ( fontSize + 8 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
              lineElement.addAttribute(
                "x2", ( reportSpec.getHorizontalOffset() + widthSum + width ) + ( f.getIsWidthPercent() ? "%" :
                  "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
              lineElement.addAttribute( "y2", ( fontSize + 8 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
            }
          }
        }
      }
      widthSum += width;
    }
    String xStr = "0"; //$NON-NLS-1$
    if ( foundCalc ) {
      Element messageField = groupFooter.addElement( ReportSpecUtility.MESSAGE_FIELD );
      messageField.addAttribute( "height", ( fontSize + 4 ) + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      // look for x coordinate of potentially matching column in headers
      // use group to look in details[]
      Field foundColumn = null;
      double cumulativeWidth = 0;
      if ( details != null && group != null ) {
        for ( int x = 0; x < details.length; x++ ) {
          if ( details[ x ].getName().equalsIgnoreCase( group.getName() ) ) {
            foundColumn = details[ x ];
            break;
          }
          cumulativeWidth += details[ x ].getWidth().doubleValue();
        }
      }
      if ( foundColumn != null ) {
        double tmpwidth = reportSpec.getHorizontalOffset() + cumulativeWidth;
        xStr = tmpwidth + ( foundColumn.getIsWidthPercent() ? "%" : "" ); //$NON-NLS-1$ //$NON-NLS-2$
        messageField.addAttribute( "x", xStr ); //$NON-NLS-1$
        messageField.addAttribute( "width", ( totalLabelWidth - tmpwidth ) + ( details[ 0 ].getIsWidthPercent() ? "%" :
          "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      } else {
        xStr = reportSpec.getHorizontalOffset() + ( details[ 0 ].getIsWidthPercent() ? "%" :
          "" ); //$NON-NLS-1$ //$NON-NLS-2$
        messageField.addAttribute( "x", xStr ); //$NON-NLS-1$
        messageField.addAttribute( "width",
          totalLabelWidth + ( details[ 0 ].getIsWidthPercent() ? "%" : "" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      }
      messageField.addAttribute( "y", ( reportSpec.getUseExpressionUnderlining() ? ( yShift + 3 ) : ( yShift + 2 ) )
        + "" ); //$NON-NLS-1$ //$NON-NLS-2$
      messageField
        .addAttribute(
          "alignment", group != null ? group.getGroupTotalsHorizontalAlignment() :
            reportSpec.getGrandTotalsHorizontalAlignment() ); //$NON-NLS-1$
      messageField.addAttribute( "vertical-alignment", "middle" ); //$NON-NLS-1$ //$NON-NLS-2$
      messageField.setText( group != null ? group.getGroupTotalsLabel() : reportSpec.getGrandTotalsLabel() );
    }
    return xStr;
  }

  /**
   * Add the appropriate elements to the configuration element so that JFree Report
   * can determine the encoding for HTML and PDF output. In particular, add
   * this XML to the configuration node:
   * <p>
   * <property name="org.jfree.report.modules.output.table.html.Encoding">UTF-8</property>
   * <property name="org.jfree.report.modules.output.pageable.pdf.Encoding">UTF-8</property>
   *
   * @param configuration Element the configuration element of the JFree Report XML document.
   * @param encoding      String The name of a supported {@link java.nio.charset.Charset </code>charset<code>}
   */
  private static void addEncoding( Element configuration, String encoding ) {
    Element property = configuration.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "org.jfree.report.modules.output.table.html.Encoding" ); //$NON-NLS-1$
    //property.addAttribute( NAME_ATTRIBUTE_NAME, HtmlTableModule.ENCODING );
    property.setText( encoding );

    property = configuration.addElement( PROPERTY_ELEMENT_NAME );
    property.addAttribute( NAME_ATTRIBUTE_NAME, "org.jfree.report.modules.output.pageable.pdf.Encoding" ); //$NON-NLS-1$
    property.setText( encoding );
  }

  public static void createJFreeReportXMLAsStream( ReportSpec reportSpec, String encoding, OutputStream outputStream ) {
    createJFreeReportXML( reportSpec, outputStream, encoding, 0, 0, false, "", 0, 0 ); //$NON-NLS-1$
  }

  public static String createJFreeReportXML( ReportSpec reportSpec, String encoding ) {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    createJFreeReportXMLAsStream( reportSpec, encoding, outputStream );
    return new String( outputStream.toByteArray() );
  }

  /**
   * @param reportSpec
   * @param outputStream
   * @param pageWidth
   * @param pageHeight
   * @param createTotalColumn
   * @param totalColumnName
   * @param totalColumnWidth
   * @param spacerWidth
   * @deprecated The caller needs to be able to specify the character encoding for the information in the reportSpec.
   * This method does not allow the caller to do that. Instead use: void createJFreeReportXML(ReportSpec reportSpec,
   * OutputStream outputStream, String encoding, int pageWidth, int pageHeight, boolean createTotalColumn, String
   * totalColumnName, int totalColumnWidth, int spacerWidth)
   */
  public static void createJFreeReportXML( ReportSpec reportSpec, OutputStream outputStream, int pageWidth,
                                           int pageHeight, boolean createTotalColumn, String totalColumnName,
                                           int totalColumnWidth, int spacerWidth ) {

    createJFreeReportXML( reportSpec, outputStream, null, pageWidth,
      pageHeight, createTotalColumn, totalColumnName, totalColumnWidth, spacerWidth );
  }

  /**
   * From the report description in the <param>reportSpec</param> parameter, create
   * a JFree Report report definition in XML format, and return the XML via
   * the <param>outputStream</param> parameter.
   *
   * @param reportSpec
   * @param outputStream
   * @param encoding
   * @param pageWidth
   * @param pageHeight
   * @param createTotalColumn
   * @param totalColumnName
   * @param totalColumnWidth
   * @param spacerWidth
   */
  public static void createJFreeReportXML( ReportSpec reportSpec, OutputStream outputStream, String encoding,
                                           int pageWidth, int pageHeight, boolean createTotalColumn,
                                           String totalColumnName, int totalColumnWidth,
                                           int spacerWidth ) {

    Field fields[] = reportSpec.getField();
    Field details[] = ReportSpecUtility.getDetails( fields );
    Field groups[] = ReportSpecUtility.getGroups( fields );
    List spaceFields = setupSpaceFields( fields );
    try {
      boolean expressionExists = ReportSpecUtility.doesExpressionExist( fields );
      setupDetailFieldWidths( reportSpec, details );
      int itemRowHeight = ReportSpecUtility.getRowHeight( reportSpec, details );
      // dom4j
      Document document = DOMDocumentFactory.getInstance().createDocument();

      document
        .addDocType(
          "report", "-//JFreeReport//DTD report definition//EN//simple/version 0.8.5",
          "http://jfreereport.sourceforge.net/report-085.dtd" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      org.dom4j.Element reportNode = document.addElement( "report" ); //$NON-NLS-1$
      Element configuration = reportNode.addElement( CONFIGURATION_ELEMENT_NAME );

      if ( null != encoding ) {
        document.setXMLEncoding( encoding );
        addEncoding( configuration, encoding );
      }

      // reportNode.addAttribute("xmlns", "http://jfreereport.sourceforge.net/namespaces/reports/legacy/simple");
      // add parser-config to generated report
      addParserConfig( reportSpec, reportNode );
      // set report name
      reportNode.addAttribute( NAME_ATTRIBUTE_NAME, StringEscapeUtils.escapeXml( reportSpec.getReportName() ) );
      // set orientation
      reportNode.addAttribute( "orientation", reportSpec.getOrientation() ); //$NON-NLS-1$
      // set page-format or page width/height
      setPageFormat( reportSpec, reportNode, pageWidth, pageHeight );
      // set margins
      setMargins( reportSpec, reportNode );
      if ( reportSpec.getIncludeSrc() != null && !"".equalsIgnoreCase( reportSpec.getIncludeSrc() ) ) { //$NON-NLS-1$
        org.dom4j.Element includeElement = reportNode.addElement( "include" ); //$NON-NLS-1$
        includeElement.addAttribute( "src",
          "file://" + reportSpec.getIncludeSrc().replace( '\\', '/' ) ); //$NON-NLS-1$ //$NON-NLS-2$
      }
      // set watermark
      setWatermark( reportSpec, reportNode );
      Element groupsNode = reportNode.addElement( "groups" ); //$NON-NLS-1$
      Element itemsNode = reportNode.addElement( "items" ); //$NON-NLS-1$
      Element functionNode = reportNode.addElement( "functions" ); //$NON-NLS-1$
      if ( reportSpec.getChart() != null && reportSpec.getUseChart() ) {
        Element reportHeaderElement = reportNode.addElement( "reportheader" ); //$NON-NLS-1$
        addChartElement( reportSpec, null, functionNode, reportHeaderElement, 0 );
      }
      setItemsFont( reportSpec, itemsNode );
      // create banding rectangle if banding is turned on
      createRowBanding( reportSpec, details, itemsNode, functionNode, itemRowHeight );
      // programatically create details section
      processDetailsSection( reportSpec, details, groups, itemsNode, functionNode, itemRowHeight );
      // programatically create groups section
      processGroupsSection( reportSpec, details, groups, groupsNode, functionNode, itemRowHeight, expressionExists,
        spacerWidth );

      // spit out report xml definition
      OutputFormat format = OutputFormat.createPrettyPrint();
      if ( null != encoding ) {
        format.setEncoding( encoding );   // TODO sbarkull, not sure this is necessary
      }
      XMLWriter writer = new XMLWriter( outputStream, format );
      writer.write( document );
      writer.close();
      // put _SPACE_ fields back in place as they were
      for ( int i = 0; i < spaceFields.size(); i++ ) {
        Field f = (Field) spaceFields.get( i );
        f.setName( "_SPACE_" + ( i + 1 ) ); //$NON-NLS-1$
        f.setDisplayName( "_SPACE_" + ( i + 1 ) ); //$NON-NLS-1$
      }
    } catch ( Exception e ) {
      getLogger().error( e.getMessage(), e );
    }
  }
}
