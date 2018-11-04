package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.Average;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Creator;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Initializer;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.AverageView;

public class AverageController {
	public static void main(String[] args) {
		DoubleVector vector = Creator.create();
		vector = Initializer.randomInit(vector, -10, 10);
		View.log(vector);

		double average = Average.findAverage(vector);
		View.log(AverageView.averageView(average));

		double geomAverage = Average.findGeometricAverage(vector);
		View.log(AverageView.geomAverageView(geomAverage));

	}
}
