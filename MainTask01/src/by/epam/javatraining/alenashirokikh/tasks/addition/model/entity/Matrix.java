package by.epam.javatraining.alenashirokikh.tasks.addition.model.entity;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class Matrix {
	private double[][] matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];

	public static final int DEFAULT_SIZE = 3;

	public Matrix() {
		this.matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
	}

	public Matrix(int rows) {
		if (rows > 0) {
			this.matrix = new double[rows][];
		}
	}

	public Matrix(int rows, int columns) {
		if (rows > 0 && columns > 0) {
			this.matrix = new double[rows][columns];
		}
	}

	public Matrix(double[][] matrix) {
		if (matrix != null && matrix.length != 0) {
			this.matrix = matrix;
		}
	}

	public double[][] getMatrix() throws NullMatrixException {
		if (matrix != null && matrix.length != 0) {
			return matrix;
		} else {
			throw new NullMatrixException();
		}
	}

	public void setMatrix(double[][] matrix) throws NullMatrixException {
		if (matrix != null && matrix.length != 0) {
			this.matrix = matrix;
		} else {
			throw new NullMatrixException();
		}
	}

	public String toString() {
		if (matrix != null && matrix.length != 0) {
			StringBuilder builder = new StringBuilder("[");
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
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