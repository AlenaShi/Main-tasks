package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class DoubleVectorTest {
	private DoubleVector vector = null;

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testDoubleVectorDefault() throws NullArrayException {
		vector = new DoubleVector();
		int expected = DoubleVector.DEFAULT_SIZE;
		assertEquals(expected, vector.getArray().length);
	}

	@Test
	public void testDoubleVectorWithSize() throws NullArrayException {
		vector = new DoubleVector(10);
		int expected = 10;
		assertEquals(expected, vector.getArray().length);
	}

	@Test
	public void testDoubleVector() throws NullArrayException {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector = new DoubleVector(array);
		double[] expected = { 1, 2, 3, 1, 2, 3 };
		double delta = 0.0001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test
	public void testDoubleVector0() throws NullArrayException {
		double[] array = {};
		vector = new DoubleVector(array);
		double[] expected = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double delta = 0.0001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test
	public void testGetArray() throws NullArrayException {
		double[] array = { 1, 2, 3, 5, 2, 0 };
		vector = new DoubleVector(array);
		double[] expected = { 1, 2, 3, 5, 2, 0 };
		double delta = 0.0001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test
	public void testSetArray() throws NullArrayException {
		vector = new DoubleVector();
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector.setArray(array);
		double[] expected = { 1, 2, 3, 1, 2, 3 };
		double delta = 0.0001;
		assertArrayEquals(expected, vector.getArray(), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testSetArray0Exception() throws NullArrayException {
		vector = new DoubleVector();
		double[] array = {};
		vector.setArray(array);
	}

	@Test(expected = NullArrayException.class)
	public void testSetArrayException() throws NullArrayException {
		vector = new DoubleVector();
		double[] array = null;
		vector.setArray(array);
	}

	@Test
	public void testToString() {
		double[] array = { 1, 2, 4, 1, 2, 3 };
		vector = new DoubleVector(array);
		String vectorStr = vector.toString();
		String expectedString = "[1.0, 2.0, 4.0, 1.0, 2.0, 3.0]";
		assertEquals(expectedString, vectorStr);
	}
}
