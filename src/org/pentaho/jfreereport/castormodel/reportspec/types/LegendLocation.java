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
 * Class LegendLocation.
 * 
 * @version $Revision$ $Date$
 */
public class LegendLocation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The top type
     */
    public static final int TOP_TYPE = 0;

    /**
     * The instance of the top type
     */
    public static final LegendLocation TOP = new LegendLocation(TOP_TYPE, "top");

    /**
     * The bottom type
     */
    public static final int BOTTOM_TYPE = 1;

    /**
     * The instance of the bottom type
     */
    public static final LegendLocation BOTTOM = new LegendLocation(BOTTOM_TYPE, "bottom");

    /**
     * The left type
     */
    public static final int LEFT_TYPE = 2;

    /**
     * The instance of the left type
     */
    public static final LegendLocation LEFT = new LegendLocation(LEFT_TYPE, "left");

    /**
     * The right type
     */
    public static final int RIGHT_TYPE = 3;

    /**
     * The instance of the right type
     */
    public static final LegendLocation RIGHT = new LegendLocation(RIGHT_TYPE, "right");

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

    private LegendLocation(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * LegendLocation
     * 
     * @return an Enumeration over all possible instances of
     * LegendLocation
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getType
     * 
     * Returns the type of this LegendLocation
     * 
     * @return the type of this LegendLocation
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
        members.put("top", TOP);
        members.put("bottom", BOTTOM);
        members.put("left", LEFT);
        members.put("right", RIGHT);
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
     * Returns the String representation of this LegendLocation
     * 
     * @return the String representation of this LegendLocation
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOf
     * 
     * Returns a new LegendLocation based on the given String
     * value.
     * 
     * @param string
     * @return the LegendLocation value of parameter 'string'
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid LegendLocation";
            throw new IllegalArgumentException(err);
        }
        return (LegendLocation) obj;
    } //-- org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation valueOf(java.lang.String) 

}
