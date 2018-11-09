package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program transposes matrix.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class Transposition {
	public static DoubleMatrix transposeMatrix(DoubleMatrix matrix) {
		int k = 0;

		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0 + k; j < matrix.size0() - k - 1; j++) {
				if (i != j || matrix.size() - j - 1 != i) {
					// 4 element swap without using another matrix
					matrix.set(i, j,
							(matrix.get(matrix.size() - j - 1, i) + matrix.get(i, j)
									+ matrix.get(matrix.size() - 1 - i, matrix.size() - j - 1)
									+ matrix.get(j, matrix.size() - 1 - i)));

					matrix.set(matrix.size() - j - 1, i,
							matrix.get(i, j) - (matrix.get(matrix.size() - j - 1, i)
									+ matrix.get(matrix.size() - 1 - i, matrix.size() - j - 1)
									+ matrix.get(j, matrix.size() - 1 - i)));

					matrix.set(matrix.size() - 1 - i, matrix.size() - j - 1,
							matrix.get(i, j) - (matrix.get(matrix.size() - j - 1, i)
									+ matrix.get(matrix.size() - 1 - i, matrix.size() - j - 1)
									+ matrix.get(j, matrix.size() - 1 - i)));

					matrix.set(j, matrix.size() - 1 - i,
							matrix.get(i, j) - (matrix.get(matrix.size() - j - 1, i)
									+ matrix.get(matrix.size() - 1 - i, matrix.size() - j - 1)
									+ matrix.get(j, matrix.size() - 1 - i)));

					matrix.set(i, j,
							matrix.get(i, j) - (matrix.get(matrix.size() - j - 1, i)
									+ matrix.get(matrix.size() - 1 - i, matrix.size() - j - 1)
									+ matrix.get(j, matrix.size() - 1 - i)));
				}
			}
			++k;
		}
		return matrix;
	}
}
