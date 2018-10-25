package com.epam.javatraining.alenashi.model.logic;

public class SimpleDividers {
	public static String getSimpleDividers(int a) {
		String result = "The simple dividers are 1";
		boolean simpleA = true;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				if (isSimpleNumber(i)) {
					result += ", " + i;
					simpleA = false;
				}
			}
		}

		if (simpleA) {
			result += ", " + a;
		}
		return result;
	}

	public static boolean isSimpleNumber(int d) {
		for (int i = 2; i < d; i++) {
			if (d % i == 0) {
				return false;
			}
		}
		return true;
	}
}