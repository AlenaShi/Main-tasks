package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds the extreme values.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class ExtremeValues {
	public static double findMaxValue(double[] array) {
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;// O(n)
	}

	public static double findMinValue(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;// O(n)
	}
}
