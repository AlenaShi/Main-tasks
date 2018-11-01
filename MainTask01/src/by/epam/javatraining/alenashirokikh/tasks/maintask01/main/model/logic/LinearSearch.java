package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds the element with using linear search.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class LinearSearch {
	public static int findElementByLinearSearch(double[] array, double element) {
		for (int i = 0; i < array.length; i++) {
			if (element == array[i]) {
				return i;
			}
		}
		return -1;//O(n)
	}
}
