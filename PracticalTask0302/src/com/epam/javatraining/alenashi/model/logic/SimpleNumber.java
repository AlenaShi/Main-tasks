package com.epam.javatraining.alenashi.model.logic;

public class SimpleNumber {
	public static String isSimpleNumber(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return "not a simple number";
			}
		}
		return "simple number";
	}
}
