package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds if the array is in the ascending order or if the array is in the descending order. .
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class Order {
	/**
	 * The method finds if the array is in the ascending order.
	 */
	public static boolean isOrderedAscending(DoubleVector array) {
		final int size = array.size();
		for (int i = 1; i < size; i++) {
			if (array.get(i) < array.get(i - 1)) {
				return false;
			}
		}
		return true;// O(n);
	}

	/**
	 * The method finds if the array is in the descending order.
	 */
	public static boolean isOrderedDescending(DoubleVector array) {
		final int size = array.size();
		for (int i = 0; i < size - 1; i++) {
			if (array.get(i) < array.get(i + 1)) {
				return false;
			}
		}
		return true;// O(n)
	}
}
