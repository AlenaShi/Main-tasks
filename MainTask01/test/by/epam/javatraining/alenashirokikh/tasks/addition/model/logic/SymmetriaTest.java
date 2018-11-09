package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.DoubleMatrix;

public class SymmetriaTest {
	@Test
	public void testIsSimmetricMain() {
		double[][] matrixArray = { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };
		DoubleMatrix matrix = new DoubleMatrix(matrixArray);
		boolean result = true;
		assertEquals(result, Symmetria.isSimmetricMain(matrix));
	}

	@Test
	public void testIsSimmetricSide() {
		double[][] matrixArray = { { 3, 4, 1 }, { 2, 1, 4 }, { 1, 2, 3 } };
		DoubleMatrix matrix = new DoubleMatrix(matrixArray);
		boolean result = true;
		assertEquals(result, Symmetria.isSimmetricSide(matrix));
	}
}
