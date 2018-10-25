package com.epam.javatraining.alenashi.model.logic;

import org.junit.Test;

import junit.framework.Assert;

public class PerfectNumberLogicTest {
	@Test
	public void testNum() {
		int a = 6;
		int result = 6;
		Assert.assertEquals(PerfectNumberLogic.getNumber(a), result);

	}

	@Test
	public void testIsPerfect() {
		int a = 28;
		String result = "a perfect number";
		Assert.assertEquals(PerfectNumberLogic.isPerfect(a), result);
	}

	@Test
	public void testNotPerfect() {
		int a = 27;
		String result = "not a perfect number";
		Assert.assertEquals(PerfectNumberLogic.isPerfect(a), result);
	}

	@Test
	public void testGetDivider() {
		int a = 28;
		int i = 4;
		int result = 7;
		int sum = 3;
		Assert.assertEquals(PerfectNumberLogic.getDivider(sum, a, i), result);
	}

	@Test
	public void testNotGetDivider() {
		int a = 28;
		int i = 3;
		int result = 3;
		int sum = 3;
		Assert.assertEquals(PerfectNumberLogic.getDivider(sum, a, i), result);
	}
}
