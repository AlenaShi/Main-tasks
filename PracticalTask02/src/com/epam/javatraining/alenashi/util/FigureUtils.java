package com.epam.javatraining.alenashi.util;

import com.epam.javatraining.alenashi.model.entity.TriangularsSides;

public class FigureUtils {
	public static boolean isTriangular(double x1, double y1, double x2, double y2, double x3, double y3) {
		double a = TriangularsSides.getA(x1, y1, x2, y2);
		double b = TriangularsSides.getB(x2, y2, x3, y3);
		double c = TriangularsSides.getC(x1, y1, x3, y3);

		return a + b > c && a + c > b && b + c > a;
	}

	public static boolean isReactTriangular(double x1, double y1, double x2, double y2, double x3, double y3) {
		double a = TriangularsSides.getA(x1, y1, x2, y2);
		double b = TriangularsSides.getB(x2, y2, x3, y3);
		double c = TriangularsSides.getC(x1, y1, x3, y3);

		return a == Math.sqrt(b * b + c * c) || b == Math.sqrt(a * a + c * c) || c == Math.sqrt(b * b + a * a);
	}
}