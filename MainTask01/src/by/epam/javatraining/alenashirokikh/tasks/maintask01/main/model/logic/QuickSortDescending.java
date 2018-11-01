package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program sorts an array in the descending order with using quick sorting.
 * 
 * @author Alena Shirokikh
 * @version 1.0 31.10.2018
 */
public class QuickSortDescending {
	public static double[] doQuickSortDescending(double[] array, int left, int right) {
		int i = left;
		int j = right;
		double p = array[(left + right) / 2];
		double temp = 0;

		do {
			while (array[i] > p) {
				i++;
			}
			while (array[j] < p) {
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
			doQuickSortDescending(array, left, j);
		if (right > i) {
			doQuickSortDescending(array, i, right);
		}
		return array;// O(n*logn)
	}
}
