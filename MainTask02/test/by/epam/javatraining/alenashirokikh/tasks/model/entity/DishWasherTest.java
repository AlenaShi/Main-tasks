package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;

public class DishWasherTest {
	private DishWasher dw;

	@Before
	public void init() throws NullElementException {
		dw = new DishWasher(1200);
	}

	@After
	public void destroy() {
		dw = null;
	}

	@Test
	public void getNameTest() {
		assertEquals("DishWasher", dw.getName());
	}

	@Test
	public void switchOnWithoutRoomTest() {
		dw.switchOn();
		assertFalse(dw.isSwitchOn());
	}

	@Test
	public void switchOnTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		dw.switchOn();
		assertTrue(dw.isSwitchOn());
	}

	@Test
	public void switchOffTest() {
		dw.switchOff();
		assertFalse(dw.isSwitchOn());
	}

	@Test
	public void getPowerTest() {
		int expected = 1200;
		assertEquals(expected, dw.getPower());
	}

	@Test(expected = NullPointerException.class)
	public void switchOffExceptionTest() {
		dw = null;
		dw.switchOff();
	}

	@Test(expected = NullPointerException.class)
	public void switchOnExceptionTest() {
		dw = null;
		dw.switchOn();
	}

	@Test(expected = NullPointerException.class)
	public void getPowerExceptionTest() {
		dw = null;
		dw.getPower();
	}

	@Test(expected = NullPointerException.class)
	public void getNameExceptionTest() {
		dw = null;
		dw.getName();
	}

	@Test
	public void hasRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		assertTrue(dw.hasRoom());
	}

	@Test
	public void hasNoRoomTest() throws NullElementException {
		assertFalse(dw.hasRoom());
	}

	@Test
	public void setRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.WASHROOM);
		dw.setRoom(room);
		assertTrue(dw.hasRoom());
	}

	@Test
	public void setAnotherRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		Room room2 = new Room(RoomTypes.KITCHEN);
		dw.setRoom(room2);
		assertEquals(room2, dw.getRoom());
	}

	@Test
	public void setRoomNullTest() throws NullElementException {
		dw.setRoom(null);
		assertFalse(dw.hasRoom());
	}

	@Test
	public void setAnotherNullRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		dw.setRoom(null);
		assertEquals(room, dw.getRoom());
	}

	@Test
	public void getRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(dw);
		assertEquals(room, dw.getRoom());
	}

	@Test(expected = NullPointerException.class)
	public void getRoomFromNullTest() throws NullElementException {
		dw = null;
		dw.getRoom();
	}

}
