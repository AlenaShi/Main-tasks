package com.epam.javatraining.alenashi.model.entity;

public class TriangularsSides {
	public static double getA(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public static double getB(double x2, double y2, double x3, double y3) {
		return Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
	}

	public static double getC(double x1, double y1, double x3, double y3) {
		return Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
	}
}
