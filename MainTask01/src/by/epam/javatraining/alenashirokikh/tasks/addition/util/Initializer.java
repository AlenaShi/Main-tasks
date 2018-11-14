package by.epam.javatraining.alenashirokikh.tasks.addition.util;

import java.util.Random;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;

public class Initializer {
	public static Matrix randomInit(Matrix vector, int from, int to) {
		Random rand = new Random();
		for (int i = 0; i < vector.getMatrix().length; i++) {
			for (int j = 0; j < vector.getMatrix()[0].length; j++) {

				vector.getMatrix()[i][j] = (double) (rand.nextInt(to - from + 1) + from);
			}
		}
		return vector;
	}
}
