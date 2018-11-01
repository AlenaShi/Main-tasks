package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds an element with using binary search.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class BinarySearch {
	public static int findElementByBinarySearch(double[] array, double element) {
		// work with sorted array
		int index = -1;
		int left = 0;
		int right = array.length - 1;
		int mid = 0;
		while (left <= right) {
			mid = (left + right) / 2;
			if (element > array[mid]) {
				left = mid + 1;
			} else if (element < array[mid]) {
				right = mid - 1;
			} else {
				index = mid;
				break;
			}//O(n)
		}

		return index;
	}

}
