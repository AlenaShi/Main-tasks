package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

public class VacuumCleanerTest {
	private VacuumCleaner vc;

	@Before
	public void init() {
		vc = new VacuumCleaner(1200);
	}

	@After
	public void destroy() {
		vc = null;
	}

	@Test
	public void cleanTest() throws UsingSwitchOffDeviceException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		vc.switchOn();
		vc.clean();
		assertTrue(vc.isWorking());
	}

	@Test(expected = UsingSwitchOffDeviceException.class)
	public void clean0Test() throws UsingSwitchOffDeviceException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		vc.clean();
	}

	@Test
	public void stopCleanTest() throws UsingSwitchOffDeviceException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		vc.switchOn();
		vc.clean();
		vc.stopClean();
		assertFalse(vc.isWorking());
	}

}