package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class SymmetriaTest {
	private DoubleMatrix matrix = null;

	@Before
	public void init() {
		matrix = new DoubleMatrix();
	}

	@After
	public void destroy() {
		matrix = null;
	}

	@Test
	public void testIsSimmetricMain() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };
		matrix.setMatrix(matrixArray);
		assertTrue(Symmetria.isSimmetricMain(matrix));
	}

	@Test
	public void testIsSimmetricMainFalse() {
		double[][] matrixArray = { { 1, 2, 3 }, { 1, 1, 4 }, { 3, 4, 1 } };
		matrix.setMatrix(matrixArray);
		assertFalse(Symmetria.isSimmetricMain(matrix));
	}

	@Test
	public void testIsSimmetricSide() {
		double[][] matrixArray = { { 3, 4, 1 }, { 2, 1, 4 }, { 1, 2, 3 } };
		matrix.setMatrix(matrixArray);
		assertTrue(Symmetria.isSimmetricSide(matrix));
	}

	@Test
	public void testIsSimmetricSideFalse() {
		double[][] matrixArray = { { 2, 4, 1 }, { 2, 1, 4 }, { 1, 2, 3 } };
		matrix.setMatrix(matrixArray);
		assertFalse(Symmetria.isSimmetricSide(matrix));
	}
}
