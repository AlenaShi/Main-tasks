package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AverageTest {
	@Test
	public void testFindAverage() {
		double[] array = { 1, 2, 3, 1, 2, 3 };
		double average = 2;
		double delta = 0.001;
		assertEquals(average, Average.findAverage(array), delta);
	}

	@Test
	public void testFindGeometricMain() {
		double[] array = { 1, 1, 1, 1, 1, 1 };
		double geometricMain = 1;
		double delta = 0.001;
		assertEquals(geometricMain, Average.findAverage(array), delta);
	}

}
