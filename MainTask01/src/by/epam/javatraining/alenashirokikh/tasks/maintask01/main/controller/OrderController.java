package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Order;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.CreatorConteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.PrintLog;

public class OrderController {
	private static PrintLog printLog = PrintLog.getLogger(OrderController.class);

	public static void main(String[] args) throws NullArrayException {
		// TODO Auto-generated method stub
		try {
			DoubleVector vector = CreatorConteiner.createConteiner("D://array.txt");
			printLog.print(vector);

			boolean orderAsc = Order.isOrderedAscending(vector);
			printLog.print("Is the array in the ascending order? " + orderAsc);

			boolean orderDesc = Order.isOrderedDescending(vector);
			printLog.print("Is the array in the descending order? " + orderDesc);

		} catch (NullArrayException e) {
			printLog.erLog("Array is null");
		} catch (FileNotFoundException e) {
			printLog.erLog("File is not found");
		} catch (IOException e) {
			printLog.erLog("Problems in reading or closing file");
		}
	}

}