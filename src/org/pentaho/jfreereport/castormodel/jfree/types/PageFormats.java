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
 * Class PageFormats.
 * 
 * @version $Revision$ $Date$
 */
public class PageFormats implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The PAPER10X11 type
     */
    public static final int PAPER10X11_TYPE = 0;

    /**
     * The instance of the PAPER10X11 type
     */
    public static final PageFormats PAPER10X11 = new PageFormats(PAPER10X11_TYPE, "PAPER10X11"); //$NON-NLS-1$

    /**
     * The PAPER10X13 type
     */
    public static final int PAPER10X13_TYPE = 1;

    /**
     * The instance of the PAPER10X13 type
     */
    public static final PageFormats PAPER10X13 = new PageFormats(PAPER10X13_TYPE, "PAPER10X13"); //$NON-NLS-1$

    /**
     * The PAPER10X14 type
     */
    public static final int PAPER10X14_TYPE = 2;

    /**
     * The instance of the PAPER10X14 type
     */
    public static final PageFormats PAPER10X14 = new PageFormats(PAPER10X14_TYPE, "PAPER10X14"); //$NON-NLS-1$

    /**
     * The PAPER12X11 type
     */
    public static final int PAPER12X11_TYPE = 3;

    /**
     * The instance of the PAPER12X11 type
     */
    public static final PageFormats PAPER12X11 = new PageFormats(PAPER12X11_TYPE, "PAPER12X11"); //$NON-NLS-1$

    /**
     * The PAPER15X11 type
     */
    public static final int PAPER15X11_TYPE = 4;

    /**
     * The instance of the PAPER15X11 type
     */
    public static final PageFormats PAPER15X11 = new PageFormats(PAPER15X11_TYPE, "PAPER15X11"); //$NON-NLS-1$

    /**
     * The PAPER7X9 type
     */
    public static final int PAPER7X9_TYPE = 5;

    /**
     * The instance of the PAPER7X9 type
     */
    public static final PageFormats PAPER7X9 = new PageFormats(PAPER7X9_TYPE, "PAPER7X9"); //$NON-NLS-1$

    /**
     * The PAPER8X10 type
     */
    public static final int PAPER8X10_TYPE = 6;

    /**
     * The instance of the PAPER8X10 type
     */
    public static final PageFormats PAPER8X10 = new PageFormats(PAPER8X10_TYPE, "PAPER8X10"); //$NON-NLS-1$

    /**
     * The PAPER9X11 type
     */
    public static final int PAPER9X11_TYPE = 7;

    /**
     * The instance of the PAPER9X11 type
     */
    public static final PageFormats PAPER9X11 = new PageFormats(PAPER9X11_TYPE, "PAPER9X11"); //$NON-NLS-1$

    /**
     * The PAPER9X12 type
     */
    public static final int PAPER9X12_TYPE = 8;

    /**
     * The instance of the PAPER9X12 type
     */
    public static final PageFormats PAPER9X12 = new PageFormats(PAPER9X12_TYPE, "PAPER9X12"); //$NON-NLS-1$

    /**
     * The A0 type
     */
    public static final int A0_TYPE = 9;

    /**
     * The instance of the A0 type
     */
    public static final PageFormats A0 = new PageFormats(A0_TYPE, "A0"); //$NON-NLS-1$

    /**
     * The A1 type
     */
    public static final int A1_TYPE = 10;

    /**
     * The instance of the A1 type
     */
    public static final PageFormats A1 = new PageFormats(A1_TYPE, "A1"); //$NON-NLS-1$

    /**
     * The A2 type
     */
    public static final int A2_TYPE = 11;

    /**
     * The instance of the A2 type
     */
    public static final PageFormats A2 = new PageFormats(A2_TYPE, "A2"); //$NON-NLS-1$

    /**
     * The A3 type
     */
    public static final int A3_TYPE = 12;

    /**
     * The instance of the A3 type
     */
    public static final PageFormats A3 = new PageFormats(A3_TYPE, "A3"); //$NON-NLS-1$

    /**
     * The A3_TRANSVERSE type
     */
    public static final int A3_TRANSVERSE_TYPE = 13;

    /**
     * The instance of the A3_TRANSVERSE type
     */
    public static final PageFormats A3_TRANSVERSE = new PageFormats(A3_TRANSVERSE_TYPE, "A3_TRANSVERSE"); //$NON-NLS-1$

    /**
     * The A3_EXTRA type
     */
    public static final int A3_EXTRA_TYPE = 14;

    /**
     * The instance of the A3_EXTRA type
     */
    public static final PageFormats A3_EXTRA = new PageFormats(A3_EXTRA_TYPE, "A3_EXTRA"); //$NON-NLS-1$

    /**
     * The A3_EXTRATRANSVERSE type
     */
    public static final int A3_EXTRATRANSVERSE_TYPE = 15;

    /**
     * The instance of the A3_EXTRATRANSVERSE type
     */
    public static final PageFormats A3_EXTRATRANSVERSE = new PageFormats(A3_EXTRATRANSVERSE_TYPE, "A3_EXTRATRANSVERSE"); //$NON-NLS-1$

    /**
     * The A3_ROTATED type
     */
    public static final int A3_ROTATED_TYPE = 16;

    /**
     * The instance of the A3_ROTATED type
     */
    public static final PageFormats A3_ROTATED = new PageFormats(A3_ROTATED_TYPE, "A3_ROTATED"); //$NON-NLS-1$

    /**
     * The A4 type
     */
    public static final int A4_TYPE = 17;

    /**
     * The instance of the A4 type
     */
    public static final PageFormats A4 = new PageFormats(A4_TYPE, "A4"); //$NON-NLS-1$

    /**
     * The A4_TRANSVERSE type
     */
    public static final int A4_TRANSVERSE_TYPE = 18;

    /**
     * The instance of the A4_TRANSVERSE type
     */
    public static final PageFormats A4_TRANSVERSE = new PageFormats(A4_TRANSVERSE_TYPE, "A4_TRANSVERSE"); //$NON-NLS-1$

    /**
     * The A4_EXTRA type
     */
    public static final int A4_EXTRA_TYPE = 19;

    /**
     * The instance of the A4_EXTRA type
     */
    public static final PageFormats A4_EXTRA = new PageFormats(A4_EXTRA_TYPE, "A4_EXTRA"); //$NON-NLS-1$

    /**
     * The A4_PLUS type
     */
    public static final int A4_PLUS_TYPE = 20;

    /**
     * The instance of the A4_PLUS type
     */
    public static final PageFormats A4_PLUS = new PageFormats(A4_PLUS_TYPE, "A4_PLUS"); //$NON-NLS-1$

    /**
     * The A4_ROTATED type
     */
    public static final int A4_ROTATED_TYPE = 21;

    /**
     * The instance of the A4_ROTATED type
     */
    public static final PageFormats A4_ROTATED = new PageFormats(A4_ROTATED_TYPE, "A4_ROTATED"); //$NON-NLS-1$

    /**
     * The A4_SMALL type
     */
    public static final int A4_SMALL_TYPE = 22;

    /**
     * The instance of the A4_SMALL type
     */
    public static final PageFormats A4_SMALL = new PageFormats(A4_SMALL_TYPE, "A4_SMALL"); //$NON-NLS-1$

    /**
     * The A5 type
     */
    public static final int A5_TYPE = 23;

    /**
     * The instance of the A5 type
     */
    public static final PageFormats A5 = new PageFormats(A5_TYPE, "A5"); //$NON-NLS-1$

    /**
     * The A5_TRANSVERSE type
     */
    public static final int A5_TRANSVERSE_TYPE = 24;

    /**
     * The instance of the A5_TRANSVERSE type
     */
    public static final PageFormats A5_TRANSVERSE = new PageFormats(A5_TRANSVERSE_TYPE, "A5_TRANSVERSE"); //$NON-NLS-1$

    /**
     * The A5_EXTRA type
     */
    public static final int A5_EXTRA_TYPE = 25;

    /**
     * The instance of the A5_EXTRA type
     */
    public static final PageFormats A5_EXTRA = new PageFormats(A5_EXTRA_TYPE, "A5_EXTRA"); //$NON-NLS-1$

    /**
     * The A5_ROTATED type
     */
    public static final int A5_ROTATED_TYPE = 26;

    /**
     * The instance of the A5_ROTATED type
     */
    public static final PageFormats A5_ROTATED = new PageFormats(A5_ROTATED_TYPE, "A5_ROTATED"); //$NON-NLS-1$

    /**
     * The A6 type
     */
    public static final int A6_TYPE = 27;

    /**
     * The instance of the A6 type
     */
    public static final PageFormats A6 = new PageFormats(A6_TYPE, "A6"); //$NON-NLS-1$

    /**
     * The A6_ROTATED type
     */
    public static final int A6_ROTATED_TYPE = 28;

    /**
     * The instance of the A6_ROTATED type
     */
    public static final PageFormats A6_ROTATED = new PageFormats(A6_ROTATED_TYPE, "A6_ROTATED"); //$NON-NLS-1$

    /**
     * The A7 type
     */
    public static final int A7_TYPE = 29;

    /**
     * The instance of the A7 type
     */
    public static final PageFormats A7 = new PageFormats(A7_TYPE, "A7"); //$NON-NLS-1$

    /**
     * The A8 type
     */
    public static final int A8_TYPE = 30;

    /**
     * The instance of the A8 type
     */
    public static final PageFormats A8 = new PageFormats(A8_TYPE, "A8"); //$NON-NLS-1$

    /**
     * The A9 type
     */
    public static final int A9_TYPE = 31;

    /**
     * The instance of the A9 type
     */
    public static final PageFormats A9 = new PageFormats(A9_TYPE, "A9"); //$NON-NLS-1$

    /**
     * The A10 type
     */
    public static final int A10_TYPE = 32;

    /**
     * The instance of the A10 type
     */
    public static final PageFormats A10 = new PageFormats(A10_TYPE, "A10"); //$NON-NLS-1$

    /**
     * The ANSIC type
     */
    public static final int ANSIC_TYPE = 33;

    /**
     * The instance of the ANSIC type
     */
    public static final PageFormats ANSIC = new PageFormats(ANSIC_TYPE, "ANSIC"); //$NON-NLS-1$

    /**
     * The ANSID type
     */
    public static final int ANSID_TYPE = 34;

    /**
     * The instance of the ANSID type
     */
    public static final PageFormats ANSID = new PageFormats(ANSID_TYPE, "ANSID"); //$NON-NLS-1$

    /**
     * The ANSIE type
     */
    public static final int ANSIE_TYPE = 35;

    /**
     * The instance of the ANSIE type
     */
    public static final PageFormats ANSIE = new PageFormats(ANSIE_TYPE, "ANSIE"); //$NON-NLS-1$

    /**
     * The ARCHA type
     */
    public static final int ARCHA_TYPE = 36;

    /**
     * The instance of the ARCHA type
     */
    public static final PageFormats ARCHA = new PageFormats(ARCHA_TYPE, "ARCHA"); //$NON-NLS-1$

    /**
     * The ARCHB type
     */
    public static final int ARCHB_TYPE = 37;

    /**
     * The instance of the ARCHB type
     */
    public static final PageFormats ARCHB = new PageFormats(ARCHB_TYPE, "ARCHB"); //$NON-NLS-1$

    /**
     * The ARCHC type
     */
    public static final int ARCHC_TYPE = 38;

    /**
     * The instance of the ARCHC type
     */
    public static final PageFormats ARCHC = new PageFormats(ARCHC_TYPE, "ARCHC"); //$NON-NLS-1$

    /**
     * The ARCHD type
     */
    public static final int ARCHD_TYPE = 39;

    /**
     * The instance of the ARCHD type
     */
    public static final PageFormats ARCHD = new PageFormats(ARCHD_TYPE, "ARCHD"); //$NON-NLS-1$

    /**
     * The ARCHE type
     */
    public static final int ARCHE_TYPE = 40;

    /**
     * The instance of the ARCHE type
     */
    public static final PageFormats ARCHE = new PageFormats(ARCHE_TYPE, "ARCHE"); //$NON-NLS-1$

    /**
     * The B0 type
     */
    public static final int B0_TYPE = 41;

    /**
     * The instance of the B0 type
     */
    public static final PageFormats B0 = new PageFormats(B0_TYPE, "B0"); //$NON-NLS-1$

    /**
     * The B1 type
     */
    public static final int B1_TYPE = 42;

    /**
     * The instance of the B1 type
     */
    public static final PageFormats B1 = new PageFormats(B1_TYPE, "B1"); //$NON-NLS-1$

    /**
     * The B2 type
     */
    public static final int B2_TYPE = 43;

    /**
     * The instance of the B2 type
     */
    public static final PageFormats B2 = new PageFormats(B2_TYPE, "B2"); //$NON-NLS-1$

    /**
     * The B3 type
     */
    public static final int B3_TYPE = 44;

    /**
     * The instance of the B3 type
     */
    public static final PageFormats B3 = new PageFormats(B3_TYPE, "B3"); //$NON-NLS-1$

    /**
     * The B4 type
     */
    public static final int B4_TYPE = 45;

    /**
     * The instance of the B4 type
     */
    public static final PageFormats B4 = new PageFormats(B4_TYPE, "B4"); //$NON-NLS-1$

    /**
     * The B4_ROTATED type
     */
    public static final int B4_ROTATED_TYPE = 46;

    /**
     * The instance of the B4_ROTATED type
     */
    public static final PageFormats B4_ROTATED = new PageFormats(B4_ROTATED_TYPE, "B4_ROTATED"); //$NON-NLS-1$

    /**
     * The B5 type
     */
    public static final int B5_TYPE = 47;

    /**
     * The instance of the B5 type
     */
    public static final PageFormats B5 = new PageFormats(B5_TYPE, "B5"); //$NON-NLS-1$

    /**
     * The B5_TRANSVERSE type
     */
    public static final int B5_TRANSVERSE_TYPE = 48;

    /**
     * The instance of the B5_TRANSVERSE type
     */
    public static final PageFormats B5_TRANSVERSE = new PageFormats(B5_TRANSVERSE_TYPE, "B5_TRANSVERSE"); //$NON-NLS-1$

    /**
     * The B5_ROTATED type
     */
    public static final int B5_ROTATED_TYPE = 49;

    /**
     * The instance of the B5_ROTATED type
     */
    public static final PageFormats B5_ROTATED = new PageFormats(B5_ROTATED_TYPE, "B5_ROTATED"); //$NON-NLS-1$

    /**
     * The B6 type
     */
    public static final int B6_TYPE = 50;

    /**
     * The instance of the B6 type
     */
    public static final PageFormats B6 = new PageFormats(B6_TYPE, "B6"); //$NON-NLS-1$

    /**
     * The B6_ROTATED type
     */
    public static final int B6_ROTATED_TYPE = 51;

    /**
     * The instance of the B6_ROTATED type
     */
    public static final PageFormats B6_ROTATED = new PageFormats(B6_ROTATED_TYPE, "B6_ROTATED"); //$NON-NLS-1$

    /**
     * The B7 type
     */
    public static final int B7_TYPE = 52;

    /**
     * The instance of the B7 type
     */
    public static final PageFormats B7 = new PageFormats(B7_TYPE, "B7"); //$NON-NLS-1$

    /**
     * The B8 type
     */
    public static final int B8_TYPE = 53;

    /**
     * The instance of the B8 type
     */
    public static final PageFormats B8 = new PageFormats(B8_TYPE, "B8"); //$NON-NLS-1$

    /**
     * The B9 type
     */
    public static final int B9_TYPE = 54;

    /**
     * The instance of the B9 type
     */
    public static final PageFormats B9 = new PageFormats(B9_TYPE, "B9"); //$NON-NLS-1$

    /**
     * The B10 type
     */
    public static final int B10_TYPE = 55;

    /**
     * The instance of the B10 type
     */
    public static final PageFormats B10 = new PageFormats(B10_TYPE, "B10"); //$NON-NLS-1$

    /**
     * The C4 type
     */
    public static final int C4_TYPE = 56;

    /**
     * The instance of the C4 type
     */
    public static final PageFormats C4 = new PageFormats(C4_TYPE, "C4"); //$NON-NLS-1$

    /**
     * The C5 type
     */
    public static final int C5_TYPE = 57;

    /**
     * The instance of the C5 type
     */
    public static final PageFormats C5 = new PageFormats(C5_TYPE, "C5"); //$NON-NLS-1$

    /**
     * The C6 type
     */
    public static final int C6_TYPE = 58;

    /**
     * The instance of the C6 type
     */
    public static final PageFormats C6 = new PageFormats(C6_TYPE, "C6"); //$NON-NLS-1$

    /**
     * The COMM10 type
     */
    public static final int COMM10_TYPE = 59;

    /**
     * The instance of the COMM10 type
     */
    public static final PageFormats COMM10 = new PageFormats(COMM10_TYPE, "COMM10"); //$NON-NLS-1$

    /**
     * The DL type
     */
    public static final int DL_TYPE = 60;

    /**
     * The instance of the DL type
     */
    public static final PageFormats DL = new PageFormats(DL_TYPE, "DL"); //$NON-NLS-1$

    /**
     * The DOUBLEPOSTCARD type
     */
    public static final int DOUBLEPOSTCARD_TYPE = 61;

    /**
     * The instance of the DOUBLEPOSTCARD type
     */
    public static final PageFormats DOUBLEPOSTCARD = new PageFormats(DOUBLEPOSTCARD_TYPE, "DOUBLEPOSTCARD"); //$NON-NLS-1$

    /**
     * The DOUBLEPOSTCARD_ROTATED type
     */
    public static final int DOUBLEPOSTCARD_ROTATED_TYPE = 62;

    /**
     * The instance of the DOUBLEPOSTCARD_ROTATED type
     */
    public static final PageFormats DOUBLEPOSTCARD_ROTATED = new PageFormats(DOUBLEPOSTCARD_ROTATED_TYPE, "DOUBLEPOSTCARD_ROTATED"); //$NON-NLS-1$

    /**
     * The ENV9 type
     */
    public static final int ENV9_TYPE = 63;

    /**
     * The instance of the ENV9 type
     */
    public static final PageFormats ENV9 = new PageFormats(ENV9_TYPE, "ENV9"); //$NON-NLS-1$

    /**
     * The ENV10 type
     */
    public static final int ENV10_TYPE = 64;

    /**
     * The instance of the ENV10 type
     */
    public static final PageFormats ENV10 = new PageFormats(ENV10_TYPE, "ENV10"); //$NON-NLS-1$

    /**
     * The ENV11 type
     */
    public static final int ENV11_TYPE = 65;

    /**
     * The instance of the ENV11 type
     */
    public static final PageFormats ENV11 = new PageFormats(ENV11_TYPE, "ENV11"); //$NON-NLS-1$

    /**
     * The ENV12 type
     */
    public static final int ENV12_TYPE = 66;

    /**
     * The instance of the ENV12 type
     */
    public static final PageFormats ENV12 = new PageFormats(ENV12_TYPE, "ENV12"); //$NON-NLS-1$

    /**
     * The ENV14 type
     */
    public static final int ENV14_TYPE = 67;

    /**
     * The instance of the ENV14 type
     */
    public static final PageFormats ENV14 = new PageFormats(ENV14_TYPE, "ENV14"); //$NON-NLS-1$

    /**
     * The ENVC0 type
     */
    public static final int ENVC0_TYPE = 68;

    /**
     * The instance of the ENVC0 type
     */
    public static final PageFormats ENVC0 = new PageFormats(ENVC0_TYPE, "ENVC0"); //$NON-NLS-1$

    /**
     * The ENVC1 type
     */
    public static final int ENVC1_TYPE = 69;

    /**
     * The instance of the ENVC1 type
     */
    public static final PageFormats ENVC1 = new PageFormats(ENVC1_TYPE, "ENVC1"); //$NON-NLS-1$

    /**
     * The ENVC2 type
     */
    public static final int ENVC2_TYPE = 70;

    /**
     * The instance of the ENVC2 type
     */
    public static final PageFormats ENVC2 = new PageFormats(ENVC2_TYPE, "ENVC2"); //$NON-NLS-1$

    /**
     * The ENVC3 type
     */
    public static final int ENVC3_TYPE = 71;

    /**
     * The instance of the ENVC3 type
     */
    public static final PageFormats ENVC3 = new PageFormats(ENVC3_TYPE, "ENVC3"); //$NON-NLS-1$

    /**
     * The ENVC4 type
     */
    public static final int ENVC4_TYPE = 72;

    /**
     * The instance of the ENVC4 type
     */
    public static final PageFormats ENVC4 = new PageFormats(ENVC4_TYPE, "ENVC4"); //$NON-NLS-1$

    /**
     * The ENVC5 type
     */
    public static final int ENVC5_TYPE = 73;

    /**
     * The instance of the ENVC5 type
     */
    public static final PageFormats ENVC5 = new PageFormats(ENVC5_TYPE, "ENVC5"); //$NON-NLS-1$

    /**
     * The ENVC6 type
     */
    public static final int ENVC6_TYPE = 74;

    /**
     * The instance of the ENVC6 type
     */
    public static final PageFormats ENVC6 = new PageFormats(ENVC6_TYPE, "ENVC6"); //$NON-NLS-1$

    /**
     * The ENVC65 type
     */
    public static final int ENVC65_TYPE = 75;

    /**
     * The instance of the ENVC65 type
     */
    public static final PageFormats ENVC65 = new PageFormats(ENVC65_TYPE, "ENVC65"); //$NON-NLS-1$

    /**
     * The ENVC7 type
     */
    public static final int ENVC7_TYPE = 76;

    /**
     * The instance of the ENVC7 type
     */
    public static final PageFormats ENVC7 = new PageFormats(ENVC7_TYPE, "ENVC7"); //$NON-NLS-1$

    /**
     * The ENVCHOU3 type
     */
    public static final int ENVCHOU3_TYPE = 77;

    /**
     * The instance of the ENVCHOU3 type
     */
    public static final PageFormats ENVCHOU3 = new PageFormats(ENVCHOU3_TYPE, "ENVCHOU3"); //$NON-NLS-1$

    /**
     * The ENVCHOU3_ROTATED type
     */
    public static final int ENVCHOU3_ROTATED_TYPE = 78;

    /**
     * The instance of the ENVCHOU3_ROTATED type
     */
    public static final PageFormats ENVCHOU3_ROTATED = new PageFormats(ENVCHOU3_ROTATED_TYPE, "ENVCHOU3_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVCHOU4 type
     */
    public static final int ENVCHOU4_TYPE = 79;

    /**
     * The instance of the ENVCHOU4 type
     */
    public static final PageFormats ENVCHOU4 = new PageFormats(ENVCHOU4_TYPE, "ENVCHOU4"); //$NON-NLS-1$

    /**
     * The ENVCHOU4_ROTATED type
     */
    public static final int ENVCHOU4_ROTATED_TYPE = 80;

    /**
     * The instance of the ENVCHOU4_ROTATED type
     */
    public static final PageFormats ENVCHOU4_ROTATED = new PageFormats(ENVCHOU4_ROTATED_TYPE, "ENVCHOU4_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVDL type
     */
    public static final int ENVDL_TYPE = 81;

    /**
     * The instance of the ENVDL type
     */
    public static final PageFormats ENVDL = new PageFormats(ENVDL_TYPE, "ENVDL"); //$NON-NLS-1$

    /**
     * The ENVINVITE type
     */
    public static final int ENVINVITE_TYPE = 82;

    /**
     * The instance of the ENVINVITE type
     */
    public static final PageFormats ENVINVITE = new PageFormats(ENVINVITE_TYPE, "ENVINVITE"); //$NON-NLS-1$

    /**
     * The ENVISOB4 type
     */
    public static final int ENVISOB4_TYPE = 83;

    /**
     * The instance of the ENVISOB4 type
     */
    public static final PageFormats ENVISOB4 = new PageFormats(ENVISOB4_TYPE, "ENVISOB4"); //$NON-NLS-1$

    /**
     * The ENVISOB5 type
     */
    public static final int ENVISOB5_TYPE = 84;

    /**
     * The instance of the ENVISOB5 type
     */
    public static final PageFormats ENVISOB5 = new PageFormats(ENVISOB5_TYPE, "ENVISOB5"); //$NON-NLS-1$

    /**
     * The ENVISOB6 type
     */
    public static final int ENVISOB6_TYPE = 85;

    /**
     * The instance of the ENVISOB6 type
     */
    public static final PageFormats ENVISOB6 = new PageFormats(ENVISOB6_TYPE, "ENVISOB6"); //$NON-NLS-1$

    /**
     * The ENVITALIAN type
     */
    public static final int ENVITALIAN_TYPE = 86;

    /**
     * The instance of the ENVITALIAN type
     */
    public static final PageFormats ENVITALIAN = new PageFormats(ENVITALIAN_TYPE, "ENVITALIAN"); //$NON-NLS-1$

    /**
     * The ENVKAKU2 type
     */
    public static final int ENVKAKU2_TYPE = 87;

    /**
     * The instance of the ENVKAKU2 type
     */
    public static final PageFormats ENVKAKU2 = new PageFormats(ENVKAKU2_TYPE, "ENVKAKU2"); //$NON-NLS-1$

    /**
     * The ENVKAKU2_ROTATED type
     */
    public static final int ENVKAKU2_ROTATED_TYPE = 88;

    /**
     * The instance of the ENVKAKU2_ROTATED type
     */
    public static final PageFormats ENVKAKU2_ROTATED = new PageFormats(ENVKAKU2_ROTATED_TYPE, "ENVKAKU2_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVKAKU3 type
     */
    public static final int ENVKAKU3_TYPE = 89;

    /**
     * The instance of the ENVKAKU3 type
     */
    public static final PageFormats ENVKAKU3 = new PageFormats(ENVKAKU3_TYPE, "ENVKAKU3"); //$NON-NLS-1$

    /**
     * The ENVKAKU3_ROTATED type
     */
    public static final int ENVKAKU3_ROTATED_TYPE = 90;

    /**
     * The instance of the ENVKAKU3_ROTATED type
     */
    public static final PageFormats ENVKAKU3_ROTATED = new PageFormats(ENVKAKU3_ROTATED_TYPE, "ENVKAKU3_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVMONARCH type
     */
    public static final int ENVMONARCH_TYPE = 91;

    /**
     * The instance of the ENVMONARCH type
     */
    public static final PageFormats ENVMONARCH = new PageFormats(ENVMONARCH_TYPE, "ENVMONARCH"); //$NON-NLS-1$

    /**
     * The ENVPERSONAL type
     */
    public static final int ENVPERSONAL_TYPE = 92;

    /**
     * The instance of the ENVPERSONAL type
     */
    public static final PageFormats ENVPERSONAL = new PageFormats(ENVPERSONAL_TYPE, "ENVPERSONAL"); //$NON-NLS-1$

    /**
     * The ENVPRC1 type
     */
    public static final int ENVPRC1_TYPE = 93;

    /**
     * The instance of the ENVPRC1 type
     */
    public static final PageFormats ENVPRC1 = new PageFormats(ENVPRC1_TYPE, "ENVPRC1"); //$NON-NLS-1$

    /**
     * The ENVPRC1_ROTATED type
     */
    public static final int ENVPRC1_ROTATED_TYPE = 94;

    /**
     * The instance of the ENVPRC1_ROTATED type
     */
    public static final PageFormats ENVPRC1_ROTATED = new PageFormats(ENVPRC1_ROTATED_TYPE, "ENVPRC1_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVPRC2 type
     */
    public static final int ENVPRC2_TYPE = 95;

    /**
     * The instance of the ENVPRC2 type
     */
    public static final PageFormats ENVPRC2 = new PageFormats(ENVPRC2_TYPE, "ENVPRC2"); //$NON-NLS-1$

    /**
     * The ENVPRC2_ROTATED type
     */
    public static final int ENVPRC2_ROTATED_TYPE = 96;

    /**
     * The instance of the ENVPRC2_ROTATED type
     */
    public static final PageFormats ENVPRC2_ROTATED = new PageFormats(ENVPRC2_ROTATED_TYPE, "ENVPRC2_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVPRC3 type
     */
    public static final int ENVPRC3_TYPE = 97;

    /**
     * The instance of the ENVPRC3 type
     */
    public static final PageFormats ENVPRC3 = new PageFormats(ENVPRC3_TYPE, "ENVPRC3"); //$NON-NLS-1$

    /**
     * The ENVPRC3_ROTATED type
     */
    public static final int ENVPRC3_ROTATED_TYPE = 98;

    /**
     * The instance of the ENVPRC3_ROTATED type
     */
    public static final PageFormats ENVPRC3_ROTATED = new PageFormats(ENVPRC3_ROTATED_TYPE, "ENVPRC3_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVPRC4 type
     */
    public static final int ENVPRC4_TYPE = 99;

    /**
     * The instance of the ENVPRC4 type
     */
    public static final PageFormats ENVPRC4 = new PageFormats(ENVPRC4_TYPE, "ENVPRC4"); //$NON-NLS-1$

    /**
     * The ENVPRC4_ROTATED type
     */
    public static final int ENVPRC4_ROTATED_TYPE = 100;

    /**
     * The instance of the ENVPRC4_ROTATED type
     */
    public static final PageFormats ENVPRC4_ROTATED = new PageFormats(ENVPRC4_ROTATED_TYPE, "ENVPRC4_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVPRC5 type
     */
    public static final int ENVPRC5_TYPE = 101;

    /**
     * The instance of the ENVPRC5 type
     */
    public static final PageFormats ENVPRC5 = new PageFormats(ENVPRC5_TYPE, "ENVPRC5"); //$NON-NLS-1$

    /**
     * The ENVPRC5_ROTATED type
     */
    public static final int ENVPRC5_ROTATED_TYPE = 102;

    /**
     * The instance of the ENVPRC5_ROTATED type
     */
    public static final PageFormats ENVPRC5_ROTATED = new PageFormats(ENVPRC5_ROTATED_TYPE, "ENVPRC5_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVPRC6 type
     */
    public static final int ENVPRC6_TYPE = 103;

    /**
     * The instance of the ENVPRC6 type
     */
    public static final PageFormats ENVPRC6 = new PageFormats(ENVPRC6_TYPE, "ENVPRC6"); //$NON-NLS-1$

    /**
     * The ENVPRC6_ROTATED type
     */
    public static final int ENVPRC6_ROTATED_TYPE = 104;

    /**
     * The instance of the ENVPRC6_ROTATED type
     */
    public static final PageFormats ENVPRC6_ROTATED = new PageFormats(ENVPRC6_ROTATED_TYPE, "ENVPRC6_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVPRC7 type
     */
    public static final int ENVPRC7_TYPE = 105;

    /**
     * The instance of the ENVPRC7 type
     */
    public static final PageFormats ENVPRC7 = new PageFormats(ENVPRC7_TYPE, "ENVPRC7"); //$NON-NLS-1$

    /**
     * The ENVPRC7_ROTATED type
     */
    public static final int ENVPRC7_ROTATED_TYPE = 106;

    /**
     * The instance of the ENVPRC7_ROTATED type
     */
    public static final PageFormats ENVPRC7_ROTATED = new PageFormats(ENVPRC7_ROTATED_TYPE, "ENVPRC7_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVPRC8 type
     */
    public static final int ENVPRC8_TYPE = 107;

    /**
     * The instance of the ENVPRC8 type
     */
    public static final PageFormats ENVPRC8 = new PageFormats(ENVPRC8_TYPE, "ENVPRC8"); //$NON-NLS-1$

    /**
     * The ENVPRC8_ROTATED type
     */
    public static final int ENVPRC8_ROTATED_TYPE = 108;

    /**
     * The instance of the ENVPRC8_ROTATED type
     */
    public static final PageFormats ENVPRC8_ROTATED = new PageFormats(ENVPRC8_ROTATED_TYPE, "ENVPRC8_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVPRC9 type
     */
    public static final int ENVPRC9_TYPE = 109;

    /**
     * The instance of the ENVPRC9 type
     */
    public static final PageFormats ENVPRC9 = new PageFormats(ENVPRC9_TYPE, "ENVPRC9"); //$NON-NLS-1$

    /**
     * The ENVPRC9_ROTATED type
     */
    public static final int ENVPRC9_ROTATED_TYPE = 110;

    /**
     * The instance of the ENVPRC9_ROTATED type
     */
    public static final PageFormats ENVPRC9_ROTATED = new PageFormats(ENVPRC9_ROTATED_TYPE, "ENVPRC9_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVPRC10 type
     */
    public static final int ENVPRC10_TYPE = 111;

    /**
     * The instance of the ENVPRC10 type
     */
    public static final PageFormats ENVPRC10 = new PageFormats(ENVPRC10_TYPE, "ENVPRC10"); //$NON-NLS-1$

    /**
     * The ENVPRC10_ROTATED type
     */
    public static final int ENVPRC10_ROTATED_TYPE = 112;

    /**
     * The instance of the ENVPRC10_ROTATED type
     */
    public static final PageFormats ENVPRC10_ROTATED = new PageFormats(ENVPRC10_ROTATED_TYPE, "ENVPRC10_ROTATED"); //$NON-NLS-1$

    /**
     * The ENVYOU4 type
     */
    public static final int ENVYOU4_TYPE = 113;

    /**
     * The instance of the ENVYOU4 type
     */
    public static final PageFormats ENVYOU4 = new PageFormats(ENVYOU4_TYPE, "ENVYOU4"); //$NON-NLS-1$

    /**
     * The ENVYOU4_ROTATED type
     */
    public static final int ENVYOU4_ROTATED_TYPE = 114;

    /**
     * The instance of the ENVYOU4_ROTATED type
     */
    public static final PageFormats ENVYOU4_ROTATED = new PageFormats(ENVYOU4_ROTATED_TYPE, "ENVYOU4_ROTATED"); //$NON-NLS-1$

    /**
     * The EXECUTIVE type
     */
    public static final int EXECUTIVE_TYPE = 115;

    /**
     * The instance of the EXECUTIVE type
     */
    public static final PageFormats EXECUTIVE = new PageFormats(EXECUTIVE_TYPE, "EXECUTIVE"); //$NON-NLS-1$

    /**
     * The FANFOLDUS type
     */
    public static final int FANFOLDUS_TYPE = 116;

    /**
     * The instance of the FANFOLDUS type
     */
    public static final PageFormats FANFOLDUS = new PageFormats(FANFOLDUS_TYPE, "FANFOLDUS"); //$NON-NLS-1$

    /**
     * The FANFOLDGERMAN type
     */
    public static final int FANFOLDGERMAN_TYPE = 117;

    /**
     * The instance of the FANFOLDGERMAN type
     */
    public static final PageFormats FANFOLDGERMAN = new PageFormats(FANFOLDGERMAN_TYPE, "FANFOLDGERMAN"); //$NON-NLS-1$

    /**
     * The FANFOLDGERMANLEGAL type
     */
    public static final int FANFOLDGERMANLEGAL_TYPE = 118;

    /**
     * The instance of the FANFOLDGERMANLEGAL type
     */
    public static final PageFormats FANFOLDGERMANLEGAL = new PageFormats(FANFOLDGERMANLEGAL_TYPE, "FANFOLDGERMANLEGAL"); //$NON-NLS-1$

    /**
     * The FOLIO type
     */
    public static final int FOLIO_TYPE = 119;

    /**
     * The instance of the FOLIO type
     */
    public static final PageFormats FOLIO = new PageFormats(FOLIO_TYPE, "FOLIO"); //$NON-NLS-1$

    /**
     * The ISOB0 type
     */
    public static final int ISOB0_TYPE = 120;

    /**
     * The instance of the ISOB0 type
     */
    public static final PageFormats ISOB0 = new PageFormats(ISOB0_TYPE, "ISOB0"); //$NON-NLS-1$

    /**
     * The ISOB1 type
     */
    public static final int ISOB1_TYPE = 121;

    /**
     * The instance of the ISOB1 type
     */
    public static final PageFormats ISOB1 = new PageFormats(ISOB1_TYPE, "ISOB1"); //$NON-NLS-1$

    /**
     * The ISOB2 type
     */
    public static final int ISOB2_TYPE = 122;

    /**
     * The instance of the ISOB2 type
     */
    public static final PageFormats ISOB2 = new PageFormats(ISOB2_TYPE, "ISOB2"); //$NON-NLS-1$

    /**
     * The ISOB3 type
     */
    public static final int ISOB3_TYPE = 123;

    /**
     * The instance of the ISOB3 type
     */
    public static final PageFormats ISOB3 = new PageFormats(ISOB3_TYPE, "ISOB3"); //$NON-NLS-1$

    /**
     * The ISOB4 type
     */
    public static final int ISOB4_TYPE = 124;

    /**
     * The instance of the ISOB4 type
     */
    public static final PageFormats ISOB4 = new PageFormats(ISOB4_TYPE, "ISOB4"); //$NON-NLS-1$

    /**
     * The ISOB5 type
     */
    public static final int ISOB5_TYPE = 125;

    /**
     * The instance of the ISOB5 type
     */
    public static final PageFormats ISOB5 = new PageFormats(ISOB5_TYPE, "ISOB5"); //$NON-NLS-1$

    /**
     * The ISOB5_EXTRA type
     */
    public static final int ISOB5_EXTRA_TYPE = 126;

    /**
     * The instance of the ISOB5_EXTRA type
     */
    public static final PageFormats ISOB5_EXTRA = new PageFormats(ISOB5_EXTRA_TYPE, "ISOB5_EXTRA"); //$NON-NLS-1$

    /**
     * The ISOB6 type
     */
    public static final int ISOB6_TYPE = 127;

    /**
     * The instance of the ISOB6 type
     */
    public static final PageFormats ISOB6 = new PageFormats(ISOB6_TYPE, "ISOB6"); //$NON-NLS-1$

    /**
     * The ISOB7 type
     */
    public static final int ISOB7_TYPE = 128;

    /**
     * The instance of the ISOB7 type
     */
    public static final PageFormats ISOB7 = new PageFormats(ISOB7_TYPE, "ISOB7"); //$NON-NLS-1$

    /**
     * The ISOB8 type
     */
    public static final int ISOB8_TYPE = 129;

    /**
     * The instance of the ISOB8 type
     */
    public static final PageFormats ISOB8 = new PageFormats(ISOB8_TYPE, "ISOB8"); //$NON-NLS-1$

    /**
     * The ISOB9 type
     */
    public static final int ISOB9_TYPE = 130;

    /**
     * The instance of the ISOB9 type
     */
    public static final PageFormats ISOB9 = new PageFormats(ISOB9_TYPE, "ISOB9"); //$NON-NLS-1$

    /**
     * The ISOB10 type
     */
    public static final int ISOB10_TYPE = 131;

    /**
     * The instance of the ISOB10 type
     */
    public static final PageFormats ISOB10 = new PageFormats(ISOB10_TYPE, "ISOB10"); //$NON-NLS-1$

    /**
     * The LEDGER type
     */
    public static final int LEDGER_TYPE = 132;

    /**
     * The instance of the LEDGER type
     */
    public static final PageFormats LEDGER = new PageFormats(LEDGER_TYPE, "LEDGER"); //$NON-NLS-1$

    /**
     * The LEGAL type
     */
    public static final int LEGAL_TYPE = 133;

    /**
     * The instance of the LEGAL type
     */
    public static final PageFormats LEGAL = new PageFormats(LEGAL_TYPE, "LEGAL"); //$NON-NLS-1$

    /**
     * The LEGAL_EXTRA type
     */
    public static final int LEGAL_EXTRA_TYPE = 134;

    /**
     * The instance of the LEGAL_EXTRA type
     */
    public static final PageFormats LEGAL_EXTRA = new PageFormats(LEGAL_EXTRA_TYPE, "LEGAL_EXTRA"); //$NON-NLS-1$

    /**
     * The LETTER type
     */
    public static final int LETTER_TYPE = 135;

    /**
     * The instance of the LETTER type
     */
    public static final PageFormats LETTER = new PageFormats(LETTER_TYPE, "LETTER"); //$NON-NLS-1$

    /**
     * The LETTER_TRANSVERSE type
     */
    public static final int LETTER_TRANSVERSE_TYPE = 136;

    /**
     * The instance of the LETTER_TRANSVERSE type
     */
    public static final PageFormats LETTER_TRANSVERSE = new PageFormats(LETTER_TRANSVERSE_TYPE, "LETTER_TRANSVERSE"); //$NON-NLS-1$

    /**
     * The LETTER_EXTRA type
     */
    public static final int LETTER_EXTRA_TYPE = 137;

    /**
     * The instance of the LETTER_EXTRA type
     */
    public static final PageFormats LETTER_EXTRA = new PageFormats(LETTER_EXTRA_TYPE, "LETTER_EXTRA"); //$NON-NLS-1$

    /**
     * The LETTER_EXTRATRANSVERSE type
     */
    public static final int LETTER_EXTRATRANSVERSE_TYPE = 138;

    /**
     * The instance of the LETTER_EXTRATRANSVERSE type
     */
    public static final PageFormats LETTER_EXTRATRANSVERSE = new PageFormats(LETTER_EXTRATRANSVERSE_TYPE, "LETTER_EXTRATRANSVERSE"); //$NON-NLS-1$

    /**
     * The LETTER_PLUS type
     */
    public static final int LETTER_PLUS_TYPE = 139;

    /**
     * The instance of the LETTER_PLUS type
     */
    public static final PageFormats LETTER_PLUS = new PageFormats(LETTER_PLUS_TYPE, "LETTER_PLUS"); //$NON-NLS-1$

    /**
     * The LETTER_ROTATED type
     */
    public static final int LETTER_ROTATED_TYPE = 140;

    /**
     * The instance of the LETTER_ROTATED type
     */
    public static final PageFormats LETTER_ROTATED = new PageFormats(LETTER_ROTATED_TYPE, "LETTER_ROTATED"); //$NON-NLS-1$

    /**
     * The LETTER_SMALL type
     */
    public static final int LETTER_SMALL_TYPE = 141;

    /**
     * The instance of the LETTER_SMALL type
     */
    public static final PageFormats LETTER_SMALL = new PageFormats(LETTER_SMALL_TYPE, "LETTER_SMALL"); //$NON-NLS-1$

    /**
     * The MONARCH type
     */
    public static final int MONARCH_TYPE = 142;

    /**
     * The instance of the MONARCH type
     */
    public static final PageFormats MONARCH = new PageFormats(MONARCH_TYPE, "MONARCH"); //$NON-NLS-1$

    /**
     * The NOTE type
     */
    public static final int NOTE_TYPE = 143;

    /**
     * The instance of the NOTE type
     */
    public static final PageFormats NOTE = new PageFormats(NOTE_TYPE, "NOTE"); //$NON-NLS-1$

    /**
     * The POSTCARD type
     */
    public static final int POSTCARD_TYPE = 144;

    /**
     * The instance of the POSTCARD type
     */
    public static final PageFormats POSTCARD = new PageFormats(POSTCARD_TYPE, "POSTCARD"); //$NON-NLS-1$

    /**
     * The POSTCARD_ROTATED type
     */
    public static final int POSTCARD_ROTATED_TYPE = 145;

    /**
     * The instance of the POSTCARD_ROTATED type
     */
    public static final PageFormats POSTCARD_ROTATED = new PageFormats(POSTCARD_ROTATED_TYPE, "POSTCARD_ROTATED"); //$NON-NLS-1$

    /**
     * The PRC16K type
     */
    public static final int PRC16K_TYPE = 146;

    /**
     * The instance of the PRC16K type
     */
    public static final PageFormats PRC16K = new PageFormats(PRC16K_TYPE, "PRC16K"); //$NON-NLS-1$

    /**
     * The PRC16K_ROTATED type
     */
    public static final int PRC16K_ROTATED_TYPE = 147;

    /**
     * The instance of the PRC16K_ROTATED type
     */
    public static final PageFormats PRC16K_ROTATED = new PageFormats(PRC16K_ROTATED_TYPE, "PRC16K_ROTATED"); //$NON-NLS-1$

    /**
     * The PRC32K type
     */
    public static final int PRC32K_TYPE = 148;

    /**
     * The instance of the PRC32K type
     */
    public static final PageFormats PRC32K = new PageFormats(PRC32K_TYPE, "PRC32K"); //$NON-NLS-1$

    /**
     * The PRC32K_ROTATED type
     */
    public static final int PRC32K_ROTATED_TYPE = 149;

    /**
     * The instance of the PRC32K_ROTATED type
     */
    public static final PageFormats PRC32K_ROTATED = new PageFormats(PRC32K_ROTATED_TYPE, "PRC32K_ROTATED"); //$NON-NLS-1$

    /**
     * The PRC32K_BIG type
     */
    public static final int PRC32K_BIG_TYPE = 150;

    /**
     * The instance of the PRC32K_BIG type
     */
    public static final PageFormats PRC32K_BIG = new PageFormats(PRC32K_BIG_TYPE, "PRC32K_BIG"); //$NON-NLS-1$

    /**
     * The PRC32K_BIGROTATED type
     */
    public static final int PRC32K_BIGROTATED_TYPE = 151;

    /**
     * The instance of the PRC32K_BIGROTATED type
     */
    public static final PageFormats PRC32K_BIGROTATED = new PageFormats(PRC32K_BIGROTATED_TYPE, "PRC32K_BIGROTATED"); //$NON-NLS-1$

    /**
     * The QUARTO type
     */
    public static final int QUARTO_TYPE = 152;

    /**
     * The instance of the QUARTO type
     */
    public static final PageFormats QUARTO = new PageFormats(QUARTO_TYPE, "QUARTO"); //$NON-NLS-1$

    /**
     * The STATEMENT type
     */
    public static final int STATEMENT_TYPE = 153;

    /**
     * The instance of the STATEMENT type
     */
    public static final PageFormats STATEMENT = new PageFormats(STATEMENT_TYPE, "STATEMENT"); //$NON-NLS-1$

    /**
     * The SUPERA type
     */
    public static final int SUPERA_TYPE = 154;

    /**
     * The instance of the SUPERA type
     */
    public static final PageFormats SUPERA = new PageFormats(SUPERA_TYPE, "SUPERA"); //$NON-NLS-1$

    /**
     * The SUPERB type
     */
    public static final int SUPERB_TYPE = 155;

    /**
     * The instance of the SUPERB type
     */
    public static final PageFormats SUPERB = new PageFormats(SUPERB_TYPE, "SUPERB"); //$NON-NLS-1$

    /**
     * The TABLOID type
     */
    public static final int TABLOID_TYPE = 156;

    /**
     * The instance of the TABLOID type
     */
    public static final PageFormats TABLOID = new PageFormats(TABLOID_TYPE, "TABLOID"); //$NON-NLS-1$

    /**
     * The TABLOIDEXTRA type
     */
    public static final int TABLOIDEXTRA_TYPE = 157;

    /**
     * The instance of the TABLOIDEXTRA type
     */
    public static final PageFormats TABLOIDEXTRA = new PageFormats(TABLOIDEXTRA_TYPE, "TABLOIDEXTRA"); //$NON-NLS-1$

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

    private PageFormats(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
        propertyChangeListeners = new Vector();
    } //-- org.pentaho.jfreereport.castormodel.jfree.types.PageFormats(int, java.lang.String)


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
     * PageFormats
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
     * Returns the type of this PageFormats
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
        members.put("PAPER10X11", PAPER10X11); //$NON-NLS-1$
        members.put("PAPER10X13", PAPER10X13); //$NON-NLS-1$
        members.put("PAPER10X14", PAPER10X14); //$NON-NLS-1$
        members.put("PAPER12X11", PAPER12X11); //$NON-NLS-1$
        members.put("PAPER15X11", PAPER15X11); //$NON-NLS-1$
        members.put("PAPER7X9", PAPER7X9); //$NON-NLS-1$
        members.put("PAPER8X10", PAPER8X10); //$NON-NLS-1$
        members.put("PAPER9X11", PAPER9X11); //$NON-NLS-1$
        members.put("PAPER9X12", PAPER9X12); //$NON-NLS-1$
        members.put("A0", A0); //$NON-NLS-1$
        members.put("A1", A1); //$NON-NLS-1$
        members.put("A2", A2); //$NON-NLS-1$
        members.put("A3", A3); //$NON-NLS-1$
        members.put("A3_TRANSVERSE", A3_TRANSVERSE); //$NON-NLS-1$
        members.put("A3_EXTRA", A3_EXTRA); //$NON-NLS-1$
        members.put("A3_EXTRATRANSVERSE", A3_EXTRATRANSVERSE); //$NON-NLS-1$
        members.put("A3_ROTATED", A3_ROTATED); //$NON-NLS-1$
        members.put("A4", A4); //$NON-NLS-1$
        members.put("A4_TRANSVERSE", A4_TRANSVERSE); //$NON-NLS-1$
        members.put("A4_EXTRA", A4_EXTRA); //$NON-NLS-1$
        members.put("A4_PLUS", A4_PLUS); //$NON-NLS-1$
        members.put("A4_ROTATED", A4_ROTATED); //$NON-NLS-1$
        members.put("A4_SMALL", A4_SMALL); //$NON-NLS-1$
        members.put("A5", A5); //$NON-NLS-1$
        members.put("A5_TRANSVERSE", A5_TRANSVERSE); //$NON-NLS-1$
        members.put("A5_EXTRA", A5_EXTRA); //$NON-NLS-1$
        members.put("A5_ROTATED", A5_ROTATED); //$NON-NLS-1$
        members.put("A6", A6); //$NON-NLS-1$
        members.put("A6_ROTATED", A6_ROTATED); //$NON-NLS-1$
        members.put("A7", A7); //$NON-NLS-1$
        members.put("A8", A8); //$NON-NLS-1$
        members.put("A9", A9); //$NON-NLS-1$
        members.put("A10", A10); //$NON-NLS-1$
        members.put("ANSIC", ANSIC); //$NON-NLS-1$
        members.put("ANSID", ANSID); //$NON-NLS-1$
        members.put("ANSIE", ANSIE); //$NON-NLS-1$
        members.put("ARCHA", ARCHA); //$NON-NLS-1$
        members.put("ARCHB", ARCHB); //$NON-NLS-1$
        members.put("ARCHC", ARCHC); //$NON-NLS-1$
        members.put("ARCHD", ARCHD); //$NON-NLS-1$
        members.put("ARCHE", ARCHE); //$NON-NLS-1$
        members.put("B0", B0); //$NON-NLS-1$
        members.put("B1", B1); //$NON-NLS-1$
        members.put("B2", B2); //$NON-NLS-1$
        members.put("B3", B3); //$NON-NLS-1$
        members.put("B4", B4); //$NON-NLS-1$
        members.put("B4_ROTATED", B4_ROTATED); //$NON-NLS-1$
        members.put("B5", B5); //$NON-NLS-1$
        members.put("B5_TRANSVERSE", B5_TRANSVERSE); //$NON-NLS-1$
        members.put("B5_ROTATED", B5_ROTATED); //$NON-NLS-1$
        members.put("B6", B6); //$NON-NLS-1$
        members.put("B6_ROTATED", B6_ROTATED); //$NON-NLS-1$
        members.put("B7", B7); //$NON-NLS-1$
        members.put("B8", B8); //$NON-NLS-1$
        members.put("B9", B9); //$NON-NLS-1$
        members.put("B10", B10); //$NON-NLS-1$
        members.put("C4", C4); //$NON-NLS-1$
        members.put("C5", C5); //$NON-NLS-1$
        members.put("C6", C6); //$NON-NLS-1$
        members.put("COMM10", COMM10); //$NON-NLS-1$
        members.put("DL", DL); //$NON-NLS-1$
        members.put("DOUBLEPOSTCARD", DOUBLEPOSTCARD); //$NON-NLS-1$
        members.put("DOUBLEPOSTCARD_ROTATED", DOUBLEPOSTCARD_ROTATED); //$NON-NLS-1$
        members.put("ENV9", ENV9); //$NON-NLS-1$
        members.put("ENV10", ENV10); //$NON-NLS-1$
        members.put("ENV11", ENV11); //$NON-NLS-1$
        members.put("ENV12", ENV12); //$NON-NLS-1$
        members.put("ENV14", ENV14); //$NON-NLS-1$
        members.put("ENVC0", ENVC0); //$NON-NLS-1$
        members.put("ENVC1", ENVC1); //$NON-NLS-1$
        members.put("ENVC2", ENVC2); //$NON-NLS-1$
        members.put("ENVC3", ENVC3); //$NON-NLS-1$
        members.put("ENVC4", ENVC4); //$NON-NLS-1$
        members.put("ENVC5", ENVC5); //$NON-NLS-1$
        members.put("ENVC6", ENVC6); //$NON-NLS-1$
        members.put("ENVC65", ENVC65); //$NON-NLS-1$
        members.put("ENVC7", ENVC7); //$NON-NLS-1$
        members.put("ENVCHOU3", ENVCHOU3); //$NON-NLS-1$
        members.put("ENVCHOU3_ROTATED", ENVCHOU3_ROTATED); //$NON-NLS-1$
        members.put("ENVCHOU4", ENVCHOU4); //$NON-NLS-1$
        members.put("ENVCHOU4_ROTATED", ENVCHOU4_ROTATED); //$NON-NLS-1$
        members.put("ENVDL", ENVDL); //$NON-NLS-1$
        members.put("ENVINVITE", ENVINVITE); //$NON-NLS-1$
        members.put("ENVISOB4", ENVISOB4); //$NON-NLS-1$
        members.put("ENVISOB5", ENVISOB5); //$NON-NLS-1$
        members.put("ENVISOB6", ENVISOB6); //$NON-NLS-1$
        members.put("ENVITALIAN", ENVITALIAN); //$NON-NLS-1$
        members.put("ENVKAKU2", ENVKAKU2); //$NON-NLS-1$
        members.put("ENVKAKU2_ROTATED", ENVKAKU2_ROTATED); //$NON-NLS-1$
        members.put("ENVKAKU3", ENVKAKU3); //$NON-NLS-1$
        members.put("ENVKAKU3_ROTATED", ENVKAKU3_ROTATED); //$NON-NLS-1$
        members.put("ENVMONARCH", ENVMONARCH); //$NON-NLS-1$
        members.put("ENVPERSONAL", ENVPERSONAL); //$NON-NLS-1$
        members.put("ENVPRC1", ENVPRC1); //$NON-NLS-1$
        members.put("ENVPRC1_ROTATED", ENVPRC1_ROTATED); //$NON-NLS-1$
        members.put("ENVPRC2", ENVPRC2); //$NON-NLS-1$
        members.put("ENVPRC2_ROTATED", ENVPRC2_ROTATED); //$NON-NLS-1$
        members.put("ENVPRC3", ENVPRC3); //$NON-NLS-1$
        members.put("ENVPRC3_ROTATED", ENVPRC3_ROTATED); //$NON-NLS-1$
        members.put("ENVPRC4", ENVPRC4); //$NON-NLS-1$
        members.put("ENVPRC4_ROTATED", ENVPRC4_ROTATED); //$NON-NLS-1$
        members.put("ENVPRC5", ENVPRC5); //$NON-NLS-1$
        members.put("ENVPRC5_ROTATED", ENVPRC5_ROTATED); //$NON-NLS-1$
        members.put("ENVPRC6", ENVPRC6); //$NON-NLS-1$
        members.put("ENVPRC6_ROTATED", ENVPRC6_ROTATED); //$NON-NLS-1$
        members.put("ENVPRC7", ENVPRC7); //$NON-NLS-1$
        members.put("ENVPRC7_ROTATED", ENVPRC7_ROTATED); //$NON-NLS-1$
        members.put("ENVPRC8", ENVPRC8); //$NON-NLS-1$
        members.put("ENVPRC8_ROTATED", ENVPRC8_ROTATED); //$NON-NLS-1$
        members.put("ENVPRC9", ENVPRC9); //$NON-NLS-1$
        members.put("ENVPRC9_ROTATED", ENVPRC9_ROTATED); //$NON-NLS-1$
        members.put("ENVPRC10", ENVPRC10); //$NON-NLS-1$
        members.put("ENVPRC10_ROTATED", ENVPRC10_ROTATED); //$NON-NLS-1$
        members.put("ENVYOU4", ENVYOU4); //$NON-NLS-1$
        members.put("ENVYOU4_ROTATED", ENVYOU4_ROTATED); //$NON-NLS-1$
        members.put("EXECUTIVE", EXECUTIVE); //$NON-NLS-1$
        members.put("FANFOLDUS", FANFOLDUS); //$NON-NLS-1$
        members.put("FANFOLDGERMAN", FANFOLDGERMAN); //$NON-NLS-1$
        members.put("FANFOLDGERMANLEGAL", FANFOLDGERMANLEGAL); //$NON-NLS-1$
        members.put("FOLIO", FOLIO); //$NON-NLS-1$
        members.put("ISOB0", ISOB0); //$NON-NLS-1$
        members.put("ISOB1", ISOB1); //$NON-NLS-1$
        members.put("ISOB2", ISOB2); //$NON-NLS-1$
        members.put("ISOB3", ISOB3); //$NON-NLS-1$
        members.put("ISOB4", ISOB4); //$NON-NLS-1$
        members.put("ISOB5", ISOB5); //$NON-NLS-1$
        members.put("ISOB5_EXTRA", ISOB5_EXTRA); //$NON-NLS-1$
        members.put("ISOB6", ISOB6); //$NON-NLS-1$
        members.put("ISOB7", ISOB7); //$NON-NLS-1$
        members.put("ISOB8", ISOB8); //$NON-NLS-1$
        members.put("ISOB9", ISOB9); //$NON-NLS-1$
        members.put("ISOB10", ISOB10); //$NON-NLS-1$
        members.put("LEDGER", LEDGER); //$NON-NLS-1$
        members.put("LEGAL", LEGAL); //$NON-NLS-1$
        members.put("LEGAL_EXTRA", LEGAL_EXTRA); //$NON-NLS-1$
        members.put("LETTER", LETTER); //$NON-NLS-1$
        members.put("LETTER_TRANSVERSE", LETTER_TRANSVERSE); //$NON-NLS-1$
        members.put("LETTER_EXTRA", LETTER_EXTRA); //$NON-NLS-1$
        members.put("LETTER_EXTRATRANSVERSE", LETTER_EXTRATRANSVERSE); //$NON-NLS-1$
        members.put("LETTER_PLUS", LETTER_PLUS); //$NON-NLS-1$
        members.put("LETTER_ROTATED", LETTER_ROTATED); //$NON-NLS-1$
        members.put("LETTER_SMALL", LETTER_SMALL); //$NON-NLS-1$
        members.put("MONARCH", MONARCH); //$NON-NLS-1$
        members.put("NOTE", NOTE); //$NON-NLS-1$
        members.put("POSTCARD", POSTCARD); //$NON-NLS-1$
        members.put("POSTCARD_ROTATED", POSTCARD_ROTATED); //$NON-NLS-1$
        members.put("PRC16K", PRC16K); //$NON-NLS-1$
        members.put("PRC16K_ROTATED", PRC16K_ROTATED); //$NON-NLS-1$
        members.put("PRC32K", PRC32K); //$NON-NLS-1$
        members.put("PRC32K_ROTATED", PRC32K_ROTATED); //$NON-NLS-1$
        members.put("PRC32K_BIG", PRC32K_BIG); //$NON-NLS-1$
        members.put("PRC32K_BIGROTATED", PRC32K_BIGROTATED); //$NON-NLS-1$
        members.put("QUARTO", QUARTO); //$NON-NLS-1$
        members.put("STATEMENT", STATEMENT); //$NON-NLS-1$
        members.put("SUPERA", SUPERA); //$NON-NLS-1$
        members.put("SUPERB", SUPERB); //$NON-NLS-1$
        members.put("TABLOID", TABLOID); //$NON-NLS-1$
        members.put("TABLOIDEXTRA", TABLOIDEXTRA); //$NON-NLS-1$
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
     * Returns the String representation of this PageFormats
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
     * Returns a new PageFormats based on the given String value.
     * 
     * @param string
     * @return PageFormats
     */
    public static org.pentaho.jfreereport.castormodel.jfree.types.PageFormats valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid PageFormats"; //$NON-NLS-1$ //$NON-NLS-2$
            throw new IllegalArgumentException(err);
        }
        return (PageFormats) obj;
    } //-- org.pentaho.jfreereport.castormodel.jfree.types.PageFormats valueOf(java.lang.String) 

}
