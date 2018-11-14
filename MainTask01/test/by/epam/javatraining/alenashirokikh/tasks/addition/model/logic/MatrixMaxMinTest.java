package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class MatrixMaxMinTest {
	private Matrix matrix = null;

	@Before
	public void init() {
		matrix = new Matrix();
	}

	@After
	public void destroy() {
		matrix = null;
	}

	@Test
	public void testfindMaxValue() throws NullMatrixException {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 5, 6 } };
		matrix.setMatrix(matrixArray);
		double expected = 6;
		double delta = 0.00001;
		assertEquals(expected, MatrixMaxMin.findMaxValue(matrix), delta);
	}

	@Test
	public void testfindMinValue() throws NullMatrixException {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 5, 6 } };
		matrix.setMatrix(matrixArray);
		double expected = 1;
		double delta = 0.00001;
		assertEquals(expected, MatrixMaxMin.findMinValue(matrix), delta);
	}

	@Test(expected = NullMatrixException.class)
	public void testfindMinValueException() throws NullMatrixException {
		matrix = null;
		MatrixMaxMin.findMinValue(matrix);
	}
}
