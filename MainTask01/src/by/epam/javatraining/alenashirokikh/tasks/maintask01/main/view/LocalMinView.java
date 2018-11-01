package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program finds local minimum.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.LocalMin;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class LocalMinView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = UserInput.readArrayWithSize("Enter the array");

		View.log("Local minimum " + LocalMin.findLocalMin(array));
	}

}
