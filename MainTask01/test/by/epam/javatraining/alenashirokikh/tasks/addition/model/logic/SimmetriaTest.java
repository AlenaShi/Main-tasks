package by.epam.javatraining.alenashirokikh.tasks.addition.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimmetriaTest {
	@Test
	public void testIsSimmetricMain() {
		double[][] matrix = { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };
		boolean result = true;
		assertEquals(result, Simmetria.isSimmetricMain(matrix));
	}

	@Test
	public void testIsSimmetricSide() {
		double[][] matrix = { { 3, 4, 1 }, { 2, 1, 4 }, { 1, 2, 3 } };
		boolean result = true;
		assertEquals(result, Simmetria.isSimmetricSide(matrix));
	}
}
