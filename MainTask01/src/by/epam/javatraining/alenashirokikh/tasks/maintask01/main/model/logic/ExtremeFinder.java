package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds the extreme values.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class ExtremeFinder {
	/**
	 * The method finds maximum value.
	 * 
	 * @throws NullArrayException
	 * 
	 */
	public static double findMaxValue(Conteiner array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			double max = array.getArray()[0];

			for (int i = 1; i < array.getArray().length; i++) {
				if (max < array.getArray()[i]) {
					max = array.getArray()[i];
				}
			}
			return max;
		} else {
			throw new NullArrayException();
		} // O(n)
	}

	/**
	 * The method finds maximum value.
	 * 
	 * @throws NullArrayException
	 */
	public static double findMinValue(Conteiner array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			double min = array.getArray()[0];

			for (int i = 1; i < array.getArray().length; i++) {
				if (min > array.getArray()[i]) {
					min = array.getArray()[i];
				}
			}
			return min;
		} else {
			throw new NullArrayException();
		}
	} // O(n)

	/**
	 * The method finds local maximum.
	 * 
	 * @throws NullArrayException
	 */
	public static int findLocalMax(Conteiner array) throws NullArrayException {
		int result = -1;
		if (array != null && array.getArray().length != 0) {
			if (array.getArray()[0] > array.getArray()[1]) {
				result = 0;
			} else {
				for (int i = 1; i < array.getArray().length - 1; i++) {
					if (array.getArray()[i] > array.getArray()[i - 1]
							&& array.getArray()[i] > array.getArray()[i + 1]) {
						return i;
					}
				}
				if (array.getArray()[array.getArray().length - 1] > array.getArray()[array.getArray().length - 2]) {
					result = array.getArray().length - 1;
				}
			}
			return result;
		} else {
			throw new NullArrayException();
		} // O(n)
	}

	/**
	 * The method finds local minimum.
	 * 
	 * @throws NullArrayException
	 */
	public static int findLocalMin(Conteiner array) throws NullArrayException {
		int result = -1;
		if (array != null && array.getArray().length != 0) {
			if (array.getArray()[0] < array.getArray()[1]) {
				result = 0;
			} else {
				for (int i = 1; i < array.getArray().length - 1; i++) {
					if (array.getArray()[i] < array.getArray()[i - 1]
							&& array.getArray()[i] < array.getArray()[i + 1]) {
						return i;
					}
				}
				if (array.getArray()[array.getArray().length - 1] < array.getArray()[array.getArray().length - 2]) {
					result = array.getArray().length - 1;
				}
			}
			return result;
		} else {
			throw new NullArrayException();
		} // O(n)
	}
}
