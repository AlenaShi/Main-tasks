package com.epam.javatraining.alenashi.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodSensorTest {
	@Test
	public void testDetectMood2() {
		int a = 2;
		String result = ":(";
		assertEquals(result, MoodSensor.detectMood(a));
	}

	@Test
	public void testDetectMood5() {
		int a = 5;
		String result = ":|";
		assertEquals(result, MoodSensor.detectMood(a));
	}

	@Test
	public void testDetectMood10() {
		int a = 10;
		String result = ":)";
		assertEquals(result, MoodSensor.detectMood(a));
	}
}
