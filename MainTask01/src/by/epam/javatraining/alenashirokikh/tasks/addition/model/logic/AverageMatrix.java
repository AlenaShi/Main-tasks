package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

/**
 * The program finds the average and the geometric main of the matrix.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class AverageMatrix {
	public static double findAverage(DoubleMatrix matrix) {
		double sum = 0;
		for (int i = 0; i < matrix.getMatrix().length; i++) {
			for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
				sum += matrix.getMatrix()[i][j];
			}
		}
		return sum / (matrix.getMatrix().length * matrix.getMatrix()[0].length);
	}

	public static double findGeometricMain(DoubleMatrix matrix) {
		double multiplication = 1;
		double rate = 1d / (matrix.getMatrix().length * matrix.getMatrix()[0].length);
		for (int i = 0; i < matrix.getMatrix().length; i++) {
			for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
				multiplication *= matrix.getMatrix()[i][j];
			}
		}
		return Math.pow(multiplication, rate);
	}
}
