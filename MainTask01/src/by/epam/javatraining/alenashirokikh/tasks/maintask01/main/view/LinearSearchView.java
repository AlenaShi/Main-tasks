package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program finds the element with using linear search.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.LinearSearch;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class LinearSearchView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double element = UserInput.readNumber("Enter the item you are looking for");

		double[] array = UserInput.readArrayWithSize("Enter the array");

		View.log(LinearSearch.findElementByLinearSearch(array, element));
	}

}
