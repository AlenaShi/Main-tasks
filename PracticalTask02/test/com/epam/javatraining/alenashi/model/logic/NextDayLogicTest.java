package com.epam.javatraining.alenashi.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NextDayLogicTest {
	@Test
	public void testNextDayLogic1() {
		int a = 28;
		int b = 2;
		int c = 1996;
		String result = "29.2.1996";
		assertEquals(result, NextDayLogic.findNextDayLogic(a, b, c));
	}

	@Test
	public void testNextDayLogic2() {
		int a = 29;
		int b = 2;
		int c = 1996;
		String result = "1.3.1996";
		assertEquals(result, NextDayLogic.findNextDayLogic(a, b, c));
	}

	@Test
	public void testNextDayLogic3() {
		int a = 29;
		int b = 2;
		int c = 2001;
		String result = "There is a mistake: wrong date";
		assertEquals(result, NextDayLogic.findNextDayLogic(a, b, c));
	}
	
}
