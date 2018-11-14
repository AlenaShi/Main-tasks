package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program transposes matrix.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class Transposition {
	public static Matrix transposeMatrix(Matrix matrix) throws NullMatrixException {
		if (matrix != null && matrix.getMatrix().length != 0) {
			int k = 0;
			for (int i = 0; i < matrix.getMatrix().length; i++) {
				for (int j = k; j < matrix.getMatrix()[0].length; j++) {
					if (i != j) {
						matrix.getMatrix()[i][j] = matrix.getMatrix()[i][j] + matrix.getMatrix()[j][i];
						matrix.getMatrix()[j][i] = matrix.getMatrix()[i][j] - matrix.getMatrix()[j][i];
						matrix.getMatrix()[i][j] = matrix.getMatrix()[i][j] - matrix.getMatrix()[j][i];
					}
				}
				k++;
			}
			return matrix;
		} else {
			throw new NullMatrixException("Matrix should be not null");
		}
	}
}
