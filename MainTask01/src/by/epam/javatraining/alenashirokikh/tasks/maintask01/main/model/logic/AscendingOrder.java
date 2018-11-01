package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds if the array is in the ascending order.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class AscendingOrder {
	public static boolean isOrderedAscending(double[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1]) { // if the element bigger than
											// previous
				continue;
			} else {
				return false;
			}
		}
		return true;//O(n);
	}
}