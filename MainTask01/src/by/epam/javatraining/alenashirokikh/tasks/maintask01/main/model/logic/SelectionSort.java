package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program sorts an array in the ascending order with using selection
 * sorting.
 * 
 * @author Alena Shirokikh
 * @version 1.0 31.10.2018
 */
public class SelectionSort {
	public static double[] doSelectionSort(double[] array) {
		int min = 0;

		for (int j = 0; j < array.length - 1; j++) {
			min = j;
			for (int i = j + 1; i < array.length; i++) {
				if (array[i] < array[min]) {
					min = i;
				}
			}
			if (min != j) {
				array[min] = array[min] + array[j];
				array[j] = array[min] - array[j];
				array[min] = array[min] - array[j];
			}
		}
		return array;// O(n^2)
	}
}
