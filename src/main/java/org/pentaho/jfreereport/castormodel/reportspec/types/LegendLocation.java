/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.pentaho.jfreereport.castormodel.reportspec.types;

/**
 * Enumeration LegendLocation.
 * 
 * @version $Revision$ $Date$
 */
public enum LegendLocation {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant TOP
     */
    TOP("top"),
    /**
     * Constant BOTTOM
     */
    BOTTOM("bottom"),
    /**
     * Constant LEFT
     */
    LEFT("left"),
    /**
     * Constant RIGHT
     */
    RIGHT("right");
    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, LegendLocation> enumConstants = new java.util.HashMap<java.lang.String, LegendLocation>();


    static {
        for (LegendLocation c: LegendLocation.values()) {
            LegendLocation.enumConstants.put(c.value, c);
        }

    }

    private LegendLocation(final java.lang.String value) {
        this.value = value;
    }

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.types.LegendLocation fromValue(final java.lang.String value) {
        LegendLocation c = LegendLocation.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString() {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value() {
        return this.value;
    }

}
