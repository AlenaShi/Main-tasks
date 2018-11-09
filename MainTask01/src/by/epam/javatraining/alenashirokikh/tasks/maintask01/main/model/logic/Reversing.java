package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program reverses the array.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class Reversing {
	public static DoubleVector reverseArray(DoubleVector array) {
		for (int i = 0; i < array.size() / 2; i++) {
			array.set(i, (array.get(i) + array.get(array.size() - 1 - i))); // swap
			// items
			array.set((array.size() - 1 - i), (array.get(i) - array.get(array.size() - 1 - i)));
			array.set(i, (array.get(i) - array.get(array.size() - 1 - i)));
		}
		return array;// O(n)
	}
}
