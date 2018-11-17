package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class ExtremeFinderTest {
	@Test
	public void testFindMaxValue() throws NullArrayException {
		double[] array = { 1, 7, 3, 4, 5, 6 };
		DoubleVector vector = new DoubleVector(array);
		double max = 7.0;
		double delta = 0.0001;
		assertEquals(max, ExtremeFinder.findMaxValue(vector), delta);
	}

	@Test
	public void testFindMinValue() throws NullArrayException {
		double[] array = { 1, 7, 3, 4, 5, 6 };
		DoubleVector vector = new DoubleVector(array);
		double min = 1.0;
		double delta = 0.0001;
		assertEquals(min, ExtremeFinder.findMinValue(vector), delta);
	}

	@Test
	public void testFindLocalMax() throws NullArrayException {
		double[] array = { 1, 2, 3 };
		DoubleVector vector = new DoubleVector(array);
		int index = 2;
		assertEquals(index, ExtremeFinder.findLocalMax(vector));
	}

	@Test
	public void testFindLocalMin() throws NullArrayException {
		double[] array = { 1, 2, 3, 5, 2, 3 };
		DoubleVector vector = new DoubleVector(array);
		int index = 0;
		assertEquals(index, ExtremeFinder.findLocalMin(vector));
	}
}
