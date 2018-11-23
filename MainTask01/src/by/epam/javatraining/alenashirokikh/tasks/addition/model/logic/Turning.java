package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class Turning {
	public static Matrix turnOnQuater(Matrix matrix) throws NullMatrixException {
		int k = 0;

		for (int i = 0; i < matrix.getMatrix().length; i++) {
			for (int j = 0 + k; j < matrix.getMatrix()[0].length - k - 1; j++) {
				if (i != j || matrix.getMatrix().length - j - 1 != i) {
					// 4 element swap without using another matrix
					matrix.getMatrix()[i][j] = matrix.getMatrix()[matrix.getMatrix().length - j - 1][i]
							+ matrix.getMatrix()[i][j]
							+ matrix.getMatrix()[matrix.getMatrix().length - 1 - i][matrix.getMatrix().length - j - 1]
							+ matrix.getMatrix()[j][matrix.getMatrix().length - 1 - i];

					matrix.getMatrix()[matrix.getMatrix().length - j
							- 1][i] = matrix.getMatrix()[i][j]
									- (matrix.getMatrix()[matrix.getMatrix().length - j - 1][i]
											+ matrix.getMatrix()[matrix.getMatrix().length - 1
													- i][matrix.getMatrix().length - j - 1]
											+ matrix.getMatrix()[j][matrix.getMatrix().length - 1 - i]);

					matrix.getMatrix()[matrix.getMatrix().length - 1 - i][matrix.getMatrix().length - j
							- 1] = matrix.getMatrix()[i][j]
									- (matrix.getMatrix()[matrix.getMatrix().length - j - 1][i]
											+ matrix.getMatrix()[matrix.getMatrix().length - 1
													- i][matrix.getMatrix().length - j - 1]
											+ matrix.getMatrix()[j][matrix.getMatrix().length - 1 - i]);

					matrix.getMatrix()[j][matrix.getMatrix().length - 1
							- i] = matrix.getMatrix()[i][j]
									- (matrix.getMatrix()[matrix.getMatrix().length - j - 1][i]
											+ matrix.getMatrix()[matrix.getMatrix().length - 1
													- i][matrix.getMatrix().length - j - 1]
											+ matrix.getMatrix()[j][matrix.getMatrix().length - 1 - i]);

					matrix.getMatrix()[i][j] = matrix.getMatrix()[i][j]
							- (matrix.getMatrix()[matrix.getMatrix().length - j - 1][i]
									+ matrix.getMatrix()[matrix.getMatrix().length - 1 - i][matrix.getMatrix().length
											- j - 1]
									+ matrix.getMatrix()[j][matrix.getMatrix().length - 1 - i]);
				}
			}
			++k;
		}
		return matrix;

	}
}
