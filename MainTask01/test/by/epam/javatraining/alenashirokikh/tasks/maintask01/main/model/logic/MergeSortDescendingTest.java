package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class MergeSortDescendingTest {
	@Test
	public void testDoMergeSortOneNonSortedArrayDescending() {
		Random rand = new Random(3);
		double[] array = new double[10];
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextDouble();
		}
		double[] sortArray = MergeSortDescending.doMergeSortOneNonSortedArrayDescending(array);
		double[] result = Arrays.copyOf(array, 10);
		Arrays.sort(result);
		double delta = 0.001;
		for (int i = 0; i < array.length; i++) {
			assertEquals(result[array.length - 1 - i], sortArray[i], delta);
		}
	}

	@Test
	public void testDoMergeSortTwoSortedArraysDescending() {
		Random rand = new Random(3);
		double[] array = new double[10];
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextDouble();
		}
		double[] array1 = Arrays.copyOfRange(array, 0, 5);
		Arrays.sort(array1);
		array1 = Reversing.reverseArray(array1);
		double[] array2 = Arrays.copyOfRange(array, 5, 10);
		Arrays.sort(array2);
		array2 = Reversing.reverseArray(array2);

		double[] sortArray = MergeSortDescending.doMergeSortTwoSortedArraysDescending(array1, array2);
		double[] result = Arrays.copyOf(array, 10);
		Arrays.sort(result);
		double delta = 0.001;
		for (int i = 0; i < array.length; i++) {
			assertEquals(result[array.length - 1 - i], sortArray[i], delta);
		}
	}
}
