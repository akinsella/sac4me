/*
 * Copyright (c) 2000 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de
 * Recherche en Informatique et en Automatique, Keio University). All
 * Rights Reserved. This program is distributed under the W3C's Software
 * Intellectual Property License. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.
 * See W3C License http://www.w3.org/Consortium/Legal/ for more details.
 *
 * $Id: DescendantSelectorImpl.java,v 1.2 2000/07/27 21:32:26 plehegar Exp $
 */
package org.w3c.css.flute.parser.selectors;

import org.w3c.css.sac.DescendantSelector;
import org.w3c.css.sac.Selector;
import org.w3c.css.sac.SimpleSelector;

/**
 * @version $Revision: 1.2 $
 * @author  Philippe Le Hegaret
 */
public class DescendantSelectorImpl implements DescendantSelector {

    Selector       parent;
    SimpleSelector simpleSelector;

    /**
     * An integer indicating the type of <code>Selector</code>
     */
    public short getSelectorType() {
	return Selector.SAC_DESCENDANT_SELECTOR;
    }

    /**
     * Creates a new DescendantSelectorImpl
     */
    public DescendantSelectorImpl(Selector parent, SimpleSelector simpleSelector) {
        this.parent = parent;
	this.simpleSelector = simpleSelector;
    }
    
        
    /**
     * Returns the parent selector.
     */    
    public Selector getAncestorSelector() {
	return parent;
    }

    /*
     * Returns the simple selector.
     */    
    public SimpleSelector getSimpleSelector() {
	return simpleSelector;
    }
}
