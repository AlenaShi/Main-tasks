package com.epam.javatraining.alenashi.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LCMTest {
	@Test
	public void testGet() {
		int a = 15;
		int b = 20;
		int result = 60;
		assertEquals(result, LCM.getLCM(a, b));
	}
}