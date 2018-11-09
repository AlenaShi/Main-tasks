package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program finds the local extreme values.
 * 
 * @author Alena Shirokikh
 * @version 1.0 5.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class LocalMaxMin {
	public static String findLocalMax(DoubleMatrix matrix) {
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size0(); j++) {
				boolean isMax = true;
				if (i - 1 >= 0) {
					isMax = matrix.get(i, j) > matrix.get(i - 1, j);
				}
				if (isMax && j - 1 >= 0) {
					isMax = matrix.get(i, j) > matrix.get(i, j - 1);
				}
				if (isMax && i + 1 < matrix.size()) {
					isMax = matrix.get(i, j) > matrix.get(i + 1, j);
				}
				if (isMax && j + 1 < matrix.size0()) {
					isMax = matrix.get(i, j) > matrix.get(i, j + 1);
				}
				if (isMax) {
					return "[" + i + ", " + j + "]";
				}
			}
		}
		return "-1";
	}

	public static String findLocalMin(DoubleMatrix matrix) {
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size0(); j++) {
				boolean isMin = true;
				if (i - 1 >= 0) {
					isMin = matrix.get(i, j) < matrix.get(i - 1, j);
				}
				if (isMin && j - 1 >= 0) {
					isMin = matrix.get(i, j) < matrix.get(i, j - 1);
				}
				if (isMin && i + 1 < matrix.size()) {
					isMin = matrix.get(i, j) < matrix.get(i + 1, j);
				}
				if (isMin && j + 1 < matrix.size0()) {
					isMin = matrix.get(i, j) < matrix.get(i, j + 1);
				}
				if (isMin) {
					return "[" + i + ", " + j + "]";
				}
			}
		}
		return "-1";
	}
}
