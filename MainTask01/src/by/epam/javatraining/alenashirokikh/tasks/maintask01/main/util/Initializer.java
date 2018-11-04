package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util;

import java.util.Random;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class Initializer {
	public static DoubleVector randomInit(DoubleVector vector, int from, int to) {
		Random rand = new Random();
		for (int i = 0; i < vector.size(); i++) {
			vector.set(i, (double) (rand.nextInt(to - from + 1) + from));
		}
		return vector;
	}
}
