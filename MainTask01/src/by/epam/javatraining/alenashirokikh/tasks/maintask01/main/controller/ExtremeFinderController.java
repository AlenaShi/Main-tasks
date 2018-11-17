package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.ExtremeFinder;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.CreatorConteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.PrintLog;

public class ExtremeFinderController {
	private static PrintLog printLog = PrintLog.getLogger(ExtremeFinderController.class);

	public static void main(String[] args) throws NullArrayException {
		try {
			DoubleVector vector = CreatorConteiner.createConteiner("D://array.txt");
			printLog.print(vector);

			double max = ExtremeFinder.findMaxValue(vector);
			printLog.print("Max value is " + max);

			double min = ExtremeFinder.findMinValue(vector);
			printLog.print("Min value is " + min);

			double locMax = ExtremeFinder.findLocalMax(vector);
			printLog.print("Local max value is " + locMax);

			double locMin = ExtremeFinder.findLocalMin(vector);
			printLog.print("Local min value is " + locMin);
			
		} catch (NullArrayException e) {
			printLog.erLog("Array is null");
		} catch (FileNotFoundException e) {
			printLog.erLog("File is not found");
		} catch (IOException e) {
			printLog.erLog("Problems in reading or closing file");
		}
	}

}
