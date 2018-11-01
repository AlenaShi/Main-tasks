package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program sorts an array in the ascending order with using quick sorting.
 * 
 * @author Alena Shirokikh
 * @version 1.0 31.10.2018
 */
public class QuickSort {
	public static double[] doQuickSort(double[] array, int left, int rightInclusive) {
		int i = left;
		int j = rightInclusive;
		double p = array[(left + rightInclusive) / 2];
		double temp = 0;

		do {
			while (array[i] < p) {
				i++;
			}
			while (array[j] > p) {
				j--;
			}
			if (i <= j) {
				temp = array[i]; // swap items
				array[i] = array[j];
				array[j] = temp;
				++i;
				--j;
			}
		} while (i <= j);
		if (j > left)
			doQuickSort(array, left, j);
		if (rightInclusive > i) {
			doQuickSort(array, i, rightInclusive);
		}
		return array;// O(n*logn)
	}
}
