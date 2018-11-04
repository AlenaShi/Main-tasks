package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class Creator {
	public static DoubleVector create() {
		return new DoubleVector();
	}

	public static DoubleVector create(int size) {
		return new DoubleVector(size);
	}

	public static DoubleVector create(double[] array) {
		return new DoubleVector(array);
	}
}
