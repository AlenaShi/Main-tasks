package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class SearchTest {
	@Test
	public void testFindElementByBinarySearch() {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		DoubleVector vector = new DoubleVector(array);
		int index = 8;
		double element = 9;
		assertEquals(index, Search.findElementByBinarySearch(vector, element));
	}

	@Test
	public void testFindElementByLinearSearch() {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		DoubleVector vector = new DoubleVector(array);
		int index = 14;
		int element = 15;
		assertEquals(index, Search.findElementByLinearSearch(vector, element));
	}
}
