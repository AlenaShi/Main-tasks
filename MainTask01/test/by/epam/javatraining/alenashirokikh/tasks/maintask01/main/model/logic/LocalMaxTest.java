package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LocalMaxTest {
	@Test
	public void testFindAverage() {
		double[] array = { 1, 2, 3 };
		int index = 2;
		assertEquals(index, LocalMax.findLocalMax(array));
	}
}
