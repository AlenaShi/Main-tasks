package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AscendingOrderTest {
	@Test
	public void testIsOrderedAscending() {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		boolean result = true;
		assertEquals(result, AscendingOrder.isOrderedAscending(array));
	}
}
