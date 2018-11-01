package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DescendingOrderTest {
	@Test
	public void testIsOrderedDescending() {
		double[] array = { 50, 49, 45, 44, 34, 33, 32, 31, 29, 28, 26, 25, 24, 23, 22, 21, 19, 18, 17, 16, 15, 14, 13,
				12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		boolean result = true;
		assertEquals(result, DescendingOrder.isOrderedDescending(array));
	}
}
