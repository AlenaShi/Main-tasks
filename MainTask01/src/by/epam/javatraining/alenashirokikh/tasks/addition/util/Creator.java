package by.epam.javatraining.alenashirokikh.tasks.addition.util;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class Creator {
	public static DoubleMatrix create() {
		return new DoubleMatrix();
	}

	public static DoubleMatrix create(int size) {
		return new DoubleMatrix(size);
	}

	public static DoubleMatrix create(int size1, int size2) {
		return new DoubleMatrix(size1, size2);
	}

	public static DoubleMatrix create(double[][] array) {
		return new DoubleMatrix(array);
	}
}
