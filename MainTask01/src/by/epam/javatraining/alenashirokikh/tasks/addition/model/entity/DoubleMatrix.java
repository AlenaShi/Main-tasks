package by.epam.javatraining.alenashirokikh.tasks.addition.model.entity;

public class DoubleMatrix {
	private double[][] matrix;

	public static final int DEFAULT_SIZE = 2;

	public DoubleMatrix() {
		this.matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
	}

	public DoubleMatrix(int size) {
		this.matrix = new double[size][];
	}

	public DoubleMatrix(int size1, int size2) {
		this.matrix = new double[size1][size2];
	}

	public DoubleMatrix(double[][] matrix) {
		this.matrix = matrix;
	}

	public double[][] getMatrix() {
		return matrix;
	}

	public double[][] setMatrix(double[][] matrix) {
		return this.matrix = matrix;
	}

	public int size() {
		return matrix.length;
	}

	public int size0() {
		return matrix[0].length;
	}

	public double get(int i, int j) {
		return matrix[i][j];
	}

	public void set(int i, int j, double element) {
		matrix[i][j] = element;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				builder.append(matrix[i][j]);
				if (j != matrix[0].length - 1 || i != matrix.length - 1) {
					builder.append(", ");
				}
			}
		}
		builder.append("]");
		return builder.toString();

	}

}
