package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

public class DishWasherTest {
	private DishWasher dw;

	@Before
	public void init() {
		dw = new DishWasher(1200);
	}

	@After
	public void destroy() {
		dw = null;
	}

	@Test
	public void washTest() throws UsingSwitchOffDeviceException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		dw.switchOn();
		dw.wash(DishWashingTypes.GLASS);
		assertTrue(dw.isWorking());
	}

	@Test(expected=UsingSwitchOffDeviceException.class)
	public void washSwitchOffTest() throws UsingSwitchOffDeviceException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		dw.wash(DishWashingTypes.GLASS);
	}

	@Test
	public void stopWashTest() throws UsingSwitchOffDeviceException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		dw.switchOn();
		dw.wash(DishWashingTypes.GLASS);
		dw.stopWash();
		assertFalse(dw.isWorking());
	}

}
