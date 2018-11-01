package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program finds an element with using binary search.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.BinarySearch;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class BinarySearchView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double element = UserInput.readNumber("Enter the item you are looking for");

		double[] array = UserInput.readArrayWithSize("Enter the array");

		View.log(BinarySearch.findElementByBinarySearch(array, element));
	}

}
