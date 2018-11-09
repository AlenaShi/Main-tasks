package by.epam.javatraining.alenashirokikh.tasks.addition.controller;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.AverageMatrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.LocalMaxMin;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.MatrixMaxMin;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.Symmetria;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.Transposition;
import by.epam.javatraining.alenashirokikh.tasks.addition.util.Creator;
import by.epam.javatraining.alenashirokikh.tasks.addition.util.Initializer;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller.AverageController;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.View;

public class Controller {
	private static View view = View.getLogger(AverageController.class);

	public static void main(String[] args) {

		DoubleMatrix vector = Creator.create();
		vector = Initializer.randomInit(vector, -10, 10);
		view.log(vector);

		double average = AverageMatrix.findAverage(vector);
		view.log("The average is " + average);

		double geomAverage = AverageMatrix.findGeometricMain(vector);
		view.log("The geometric average is " + geomAverage);

		double maxValue = MatrixMaxMin.findMaxValue(vector);
		view.log("The max value is " + maxValue);

		double minValue = MatrixMaxMin.findMinValue(vector);
		view.log("The min value is " + minValue);

		String localMax = LocalMaxMin.findLocalMax(vector);
		view.log("The localMax is " + localMax);

		String localMin = LocalMaxMin.findLocalMin(vector);
		view.log("The localMin is " + localMin);

		boolean simmetry = Symmetria.isSimmetricMain(vector);
		view.log("Is this matrix is simmetry by main diagonal? " + simmetry);

		boolean simmetrySide = Symmetria.isSimmetricSide(vector);
		view.log("Is this matrix is simmetry by side diagonal? " + simmetrySide);

		view.log(vector);

		DoubleMatrix matrixResult = Transposition.transposeMatrix(vector);
		view.log("Matrix transposition: " + matrixResult);

	}

}
