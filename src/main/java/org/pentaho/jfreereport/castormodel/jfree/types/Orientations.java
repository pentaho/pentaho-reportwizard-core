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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.9</a>, using an XML
 * Schema.
 * $Id$
 */

package org.pentaho.jfreereport.castormodel.jfree.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;
import java.util.Vector;

/**
 * Class Orientations.
 * 
 * @version $Revision$ $Date$
 */
public class Orientations implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The portrait type
     */
    public static final int PORTRAIT_TYPE = 0;

    /**
     * The instance of the portrait type
     */
    public static final Orientations PORTRAIT = new Orientations(PORTRAIT_TYPE, "portrait"); //$NON-NLS-1$

    /**
     * The landscape type
     */
    public static final int LANDSCAPE_TYPE = 1;

    /**
     * The instance of the landscape type
     */
    public static final Orientations LANDSCAPE = new Orientations(LANDSCAPE_TYPE, "landscape"); //$NON-NLS-1$

    /**
     * The reverse_landscape type
     */
    public static final int REVERSE_LANDSCAPE_TYPE = 2;

    /**
     * The instance of the reverse_landscape type
     */
    public static final Orientations REVERSE_LANDSCAPE = new Orientations(REVERSE_LANDSCAPE_TYPE, "reverse_landscape"); //$NON-NLS-1$

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

    /**
     * Field propertyChangeListeners
     */
    private java.util.Vector propertyChangeListeners;


      //----------------/
     //- Constructors -/
    //----------------/

    private Orientations(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
        propertyChangeListeners = new Vector();
    } //-- org.pentaho.jfreereport.castormodel.jfree.types.Orientations(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPropertyChangeListener
     * 
     * Registers a PropertyChangeListener with this class.
     * 
     * @param pcl The PropertyChangeListener to register.
     */
    public void addPropertyChangeListener(java.beans.PropertyChangeListener pcl)
    {
        propertyChangeListeners.addElement(pcl);
    } //-- void addPropertyChangeListener(java.beans.PropertyChangeListener) 

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * Orientations
     * 
     * @return Enumeration
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getType
     * 
     * Returns the type of this Orientations
     * 
     * @return int
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method notifyPropertyChangeListeners
     * 
     * Notifies all registered PropertyChangeListeners when a bound
     * property's value changes.
     * 
     * @param fieldName the name of the property that has changed.
     * @param newValue the new value of the property.
     * @param oldValue the old value of the property.
     */
    protected void notifyPropertyChangeListeners(java.lang.String fieldName, java.lang.Object oldValue, java.lang.Object newValue)
    {
        if (propertyChangeListeners == null) return;
        java.beans.PropertyChangeEvent event = new java.beans.PropertyChangeEvent(this, fieldName, oldValue, newValue);
        
        for (int i = 0; i < propertyChangeListeners.size(); i++) {
            ((java.beans.PropertyChangeListener) propertyChangeListeners.elementAt(i)).propertyChange(event);
        }
    } //-- void notifyPropertyChangeListeners(java.lang.String, java.lang.Object, java.lang.Object) 

    /**
     * Method removePropertyChangeListener
     * 
     * Removes the given PropertyChangeListener from this classes
     * list of ProperyChangeListeners.
     * 
     * @param pcl The PropertyChangeListener to remove.
     * @return boolean
     * @return true if the given PropertyChangeListener was removed.
     */
    public boolean removePropertyChangeListener(java.beans.PropertyChangeListener pcl)
    {
        return propertyChangeListeners.removeElement(pcl);
    } //-- boolean removePropertyChangeListener(java.beans.PropertyChangeListener) 

    /**
     * Method init
     * 
     * 
     * 
     * @return Hashtable
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("portrait", PORTRAIT); //$NON-NLS-1$
        members.put("landscape", LANDSCAPE); //$NON-NLS-1$
        members.put("reverse_landscape", REVERSE_LANDSCAPE); //$NON-NLS-1$
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method readResolve
     * 
     *  will be called during deserialization to replace the
     * deserialized object with the correct constant instance.
     * <br/>
     * 
     * @return Object
     */
    private java.lang.Object readResolve()
    {
        return valueOf(this.stringValue);
    } //-- java.lang.Object readResolve() 

    /**
     * Method toString
     * 
     * Returns the String representation of this Orientations
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOf
     * 
     * Returns a new Orientations based on the given String value.
     * 
     * @param string
     * @return Orientations
     */
    public static org.pentaho.jfreereport.castormodel.jfree.types.Orientations valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid Orientations"; //$NON-NLS-1$ //$NON-NLS-2$
            throw new IllegalArgumentException(err);
        }
        return (Orientations) obj;
    } //-- org.pentaho.jfreereport.castormodel.jfree.types.Orientations valueOf(java.lang.String) 

}
