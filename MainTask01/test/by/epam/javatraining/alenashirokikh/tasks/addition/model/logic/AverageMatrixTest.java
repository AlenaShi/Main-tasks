package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class AverageMatrixTest {
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
	public void testfindAverage() throws NullMatrixException {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 4, 6 } };
		matrix.setMatrix(matrixArray);
		double expected = 3;
		double delta = 0.00001;
		assertEquals(expected, AverageMatrix.findAverage(matrix), delta);
	}

	@Test(expected = NullMatrixException.class)
	public void testfindAverageException() throws NullMatrixException {
		matrix = null;
		AverageMatrix.findAverage(matrix);
	}

	@Test
	public void testfindGeomAverage() throws NullMatrixException {
		double[][] matrixArray = { { 1, 1, 1 }, { 1, 1, 1 } };
		matrix.setMatrix(matrixArray);
		double expected = 1;
		double delta = 0.00001;
		assertEquals(expected, AverageMatrix.findGeometricMain(matrix), delta);
	}

	@Test(expected = NullMatrixException.class)
	public void testfindGeomException() throws NullMatrixException {
		matrix = null;
		AverageMatrix.findGeometricMain(matrix);
	}
}
