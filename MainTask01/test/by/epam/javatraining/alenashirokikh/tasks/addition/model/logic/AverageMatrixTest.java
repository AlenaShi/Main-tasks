package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class AverageMatrixTest {
	private DoubleMatrix matrix = null;

	@Before
	public void init() {
		matrix = new DoubleMatrix();
	}

	@After
	public void destroy() {
		matrix = null;
	}

	@Test
	public void testfindAverage() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 4, 6 } };
		matrix.setMatrix(matrixArray);
		double expected = 3;
		double delta = 0.00001;
		assertEquals(expected, AverageMatrix.findAverage(matrix), delta);
	}

	@Test
	public void testfindGeomAverage() {
		double[][] matrixArray = { { 1, 1, 1 }, { 1, 1, 1 } };
		matrix.setMatrix(matrixArray);
		double expected = 1;
		double delta = 0.00001;
		assertEquals(expected, AverageMatrix.findGeometricMain(matrix), delta);
	}
}
