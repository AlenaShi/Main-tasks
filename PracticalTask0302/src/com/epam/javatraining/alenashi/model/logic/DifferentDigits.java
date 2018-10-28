package com.epam.javatraining.alenashi.model.logic;

public class DifferentDigits {
	public static int getNumberOfDifferentDigits(int a) {
		int result = 0;

		for (int i = 0; i < 10; i++) {
			int number = a;
			while (number > 0) {
				if (number % 10 == i) {
					++result;
					break;
				}
				number /= 10;
			}
		}
		return result;

	}
}
