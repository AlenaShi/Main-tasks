package by.epam.javatraining.alenashirokikh.tasks.addition.model.entity;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

public class DoubleMatrixTest {
	private DoubleMatrix vector = null;

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testDoubleVectorDefault() {
		vector = new DoubleMatrix();
		int expected = DoubleMatrix.DEFAULT_SIZE;
		assertEquals(expected, vector.getMatrix().length);
	}

	@Test
	public void testDoubleVectorWithRows() {
		vector = new DoubleMatrix(4);
		int expected = 4;
		assertEquals(expected, vector.getMatrix().length);
	}

	@Test
	public void testDoubleVectorWithRowsColumns() {
		vector = new DoubleMatrix(4, 5);
		int expected = 5;
		assertEquals(expected, vector.getMatrix()[0].length);
	}

	@Test
	public void testDoubleVector() {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		double[][] expected = { { 1, 2, 3 }, { 1, 2, 3 } };
		double delta = 0.0001;
		for (int i = 0; i < vector.getMatrix().length; i++) {
			assertArrayEquals(expected[i], vector.getMatrix()[i], delta);
		}
	}

	@Test
	public void testSetArray() {
		vector = new DoubleMatrix();
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector.setMatrix(matrix);
		double[][] expected = { { 1, 2, 3 }, { 1, 2, 3 } };
		double delta = 0.0001;
		for (int i = 0; i < vector.getMatrix().length; i++) {
			assertArrayEquals(expected[i], vector.getMatrix()[i], delta);
		}
	}

	@Test
	public void testToString() {
		double[][] matrix = { { 1, 2, 4 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		String vectorStr = vector.toString();
		String expectedString = "[1.0, 2.0, 4.0, 1.0, 2.0, 3.0]";
		assertEquals(expectedString, vectorStr);
	}
}
