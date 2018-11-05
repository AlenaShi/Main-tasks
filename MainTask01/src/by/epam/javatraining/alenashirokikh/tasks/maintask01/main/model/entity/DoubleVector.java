package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity;

import java.util.Arrays;

public class DoubleVector {
	private double[] array;

	public static final int DEFAULT_SIZE = 10;

	public DoubleVector() {
		this.array = new double[DEFAULT_SIZE];
	}

	public DoubleVector(int size) {
		this.array = new double[size];
	}

	public DoubleVector(double[] array) {
		this.array = array;
	}

	public double[] getArray() {
		return array;
	}

	public double[] setArray(double[] array) {
		return this.array = array;
	}

	public int size() {
		return array.length;
	}

	public double get(int index) {
			return array[index];
	}

	public void set(int index, double element) {
			array[index] = element;
	}

	public DoubleVector copyOfRange(int from, int to) {
		return new DoubleVector(Arrays.copyOfRange(array, from, to));
	}

	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++) {
			builder.append(array[i]);
			if (i != array.length - 1) {
				builder.append(", ");
			}
		}
		builder.append("]");
		return builder.toString();

	}

}
