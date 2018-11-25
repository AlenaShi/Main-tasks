package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.SwitchOffEquipmentException;

public class VacuumCleanerTest {
	private VacuumCleaner vc;

	@Before
	public void init() {
		vc = new VacuumCleaner(1200, "ert345h", 44);
	}

	@After
	public void destroy() {
		vc = null;
	}

	@Test
	public void cleanTest() throws SwitchOffEquipmentException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		vc.switchOn();
		vc.work();
		assertTrue(vc.isWorking());
	}

	@Test
	public void getNoise() {
		assertEquals(44, vc.getNoise(), 0.00001);
	}

	@Test
	public void clean0Test() throws SwitchOffEquipmentException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		vc.work();
		assertFalse(vc.isWorking());
	}

	@Test
	public void stopCleanTest() throws SwitchOffEquipmentException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		vc.switchOn();
		vc.work();
		vc.stopWork();
		assertFalse(vc.isWorking());
	}

}