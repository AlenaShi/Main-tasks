package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class SortingTest {
	private DoubleVector vector = null;

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testDoBubbleSortAscending() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		Sorting.doBubbleSortAscending(vector);
		double[] arrayResult = { 2, 3, 4, 5, 6, 8, 9 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

	@Test
	public void testDoBubbleSortDescending() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		Sorting.doBubbleSortDescending(vector);
		double[] arrayResult = { 9, 8, 6, 5, 4, 3, 2 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

	@Test
	public void testDoInsertionSortAscending() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		Sorting.doInsertionSortAscending(vector);
		double[] arrayResult = { 2, 3, 4, 5, 6, 8, 9 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

	@Test
	public void testDoInsertionSortDescending() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		Sorting.doInsertionSortDescending(vector);
		double[] arrayResult = { 9, 8, 6, 5, 4, 3, 2 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

	@Test
	public void testDoSelectionSortAscending() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		Sorting.doSelectionSortAscending(vector);
		double[] arrayResult = { 2, 3, 4, 5, 6, 8, 9 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

	@Test
	public void testDoSelectionSortDescending() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		Sorting.doSelectionSortDescending(vector);
		double[] arrayResult = { 9, 8, 6, 5, 4, 3, 2 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

	@Test
	public void testDoMergeSortOneNonSortedArray() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		vector = Sorting.doMergeSortOneNonSortedArrayAscending(vector);
		double[] arrayResult = { 2, 3, 4, 5, 6, 8, 9 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

	@Test
	public void testDoMergeSortTwoSortedArraysAscending() {
		double[] array1 = { 1, 4, 8, 9, 11, 15, 17 };
		DoubleVector vector1 = new DoubleVector(array1);
		double[] array2 = { 2, 5, 6, 13, 14 };
		DoubleVector vector2 = new DoubleVector(array2);
		double[] arrayResult = { 1, 2, 4, 5, 6, 8, 9, 11, 13, 14, 15, 17 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		DoubleVector sortVector = Sorting.doMergeSortTwoSortedArraysAscending(vector1, vector2);
		int size = sortVector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), sortVector.get(i), delta);
		}
	}

	@Test
	public void testDoMergeSortOneNonSortedArrayDescending() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		vector = Sorting.doMergeSortOneNonSortedArrayDescending(vector);
		double[] arrayResult = { 9, 8, 6, 5, 4, 3, 2 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

	@Test
	public void testDoMergeSortTwoSortedArraysDescending() {
		double[] array1 = { 17, 15, 11, 9, 8, 4, 1 };
		DoubleVector vector1 = new DoubleVector(array1);
		double[] array2 = { 14, 13, 6, 5, 2 };
		DoubleVector vector2 = new DoubleVector(array2);
		double[] arrayResult = { 17, 15, 14, 13, 11, 9, 8, 6, 5, 4, 2, 1 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		DoubleVector sortVector = Sorting.doMergeSortTwoSortedArraysDescending(vector1, vector2);
		int size = sortVector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), sortVector.get(i), delta);
		}
	}

	@Test
	public void testDoQuickSortAscending() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		Sorting.doQuickSortAscending(vector, 0, vector.size() - 1);
		double[] arrayResult = { 2, 3, 4, 5, 6, 8, 9 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

	@Test
	public void testDoQuickSortDescending() {
		double[] array = { 2, 4, 6, 8, 3, 5, 9 };
		vector = new DoubleVector(array);
		Sorting.doQuickSortDescending(vector, 0, vector.size() - 1);
		double[] arrayResult = { 9, 8, 6, 5, 4, 3, 2 };
		DoubleVector expected = new DoubleVector(arrayResult);
		double delta = 0.001;
		int size = vector.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), vector.get(i), delta);
		}
	}

}
