package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Average;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Creator;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Initializer;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.View;

public class AverageController {
	private static View view = View.getLogger(AverageController.class);

	public static void main(String[] args) {
		DoubleVector vector = Creator.create();
		vector = Initializer.randomInit(vector, -10, 10);
		view.log(vector);

		String average = Average.findAverage(vector);
		view.log("The average is " + average);

		String geomAverage = Average.findGeometricAverage(vector);
		view.log("The geometric average is " + geomAverage);
	}
}