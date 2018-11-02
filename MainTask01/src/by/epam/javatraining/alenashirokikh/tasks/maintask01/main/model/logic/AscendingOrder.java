package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

/**
 * The program finds if the array is in the ascending order.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
public class AscendingOrder {
	public static boolean isOrderedAscending(DoubleVector array) {
		final int size = array.size();
		for (int i = 1; i < size; i++) {
			if (array.get(i) < array.get(i - 1)) {
				return false;
			}
		}
		return true;// O(n);
	}
}