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
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size0(); j++) {
				if (i == j || matrix.get(i, j) == matrix.get(j, i)) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
		}
		return result;
	}

	public static boolean isSimmetricSide(DoubleMatrix matrix) {
		matrix = Transposition.transposeMatrix(matrix);
		return Symmetria.isSimmetricMain(matrix);
	}
}
