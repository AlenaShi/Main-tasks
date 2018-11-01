package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program finds the extreme values.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
public class MatrixMaxMin {
	public static double findMaxValue(double[][] matrix) {
		double max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	public static double findMinValue(double[][] matrix) {
		double min = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}

		}
		return min;
	}
}
