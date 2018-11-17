package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds the average and the geometric average of the array.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class Average {
	/**
	 * The method finds the average of the array.
	 * 
	 * @throws NullArrayException
	 */
	public static double findAverage(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			double sum = array.getArray()[0];

			for (int i = 1; i < array.getArray().length; i++) {
				sum += array.getArray()[i];
			}
			return sum / array.getArray().length;
		} else {
			throw new NullArrayException();
		}
	}// O(n)

	/**
	 * The method finds the geometric average of the array.
	 * 
	 * @throws NullArrayException
	 */
	public static double findGeometricAverage(DoubleVector array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			double rate = 1d / array.getArray().length;
			double multiplication = 1;

			for (int i = 0; i < array.getArray().length; i++) {
				multiplication *= array.getArray()[i];
			}
			return Math.pow(multiplication, rate);
		} else {
			throw new NullArrayException();
		}
	}
}// O(n)
