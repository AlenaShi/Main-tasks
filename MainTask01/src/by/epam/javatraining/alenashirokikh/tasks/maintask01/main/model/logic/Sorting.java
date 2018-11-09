package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program include sorting methods in the ascending and descending way: bubble sort, insertion sort, selection sort, merge sort,quick sort.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class Sorting {
	/**
	 * The method sorts an array in the ascending order with using bubble sort.
	 */
	public static DoubleVector doBubbleSortAscending(DoubleVector array) {
		int k = 1;
		int count = 1;
		double temp = 0;

		while (count != 0) {
			count = 0;
			for (int i = 0; i < array.size() - k; i++) {
				if (array.get(i) > array.get(i + 1)) {
					temp = array.get(i + 1); // swap items
					array.set(i + 1, array.get(i));
					array.set(i, temp);
					++count;
				}
			}
			++k; // reduce the number of elements due to the screening of large
					// elements
		}
		return array;// O(n^2)
	}

	/**
	 * The method sorts an array in the descending order with using bubble sort.
	 */
	public static DoubleVector doBubbleSortDescending(DoubleVector array) {
		int k = 1;
		int count = 1;
		double temp = 0;

		while (count != 0) {
			count = 0;
			for (int i = 0; i < array.size() - k; i++) {
				if (array.get(i) < array.get(i + 1)) {
					temp = array.get(i + 1); // swap items
					array.set(i + 1, array.get(i));
					array.set(i, temp);
					++count;
				}
			}
			++k; // reduce the number of elements due to the screening of small
			// elements
		}
		return array;// O(n^2)
	}

	/**
	 * The method sorts an array in the ascending order with using insertion
	 * sorting.
	 */
	public static DoubleVector doInsertionSortAscending(DoubleVector array) {
		double element = 0;
		int j = 0;

		for (int i = 1; i < array.size(); i++) {
			element = array.get(i);
			j = i;
			while (j > 0 && element < array.get(j - 1)) {// compare current
															// element
															// with previous

				array.set(j, array.get(j - 1));
				array.set(j - 1, element);
				--j;
			}
		}
		return array;// O(n^2)
	}

	/**
	 * The method sorts an array in the descending order with using insertion
	 * sorting.
	 */
	public static DoubleVector doInsertionSortDescending(DoubleVector array) {
		double element = 0;
		int j = 0;

		for (int i = 1; i < array.size(); i++) {
			element = array.get(i);
			j = i;
			while (j > 0 && element > array.get(j - 1)) {// compare current
															// element
															// with previous

				array.set(j, array.get(j - 1));
				array.set(j - 1, element);
				--j;
			}
		}
		return array;// O(n^2)
	}

	/**
	 * The method sorts an array in the ascending order with using selection
	 * sorting.
	 */
	public static DoubleVector doSelectionSortAscending(DoubleVector array) {
		int min = 0;
		double temp = 0;

		for (int j = 0; j < array.size() - 1; j++) {
			min = j;
			for (int i = j + 1; i < array.size(); i++) {
				if (array.get(i) < array.get(min)) {
					min = i;
				}
			}
			if (min != j) {
				temp = array.get(min);
				array.set(min, array.get(j));
				array.set(j, temp);
			}
		}
		return array;// O(n^2)
	}

	/**
	 * The method sorts an array in the descending order with using selection
	 * sorting.
	 */
	public static DoubleVector doSelectionSortDescending(DoubleVector array) {
		int max = 0;
		double temp = 0;

		for (int j = 0; j < array.size() - 1; j++) {
			max = j;
			for (int i = j + 1; i < array.size(); i++) {
				if (array.get(i) > array.get(max)) {
					max = i;
				}
			}
			if (max != j) {
				temp = array.get(max);
				array.set(max, array.get(j));
				array.set(j, temp);
			}
		}
		return array;// O(n^2)
	}

	/**
	 * The method sorts an array in the ascending order with using merge
	 * sorting.
	 */
	public static DoubleVector doMergeSortTwoSortedArraysAscending(DoubleVector array1, DoubleVector array2) {
		int j = 0;
		int k = 0;
		int i = 0;
		DoubleVector array = new DoubleVector(array1.size() + array2.size());

		while (i < array1.size()) {
			if (j >= array2.size() || array1.get(i) <= array2.get(j)) { // choose
																		// the
				// smallest
				// value
				array.set(k, array1.get(i));
				k++;
				i++;
			} else {
				array.set(k, array2.get(j));
				k++;
				j++;
			}
		}
		while (j < array2.size()) {
			array.set(k, array2.get(j));
			j++;
			k++;
		}

		return array;// O(n*logn)
	}

	public static DoubleVector doMergeSortOneNonSortedArrayAscending(DoubleVector array) {
		int size = array.size();

		if (size < 2) {
			return array;
		}
		int mid = size / 2;
		DoubleVector array1 = array.copyOfRange(0, mid);
		DoubleVector array2 = array.copyOfRange(mid, size);
		return doMergeSortTwoSortedArraysAscending(doMergeSortOneNonSortedArrayAscending(array1),
				doMergeSortOneNonSortedArrayAscending(array2));
	}

	/**
	 * The method sorts an array in the descending order with using merge
	 * sorting.
	 */
	public static DoubleVector doMergeSortTwoSortedArraysDescending(DoubleVector array1, DoubleVector array2) {
		int j = 0;
		int k = 0;
		int i = 0;
		DoubleVector array = new DoubleVector(array1.size() + array2.size());

		while (i < array1.size()) {
			if (j >= array2.size() || array1.get(i) >= array2.get(j)) {
				array.set(k, array1.get(i));
				k++;
				i++;
			} else {
				array.set(k, array2.get(j));
				k++;
				j++;
			}
		}
		while (j < array2.size()) {
			array.set(k, array2.get(j));
			k++;
			j++;
		}

		return array;// O(n*logn)
	}

	public static DoubleVector doMergeSortOneNonSortedArrayDescending(DoubleVector array) {

		if (array.size() < 2) {
			return array;
		}
		int mid = array.size() / 2;
		DoubleVector array1 = array.copyOfRange(0, mid);
		DoubleVector array2 = array.copyOfRange(mid, array.size());
		return doMergeSortTwoSortedArraysDescending(doMergeSortOneNonSortedArrayDescending(array1),
				doMergeSortOneNonSortedArrayDescending(array2));
	}

	/**
	 * The method sorts an array in the ascending order with using quick
	 * sorting.
	 */
	public static DoubleVector doQuickSortAscending(DoubleVector array, int left, int rightInclusive) {
		int i = left;
		int j = rightInclusive;
		double p = array.get((left + rightInclusive) / 2);
		double temp = 0;

		do {
			while (array.get(i) < p) {
				i++;
			}
			while (array.get(j) > p) {
				j--;
			}
			if (i <= j) {
				temp = array.get(i); // swap items
				array.set(i, array.get(j));
				array.set(j, temp);
				++i;
				--j;
			}
		} while (i <= j);
		if (j > left)
			doQuickSortAscending(array, left, j);
		if (rightInclusive > i) {
			doQuickSortAscending(array, i, rightInclusive);
		}
		return array;// O(n*logn)
	}

	/**
	 * The method sorts an array in the descending order with using quick
	 * sorting.
	 */
	public static DoubleVector doQuickSortDescending(DoubleVector array, int left, int right) {
		int i = left;
		int j = right;
		double p = array.get((left + right) / 2);
		double temp = 0;

		do {
			while (array.get(i) > p) {
				i++;
			}
			while (array.get(j) < p) {
				j--;
			}
			if (i <= j) {
				temp = array.get(i); // swap items
				array.set(i, array.get(j));
				array.set(j, temp);
				++i;
				--j;
			}
		} while (i <= j);
		if (j > left)
			doQuickSortDescending(array, left, j);
		if (right > i) {
			doQuickSortDescending(array, i, right);
		}
		return array;// O(n*logn)
	}
}
