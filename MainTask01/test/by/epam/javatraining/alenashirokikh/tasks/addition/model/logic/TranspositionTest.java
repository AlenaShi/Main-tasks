package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class TranspositionTest {
	@Test
	public void testTransposition1() {
		double[][] matrixArray = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };
		DoubleMatrix actual = new DoubleMatrix(matrixArray);
		double[][] expected = { 
				{ 1, 4, 7 },
				{ 2, 5, 8 },
				{ 3, 6, 9 } };
		DoubleMatrix expectedMatrix = new DoubleMatrix(expected);
		actual = Transposition.transposeMatrix(actual);
		assertEquals(expectedMatrix.toString(), actual.toString());
	}

	@Test
	public void testTransposition2() {
		double[][] matrixArray = { 
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		DoubleMatrix actual = new DoubleMatrix(matrixArray);
		double[][] expected = {
				{ 1, 5, 9, 13 },
				{ 2, 6, 10, 14 },
				{ 3, 7, 11, 15 }, 
				{ 4, 8, 12, 16 } };
		DoubleMatrix expectedMatrix = new DoubleMatrix(expected);
		actual = Transposition.transposeMatrix(actual);
		assertEquals(expectedMatrix.toString(), actual.toString());
	}
}
