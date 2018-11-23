package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

public class VacuumCleanerTest {
	private VacuumCleaner vc;

	@Before
	public void init() throws NullElementException {
		vc = new VacuumCleaner(1200);
	}

	@After
	public void destroy() {
		vc = null;
	}

	@Test
	public void getNameTest() {
		assertEquals("Vacuum cleaner", vc.getName());
	}

	@Test
	public void switchOnWithoutRoomTest() {
		vc.switchOn();
		assertFalse(vc.isSwitchOn());
	}

	@Test
	public void switchOnTest() throws NullElementException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		vc.switchOn();
		assertTrue(vc.isSwitchOn());
	}

	@Test
	public void switchOffTest() {
		vc.switchOff();
		assertFalse(vc.isSwitchOn());
	}

	@Test
	public void getPowerTest() {
		int expected = 1200;
		assertEquals(expected, vc.getPower());
	}

	@Test(expected = NullPointerException.class)
	public void switchOffExceptionTest() {
		vc = null;
		vc.switchOff();
	}

	@Test(expected = NullPointerException.class)
	public void switchOnExceptionTest() {
		vc = null;
		vc.switchOn();
	}

	@Test(expected = NullPointerException.class)
	public void getPowerExceptionTest() {
		vc = null;
		vc.getPower();
	}

	@Test(expected = NullPointerException.class)
	public void getNameExceptionTest() {
		vc = null;
		vc.getName();
	}

	@Test
	public void hasRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(vc);
		assertTrue(vc.hasRoom());
	}

	@Test
	public void hasNoRoomTest() throws NullElementException {
		assertFalse(vc.hasRoom());
	}

	@Test
	public void setRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.WASHROOM);
		vc.setRoom(room);
		assertTrue(vc.hasRoom());
	}

	@Test
	public void setAnotherRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		Room room2 = new Room(RoomTypes.STOREROOM);
		vc.setRoom(room2);
		assertEquals(room2, vc.getRoom());
	}

	@Test
	public void setRoomNullTest() throws NullElementException {
		vc.setRoom(null);
		assertFalse(vc.hasRoom());
	}

	@Test
	public void setAnotherNullRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		vc.setRoom(null);
		assertEquals(room, vc.getRoom());
	}

	@Test
	public void getRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		assertEquals(room, vc.getRoom());
	}

	@Test(expected = NullPointerException.class)
	public void getRoomFromNullTest() throws NullElementException {
		vc = null;
		vc.getRoom();
	}

	@Test
	public void CleanTest() throws UsingSwitchOffDeviceException, NullElementException {
		Room room = new Room(RoomTypes.STOREROOM);
		room.addDevice(vc);
		vc.switchOn();
		vc.clean();
		assertTrue(vc.isWorking());
	}

}