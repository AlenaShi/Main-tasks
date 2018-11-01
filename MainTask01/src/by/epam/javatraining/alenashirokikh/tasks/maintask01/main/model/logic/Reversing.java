package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program reverses the array.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class Reversing {
	public static double[] reverseArray(double[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			array[i] = array[i] + array[array.length - 1 - i]; // swap items
			array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
			array[i] = array[i] - array[array.length - 1 - i];
		}
		return array;// O(n)
	}
}
