package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Order;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.CreatorConteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.LoggerType;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.Printable;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.PrinterCreator;

public class OrderController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable printLog = PrinterCreator.create(LoggerType.LOGGER);
		try {

			Conteiner vector = CreatorConteiner.createConteiner("D://array.txt");
			printLog.print(vector);

			boolean orderAsc = Order.isOrderedAscending(vector);
			printLog.print("Is the array in the ascending order? " + orderAsc);

			boolean orderDesc = Order.isOrderedDescending(vector);
			printLog.print("Is the array in the descending order? " + orderDesc);

		} catch (NullArrayException e) {
			printLog.printError("Array is null");
		} catch (FileNotFoundException e) {
			printLog.printError("File is not found");
		} catch (IOException e) {
			printLog.printError("Problems in reading or closing file");
		}
	}

}