package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util;

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

	public static double[] readArrayWithSize(String msg) {
		int size = UserInput.readNumber("Enter size of array");
		System.out.println(msg);
		double[] array = new double[size];
		int count = 0;
		while (count < size && in.hasNextDouble()) {
			array[count] = in.nextDouble();
			++count;
		}
		return array;
	}
}
