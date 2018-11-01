package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds local minimum.
 * 
 * @author Alena Shirokikh
 * @version 1.1 1.11.2018
 */
public class LocalMin {
	public static int findLocalMin(double[] array) {
		int result = -1;
		if (array[0] < array[1]) {
			result = 0;
		} else {
			for (int i = 1; i < array.length - 1; i++) {
				if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
					result = i;
					break;
				}
			}
		}
		if (result == -1) {
			if (array[array.length - 1] < array[array.length - 2]) {
				result = array.length - 1;
			}
		}
		return result;// O(n)
	}
}
