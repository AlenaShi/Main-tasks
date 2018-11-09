package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds the extreme values.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class ExtremeFinder {
	/**
	 * The method finds maximum value.
	 * 
	 */
	public static String findMaxValue(DoubleVector array) {
		if (array != null) {
			double max = array.get(0);

			for (int i = 1; i < array.size(); i++) {
				if (max < array.get(i)) {
					max = array.get(i);
				}
			}
			return max + "";
		} // O(n)
		return "Array is null";
	}

	/**
	 * The method finds maximum value.
	 */
	public static String findMinValue(DoubleVector array) {
		if (array != null) {
			double min = array.get(0);

			for (int i = 1; i < array.size(); i++) {
				if (min > array.get(i)) {
					min = array.get(i);
				}
			}
			return min + "";
		} // O(n)
		return "Array is null";
	}

	/**
	 * The method finds local maximum.
	 */
	public static int findLocalMax(DoubleVector array) {
		int result = -1;
		if (array != null) {
			if (array.get(0) > array.get(1)) {
				result = 0;
			} else {
				for (int i = 1; i < array.size() - 1; i++) {
					if (array.get(i) > array.get(i - 1) && array.get(i) > array.get(i + 1)) {
						result = i;
						break;
					}
				}
			}
			if (result == -1) {
				if (array.get(array.size() - 1) > array.get(array.size() - 2)) {
					result = array.size() - 1;
				}
			}
		}
		return result;// O(n)
	}

	/**
	 * The method finds local minimum.
	 */
	public static int findLocalMin(DoubleVector array) {
		int result = -1;
		if (array != null) {
			if (array.get(0) < array.get(1)) {
				result = 0;
			} else {
				for (int i = 1; i < array.size() - 1; i++) {
					if (array.get(i) < array.get(i - 1) && array.get(i) < array.get(i + 1)) {
						result = i;
						break;
					}
				}
			}
			if (result == -1) {
				if (array.get(array.size() - 1) < array.get(array.size() - 2)) {
					result = array.size() - 1;
				}
			}
		}
		return result;// O(n)
	}
}
