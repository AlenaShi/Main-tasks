package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class OrderTest {
	@Test
	public void testIsOrderedAscending() {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		DoubleVector vector = new DoubleVector(array);
		boolean expected = true;
		assertEquals(expected, Order.isOrderedAscending(vector));
	}

	@Test
	public void testIsOrderedDescending() {
		double[] array = { 50, 49, 45, 44, 34, 33, 32, 31, 29, 28, 26, 25, 24, 23, 22, 21, 19, 18, 17, 16, 15, 14, 13,
				12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		DoubleVector vector = new DoubleVector(array);
		boolean expected = true;
		assertEquals(expected, Order.isOrderedDescending(vector));
	}
}
