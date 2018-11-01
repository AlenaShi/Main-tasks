package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

public class Transposition {
	public static double[][] transposeMatrix(double[][] matrix) {
		int k = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0 + k; j < matrix[0].length - k - 1; j++) {
				if (matrix.length - j - 1 == i && i == j) {
					continue;
				} else {
					matrix[i][j] = matrix[matrix.length - j - 1][i] + matrix[i][j]
							+ matrix[matrix.length - 1 - i][matrix.length - j - 1] + matrix[j][matrix.length - 1 - i];
					matrix[matrix.length - j - 1][i] = matrix[i][j] - (matrix[matrix.length - j - 1][i]
							+ matrix[matrix.length - 1 - i][matrix.length - j - 1] + matrix[j][matrix.length - 1 - i]);
					matrix[matrix.length - 1 - i][matrix.length - j - 1] = matrix[i][j]
							- (matrix[matrix.length - j - 1][i] + matrix[matrix.length - 1 - i][matrix.length - j - 1]
									+ matrix[j][matrix.length - 1 - i]);
					matrix[j][matrix.length - 1 - i] = matrix[i][j] - (matrix[matrix.length - j - 1][i]
							+ matrix[matrix.length - 1 - i][matrix.length - j - 1] + matrix[j][matrix.length - 1 - i]);
					matrix[i][j] = matrix[i][j] - (matrix[matrix.length - j - 1][i]
							+ matrix[matrix.length - 1 - i][matrix.length - j - 1] + matrix[j][matrix.length - 1 - i]);

				}
			}
			++k;
		}
		return matrix;
	}
}
