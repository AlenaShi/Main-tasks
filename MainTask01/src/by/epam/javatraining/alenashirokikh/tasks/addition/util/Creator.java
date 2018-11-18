package by.epam.javatraining.alenashirokikh.tasks.addition.util;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;

public class Creator {
	public static Matrix create() {
		return new Matrix();
	}

	public static Matrix create(int size1, int size2) {
		return new Matrix(size1, size2);
	}

	public static Matrix create(double[][] array) {
		return new Matrix(array);
	}
}
