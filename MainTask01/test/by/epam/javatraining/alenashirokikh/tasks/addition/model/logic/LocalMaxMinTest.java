package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class LocalMaxMinTest {
	private Matrix matrix = null;

	@Before
	public void init() {
		matrix = new Matrix();
	}

	@After
	public void destroy() {
		matrix = null;
	}

	@Test
	public void testfindLocalMax() throws NullMatrixException {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 5, 6 } };
		matrix.setMatrix(matrixArray);
		int[] expected = { 1, 2 };
		assertArrayEquals(expected, LocalMaxMin.findLocalMax(matrix));
	}

	@Test
	public void testfindLocalMax1() throws NullMatrixException {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 10, 6 }, { 1, 5, 4 } };
		matrix.setMatrix(matrixArray);
		int[] expected = { 1, 1 };
		assertArrayEquals(expected, LocalMaxMin.findLocalMax(matrix));
	}

	@Test
	public void testfindLocalMax2() throws NullMatrixException {
		double[][] matrixArray = { { 20, 2, 3 }, { 2, 10, 6 }, { 1, 5, 4 } };
		matrix.setMatrix(matrixArray);
		int[] expected = { 0, 0 };
		assertArrayEquals(expected, LocalMaxMin.findLocalMax(matrix));
	}

	@Test
	public void testfindLocalMax3() throws NullMatrixException {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 6, 10 }, { 1, 5, 4 } };
		matrix.setMatrix(matrixArray);
		int[] expected = { 1, 2 };
		assertArrayEquals(expected, LocalMaxMin.findLocalMax(matrix));
	}

	@Test(expected = NullMatrixException.class)
	public void testfindLocalMaxException() throws NullMatrixException {
		matrix = null;
		LocalMaxMin.findLocalMax(matrix);
	}

	@Test
	public void testfindLocalMin() throws NullMatrixException {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 5, 6 } };
		matrix.setMatrix(matrixArray);
		int[] expected = { 0, 0 };
		assertArrayEquals(expected, LocalMaxMin.findLocalMin(matrix));
	}

	@Test
	public void testfindLocalMin1() throws NullMatrixException {
		double[][] matrixArray = { { 5, 3, 3 }, { 2, 1, 6 }, { 4, 5, 7 } };
		matrix.setMatrix(matrixArray);
		int[] expected = { 1, 1 };
		assertArrayEquals(expected, LocalMaxMin.findLocalMin(matrix));
	}

	@Test
	public void testfindLocalMin2() throws NullMatrixException {
		double[][] matrixArray = { { 6, 0, 3 }, { 2, 1, 6 }, { 4, 5, 7 } };
		matrix.setMatrix(matrixArray);
		int[] expected = { 0, 1 };
		assertArrayEquals(expected, LocalMaxMin.findLocalMin(matrix));
	}

	@Test
	public void testfindLocalMin3() throws NullMatrixException {
		double[][] matrixArray = { { 6, 1, 3 }, { 2, 1, 6 }, { 4, 5, 0 } };
		matrix.setMatrix(matrixArray);
		int[] expected = { 2, 2 };
		assertArrayEquals(expected, LocalMaxMin.findLocalMin(matrix));
	}

	@Test(expected = NullMatrixException.class)
	public void testfindLocalMinException() throws NullMatrixException {
		matrix = null;
		LocalMaxMin.findLocalMin(matrix);
	}

}
