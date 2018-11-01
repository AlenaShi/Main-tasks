package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReversingTest {
	@Test
	public void testReverseArray() {
		double[] array = { 1, 2, 3, 4, 5, 6 };
		double[] result = { 6, 5, 4, 3, 2, 1 };
		double[] reverseArray = Reversing.reverseArray(array);
		double delta = 0.001;
		for (int i = 0; i < array.length; i++) {
			assertEquals(result[i], reverseArray[i], delta);
		}
	}
}
