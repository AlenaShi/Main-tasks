package com.epam.javatraining.alenashi.model.logic;

public class PerfectNumberLogic {
	public static int getNumber(int a) {
		int sum = 0;
		for (int i = 1; i <= a / 2; i++) {
			sum = getDivider(sum, a, i);

		}
		return sum;
	}

	public static int getDivider(int sum, int a, int i) {
		if (a % i == 0) {
			sum += i;
		}
		return sum;
	}

	public static String isPerfect(int a) {
		if (getNumber(a) == a) {
			return "a perfect number";
		}
		return "not a perfect number";
	}
}
