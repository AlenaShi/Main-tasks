package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class Conteiner {
	private double[] array = new double[DEFAULT_SIZE];

	public static final int DEFAULT_SIZE = 10;

	public Conteiner() {
		this.array = new double[DEFAULT_SIZE];
	}

	public Conteiner(int size) {
		if (size > 0) {
			this.array = new double[size];
		}
	}

	public Conteiner(double[] array) {
		if (array != null && array.length != 0) {
			this.array = array;
		}
	}

	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) throws NullArrayException {
		if (array != null && array.length != 0) {
			this.array = array;
		} else {
			throw new NullArrayException();
		}
	}

	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < array.length; i++) {
			builder.append(array[i]).append(", ");
		}
		builder.setCharAt(builder.length() - 2, ']');
		builder.deleteCharAt(builder.length() - 1);
		return builder.toString();
	}
}