package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class QuickSortTest {
	@Test
	public void testDoQuickSort() {
		Random rand = new Random(3);
		double[] array = new double[10];
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextDouble();
		}
		double[] sortArray = QuickSort.doQuickSort(array, 0, array.length - 1);
		double[] result = Arrays.copyOf(array, 10);
		Arrays.sort(result);
		double delta = 0.001;
		for (int i = 0; i < array.length; i++) {
			assertEquals(result[i], sortArray[i], delta);
		}
	}
}
