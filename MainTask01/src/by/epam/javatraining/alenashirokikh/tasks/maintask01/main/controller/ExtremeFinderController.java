package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.controller;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic.ExtremeFinder;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Creator;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.Initializer;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util.View;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view.ExtremeFinderView;

public class ExtremeFinderController {
	public static void main(String[] args) {
		DoubleVector vector = Creator.create();
		vector = Initializer.randomInit(vector, -10, 10);
		View.log(vector);

		double max = ExtremeFinder.findMaxValue(vector);
		View.log(ExtremeFinderView.maxValueView(max));

		double min = ExtremeFinder.findMinValue(vector);
		View.log(ExtremeFinderView.minValueView(min));

		double locMax = ExtremeFinder.findLocalMax(vector);
		View.log(ExtremeFinderView.localMaxView(locMax));

		double locMin = ExtremeFinder.findLocalMin(vector);
		View.log(ExtremeFinderView.localMinView(locMin));
	}

}
