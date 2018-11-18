package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.ExtremeFinder;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.CreatorConteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.LoggerType;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.Printable;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.PrinterCreator;

public class ExtremeFinderController {

	public static void main(String[] args) {
		Printable printLog = PrinterCreator.create(LoggerType.LOGGER);
		try {
			Conteiner vector = CreatorConteiner.createConteiner("D://array.txt");
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
			printLog.printError("Array is null");
		} catch (FileNotFoundException e) {
			printLog.printError("File is not found");
		} catch (IOException e) {
			printLog.printError("Problems in reading or closing file");
		}
	}

}
