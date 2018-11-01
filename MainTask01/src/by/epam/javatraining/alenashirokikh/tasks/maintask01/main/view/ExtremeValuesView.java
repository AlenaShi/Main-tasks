package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program finds the extreme values.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.ExtremeValues;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class ExtremeValuesView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = UserInput.readArrayWithSize("Enter the array");

		View.log("max " + ExtremeValues.findMaxValue(array));
		View.log("min " + ExtremeValues.findMinValue(array));
	}

}
