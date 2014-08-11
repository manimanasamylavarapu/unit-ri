/**
 * Unit-API - Units of Measurement API for Java
 * Copyright (c) 2014 Jean-Marie Dautelle, Werner Keil, V2COM
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package org.unitsofmeasurement.ri.util;

import static org.junit.Assert.*;
import static org.unitsofmeasurement.ri.util.SI.KILOGRAM;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;

import org.unitsofmeasurement.ri.AbstractQuantity;
import org.junit.Before;
import org.junit.Test;
import org.unitsofmeasurement.ri.util.Range;

public class RangeTest {
	private Quantity<Mass> min;
	private Quantity<Mass> max;
	private Quantity<Mass> res;
	@SuppressWarnings("rawtypes")
	private Range range;
	
	@Before
	public void init() {
		min = AbstractQuantity.of(1d, KILOGRAM);
		max = AbstractQuantity.of(10d, KILOGRAM);
		res = AbstractQuantity.of(2d, KILOGRAM);
		
		range = Range.of(min, max, res);
	}
	
	@Test
	public void testGetMinimum() {
		assertEquals(min, range.getMinimum());
	}

	@Test
	public void testGetMaximum() {
		assertEquals(max, range.getMaximum());
	}

	@Test
	public void testGetResolution() {
		assertEquals(res, range.getResolution());
	}

	@Test
	public void testToString() {
		assertEquals("min= 1.0 kg, max= 10.0 kg, res= 2.0 kg", range.toString());
	}

}