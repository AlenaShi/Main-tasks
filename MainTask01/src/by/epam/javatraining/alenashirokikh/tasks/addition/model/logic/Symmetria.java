package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program finds symmetric matrix.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class Symmetria {
	public static boolean isSimmetricMain(DoubleMatrix matrix) {
		boolean result = false;

		if (matrix.getMatrix().length == matrix.getMatrix()[0].length) {
			for (int i = 0; i < matrix.getMatrix().length; i++) {
				for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
					if (i != j && matrix.getMatrix()[i][j] != matrix.getMatrix()[j][i]) {
						return false;
					}
				}
			}
			result = true;
		}
		return result;
	}

	public static boolean isSimmetricSide(DoubleMatrix matrix) {
		boolean result = false;

		if (matrix.getMatrix().length == matrix.getMatrix()[0].length) {
			for (int i = 0; i < matrix.getMatrix().length; i++) {
				for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
					if (matrix.getMatrix().length - j - 1 != i && matrix.getMatrix()[i][j] != matrix
							.getMatrix()[matrix.getMatrix().length - j - 1][matrix.getMatrix().length - i - 1]) {
						return false;
					}
				}
			}
			result = true;
		}
		return result;
	}
}
