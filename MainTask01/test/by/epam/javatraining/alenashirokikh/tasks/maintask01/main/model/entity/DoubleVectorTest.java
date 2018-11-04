package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

public class DoubleVectorTest {
	private DoubleVector vector = null;

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testDoubleVectorDefault() {
		vector = new DoubleVector();
		int expected = DoubleVector.DEFAULT_SIZE;
		assertEquals(expected, vector.size());
	}

	@Test
	public void testDoubleVectorWithSize() {
		vector = new DoubleVector(10);
		int expected = 10;
		assertEquals(expected, vector.size());
	}

	@Test
	public void testDoubleVector() {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector = new DoubleVector(array);
		double[] expected = { 1, 2, 3, 1, 2, 3 };
		double delta = 0.0001;
		for (int i = 0; i < vector.size(); i++) {
			assertEquals(expected[i], vector.get(i), delta);
		}
	}

	@Test
	public void testGetArray() {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector = new DoubleVector(array);
		double[] expected = { 1, 2, 3, 1, 2, 3 };
		double delta = 0.0001;
		for (int i = 0; i < vector.size(); i++) {
			assertEquals(expected[i], vector.getArray()[i], delta);
		}
	}

	@Test
	public void testSetArray() {
		vector = new DoubleVector();
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector.setArray(array);
		double[] expected = { 1, 2, 3, 1, 2, 3 };
		double delta = 0.0001;
		for (int i = 0; i < vector.size(); i++) {
			assertEquals(expected[i], vector.get(i), delta);
		}
	}

	@Test
	public void testDoubleVectorSize() {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector = new DoubleVector(array);
		int expected = 6;
		assertEquals(expected, vector.size());
	}

	@Test
	public void testGet() {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector = new DoubleVector(array);
		double expected = 3;
		int index = 2;
		double delta = 0.0001;
		assertEquals(expected, vector.get(index), delta);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetException() {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector = new DoubleVector(array);
		int index = 7;
		vector.get(index);
	}

	@Test
	public void testSet() {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector = new DoubleVector(array);
		double element = 8;
		double expected = 8;
		int index = 2;
		vector.set(index, element);
		double delta = 0.0001;
		assertEquals(expected, vector.get(index), delta);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetException() {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector = new DoubleVector(array);
		double element = 8;
		int index = 7;
		vector.set(index, element);
	}

	@Test
	public void testCopyOfRange() {
		double[] array = { 1, 2, 4, 1, 2, 3 };
		vector = new DoubleVector(array);
		vector = vector.copyOfRange(0, 3);
		double[] expected = { 1, 2, 4 };
		double delta = 0.0001;
		for (int i = 0; i < vector.size(); i++) {
			assertEquals(expected[i], vector.get(i), delta);
		}
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
