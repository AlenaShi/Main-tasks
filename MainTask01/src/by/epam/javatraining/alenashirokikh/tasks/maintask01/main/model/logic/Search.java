package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

/**
 * The program finds the element with using linear search.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
public class Search {
	/**
	 * The method finds the element with using linear search.
	 */
	public static int findElementByLinearSearch(DoubleVector array, double element) {
		final int size = array.size();
		for (int i = 0; i < size; i++) {
			if (element == array.get(i)) {
				return i;
			}
		}
		return -1;// O(n)
	}

	/**
	 * The method finds an element with using binary search.
	 */
	public static int findElementByBinarySearch(DoubleVector array, double element) {
		// work with sorted array
		int index = -1;
		int left = 0;
		int right = array.size() - 1;
		int mid = 0;
		while (left <= right) {
			mid = (left + right) / 2;
			if (element > array.get(mid)) {
				left = mid + 1;
			} else if (element < array.get(mid)) {
				right = mid - 1;
			} else {
				index = mid;
				break;
			} // O(n)
		}
		return index;
	}
}
