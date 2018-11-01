package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program sorts an array in the descending order with using bubble sort.
 * 
 * @author Alena Shirokikh
 * @version 1.0 31.10.2018
 */
public class BubbleSortDescending {
	public static double[] doBubbleSort(double[] array) {
		int k = 1;
		int count = 1;
		while (count != 0) {
			count = 0;
			for (int i = 0; i < array.length - k; i++) {
				if (array[i] < array[i + 1]) {
					array[i] = array[i] + array[i + 1]; // swap items
					array[i + 1] = array[i] - array[i + 1];
					array[i] = array[i] - array[i + 1];
					++count;
				}
			}
			++k; // reduce the number of elements due to the screening of small
			// elements
		}
		return array;// O(n^2)
	}
}
