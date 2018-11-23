package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;

public class WashingMachineTest {
	private WashingMachine wm;

	@Before
	public void init() throws NullElementException {
		wm = new WashingMachine(1200);
	}

	@After
	public void destroy() {
		wm = null;
	}

	@Test
	public void getNameTest() {
		assertEquals("Washing mashine", wm.getName());
	}

	@Test
	public void switchOnWithoutRoomTest() {
		wm.switchOn();
		assertFalse(wm.isSwitchOn());
	}

	@Test
	public void switchOnTest() throws NullElementException {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(wm);
		wm.switchOn();
		assertTrue(wm.isSwitchOn());
	}

	@Test
	public void switchOffTest() {
		wm.switchOff();
		assertFalse(wm.isSwitchOn());
	}

	@Test
	public void getPowerTest() {
		int expected = 1200;
		assertEquals(expected, wm.getPower());
	}

	@Test(expected = NullPointerException.class)
	public void switchOffExceptionTest() {
		wm = null;
		wm.switchOff();
	}

	@Test(expected = NullPointerException.class)
	public void switchOnExceptionTest() {
		wm = null;
		wm.switchOn();
	}

	@Test(expected = NullPointerException.class)
	public void getPowerExceptionTest() {
		wm = null;
		wm.getPower();
	}

	@Test(expected = NullPointerException.class)
	public void getNameExceptionTest() {
		wm = null;
		wm.getName();
	}

	@Test
	public void hasRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(wm);
		assertTrue(wm.hasRoom());
	}

	@Test
	public void hasNoRoomTest() throws NullElementException {
		assertFalse(wm.hasRoom());
	}

	@Test
	public void setRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.WASHROOM);
		wm.setRoom(room);
		assertTrue(wm.hasRoom());
	}

	@Test
	public void setAnotherRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(wm);
		Room room2 = new Room(RoomTypes.WASHROOM);
		wm.setRoom(room2);
		assertEquals(room2, wm.getRoom());
	}

	@Test
	public void setRoomNullTest() throws NullElementException {
		wm.setRoom(null);
		assertFalse(wm.hasRoom());
	}

	@Test
	public void setAnotherNullRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(wm);
		wm.setRoom(null);
		assertEquals(room, wm.getRoom());
	}

	@Test
	public void getRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(wm);
		assertEquals(room, wm.getRoom());
	}

	@Test(expected = NullPointerException.class)
	public void getRoomFromNullTest() throws NullElementException {
		wm = null;
		wm.getRoom();
	}

	@Test
	public void equalsRefTest() {
		Device wm2 = new WashingMachine(1200);
		assertTrue(wm.equals(wm2));
	}

	@Test
	public void equalsDifferentRefTest() {
		Device wm2 = new Refrigerator(1000);
		assertFalse(wm.equals(wm2));
	}

	@Test
	public void equalsRefWithNullTest() {
		Device wm2 = null;
		assertFalse(wm.equals(wm2));
	}

	@Test
	public void equalsRefWithOtherClassTest() {
		Room room = new Room(RoomTypes.KITCHEN, "kitchen");
		assertFalse(wm.equals(room));
	}

	@Test(expected = NullPointerException.class)
	public void equalsFromNullTest() throws NullElementException {
		wm = null;
		Device wm2 = new WashingMachine(1000);
		wm.equals(wm2);
	}

	@Test
	public void hashCodeTest() {
		Device wm2 = new WashingMachine(1200);
		assertTrue(wm.hashCode() == wm2.hashCode());
	}

	@Test(expected = NullPointerException.class)
	public void hashCodeNullTest() {
		wm = null;
		wm.hashCode();
	}

	@Test
	public void hashCode2Test() {
		Device wm2 = new WashingMachine(1000);
		assertFalse(wm.hashCode() == wm2.hashCode());
	}

}
