package by.epam.javatraining.alenashirokikh.tasks.addition.view;

/**
 * The program finds the extreme values.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.MatrixMaxMin;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.addition.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class MatrixMaxMinView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matrix = UserInput.readMatrixWithSize("Enter the matrix by columns");

		View.log("max " + MatrixMaxMin.findMaxValue(matrix));
		View.log("min " + MatrixMaxMin.findMinValue(matrix));
	}

}
