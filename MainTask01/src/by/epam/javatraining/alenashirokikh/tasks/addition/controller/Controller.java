package by.epam.javatraining.alenashirokikh.tasks.addition.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NotValidMatrixException;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.AverageMatrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.LocalMaxMin;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.MatrixMaxMin;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.Symmetria;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.logic.Transposition;
import by.epam.javatraining.alenashirokikh.tasks.addition.util.CreatorMatrix;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.LoggerType;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.Printable;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.PrinterCreator;

public class Controller {
	public static void main(String[] args) {
		Printable printLog = PrinterCreator.create(LoggerType.LOGGER);
		try {
			Matrix vector;
			vector = CreatorMatrix.createSquareMatrix("D://matrix.txt");
			printLog.print(vector);

			double average = AverageMatrix.findAverage(vector);
			printLog.print("The average is " + average);

			double geomAverage = AverageMatrix.findGeometricMain(vector);
			printLog.print("The geometric average is " + geomAverage);

			double maxValue = MatrixMaxMin.findMaxValue(vector);
			printLog.print("The max value is " + maxValue);

			double minValue = MatrixMaxMin.findMinValue(vector);
			printLog.print("The min value is " + minValue);

			int[] localMax = LocalMaxMin.findLocalMax(vector);
			printLog.print("The localMax is " + Arrays.toString(localMax));

			int[] localMin = LocalMaxMin.findLocalMin(vector);
			printLog.print("The localMin is " + Arrays.toString(localMin));

			boolean simmetry = Symmetria.isSimmetricMain(vector);
			printLog.print("Is this matrix is simmetry by main diagonal? " + simmetry);

			boolean simmetrySide = Symmetria.isSimmetricSide(vector);
			printLog.print("Is this matrix is simmetry by side diagonal? " + simmetrySide);

			printLog.print(vector);

			Matrix matrixResult = Transposition.transposeMatrix(vector);
			printLog.print("Matrix transposition: " + matrixResult);

		} catch (NotValidMatrixException e) {
			printLog.printError("Matrix is not square.");
		} catch (NullMatrixException e) {
			printLog.printError("Matrix is null.");
		} catch (FileNotFoundException e) {
			printLog.printError("File is not found");
		} catch (IOException e) {
			printLog.printError("Problems in reading or closing file");
		}
	}
}