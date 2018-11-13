package by.epam.javatraining.alenashirokikh.tasks.addition.model.entity;

public class DoubleMatrix {
	private double[][] matrix;

	public static final int DEFAULT_SIZE = 3;

	public DoubleMatrix() {
		this.matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
	}

	public DoubleMatrix(int rows) {
		this.matrix = new double[rows][];
	}

	public DoubleMatrix(int rows, int columns) {
		this.matrix = new double[rows][columns];
	}

	public DoubleMatrix(double[][] matrix) {
		this.matrix = matrix;
	}

	public double[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				builder.append(matrix[i][j]).append(", ");
			}
		}
		builder.setCharAt(builder.length() - 2,']');
		builder.deleteCharAt(builder.length()-1);
		return builder.toString();

	}

}
