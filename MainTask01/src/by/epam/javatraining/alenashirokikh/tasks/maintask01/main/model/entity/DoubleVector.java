package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity;

public class DoubleVector {
	private double[] array;

	private static final int DEFAULT_SIZE = 10;

	public DoubleVector() {
		this.array = new double[DEFAULT_SIZE];
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

	public void set(double element, int index) {
		if (array.length > index && index >= 0) {
			array[index] = element;
		} else {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
	}

}
