package com.epam.javatraining.alenashi.model.logic;

public class MaxNumber {
	public static int getNumber(int a) {
		int max = 0;

		while (a > 0) {
			int num = a % 10;
			if (num > max) {
				max = num;
			}
			a /= 10;
		}

		return max;
	}

}
