package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program sorts an array in the descending order with using merge sorting.
 * 
 * @author Alena Shirokikh
 * @version 1.0 31.10.2018
 */
import java.util.Arrays;

public class MergeSortDescending {
	public static double[] doMergeSortTwoSortedArraysDescending(double[] array1, double[] array2) {
		int j = 0;
		int k = 0;
		int i = 0;
		double[] array = new double[array1.length + array2.length];

		while (i < array1.length) {
			if (j >= array2.length || array1[i] >= array2[j]) {
				array[k++] = array1[i++];
			} else {
				array[k++] = array2[j++];
			}
		}
		while (j < array2.length) {
			array[k++] = array2[j++];
		}

		return array;// O(n*logn)
	}

	public static double[] doMergeSortOneNonSortedArrayDescending(double[] array) {
		if (array.length < 2) {
			return array;
		}
		int mid = array.length / 2;
		double[] array1 = Arrays.copyOfRange(array, 0, mid);
		double[] array2 = Arrays.copyOfRange(array, mid, array.length);
		return doMergeSortTwoSortedArraysDescending(doMergeSortOneNonSortedArrayDescending(array1),
				doMergeSortOneNonSortedArrayDescending(array2));
	}
}
