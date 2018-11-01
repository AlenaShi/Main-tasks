package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program finds the average and the geometric main of the array.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Average;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class AverageView {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = UserInput.readArrayWithSize("Enter the array");

		View.log("Average " + Average.findAverage(array));
		View.log("Geometric main " +Average.findGeometricMain(array));
	}
}
