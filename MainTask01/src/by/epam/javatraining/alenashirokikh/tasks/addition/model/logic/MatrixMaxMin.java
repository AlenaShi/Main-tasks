package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program finds the extreme values.
 * 
 * @author Alena Shirokikh
 * @version 2.0 3.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class MatrixMaxMin {
	public static double findMaxValue(Matrix matrix) throws NullMatrixException {
		if (matrix != null && matrix.getMatrix().length != 0) {
			double max = matrix.getMatrix()[0][0];
			for (int i = 0; i < matrix.getMatrix().length; i++) {
				for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
					if (matrix.getMatrix()[i][j] > max) {
						max = matrix.getMatrix()[i][j];
					}
				}
			}
			return max;
		} else {
			throw new NullMatrixException("Matrix should be not null");

		}

	}

	public static double findMinValue(Matrix matrix) throws NullMatrixException {
		if (matrix != null && matrix.getMatrix().length != 0) {
			double min = matrix.getMatrix()[0][0];
			for (int i = 0; i < matrix.getMatrix().length; i++) {
				for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
					if (matrix.getMatrix()[i][j] < min) {
						min = matrix.getMatrix()[i][j];
					}
				}
			}
			return min;
		} else {
			throw new NullMatrixException("Matrix should be not null");

		}
	}
}