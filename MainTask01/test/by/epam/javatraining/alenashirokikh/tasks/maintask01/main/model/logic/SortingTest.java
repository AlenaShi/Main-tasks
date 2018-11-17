package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class SortingTest {
	private DoubleVector vector;

	@Before
	public void init() {
		vector = new DoubleVector();
	}

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testDoBubbleSortAscending() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector.setArray(array);
		Sorting.doBubbleSortAscending(vector);
		double[] expected = { 2, 3, 4, 5, 6, 8, 9 };
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testBubbleSortAscendingNullException() throws NullArrayException {
		vector = null;
		Sorting.doBubbleSortAscending(vector);
	}

	@Test
	public void testDoBubbleSortDescending() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector.setArray(array);
		Sorting.doBubbleSortDescending(vector);
		double[] expected = { 9, 8, 6, 5, 4, 3, 2 };
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testBubbleSortDescendingNullException() throws NullArrayException {
		vector = null;
		Sorting.doBubbleSortDescending(vector);
	}

	@Test
	public void testDoInsertionSortAscending() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector.setArray(array);
		Sorting.doInsertionSortAscending(vector);
		double[] arrayResult = { 2, 3, 4, 5, 6, 8, 9 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		assertArrayEquals(expected.getArray(), vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testInsertionSortAscendingNullException() throws NullArrayException {
		vector = null;
		Sorting.doInsertionSortAscending(vector);
	}

	@Test
	public void testDoInsertionSortDescending() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		Sorting.doInsertionSortDescending(vector);
		double[] expected = { 9, 8, 6, 5, 4, 3, 2 };
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testInsertionSortDescendingNullException() throws NullArrayException {
		vector = null;
		Sorting.doInsertionSortDescending(vector);
	}

	@Test
	public void testDoSelectionSortAscending() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector.setArray(array);
		Sorting.doSelectionSortAscending(vector);
		double[] expected = { 2, 3, 4, 5, 6, 8, 9 };
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testSelectionSortAscendingNullException() throws NullArrayException {
		vector = null;
		Sorting.doSelectionSortAscending(vector);
	}

	@Test
	public void testDoSelectionSortDescending() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector.setArray(array);
		Sorting.doSelectionSortDescending(vector);
		double[] expected = { 9, 8, 6, 5, 4, 3, 2 };
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testSelectionSortDescendingNullException() throws NullArrayException {
		vector = null;
		Sorting.doSelectionSortDescending(vector);
	}

	@Test
	public void testDoMergeSortOneNonSortedArray() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector.setArray(array);
		vector = Sorting.doMergeSortOneNonSortedArrayAscending(vector);
		double[] expected = { 2, 3, 4, 5, 6, 8, 9 };
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testMergeSortOneArrayNullException() throws NullArrayException {
		vector = null;
		Sorting.doMergeSortOneNonSortedArrayAscending(vector);
	}

	@Test
	public void testDoMergeSortTwoSortedArraysAscending() throws NullArrayException {
		double[] array1 = { 1, 4, 8, 9, 11, 15, 17 };
		DoubleVector vector1 = new DoubleVector(array1);
		double[] array2 = { 2, 5, 6, 13, 14 };
		DoubleVector vector2 = new DoubleVector(array2);
		double[] expected = { 1, 2, 4, 5, 6, 8, 9, 11, 13, 14, 15, 17 };
		double delta = 0.001;
		DoubleVector sortVector = Sorting.doMergeSortTwoSortedArraysAscending(vector1, vector2);
		assertArrayEquals(expected, sortVector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testMergeSortTwoArrayNullException1() throws NullArrayException {
		DoubleVector vector1 = new DoubleVector();
		DoubleVector vector2 = new DoubleVector();
		vector1 = null;
		Sorting.doMergeSortTwoSortedArraysAscending(vector1, vector2);
	}

	@Test(expected = NullArrayException.class)
	public void testMergeSortTwoArrayNullException2() throws NullArrayException {
		DoubleVector vector1 = new DoubleVector();
		DoubleVector vector2 = new DoubleVector();
		vector2 = null;
		Sorting.doMergeSortTwoSortedArraysAscending(vector1, vector2);
	}

	@Test
	public void testDoMergeSortOneNonSortedArrayDescending() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector.setArray(array);
		vector = Sorting.doMergeSortOneNonSortedArrayDescending(vector);
		double[] expected = { 9, 8, 6, 5, 4, 3, 2 };
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testMergeSortOneArrayDescendingNullException() throws NullArrayException {
		vector = null;
		Sorting.doMergeSortOneNonSortedArrayDescending(vector);
	}

	@Test
	public void testDoMergeSortTwoSortedArraysDescending() throws NullArrayException {
		double[] array1 = { 17, 15, 11, 9, 8, 4, 1 };
		DoubleVector vector1 = new DoubleVector(array1);
		double[] array2 = { 14, 13, 6, 5, 2 };
		DoubleVector vector2 = new DoubleVector(array2);
		double[] expected = { 17, 15, 14, 13, 11, 9, 8, 6, 5, 4, 2, 1 };
		double delta = 0.001;
		DoubleVector sortVector = Sorting.doMergeSortTwoSortedArraysDescending(vector1, vector2);
		assertArrayEquals(expected, sortVector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testMergeSortTwoArrayDescendingNullException1() throws NullArrayException {
		DoubleVector vector1 = new DoubleVector();
		DoubleVector vector2 = new DoubleVector();
		vector1 = null;
		Sorting.doMergeSortTwoSortedArraysDescending(vector1, vector2);
	}

	@Test(expected = NullArrayException.class)
	public void testMergeSortTwoArrayDescendingNullException2() throws NullArrayException {
		DoubleVector vector1 = new DoubleVector();
		DoubleVector vector2 = new DoubleVector();
		vector2 = null;
		Sorting.doMergeSortTwoSortedArraysDescending(vector1, vector2);
	}

	@Test
	public void testDoQuickSortAscending() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector.setArray(array);
		Sorting.doQuickAscendingSort(vector);
		double[] expected = { 2, 3, 4, 5, 6, 8, 9 };
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testQuickSortNullException() throws NullArrayException {
		vector = null;
		Sorting.doQuickAscendingSort(vector);
	}

	@Test
	public void testDoQuickSortDescending() throws NullArrayException {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector.setArray(array);
		Sorting.doQuickDescendingSort(vector);
		double[] expected = { 9, 8, 6, 5, 4, 3, 2 };
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testQuickSortDescendingNullException() throws NullArrayException {
		vector = null;
		Sorting.doQuickDescendingSort(vector);
	}
}