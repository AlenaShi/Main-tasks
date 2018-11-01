package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds local minimum.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class LocalMin {
	public static int findLocalMin(double[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
				return i;
			}
		}
		return -1;// O(n)
	}
}
