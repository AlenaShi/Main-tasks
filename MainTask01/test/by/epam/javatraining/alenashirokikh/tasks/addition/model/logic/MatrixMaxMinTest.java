package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class MatrixMaxMinTest {
	@Test
	public void testfindMaxValue() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 5, 6 } };
		DoubleMatrix matrix = new DoubleMatrix(matrixArray);
		double result = 6;
		double delta = 0.00001;
		assertEquals(result, MatrixMaxMin.findMaxValue(matrix), delta);
	}

	@Test
	public void testfindMinValue() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 5, 6 } };
		DoubleMatrix matrix = new DoubleMatrix(matrixArray);
		double result = 1;
		double delta = 0.00001;
		assertEquals(result, MatrixMaxMin.findMinValue(matrix), delta);
	}
}
