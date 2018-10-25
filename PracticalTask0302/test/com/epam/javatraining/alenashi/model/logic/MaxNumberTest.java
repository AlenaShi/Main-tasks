package com.epam.javatraining.alenashi.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxNumberTest {
	@Test
	public void testGetNumber() {
		int a = 1234567;
		int max = 7;
		assertEquals(max, MaxNumber.getNumber(a));
	}
}
