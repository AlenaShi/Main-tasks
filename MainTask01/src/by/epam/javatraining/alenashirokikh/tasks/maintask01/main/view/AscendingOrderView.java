package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program finds if the array is in the ascending order.
 * 
 * @author Alena Shirokikh
 * @version 1.0 1.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.AscendingOrder;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.UserInput;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;

public class AscendingOrderView {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = UserInput.readArrayWithSize("Enter the array");

		View.log(AscendingOrder.isOrderedAscending(array));
	}
}
