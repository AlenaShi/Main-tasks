package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program finds the average and the geometric main of the array.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
public class AverageMatrix {
	public static double findAverage(double[][] matrix) {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sum += matrix[i][j];
			}
		}
		return sum / (matrix.length * matrix[0].length);
	}

	public static double findGeometricMain(double[][] matrix) {
		double multiplication = 1;
		double rate = 1d / (matrix.length * matrix[0].length);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				multiplication *= matrix[i][j];
			}
		}
		return Math.pow(multiplication, rate);
	}
}
