package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Sorting;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.CreatorConteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.PrintLog;

public class SortingController {
	private static PrintLog printLog = PrintLog.getLogger(ExtremeFinderController.class);

	public static void main(String[] args) throws NullArrayException {
		// TODO Auto-generated method stub
		try {
			DoubleVector array = new DoubleVector();
			DoubleVector vector = CreatorConteiner.createConteiner("D://array.txt");
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
			printLog.erLog("Array is null");
		} catch (FileNotFoundException e) {
			printLog.erLog("File is not found");
		} catch (IOException e) {
			printLog.erLog("Problems in reading or closing file");
		}
	}

}
