package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class OrderTest {
	private Conteiner vector = null;

	@Before
	public void init() {
		vector = new Conteiner();
	}

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testIsOrderedAscending() throws NullArrayException {
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		vector = new Conteiner(array);
		assertTrue(Order.isOrderedAscending(vector));
	}

	@Test
	public void testIsNotOrderedAscending() throws NullArrayException {
		double[] array = { 1, 2, 3, 5, 4, 6, 7, 8, 9, 10, 11 };
		vector.setArray(array);
		assertFalse(Order.isOrderedAscending(vector));
	}

	@Test
	public void testIsOrderedDescending() throws NullArrayException {
		double[] array = { 50, 49, 45, 44, 34, 33, 32, 31, 29, 28, 26, 25, 24, 23, 22, 21, 19, 18, 17, 16, 15, 14, 13,
				12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		vector.setArray(array);
		assertTrue(Order.isOrderedDescending(vector));
	}

	@Test
	public void testIsNotOrderedDescending() throws NullArrayException {
		double[] array = { 50, 49, 45, 44, 34, 33, 32, 31, 29, 28, 26, 25, 24, 23, 22, 21, 19, 18, 17, 16, 15, 14, 13,
				12, 11, 16, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		vector.setArray(array);
		assertFalse(Order.isOrderedDescending(vector));
	}

	@Test(expected = NullArrayException.class)
	public void testOrderAscendingNullException() throws NullArrayException {
		vector = null;
		Order.isOrderedAscending(vector);
	}

	@Test(expected = NullArrayException.class)
	public void testOrderDescendingNullException() throws NullArrayException {
		vector = null;
		Order.isOrderedDescending(vector);
	}
}