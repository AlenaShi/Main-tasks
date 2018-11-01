package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program reverses the array.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Reversing;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class ReversingView {

	public static void main(String[] args) {
		double[] array = UserInput.readArrayWithSize("Enter array");
		// TODO Auto-generated method stub
		array = Reversing.reverseArray(array);
		String result = "";

		for (int i = 0; i < array.length; i++) {
			result += array[i] + " ";
		}

		View.log(result);
	}
}
