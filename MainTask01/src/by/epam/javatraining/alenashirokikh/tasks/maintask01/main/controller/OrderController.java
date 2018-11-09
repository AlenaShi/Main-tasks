package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Order;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Creator;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Initializer;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.View;

public class OrderController {
	private static View view = View.getLogger(OrderController.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleVector vector = Creator.create();
		vector = Initializer.randomInit(vector, -10, 10);
		view.log(vector);

		boolean orderAsc = Order.isOrderedAscending(vector);
		view.log("Is the array in the ascending order? " + orderAsc);

		boolean orderDesc = Order.isOrderedDescending(vector);
		view.log("Is the array in the descending order? " + orderDesc);

	}

}
