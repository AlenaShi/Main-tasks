package com.epam.javatraining.alenashi.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangularLogicTest {
	@Test
	public void testDetectReactTriangular() {
		double x1 = 1;
		double y1 = 1;
		double x2 = 3;
		double y2 = 1;
		double x3 = 1;
		double y3 = 3;
		String result = "This is a react triangular.";
		assertEquals(result, TriangularLogic.detectTriangular(x1, y1, x2, y2, x3, y3));
	}

	@Test
	public void testDetectNotAReactTriangular() {
		double x1 = 1;
		double y1 = 1;
		double x2 = 3;
		double y2 = 1;
		double x3 = 2;
		double y3 = 4;
		String result = "This is not a react triangular.";
		assertEquals(result, TriangularLogic.detectTriangular(x1, y1, x2, y2, x3, y3));
	}

	@Test
	public void testDetectNotATriangular() {
		double x1 = 1;
		double y1 = 1;
		double x2 = 2;
		double y2 = 1;
		double x3 = 3;
		double y3 = 1;
		String result = "This is not a triangular.";
		assertEquals(result, TriangularLogic.detectTriangular(x1, y1, x2, y2, x3, y3));
	}

}
