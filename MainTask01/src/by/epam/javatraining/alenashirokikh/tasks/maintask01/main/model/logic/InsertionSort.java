package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program sorts an array in the ascending and descending order with using
 * insertion sorting.
 * 
 * @author Alena Shirokikh
 * @version 1.0 31.10.2018
 */
public class InsertionSort {
	public static double[] doInsertionSortAscending(double[] array) {
		double element = 0;
		int j = 0;
		for (int i = 1; i < array.length; i++) {
			element = array[i];
			j = i;
			while (j > 0 && element < array[j - 1]) {// compare current element
														// with previous

				array[j] = array[j - 1];
				array[j - 1] = element;
				--j;
			}
		}
		return array;// O(n^2)
	}

	public static double[] doInsertionSortDescending(double[] array) {
		double element = 0;
		int j = 0;
		for (int i = 1; i < array.length; i++) {
			element = array[i];
			j = i;
			while (j > 0 && element > array[j - 1]) {// compare current element
														// with previous

				array[j] = array[j - 1];
				array[j - 1] = element;
				--j;
			}
		}
		return array;// O(n^2)
	}
}
