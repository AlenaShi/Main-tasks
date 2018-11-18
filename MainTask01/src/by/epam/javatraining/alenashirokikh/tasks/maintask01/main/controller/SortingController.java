package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Sorting;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.CreatorConteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.LoggerType;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.Printable;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.PrinterCreator;

public class SortingController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable printLog = PrinterCreator.create(LoggerType.LOGGER);
		try {
			Conteiner array = new Conteiner();
			Conteiner vector = CreatorConteiner.createConteiner("D://array.txt");
			printLog.print(vector);

			array = Sorting.doBubbleSortAscending(vector);
			printLog.print("Bubble sort ascending: " + array);

			array = Sorting.doBubbleSortDescending(vector);
			printLog.print("Bubble sort descending: " + array);

			array = Sorting.doInsertionSortAscending(vector);
			printLog.print("Insertion sort ascending: " + array);

			array = Sorting.doInsertionSortDescending(vector);
			printLog.print("Insertion sort descending: " + array);

			array = Sorting.doSelectionSortAscending(vector);
			printLog.print("Selection sort ascending: " + array);

			array = Sorting.doSelectionSortDescending(vector);
			printLog.print("Selection sort descending: " + array);

			array = Sorting.doMergeSortOneNonSortedArrayAscending(vector);
			printLog.print("Merge sort ascending: " + array);

			array = Sorting.doMergeSortOneNonSortedArrayDescending(vector);
			printLog.print("Merge sort descending: " + array);

			array = Sorting.doQuickAscendingSort(vector);
			printLog.print("Quick sort ascending: " + array);

			array = Sorting.doQuickDescendingSort(vector);
			printLog.print("Quick sort descending: " + array);

		} catch (NullArrayException e) {
			printLog.printError("Array is null");
		} catch (FileNotFoundException e) {
			printLog.printError("File is not found");
		} catch (IOException e) {
			printLog.printError("Problems in reading or closing file");
		}
	}

}
