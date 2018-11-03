package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity;

import java.util.Arrays;

public class DoubleVector {
	private double[] array;

	private static final int DEFAULT_SIZE = 10;

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
		if (array.length > index && index >= 0) {
			return array[index];
		} else {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
	}

	public void set(int index, double element) {
		if (array.length > index && index >= 0) {
			array[index] = element;
		} else {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
	}

	public DoubleVector copyOfRange(int from, int to) {
		return new DoubleVector(Arrays.copyOfRange(array, from, to));

	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (int i = 0; i < array.length; i++) {
			str.append(array[i]);
			if (i != array.length - 1) {
				str.append(", ");
			}
		}
		str.append("]");
		return str.toString();

	}

}
