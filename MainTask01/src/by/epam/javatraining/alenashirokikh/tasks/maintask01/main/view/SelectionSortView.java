package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program sorts an array in the ascending order with using selection
 * sorting.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.SelectionSort;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class SelectionSortView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = UserInput.readArrayWithSize("Enter the array.");
		array = SelectionSort.doSelectionSort(array);
		String result = "";

		for (int i = 0; i < array.length; i++) {
			result += array[i] + " ";
		}

		View.log(result);
	}

}
