package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program finds the extreme values.
 * 
 * @author Alena Shirokikh
 * @version 2.0 3.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;


public class MatrixMaxMin {
	public static double findMaxValue(DoubleMatrix matrix) {
		double max = matrix.get(0, 0);
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size0(); j++) {
				if (matrix.get(i, j) > max) {
					max = matrix.get(i, j);
				}
			}
		}
		return max;
	}

	public static double findMinValue(DoubleMatrix matrix) {
		double min = matrix.get(0, 0);
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size0(); j++) {
				if (matrix.get(i, j) < min) {
					min = matrix.get(i, j);
				}
			}
		}
		return min;
	}
}