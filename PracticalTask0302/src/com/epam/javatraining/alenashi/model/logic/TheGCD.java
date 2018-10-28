package com.epam.javatraining.alenashi.model.logic;

public class TheGCD {
	public static int getGreatestCommonDivisor(int a, int b) {
		int result = 1;
		for (int i = 2; i <= getLeastNum(a, b); i++) {
			while (a % i == 0 && b % i == 0) {
				a /= i;
				b /= i;
				result *= i;
			}
		}
		return result;
	}

	public static int getLeastNum(int a, int b) {
		return (a <= b ? a : b);
	}
}
