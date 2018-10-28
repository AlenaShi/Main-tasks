package com.epam.javatraining.alenashi.model.logic;

public class LCM {
	public static int getLCM(int a, int b) {
		return a * b / TheGCD.getGreatestCommonDivisor(a, b);
	}
}
