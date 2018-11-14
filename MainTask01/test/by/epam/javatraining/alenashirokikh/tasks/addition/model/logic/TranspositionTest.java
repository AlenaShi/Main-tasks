package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class TranspositionTest {
	private Matrix actual;

	@Before
	public void init() {
		actual = new Matrix();
	}

	@After
	public void destroy() {
		actual = null;
	}

	@Test
	public void testTranspose1() throws NullMatrixException {
		double[][] matrixArray = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } };
		actual.setMatrix(matrixArray);
		double[][] expected = {
				{ 1, 4, 7 },
				{ 2, 5, 8 }, 
				{ 3, 6, 9 } };
		Matrix expectedMatrix = new Matrix(expected);
		actual = Transposition.transposeMatrix(actual);
		assertEquals(expectedMatrix.toString(), actual.toString());
	}

	@Test
	public void testTranspose2() throws NullMatrixException {
		double[][] matrixArray = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		actual.setMatrix(matrixArray);
		double[][] expected = {
				{ 1, 5, 9, 13 },
				{ 2, 6, 10, 14 }, 
				{ 3, 7, 11, 15 }, 
				{ 4, 8, 12, 16 } };
		Matrix expectedMatrix = new Matrix(expected);
		actual = Transposition.transposeMatrix(actual);
		assertEquals(expectedMatrix.toString(), actual.toString());
	}

	@Test(expected = NullMatrixException.class)
	public void testTransposeException() throws NullMatrixException {
		actual = null;
		Transposition.transposeMatrix(actual);
	}
}