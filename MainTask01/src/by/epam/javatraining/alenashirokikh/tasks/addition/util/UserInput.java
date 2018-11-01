package by.epam.javatraining.alenashirokikh.tasks.addition.util;

/**
 * The program helps input number or the array with a given size.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import java.util.Scanner;

public class UserInput {
	static Scanner in;
	static {
		in = new Scanner(System.in);
	}

	public static int readNumber(String msg) {
		System.out.println(msg);
		return in.nextInt();
	}

	public static double[][] readMatrixWithSize(String msg) {
		int colMatrix = UserInput.readNumber("Enter number of columns");
		int strMatrix = UserInput.readNumber("Enter number of strings");
		System.out.println(msg);
		double[][] matrix = new double[colMatrix][strMatrix];

		for (int i = 0; i < colMatrix; i++) {
			for (int j = 0; j < strMatrix; j++) {
				if (in.hasNextDouble()) {
					matrix[i][j] = in.nextDouble();
				}
			}
		}
		return matrix;
	}
}
