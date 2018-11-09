package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class AverageMatrixTest {
	@Test
	public void testfindAverage() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 4, 6 } };
		DoubleMatrix matrix = new DoubleMatrix(matrixArray);
		double result = 3;
		double delta = 0.00001;
		assertEquals(result, AverageMatrix.findAverage(matrix), delta);
	}

	@Test
	public void testfindGeomAverage() {
		double[][] matrixArray = { { 1, 1, 1 }, { 1, 1, 1 } };
		DoubleMatrix matrix = new DoubleMatrix(matrixArray);
		double result = 1;
		double delta = 0.00001;
		assertEquals(result, AverageMatrix.findGeometricMain(matrix), delta);
	}
}
