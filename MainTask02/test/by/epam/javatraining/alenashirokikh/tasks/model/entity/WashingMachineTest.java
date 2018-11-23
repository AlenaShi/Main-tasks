package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.entity.WashingMachine.WashingTypes;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.SwitchOffEquipmentException;

public class WashingMachineTest {
	private WashingMachine wm;

	@Before
	public void init() {
		wm = new WashingMachine(1200);
	}

	@After
	public void destroy() {
		wm = null;
	}

	@Test
	public void washTest() throws SwitchOffEquipmentException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(wm);
		wm.switchOn();
		wm.wash(WashingTypes.COTTON);
		assertTrue(wm.isWorking());
	}

	@Test(expected = SwitchOffEquipmentException.class)
	public void washSwitchOffTest() throws SwitchOffEquipmentException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(wm);
		wm.wash(WashingTypes.SOFT);
	}

	@Test
	public void stopWashTest() throws SwitchOffEquipmentException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(wm);
		wm.switchOn();
		wm.wash(WashingTypes.CLEANING);
		wm.stopWash();
		assertFalse(wm.isWorking());
	}

	@Test
	public void equalsRefTest() {
		Equipment wm2 = new WashingMachine(1200);
		assertTrue(wm.equals(wm2));
	}

	@Test
	public void equalsDifferentRefTest() {
		Equipment wm2 = new Refrigerator(1000);
		assertFalse(wm.equals(wm2));
	}

	@Test
	public void equalsRefWithNullTest() {
		Equipment wm2 = null;
		assertFalse(wm.equals(wm2));
	}

	@Test
	public void equalsRefWithOtherClassTest() {
		Room room = new Room(RoomTypes.KITCHEN, "kitchen");
		assertFalse(wm.equals(room));
	}

	@Test(expected = NullPointerException.class)
	public void equalsFromNullTest() {
		wm = null;
		Equipment wm2 = new WashingMachine(1000);
		wm.equals(wm2);
	}

	@Test
	public void hashCodeTest() {
		Equipment wm2 = new WashingMachine(1200);
		assertTrue(wm.hashCode() == wm2.hashCode());
	}

	@Test(expected = NullPointerException.class)
	public void hashCodeNullTest() {
		wm = null;
		wm.hashCode();
	}
}
