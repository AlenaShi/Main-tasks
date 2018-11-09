package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.ExtremeFinder;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Creator;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Initializer;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.View;

public class ExtremeFinderController {
	private static View view = View.getLogger(ExtremeFinderController.class);

	public static void main(String[] args) {
		DoubleVector vector = Creator.create();
		vector = Initializer.randomInit(vector, -10, 10);
		view.log(vector);

		String max = ExtremeFinder.findMaxValue(vector);
		view.log("Max value is " + max);

		String min = ExtremeFinder.findMinValue(vector);
		view.log("Min value is " + min);

		double locMax = ExtremeFinder.findLocalMax(vector);
		view.log("Local max value is " + locMax);

		double locMin = ExtremeFinder.findLocalMin(vector);
		view.log("Local min value is " + locMin);
	}

}
