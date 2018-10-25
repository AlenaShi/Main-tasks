package com.epam.javatraining.alenashi.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleDividersTest {
	@Test
	public void testGetSimpleDividers() {
		int a = 72;
		String result = "The simple dividers are 1, 2, 3";
		assertEquals(result, SimpleDividers.getSimpleDividers(a));
	}

	@Test
	public void testGetSimpleDividersSimple() {
		int a = 13;
		String result = "The simple dividers are 1, 13";
		assertEquals(result, SimpleDividers.getSimpleDividers(a));
	}

	@Test
	public void testIsSimpleNumber() {
		int a = 17;
		boolean result = true;
		assertEquals(result, SimpleDividers.isSimpleNumber(a));
	}

	@Test
	public void testIsNotSimpleNumber() {
		int a = 6;
		boolean result = false;
		assertEquals(result, SimpleDividers.isSimpleNumber(a));
	}
}
