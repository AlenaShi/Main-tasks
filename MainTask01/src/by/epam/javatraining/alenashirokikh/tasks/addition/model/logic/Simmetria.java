package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

public class Simmetria {
	public static boolean isSimmetricMain(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == j || matrix[i][j] == matrix[j][i]) {
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isSimmetricSide(double[][] matrix) {
		matrix = Transposition.transposeMatrix(matrix);
		return Simmetria.isSimmetricMain(matrix);
	}
}
