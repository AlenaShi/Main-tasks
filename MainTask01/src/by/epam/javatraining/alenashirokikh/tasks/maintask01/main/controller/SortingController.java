package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Sorting;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Creator;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Initializer;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.View;

public class SortingController {
	private static View view = View.getLogger(SortingController.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleVector array = new DoubleVector();
		DoubleVector vector = Creator.create();
		vector = Initializer.randomInit(vector, -10, 10);
		view.log(vector);

		array = Sorting.doBubbleSortAscending(vector);
		view.log("Bubble sort ascending: " + array);

		array = Sorting.doBubbleSortDescending(vector);
		view.log("Bubble sort descending: " + array);

		array = Sorting.doInsertionSortAscending(vector);
		view.log("Insertion sort ascending: " + array);

		array = Sorting.doInsertionSortDescending(vector);
		view.log("Insertion sort descending: " + array);

		array = Sorting.doSelectionSortAscending(vector);
		view.log("Selection sort ascending: " + array);

		array = Sorting.doSelectionSortDescending(vector);
		view.log("Selection sort descending: " + array);

		array = Sorting.doMergeSortOneNonSortedArrayAscending(vector);
		view.log("Merge sort ascending: " + array);

		array = Sorting.doMergeSortOneNonSortedArrayDescending(vector);
		view.log("Merge sort descending: " + array);

		array = Sorting.doQuickSortAscending(vector, 0, vector.size() - 1);
		view.log("Quick sort ascending: " + array);

		array = Sorting.doQuickSortDescending(vector, 0, vector.size() - 1);
		view.log("Quick sort descending: " + array);
	}

}
