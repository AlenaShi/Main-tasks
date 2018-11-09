package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class TranspositionTest {
	@Test
	public void testTransposition() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };
		DoubleMatrix matrix = new DoubleMatrix(matrixArray);
		double[][] result = { { 3, 4, 1 }, { 2, 1, 4 }, { 1, 2, 3 } };
		DoubleMatrix matrixResult = new DoubleMatrix(result);
		double delta = 0.0001;
		matrix = Transposition.transposeMatrix(matrix);
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size(); j++) {
				assertEquals(matrixResult.get(i, j), matrix.get(i, j), delta);

			}

		}
	}
}
