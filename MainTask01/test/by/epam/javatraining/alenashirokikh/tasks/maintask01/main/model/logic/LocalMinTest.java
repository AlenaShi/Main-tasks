package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LocalMinTest {
	@Test
	public void testFindAverage() {
		double[] array = { 1, 2, 3, 5, 2, 3 };
		int index = 0;
		assertEquals(index, LocalMin.findLocalMin(array));
	}
}
