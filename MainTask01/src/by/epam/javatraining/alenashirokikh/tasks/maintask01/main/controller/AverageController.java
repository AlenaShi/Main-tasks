package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Average;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.CreatorConteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.LoggerType;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.Printable;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.PrinterCreator;

public class AverageController {
	public static void main(String[] args) throws NullArrayException {
		Printable printLog = PrinterCreator.create(LoggerType.LOGGER);
		try {
			Conteiner vector = CreatorConteiner.createConteiner("D://array.txt");
			printLog.print(vector);

			double average = Average.findAverage(vector);
			printLog.print("The average is " + average);

			double geomAverage = Average.findGeometricAverage(vector);
			printLog.print("The geometric average is " + geomAverage);

		} catch (NullArrayException e) {
			printLog.printError("Array is null");
		} catch (FileNotFoundException e) {
			printLog.printError("File is not found");
		} catch (IOException e) {
			printLog.printError("Problems in reading or closing file");
		}
	}
}