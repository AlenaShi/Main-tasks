package by.epam.javatraining.alenashirokikh.tasks.addition.model.entity;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class MatrixTest {
	private Matrix vector = null;

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testDoubleVectorDefault() throws NullMatrixException {
		vector = new Matrix();
		int expected = Matrix.DEFAULT_SIZE;
		assertEquals(expected, vector.getMatrix().length);
	}

	@Test
	public void testDoubleVectorWithRowsColumns() throws NullMatrixException {
		vector = new Matrix(4, 5);
		int expected = 5;
		assertEquals(expected, vector.getMatrix()[0].length);
	}

	@Test
	public void testDoubleVector() throws NullMatrixException {
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector = new Matrix(matrix);
		double[][] expected = { { 1, 2, 3 }, { 1, 2, 3 } };
		double delta = 0.0001;
		for (int i = 0; i < vector.getMatrix().length; i++) {
			assertArrayEquals(expected[i], vector.getMatrix()[i], delta);
		}
	}

	@Test
	public void testSetArray() throws NullMatrixException {
		vector = new Matrix();
		double[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } };
		vector.setMatrix(matrix);
		double[][] expected = { { 1, 2, 3 }, { 1, 2, 3 } };
		double delta = 0.0001;
		for (int i = 0; i < vector.getMatrix().length; i++) {
			assertArrayEquals(expected[i], vector.getMatrix()[i], delta);
		}
	}

	@Test(expected = NullMatrixException.class)
	public void testSetArrayException() throws NullMatrixException {
		vector = new Matrix();
		double[][] matrix = null;
		vector.setMatrix(matrix);
	}

	@Test(expected = NullMatrixException.class)
	public void testSetArrayException2() throws NullMatrixException {
		vector = new Matrix();
		double[][] matrix = {};
		vector.setMatrix(matrix);
	}

	@Test(expected = NullMatrixException.class)
	public void testSetArrayException3() throws NullMatrixException {
		vector = new Matrix();
		double[][] matrix = { {}, {} };
		vector.setMatrix(matrix);
	}

	@Test
	public void testToString() {
		double[][] matrix = { { 1, 2, 4 }, { 1, 2, 3 } };
		vector = new Matrix(matrix);
		String vectorStr = vector.toString();
		String expectedString = "[1.0, 2.0, 4.0, 1.0, 2.0, 3.0]";
		assertEquals(expectedString, vectorStr);
	}
}
