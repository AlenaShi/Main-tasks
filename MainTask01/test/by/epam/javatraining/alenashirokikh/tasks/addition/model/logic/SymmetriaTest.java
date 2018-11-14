package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NullMatrixException;

public class SymmetriaTest {
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
	public void testIsSimmetricMain() throws NullMatrixException {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };
		matrix.setMatrix(matrixArray);
		assertTrue(Symmetria.isSimmetricMain(matrix));
	}

	@Test
	public void testIsSimmetricMainFalse() throws NullMatrixException {
		double[][] matrixArray = { { 1, 2, 3 }, { 1, 1, 4 }, { 3, 4, 1 } };
		matrix.setMatrix(matrixArray);
		assertFalse(Symmetria.isSimmetricMain(matrix));
	}

	@Test(expected = NullMatrixException.class)
	public void testisSimmetricMainException() throws NullMatrixException {
		matrix = null;
		Symmetria.isSimmetricMain(matrix);
	}

	@Test
	public void testIsSimmetricSide() throws NullMatrixException {
		double[][] matrixArray = { { 3, 4, 1 }, { 2, 1, 4 }, { 1, 2, 3 } };
		matrix.setMatrix(matrixArray);
		assertTrue(Symmetria.isSimmetricSide(matrix));
	}

	@Test
	public void testIsSimmetricSideFalse() throws NullMatrixException {
		double[][] matrixArray = { { 2, 4, 1 }, { 2, 1, 4 }, { 1, 2, 3 } };
		matrix.setMatrix(matrixArray);
		assertFalse(Symmetria.isSimmetricSide(matrix));
	}

	@Test(expected = NullMatrixException.class)
	public void testisSimmetricSideException() throws NullMatrixException {
		matrix = null;
		Symmetria.isSimmetricSide(matrix);
	}
}
