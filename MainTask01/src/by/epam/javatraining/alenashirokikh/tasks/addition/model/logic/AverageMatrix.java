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
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size0(); j++) {
				sum += matrix.get(i, j);
			}
		}
		return sum / (matrix.size() * matrix.size0());
	}

	public static double findGeometricMain(DoubleMatrix matrix) {
		double multiplication = 1;
		double rate = 1d / (matrix.size() * matrix.size0());
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size0(); j++) {
				multiplication *= matrix.get(i, j);
			}
		}
		return Math.pow(multiplication, rate);
	}
}
