package com.epam.javatraining.alenashi.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleNumberTest {
	@Test
	public void testIsSimpleNumber() {
		int a = 17;
		String result = "simple number";
		assertEquals(result, SimpleNumber.isSimpleNumber(a));
	}

	@Test
	public void testIsNotSimpleNumber() {
		int a = 6;
		String result = "not a simple number";
		assertEquals(result, SimpleNumber.isSimpleNumber(a));
	}
}
