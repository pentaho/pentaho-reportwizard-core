/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.pentaho.jfreereport.castormodel.reportspec.types;

/**
 * Enumeration ChartType.
 * 
 * @version $Revision$ $Date$
 */
public enum ChartType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant AREA
     */
    AREA("area"),
    /**
     * Constant BAR
     */
    BAR("bar"),
    /**
     * Constant LINE
     */
    LINE("line"),
    /**
     * Constant PIE
     */
    PIE("pie"),
    /**
     * Constant PIE_MULTI
     */
    PIE_MULTI("pie-multi"),
    /**
     * Constant RING
     */
    RING("ring"),
    /**
     * Constant WATERFALL
     */
    WATERFALL("waterfall");
    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, ChartType> enumConstants = new java.util.HashMap<java.lang.String, ChartType>();


    static {
        for (ChartType c: ChartType.values()) {
            ChartType.enumConstants.put(c.value, c);
        }

    }

    private ChartType(final java.lang.String value) {
        this.value = value;
    }

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static org.pentaho.jfreereport.castormodel.reportspec.types.ChartType fromValue(final java.lang.String value) {
        ChartType c = ChartType.enumConstants.get(value);
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
