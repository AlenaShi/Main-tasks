package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds the average and the geometric main of the array.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class Average {
	public static double findAverage(double[] array) {
		double sum = array[0];
		for (int i = 1; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;//O(n)
	}

	public static double findGeometricMain(double[] array) {
		double rate = 1d / array.length;
		double multiplication = array[0];
		for (int i = 1; i < array.length; i++) {
			multiplication *= array[i];
		}
		return Math.pow(multiplication, rate);//O(n)
	}
}
