package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
	@Test
	public void testFindElementByBinarySearch() {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int index = 8;
		double element = 9;
		assertEquals(index, BinarySearch.findElementByBinarySearch(array, element));
	}
}
