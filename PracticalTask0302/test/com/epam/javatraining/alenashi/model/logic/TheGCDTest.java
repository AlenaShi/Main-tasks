package com.epam.javatraining.alenashi.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TheGCDTest {
	@Test
	public void testGet() {
		int a = 15;
		int b = 20;
		int result = 5;
		assertEquals(result, TheGCD.getGreatestCommonDivisor(a, b));
	}
}
