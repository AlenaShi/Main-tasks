package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatrixMaxMinTest {
	@Test
	public void testfindMaxValue() {
		double[][] matrix = { { 1, 2, 3 }, { 2, 5, 6 } };
		double result = 6;
		double delta = 0.00001;
		assertEquals(result, MatrixMaxMin.findMaxValue(matrix), delta);
	}

	@Test
	public void testfindMinValue() {
		double[][] matrix = { { 1, 2, 3 }, { 2, 5, 6 } };
		double result = 1;
		double delta = 0.00001;
		assertEquals(result, MatrixMaxMin.findMinValue(matrix), delta);
	}
}
