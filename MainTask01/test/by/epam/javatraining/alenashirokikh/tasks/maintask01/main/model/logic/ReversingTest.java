package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class ReversingTest {
	@Test
	public void testReverseArray() {
		double[] array = { 1, 2, 3, 4, 5, 6 };
		DoubleVector vector = new DoubleVector(array);
		double[] result = { 6, 5, 4, 3, 2, 1 };
		DoubleVector expected = new DoubleVector(result);
		DoubleVector reverseArray = Reversing.reverseArray(vector);
		double delta = 0.001;
		for (int i = 0; i < array.length; i++) {
			assertEquals(expected.get(i), reverseArray.get(i), delta);
		}
	}
}
