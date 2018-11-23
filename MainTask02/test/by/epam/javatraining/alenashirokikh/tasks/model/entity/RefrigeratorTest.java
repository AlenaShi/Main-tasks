package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RefrigeratorTest {
	private Refrigerator ref;

	@Before
	public void init() {
		ref = new Refrigerator(1200);
	}

	@After
	public void destroy() {
		ref = null;
	}

	@Test
	public void getVolume0Test() {
		assertEquals(0, ref.getVolume(), 0.001);
	}

	@Test
	public void getVolumeTest() {
		ref = new Refrigerator(1000, 100, 5, -14);
		assertEquals(100, ref.getVolume(), 0.001);
	}

	@Test
	public void getTemperatureTest() {
		assertEquals(0, ref.getTemperature());
	}

	@Test
	public void setTemperature() {
		ref.setTemperature(8);
		assertEquals(8, ref.getTemperature());
	}

	@Test
	public void getFreezerTemperature() {
		assertEquals(0, ref.getFreezerTemperature());
	}

	@Test
	public void setFreezerTemperature() {
		ref.setFreezerTemperature(-20);
		assertEquals(-20, ref.getFreezerTemperature());
	}

	@Test
	public void equalsDifferentRefTest() {
		Device ref2 = new Refrigerator(1000);
		assertFalse(ref.equals(ref2));
	}

	@Test
	public void equalsRefWithNullTest() {
		Device ref2 = null;
		assertFalse(ref.equals(ref2));
	}

	@Test
	public void equalsRefWithOtherClassTest() {
		Room room = new Room(RoomTypes.KITCHEN, "kitchen");
		assertFalse(ref.equals(room));
	}

	@Test(expected = NullPointerException.class)
	public void equalsFromNullTest() {
		ref = null;
		Device ref2 = new Refrigerator(1000);
		ref.equals(ref2);
	}

	@Test
	public void hashCodeTest() {
		Device ref2 = new Refrigerator(1200);
		assertTrue(ref.hashCode() == ref2.hashCode());
	}

	@Test(expected = NullPointerException.class)
	public void hashCodeNullTest() {
		ref = null;
		ref.hashCode();
	}
}
