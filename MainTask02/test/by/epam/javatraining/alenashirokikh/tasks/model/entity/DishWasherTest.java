package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.entity.DishWasher.DishWashingTypes;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.SwitchOffEquipmentException;

public class DishWasherTest {
	private DishWasher dw;

	@Before
	public void init() {
		dw = new DishWasher(1200, "ert345h");
	}

	@After
	public void destroy() {
		dw = null;
	}

	@Test
	public void workTest() throws SwitchOffEquipmentException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		dw.switchOn();
		dw.work(DishWashingTypes.GLASS);
		assertTrue(dw.isWorking());
	}

	@Test(expected = SwitchOffEquipmentException.class)
	public void workSwitchOffTest() throws SwitchOffEquipmentException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		dw.work(DishWashingTypes.GLASS);
	}

	@Test
	public void stopWorkTest() throws SwitchOffEquipmentException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		dw.switchOn();
		dw.work(DishWashingTypes.GLASS);
		dw.stopWork();
		assertFalse(dw.isWorking());
	}

}
