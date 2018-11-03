package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

/**
 * The program reverses the array.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class Reversing {
	public static DoubleVector reverseArray(DoubleVector array) {
		final int size = array.size();
		for (int i = 0; i < size / 2; i++) {
			array.set(i, (array.get(i) + array.get(size - 1 - i))); // swap
																	// items
			array.set((size - 1 - i), (array.get(i) - array.get(size - 1 - i)));
			array.set(i, (array.get(i) - array.get(size - 1 - i)));
		}
		return array;// O(n)
	}
}
