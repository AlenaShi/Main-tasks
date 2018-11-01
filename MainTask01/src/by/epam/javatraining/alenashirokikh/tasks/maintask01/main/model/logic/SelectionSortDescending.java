package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program sorts an array in the descending order with using selection
 * sorting.
 * 
 * @author Alena Shirokikh
 * @version 1.0 31.10.2018
 */
public class SelectionSortDescending {
	public static double[] doSelectionSort(double[] array) {
		int max = 0;

		for (int j = 0; j < array.length - 1; j++) {
			max = j;
			for (int i = j + 1; i < array.length; i++) {
				if (array[i] > array[max]) {
					max = i;
				}
			}
			if (max != j) {
				array[max] = array[max] + array[j];
				array[j] = array[max] - array[j];
				array[max] = array[max] - array[j];
			}
		}
		return array;// O(n^2)
	}

}
