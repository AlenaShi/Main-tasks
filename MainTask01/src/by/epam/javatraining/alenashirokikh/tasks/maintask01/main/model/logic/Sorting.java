package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import java.util.Arrays;

/**
 * The program include sorting methods in the ascending and descending way: bubble sort, insertion sort, selection sort, merge sort,quick sort.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class Sorting {
	/**
	 * The method sorts an array in the ascending order with using bubble sort.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doBubbleSortAscending(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			int k = 1;
			int count = 1;
			double temp = 0;

			while (count != 0) {
				count = 0;
				for (int i = 0; i < array.getArray().length - k; i++) {
					if (array.getArray()[i] > array.getArray()[i + 1]) {
						temp = array.getArray()[i + 1]; // swap items
						array.getArray()[i + 1] = array.getArray()[i];
						array.getArray()[i] = temp;
						++count;
					}
				}
				++k; // reduce the number of elements due to the screening of
						// large
						// elements
			}
			return array;
		} else

		{
			throw new NullArrayException();
		} // O(n^2)
	}

	/**
	 * The method sorts an array in the descending order with using bubble sort.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doBubbleSortDescending(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			int k = 1;
			int count = 1;
			double temp = 0;

			while (count != 0) {
				count = 0;
				for (int i = 0; i < array.getArray().length - k; i++) {
					if (array.getArray()[i] < array.getArray()[i + 1]) {
						temp = array.getArray()[i + 1]; // swap items
						array.getArray()[i + 1] = array.getArray()[i];
						array.getArray()[i] = temp;
						++count;
					}
				}
				++k; // reduce the number of elements due to the screening of
						// small
				// elements
			}
			return array;
		} else

		{
			throw new NullArrayException();
		} // O(n^2)
	}

	/**
	 * The method sorts an array in the ascending order with using insertion
	 * sorting.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doInsertionSortAscending(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			double element = 0;
			int j = 0;

			for (int i = 1; i < array.getArray().length; i++) {
				element = array.getArray()[i];
				j = i;
				while (j > 0 && element < array.getArray()[j - 1]) {// compare
																	// current
					// element
					// with previous

					array.getArray()[j] = array.getArray()[j - 1];
					array.getArray()[j - 1] = element;
					--j;
				}
			}
			return array;
		} else

		{
			throw new NullArrayException();
		} // O(n^2)
	}

	/**
	 * The method sorts an array in the descending order with using insertion
	 * sorting.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doInsertionSortDescending(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			double element = 0;
			int j = 0;

			for (int i = 1; i < array.getArray().length; i++) {
				element = array.getArray()[i];
				j = i;
				while (j > 0 && element > array.getArray()[j - 1]) {// compare
																	// current
					// element
					// with previous

					array.getArray()[j] = array.getArray()[j - 1];
					array.getArray()[j - 1] = element;
					--j;
				}
			}
			return array;
		} else

		{
			throw new NullArrayException();
		} // O(n^2)
	}

	/**
	 * The method sorts an array in the ascending order with using selection
	 * sorting.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doSelectionSortAscending(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			int min = 0;
			double temp = 0;

			for (int j = 0; j < array.getArray().length - 1; j++) {
				min = j;
				for (int i = j + 1; i < array.getArray().length; i++) {
					if (array.getArray()[i] < array.getArray()[min]) {
						min = i;
					}
				}
				if (min != j) {
					temp = array.getArray()[min];
					array.getArray()[min] = array.getArray()[j];
					array.getArray()[j] = temp;
				}
			}
			return array;
		} else

		{
			throw new NullArrayException();
		} // O(n^2)
	}

	/**
	 * The method sorts an array in the descending order with using selection
	 * sorting.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doSelectionSortDescending(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			int max = 0;
			double temp = 0;

			for (int j = 0; j < array.getArray().length - 1; j++) {
				max = j;
				for (int i = j + 1; i < array.getArray().length; i++) {
					if (array.getArray()[i] > array.getArray()[max]) {
						max = i;
					}
				}
				if (max != j) {
					temp = array.getArray()[max];
					array.getArray()[max] = array.getArray()[j];
					array.getArray()[j] = temp;
				}
			}
			return array;
		} else

		{
			throw new NullArrayException();
		} // O(n^2)
	}

	/**
	 * The method sorts an array in the ascending order with using merge
	 * sorting.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doMergeSortTwoSortedArraysAscending(DoubleVector array1, DoubleVector array2)
			throws NullArrayException {
		if (array1 != null && array1.getArray().length != 0 && array2 != null && array2.getArray().length != 0) {
			int j = 0;
			int k = 0;
			int i = 0;
			DoubleVector array = new DoubleVector(array1.getArray().length + array2.getArray().length);

			while (i < array1.getArray().length) {
				if (j >= array2.getArray().length || array1.getArray()[i] <= array2.getArray()[j]) { // choose
					// the
					// smallest
					// value
					array.getArray()[k] = array1.getArray()[i];
					k++;
					i++;
				} else {
					array.getArray()[k] = array2.getArray()[j];
					k++;
					j++;
				}
			}
			while (j < array2.getArray().length) {
				array.getArray()[k] = array2.getArray()[j];
				j++;
				k++;
			}

			return array;
		} else

		{
			throw new NullArrayException();
		} // O(n*logn)
	}

	public static DoubleVector doMergeSortOneNonSortedArrayAscending(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			int size = array.getArray().length;

			if (size < 2) {
				return array;
			}
			int mid = size / 2;
			DoubleVector array1 = new DoubleVector(Arrays.copyOfRange(array.getArray(), 0, mid));
			DoubleVector array2 = new DoubleVector(Arrays.copyOfRange(array.getArray(), mid, size));
			return doMergeSortTwoSortedArraysAscending(doMergeSortOneNonSortedArrayAscending(array1),
					doMergeSortOneNonSortedArrayAscending(array2));
		} else

		{
			throw new NullArrayException();
		}
	}

	/**
	 * The method sorts an array in the descending order with using merge
	 * sorting.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doMergeSortTwoSortedArraysDescending(DoubleVector array1, DoubleVector array2)
			throws NullArrayException {
		if (array1 != null && array1.getArray().length != 0 && array2 != null && array2.getArray().length != 0) {
			int j = 0;
			int k = 0;
			int i = 0;
			DoubleVector array = new DoubleVector(array1.getArray().length + array2.getArray().length);

			while (i < array1.getArray().length) {
				if (j >= array2.getArray().length || array1.getArray()[i] >= array2.getArray()[j]) {
					array.getArray()[k] = array1.getArray()[i];
					k++;
					i++;
				} else {
					array.getArray()[k] = array2.getArray()[j];
					k++;
					j++;
				}
			}
			while (j < array2.getArray().length) {
				array.getArray()[k] = array2.getArray()[j];
				k++;
				j++;
			}

			return array;
		} else {
			throw new NullArrayException();
		} // O(n*logn)
	}

	public static DoubleVector doMergeSortOneNonSortedArrayDescending(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			if (array.getArray().length < 2) {
				return array;
			}
			int mid = array.getArray().length / 2;
			DoubleVector array1 = new DoubleVector(Arrays.copyOfRange(array.getArray(), 0, mid));
			DoubleVector array2 = new DoubleVector(Arrays.copyOfRange(array.getArray(), mid, array.getArray().length));
			return doMergeSortTwoSortedArraysDescending(doMergeSortOneNonSortedArrayDescending(array1),
					doMergeSortOneNonSortedArrayDescending(array2));
		} else {
			throw new NullArrayException();
		}
	}

	/**
	 * The method sorts an array in the ascending order with using quick
	 * sorting.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doQuickAscendingSort(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			return doQuickSortAscending(array, 0, array.getArray().length - 1);
		} else {
			throw new NullArrayException();
		}
	}

	private static DoubleVector doQuickSortAscending(DoubleVector array, int left, int rightInclusive) {
		int i = left;
		int j = rightInclusive;
		double p = array.getArray()[(left + rightInclusive) / 2];
		double temp = 0;

		do {
			while (array.getArray()[i] < p) {
				i++;
			}
			while (array.getArray()[j] > p) {
				j--;
			}
			if (i <= j) {
				temp = array.getArray()[i]; // swap items
				array.getArray()[i] = array.getArray()[j];
				array.getArray()[j] = temp;
				++i;
				--j;
			}
		} while (i <= j);
		if (j > left)
			doQuickSortAscending(array, left, j);
		if (rightInclusive > i) {
			doQuickSortAscending(array, i, rightInclusive);
		}
		return array;
		// O(n*logn)
	}

	/**
	 * The method sorts an array in the descending order with using quick
	 * sorting.
	 * 
	 * @throws NullArrayException
	 */
	public static DoubleVector doQuickDescendingSort(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			return doQuickSortDescending(array, 0, array.getArray().length - 1);
		} else {
			throw new NullArrayException();
		}
	}

	private static DoubleVector doQuickSortDescending(DoubleVector array, int left, int right) {
		int i = left;
		int j = right;
		double p = array.getArray()[(left + right) / 2];
		double temp = 0;

		do {
			while (array.getArray()[i] > p) {
				i++;
			}
			while (array.getArray()[j] < p) {
				j--;
			}
			if (i <= j) {
				temp = array.getArray()[i]; // swap items
				array.getArray()[i] = array.getArray()[j];
				array.getArray()[j] = temp;
				++i;
				--j;
			}
		} while (i <= j);
		if (j > left)
			doQuickSortDescending(array, left, j);
		if (right > i) {
			doQuickSortDescending(array, i, right);
		}
		return array;
		// O(n*logn)
	}
}
