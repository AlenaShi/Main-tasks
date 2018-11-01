package by.epam.javatraining.alenashirokikh.tasks.addition.view;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.Transposition;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.addition.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class TranspositionView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matrix = UserInput.readMatrixWithSize("Enter the matrix by columns");
		matrix = Transposition.transposeMatrix(matrix);
		String result="";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				result+=matrix[i][j] + " ";
			}
		}
		View.log(result);
	}

}
