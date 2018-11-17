package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class ReversingTest {
	private DoubleVector vector = null;

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testReverseArray() throws NullArrayException {
		double[] array = { 1, 2, 3, 4, 5, 6 };
		vector = new DoubleVector(array);
		double[] expected = { 6, 5, 4, 3, 2, 1 };
		vector = Reversing.reverseArray(vector);
		double delta = 0.001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testReverseNullException() throws NullArrayException {
		vector = null;
		Reversing.reverseArray(vector);
	}
}
