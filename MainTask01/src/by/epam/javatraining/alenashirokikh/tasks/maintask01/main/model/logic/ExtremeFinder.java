package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

/**
 * The program finds the extreme values.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
public class ExtremeFinder {
	/**
	 * The method finds maximum value.
	 * 
	 */
	public static double findMaxValue(DoubleVector array) {
		double max = array.get(0);
		final int size = array.size();
		for (int i = 1; i < size; i++) {
			if (max < array.get(i)) {
				max = array.get(i);
			}
		}
		return max;// O(n)
	}

	/**
	 * The method finds maximum value.
	 */
	public static double findMinValue(DoubleVector array) {
		double min = array.get(0);
		final int size = array.size();
		for (int i = 1; i < size; i++) {
			if (min > array.get(i)) {
				min = array.get(i);
			}
		}
		return min;// O(n)
	}

	/**
	 * The method finds local maximum.
	 */
	public static int findLocalMax(DoubleVector array) {
		int result = -1;
		final int size = array.size();
		if (array.get(0) > array.get(1)) {
			result = 0;
		} else {
			for (int i = 1; i < size - 1; i++) {
				if (array.get(i) > array.get(i - 1) && array.get(i) > array.get(i + 1)) {
					result = i;
					break;
				}
			}
		}
		if (result == -1) {
			if (array.get(size - 1) > array.get(size - 2)) {
				result = size - 1;
			}
		}
		return result;// O(n)
	}

	/**
	 * The method finds local minimum.
	 */
	public static int findLocalMin(DoubleVector array) {
		int result = -1;
		final int size = array.size();
		if (array.get(0) < array.get(1)) {
			result = 0;
		} else {
			for (int i = 1; i < size - 1; i++) {
				if (array.get(i) < array.get(i - 1) && array.get(i) < array.get(i + 1)) {
					result = i;
					break;
				}
			}
		}
		if (result == -1) {
			if (array.get(size - 1) < array.get(size - 2)) {
				result = size - 1;
			}
		}
		return result;// O(n)
	}
}
