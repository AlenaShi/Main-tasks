package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class AverageTest {
	private DoubleVector vector = null;

	@Before
	public void init() {
		vector = new DoubleVector();
	}

	@After
	public void destroy() {
		vector = null;
	}

	@Test
	public void testFindAverage() throws NullArrayException {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		vector.setArray(array);
		double expected = 2.0;
		double delta = 0.0001;
		assertEquals(expected, Average.findAverage(vector), delta);
	}

	@Test
	public void testFindGeometricAverage() throws NullArrayException {
		double[] array = { 1, 1, 1, 1, 1, 1 };
		vector.setArray(array);
		double expected = 1.0;
		double delta = 0.0001;
		assertEquals(expected, Average.findAverage(vector), delta);
	}

	@Test(expected = NullArrayException.class)
	public void testAverageNullException() throws NullArrayException {
		vector = null;
		Average.findAverage(vector);
	}

	@Test(expected = NullArrayException.class)
	public void testGeomAverageNullException() throws NullArrayException {
		vector = null;
		Average.findGeometricAverage(vector);
	}

}
