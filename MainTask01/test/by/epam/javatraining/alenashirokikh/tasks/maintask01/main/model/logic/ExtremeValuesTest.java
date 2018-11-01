package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExtremeValuesTest {
	@Test
	public void testFindMaxValue() {
		double[] array = { 1, 7, 3, 4, 5, 6 };
		double max = 7;
		double delta = 0.001;
		assertEquals(max, ExtremeValues.findMaxValue(array), delta);
	}

	@Test
	public void testFindMinValue() {
		double[] array = { 1, 7, 3, 4, 5, 6 };
		double min = 1;
		double delta = 0.001;
		assertEquals(min, ExtremeValues.findMinValue(array), delta);
	}
}
