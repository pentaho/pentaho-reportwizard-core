/*
* Copyright 2002 - 2013 Pentaho Corporation.  All rights reserved.
* 
* This software was developed by Pentaho Corporation and is provided under the terms
* of the Mozilla Public License, Version 1.1, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to http://www.mozilla.org/MPL/MPL-1.1.txt. TThe Initial Developer is Pentaho Corporation.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.5</a>, using an XML
 * Schema.
 * $Id$
 */

package org.pentaho.jfreereport.castormodel.reportspec.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class ChartType.
 * 
 * @version $Revision$ $Date$
 */
public class ChartType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The area type
     */
    public static final int AREA_TYPE = 0;

    /**
     * The instance of the area type
     */
    public static final ChartType AREA = new ChartType(AREA_TYPE, "area");

    /**
     * The bar type
     */
    public static final int BAR_TYPE = 1;

    /**
     * The instance of the bar type
     */
    public static final ChartType BAR = new ChartType(BAR_TYPE, "bar");

    /**
     * The line type
     */
    public static final int LINE_TYPE = 2;

    /**
     * The instance of the line type
     */
    public static final ChartType LINE = new ChartType(LINE_TYPE, "line");

    /**
     * The pie type
     */
    public static final int PIE_TYPE = 3;

    /**
     * The instance of the pie type
     */
    public static final ChartType PIE = new ChartType(PIE_TYPE, "pie");

    /**
     * The pie-multi type
     */
    public static final int PIE_MULTI_TYPE = 4;

    /**
     * The instance of the pie-multi type
     */
    public static final ChartType PIE_MULTI = new ChartType(PIE_MULTI_TYPE, "pie-multi");

    /**
     * The ring type
     */
    public static final int RING_TYPE = 5;

    /**
     * The instance of the ring type
     */
    public static final ChartType RING = new ChartType(RING_TYPE, "ring");

    /**
     * The waterfall type
     */
    public static final int WATERFALL_TYPE = 6;

    /**
     * The instance of the waterfall type
     */
    public static final ChartType WATERFALL = new ChartType(WATERFALL_TYPE, "waterfall");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private ChartType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.types.ChartType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ChartType
     * 
     * @return an Enumeration over all possible instances of
     * ChartType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getType
     * 
     * Returns the type of this ChartType
     * 
     * @return the type of this ChartType
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     * 
     * 
     * 
     * @return the initialized Hashtable for the member table
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("area", AREA);
        members.put("bar", BAR);
        members.put("line", LINE);
        members.put("pie", PIE);
        members.put("pie-multi", PIE_MULTI);
        members.put("ring", RING);
        members.put("waterfall", WATERFALL);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method readResolve
     * 
     *  will be called during deserialization to replace the
     * deserialized object with the correct constant instance.
     * 
     * @return this deserialized object
     */
    private java.lang.Object readResolve()
    {
        return valueOf(this.stringValue);
    } //-- java.lang.Object readResolve() 

    /**
     * Method toString
     * 
     * Returns the String representation of this ChartType
     * 
     * @return the String representation of this ChartType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOf
     * 
     * Returns a new ChartType based on the given String value.
     * 
     * @param string
     * @return the ChartType value of parameter 'string'
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.types.ChartType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ChartType";
            throw new IllegalArgumentException(err);
        }
        return (ChartType) obj;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.types.ChartType valueOf(java.lang.String) 

}
