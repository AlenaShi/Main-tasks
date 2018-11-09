package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds the average and the geometric average of the array.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class Average {
	/**
	 * The method finds the average of the array.
	 */
	public static String findAverage(DoubleVector array) {
		if (array != null) {
			double sum = array.get(0);

			for (int i = 1; i < array.size(); i++) {
				sum += array.get(i);
			}
			return sum / array.size() + "";
		} // O(n)
		return "Array is null";
	}

	/**
	 * The method finds the geometric average of the array.
	 */
	public static String findGeometricAverage(DoubleVector array) {
		if (array != null) {
			double rate = 1d / array.size();
			double multiplication = 1;

			for (int i = 0; i < array.size(); i++) {
				if (array.get(i) > 0) {
					multiplication *= array.get(i);
				} else {// return exception
				}
			}
			return Math.pow(multiplication, rate) + "";
		} // O(n)
		return "Array is null";
	}
}
