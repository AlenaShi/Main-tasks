package by.epam.javatraining.alenashirokikh.tasks.addition.model.entity;

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
		assertEquals(expected, vector.size());
	}

	@Test
	public void testDoubleVectorWithSize() {
		vector = new DoubleMatrix(4);
		int expected = 4;
		assertEquals(expected, vector.size());
	}

	@Test
	public void testDoubleVectorWithSize0() {
		vector = new DoubleMatrix(4, 5);
		int expected = 5;
		assertEquals(expected, vector.size0());
	}

	@Test
	public void testDoubleVector() {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		double[][] expected = { { 1, 2, 3 }, { 1, 2, 3 } };
		double delta = 0.0001;
		for (int i = 0; i < vector.size(); i++) {
			for (int j = 0; j < vector.size0(); j++) {
				assertEquals(expected[i][j], vector.get(i, j), delta);
			}
		}
	}

	@Test
	public void testGetMatrix() {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		double[][] expected = { { 1, 2, 3 }, { 1, 2, 3 } };
		double delta = 0.0001;
		for (int i = 0; i < vector.size(); i++) {
			for (int j = 0; j < vector.size0(); j++) {
				assertEquals(expected[i][j], vector.getMatrix()[i][j], delta);
			}
		}
	}

	@Test
	public void testSetArray() {
		vector = new DoubleMatrix();
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector.setMatrix(matrix);
		double[][] expected = { { 1, 2, 3 }, { 1, 2, 3 } };
		double delta = 0.0001;
		for (int i = 0; i < vector.size(); i++) {
			for (int j = 0; j < vector.size0(); j++) {
				assertEquals(expected[i][j], vector.get(i, j), delta);
			}
		}
	}

	@Test
	public void testDoubleVectorSize() {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		int expected = 2;
		assertEquals(expected, vector.size());
	}

	@Test
	public void testDoubleVectorSize0() {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		int expected = 3;
		assertEquals(expected, vector.size0());
	}

	@Test
	public void testGet() {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		double expected = 3;
		int i = 0;
		int j = 2;
		double delta = 0.0001;
		assertEquals(expected, vector.get(i, j), delta);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetException() {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		int i = 7;
		int j = 0;
		vector.get(i, j);
	}

	@Test
	public void testSet() {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		double element = 8;
		double expected = 8;
		int i = 0;
		int j = 2;
		vector.set(i, j, element);
		double delta = 0.0001;
		assertEquals(expected, vector.get(i, j), delta);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetException() {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new DoubleMatrix(matrix);
		double element = 8;
		int i = 7;
		int j = 0;
		vector.set(i, j, element);
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
