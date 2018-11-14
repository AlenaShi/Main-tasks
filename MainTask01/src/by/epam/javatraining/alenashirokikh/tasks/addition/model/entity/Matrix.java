package by.epam.javatraining.alenashirokikh.tasks.addition.model.entity;

public class Matrix {
	private double[][] matrix;

	public static final int DEFAULT_SIZE = 3;

	public Matrix() {
		this.matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
	}

	public Matrix(int rows) {
		if (rows > 0) {
			this.matrix = new double[rows][];
		} else {
			this.matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
		}
	}

	public Matrix(int rows, int columns) {
		if (rows > 0 && columns > 0) {
			this.matrix = new double[rows][columns];
		} else {
			this.matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
		}
	}

	public Matrix(double[][] matrix) {
		if (matrix.length != 0) {
			this.matrix = matrix;
		} else {
			this.matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
		}
	}

	public double[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(double[][] matrix) {
		if (matrix.length != 0) {
			this.matrix = matrix;
		} else {
			this.matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
		}
	}

	public String toString() {
		if (matrix != null && matrix.length != 0) {
			StringBuilder builder = new StringBuilder("[");
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					builder.append(matrix[i][j]).append(", ");
				}
			}
			builder.setCharAt(builder.length() - 2, ']');
			builder.deleteCharAt(builder.length() - 1);
			return builder.toString();
		}
		return "Matrix is null";

	}
}
