package com.epam.javatraining.alenashi.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DifferentDigitsTest {
	@Test
	public void testGet() {
		int a = 1234567890;
		int result = 10;
		assertEquals(result, DifferentDigits.getNumberOfDifferentDigits(a));
	}
}
