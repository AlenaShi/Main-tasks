package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Average;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.CreatorConteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.PrintLog;

public class AverageController {
	private static PrintLog printLog = PrintLog.getLogger(AverageController.class);

	public static void main(String[] args) throws NullArrayException {
		try {
			DoubleVector vector = CreatorConteiner.createConteiner("D://array.txt");
			printLog.print(vector);

			double average = Average.findAverage(vector);
			printLog.print("The average is " + average);

			double geomAverage = Average.findGeometricAverage(vector);
			printLog.print("The geometric average is " + geomAverage);
			
		} catch (NullArrayException e) {
			printLog.erLog("Array is null");
		} catch (FileNotFoundException e) {
			printLog.erLog("File is not found");
		} catch (IOException e) {
			printLog.erLog("Problems in reading or closing file");
		}
	}
}