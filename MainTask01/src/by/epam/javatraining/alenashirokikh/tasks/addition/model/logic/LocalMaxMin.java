package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program finds the local extreme values.
 * 
 * @author Alena Shirokikh
 * @version 1.0 5.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class LocalMaxMin {
	public static int[] findLocalMax(DoubleMatrix matrix) {
		for (int i = 0; i < matrix.getMatrix().length; i++) {
			for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
				boolean isMax = true;
				if (i - 1 >= 0) {
					isMax = matrix.getMatrix()[i][j] > matrix.getMatrix()[i - 1][j];
				}
				if (isMax && j - 1 >= 0) {
					isMax = matrix.getMatrix()[i][j] > matrix.getMatrix()[i][j - 1];
				}
				if (isMax && i + 1 < matrix.getMatrix().length) {
					isMax = matrix.getMatrix()[i][j] > matrix.getMatrix()[i + 1][j];
				}
				if (isMax && j + 1 < matrix.getMatrix()[0].length) {
					isMax = matrix.getMatrix()[i][j] > matrix.getMatrix()[i][j + 1];
				}
				if (isMax) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1 };
	}

	public static int[] findLocalMin(DoubleMatrix matrix) {
		for (int i = 0; i < matrix.getMatrix().length; i++) {
			for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
				boolean isMin = true;
				if (i - 1 >= 0) {
					isMin = matrix.getMatrix()[i][j] < matrix.getMatrix()[i - 1][j];
				}
				if (isMin && j - 1 >= 0) {
					isMin = matrix.getMatrix()[i][j] < matrix.getMatrix()[i][j - 1];
				}
				if (isMin && i + 1 < matrix.getMatrix().length) {
					isMin = matrix.getMatrix()[i][j] < matrix.getMatrix()[i + 1][j];
				}
				if (isMin && j + 1 < matrix.getMatrix()[0].length) {
					isMin = matrix.getMatrix()[i][j] < matrix.getMatrix()[i][j + 1];
				}
				if (isMin) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1 };
	}
}
