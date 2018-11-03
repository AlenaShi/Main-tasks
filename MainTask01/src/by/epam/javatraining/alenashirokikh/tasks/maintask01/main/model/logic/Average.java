package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

/**
 * The program finds the average and the geometric average of the array.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
public class Average {
	/**
	 * The method finds the average of the array.
	 */
	public static double findAverage(DoubleVector array) {
		double sum = array.get(0);
		final int size = array.size();
		for (int i = 1; i < size; i++) {
			sum += array.get(i);
		}
		return sum / size;// O(n)
	}

	/**
	 * The method finds the geometric average of the array.
	 */
	public static double findGeometricAverage(DoubleVector array) {
		final int size = array.size();
		double rate = 1d / size;
		double multiplication = 1;
		for (int i = 0; i < size; i++) {
			if (array.get(i) > 0) {
				multiplication *= array.get(i);
			} else {// return exception
			}
		}
		return Math.pow(multiplication, rate);// O(n)
	}
}
