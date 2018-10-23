package com.epam.javatraining.alenashi.tasks;

import java.util.Random;

public class Task01 {
	public static String getCount() {
		Random rand = new Random();
		int heads = 0;
		int tails = 0;
		for (int i = 0; i < 1000; i++) {
			int number = rand.nextInt(2);
			if (number == 0) {
				++heads;
			} else {
				++tails;
			}
		}
		return "heads " + heads + ", tails " + tails;
	}
}
