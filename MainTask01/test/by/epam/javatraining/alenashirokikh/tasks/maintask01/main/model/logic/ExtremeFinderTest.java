package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class ExtremeFinderTest {
	@Test
	public void testFindMaxValue() {
		double[] array = { 1, 7, 3, 4, 5, 6 };
		DoubleVector vector = new DoubleVector(array);
		String max = "7.0";
		assertEquals(max, ExtremeFinder.findMaxValue(vector));
	}

	@Test
	public void testFindMinValue() {
		double[] array = { 1, 7, 3, 4, 5, 6 };
		DoubleVector vector = new DoubleVector(array);
		String min = "1.0";
		assertEquals(min, ExtremeFinder.findMinValue(vector));
	}

	@Test
	public void testFindLocalMax() {
		double[] array = { 1, 2, 3 };
		DoubleVector vector = new DoubleVector(array);
		int index = 2;
		assertEquals(index, ExtremeFinder.findLocalMax(vector));
	}

	@Test
	public void testFindLocalMin() {
		double[] array = { 1, 2, 3, 5, 2, 3 };
		DoubleVector vector = new DoubleVector(array);
		int index = 0;
		assertEquals(index, ExtremeFinder.findLocalMin(vector));
	}
}
