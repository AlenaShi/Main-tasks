package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TranspositionTest {
	@Test
	public void testIsSimmetricMain() {
		double[][] matrix = { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };
		double[][] result = { { 3, 4, 1 }, { 2, 1, 4 }, { 1, 2, 3 } };
		double delta = 0.0001;
		matrix = Transposition.transposeMatrix(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				assertEquals(result[i][j], matrix[i][j], delta);

			}

		}
	}
}
