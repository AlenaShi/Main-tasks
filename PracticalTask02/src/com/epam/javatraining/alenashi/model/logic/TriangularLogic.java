package com.epam.javatraining.alenashi.model.logic;

import com.epam.javatraining.alenashi.util.FigureUtils;

public class TriangularLogic {
	public static String detectTriangular(double x1, double y1, double x2, double y2, double x3, double y3) {
		String result = "";

		if (FigureUtils.isTriangular(x1, y1, x2, y2, x3, y3)) {
			if (FigureUtils.isReactTriangular(x1, y1, x2, y2, x3, y3)) {
				result = "This is a react triangular.";
			} else {
				result = "This is not a react triangular.";
			}
		} else {
			result = "This is not a triangular.";
		}
		return result;
	}
}
