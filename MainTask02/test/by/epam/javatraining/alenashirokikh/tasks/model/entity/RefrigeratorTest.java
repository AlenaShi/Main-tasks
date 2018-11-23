package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;

public class RefrigeratorTest {
	private Device ref;

	@Before
	public void init() throws NullElementException {
		ref = new Refrigerator(1200);
	}

	@After
	public void destroy() {
		ref = null;
	}

	@Test
	public void getNameTest() {
		assertEquals("Refrigerator", ref.getName());
	}

	@Test
	public void switchOnWithoutRoomTest() {
		ref.switchOn();
		assertFalse(ref.isSwitchOn());
	}

	@Test
	public void switchOnTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(ref);
		ref.switchOn();
		assertTrue(ref.isSwitchOn());
	}

	@Test
	public void switchOffTest() {
		ref.switchOff();
		assertFalse(ref.isSwitchOn());
	}

	@Test
	public void getPowerTest() {
		int expected = 1200;
		assertEquals(expected, ref.getPower());
	}

	@Test(expected = NullPointerException.class)
	public void switchOffExceptionTest() {
		ref = null;
		ref.switchOff();
	}

	@Test(expected = NullPointerException.class)
	public void switchOnExceptionTest() {
		ref = null;
		ref.switchOn();
	}

	@Test(expected = NullPointerException.class)
	public void getPowerExceptionTest() {
		ref = null;
		ref.getPower();
	}

	@Test(expected = NullPointerException.class)
	public void getNameExceptionTest() {
		ref = null;
		ref.getName();
	}

	@Test
	public void hasRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(ref);
		assertTrue(ref.hasRoom());
	}

	@Test
	public void hasNoRoomTest() throws NullElementException {
		assertFalse(ref.hasRoom());
	}

	@Test
	public void setRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		ref.setRoom(room);
		assertTrue(ref.hasRoom());
	}

	@Test
	public void setAnotherRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(ref);
		Room room2 = new Room(RoomTypes.KITCHEN);
		ref.setRoom(room2);
		assertEquals(room2, ref.getRoom());
	}

	@Test
	public void setRoomNullTest() throws NullElementException {
		ref.setRoom(null);
		assertFalse(ref.hasRoom());
	}

	@Test
	public void setAnotherNullRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(ref);
		ref.setRoom(null);
		assertEquals(room, ref.getRoom());
	}

	@Test
	public void getRoomTest() throws NullElementException {
		Room room = new Room(RoomTypes.KITCHEN);
		room.addDevice(ref);
		assertEquals(room, ref.getRoom());
	}

	@Test(expected = NullPointerException.class)
	public void getRoomFromNullTest() throws NullElementException {
		ref = null;
		ref.getRoom();
	}

	@Test
	public void equalsRefTest() {
		Device ref2 = new Refrigerator(1200);
		assertTrue(ref.equals(ref2));
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
	public void equalsFromNullTest() throws NullElementException {
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

	@Test
	public void hashCode2Test() {
		Device ref2 = new Refrigerator(1000);
		assertFalse(ref.hashCode() == ref2.hashCode());
	}

}
