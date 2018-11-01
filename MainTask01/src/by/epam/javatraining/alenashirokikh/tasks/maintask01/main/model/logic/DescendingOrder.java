package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds if the array is in the descending order.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class DescendingOrder {
	public static boolean isOrderedDescending(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				continue;
			} else {
				return false;
			}
		}
		return true;// O(n)
	}
}
