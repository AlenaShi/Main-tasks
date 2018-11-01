package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program sorts an array in the descending order with using bubble sort.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.BubbleSortDescending;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class BubbleSortDescendingView {

	public static void main(String[] args) {
		double[] array = UserInput.readArrayWithSize("Enter the array");
		array = BubbleSortDescending.doBubbleSort(array);
		String result = "";

		for (int i = 0; i < array.length; i++) {
			result += array[i] + " ";
		}

		View.log(result);
	}
}
