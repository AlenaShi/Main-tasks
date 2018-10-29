package com.epam.javatraining.alenashi.model.logic;

public class MoodSensor {
	public static String detectMood(int a) {
		String result = "";
		if (a <= 4) {
			result = ":(";
		} else if (a <= 7) {
			result = ":|";
		} else {
			result = ":)";
		}
		return result;
	}
}
