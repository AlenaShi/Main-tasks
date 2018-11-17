package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class SearchTest {
	private DoubleVector vector = null;

	@Before
	public void init() {
		vector = new DoubleVector();
	}

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testFindElementByBinarySearch() throws NullArrayException {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		vector.setArray(array);
		int index = 8;
		double element = 9;
		assertEquals(index, Search.findElementByBinarySearch(vector, element));
	}

	@Test
	public void testNotFindByBinarySearch() throws NullArrayException {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		vector.setArray(array);
		int index = -1;
		double element = 34;
		assertEquals(index, Search.findElementByBinarySearch(vector, element));
	}

	@Test
	public void testFindElementByLinearSearch() throws NullArrayException {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		vector.setArray(array);
		int index = 14;
		int element = 15;
		assertEquals(index, Search.findElementByLinearSearch(vector, element));
	}

	@Test
	public void testNotFindByLinearSearch() throws NullArrayException {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		vector.setArray(array);
		int index = -1;
		int element = 0;
		assertEquals(index, Search.findElementByLinearSearch(vector, element));
	}

	@Test(expected = NullArrayException.class)
	public void testLinearSearchNullException() throws NullArrayException {
		vector = null;
		Search.findElementByLinearSearch(vector, 2);
	}

	@Test(expected = NullArrayException.class)
	public void testBinarySearchNullException() throws NullArrayException {
		vector = null;
		Search.findElementByBinarySearch(vector, 6);
	}
}