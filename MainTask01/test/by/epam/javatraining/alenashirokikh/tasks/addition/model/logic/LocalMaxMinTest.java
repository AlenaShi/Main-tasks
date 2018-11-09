package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class LocalMaxMinTest {
	private DoubleMatrix matrix = null;

	@After
	public void destroy() {
		matrix = null;
	}

	@Test
	public void testfindLocalMax() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 5, 6 } };
		matrix = new DoubleMatrix(matrixArray);
		String result = "[1, 2]";
		assertEquals(result, LocalMaxMin.findLocalMax(matrix));
	}

	@Test
	public void testfindLocalMax1() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 10, 6 }, { 1, 5, 4 } };
		matrix = new DoubleMatrix(matrixArray);
		String result = "[1, 1]";
		assertEquals(result, LocalMaxMin.findLocalMax(matrix));
	}

	@Test
	public void testfindLocalMax2() {
		double[][] matrixArray = { { 20, 2, 3 }, { 2, 10, 6 }, { 1, 5, 4 } };
		matrix = new DoubleMatrix(matrixArray);
		String result = "[0, 0]";
		assertEquals(result, LocalMaxMin.findLocalMax(matrix));
	}

	@Test
	public void testfindLocalMax3() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 6, 10 }, { 1, 5, 4 } };
		matrix = new DoubleMatrix(matrixArray);
		String result = "[1, 2]";
		assertEquals(result, LocalMaxMin.findLocalMax(matrix));
	}

	@Test
	public void testfindLocalMin() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 5, 6 } };
		DoubleMatrix matrix = new DoubleMatrix(matrixArray);
		String result = "[0, 0]";
		assertEquals(result, LocalMaxMin.findLocalMin(matrix));
	}

	@Test
	public void testfindLocalMin1() {
		double[][] matrixArray = { { 5, 3, 3 }, { 2, 1, 6 }, { 4, 5, 7 } };
		matrix = new DoubleMatrix(matrixArray);
		String result = "[1, 1]";
		assertEquals(result, LocalMaxMin.findLocalMin(matrix));
	}

	@Test
	public void testfindLocalMin2() {
		double[][] matrixArray = { { 6, 0, 3 }, { 2, 1, 6 }, { 4, 5, 7 } };
		DoubleMatrix matrix = new DoubleMatrix(matrixArray);
		String result = "[0, 1]";
		assertEquals(result, LocalMaxMin.findLocalMin(matrix));
	}

	@Test
	public void testfindLocalMin3() {
		double[][] matrixArray = { { 6, 1, 3 }, { 2, 1, 6 }, { 4, 5, 0 } };
		matrix = new DoubleMatrix(matrixArray);
		String result = "[2, 2]";
		assertEquals(result, LocalMaxMin.findLocalMin(matrix));
	}
}
