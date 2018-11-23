package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeviceTest {
	private Device dev;

	@Before
	public void init() {
		dev = new Device(1200);
	}

	@After
	public void destroy() {
		dev = null;
	}

	@Test
	public void getNameTest() {
		assertEquals("Device", dev.getName());
	}

	@Test
	public void switchOnWithoutRoomTest() {
		dev.switchOn();
		assertFalse(dev.isSwitchOn());
	}

	@Test
	public void switchOnTest(){
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(dev);
		dev.switchOn();
		assertTrue(dev.isSwitchOn());
	}

	@Test
	public void switchOffTest() {
		dev.switchOff();
		assertFalse(dev.isSwitchOn());
	}

	@Test
	public void getPowerTest() {
		int expected = 1200;
		assertEquals(expected, dev.getPower());
	}

	@Test(expected = NullPointerException.class)
	public void switchOffExceptionTest() {
		dev = null;
		dev.switchOff();
	}

	@Test(expected = NullPointerException.class)
	public void switchOnExceptionTest() {
		dev = null;
		dev.switchOn();
	}

	@Test(expected = NullPointerException.class)
	public void getPowerExceptionTest() {
		dev = null;
		dev.getPower();
	}

	@Test(expected = NullPointerException.class)
	public void getNameExceptionTest() {
		dev = null;
		dev.getName();
	}

	@Test
	public void hasRoomTest() {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(dev);
		assertTrue(dev.hasRoom());
	}

	@Test
	public void hasNoRoomTest(){
		assertFalse(dev.hasRoom());
	}

	@Test
	public void setRoomTest() {
		Room room = new Room(RoomTypes.WASHROOM);
		dev.setRoom(room);
		assertTrue(dev.hasRoom());
	}

	@Test
	public void setAnotherRoomTest() {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(dev);
		Room room2 = new Room(RoomTypes.WASHROOM);
		dev.setRoom(room2);
		assertEquals(room2, dev.getRoom());
	}

	@Test
	public void setRoomNullTest() {
		dev.setRoom(null);
		assertFalse(dev.hasRoom());
	}

	@Test
	public void setAnotherNullRoomTest() {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(dev);
		dev.setRoom(null);
		assertEquals(room, dev.getRoom());
	}

	@Test
	public void getRoomTest() {
		Room room = new Room(RoomTypes.WASHROOM);
		room.addDevice(dev);
		assertEquals(room, dev.getRoom());
	}

	@Test(expected = NullPointerException.class)
	public void getRoomFromNullTest() {
		dev = null;
		dev.getRoom();
	}

	@Test
	public void equalsRefTest() {
		Device dev2 = new Device(1200);
		assertTrue(dev.equals(dev2));
	}

	@Test
	public void equalsDifferentRefTest() {
		Device dev2 = new Device(1000);
		assertFalse(dev.equals(dev2));
	}

	@Test
	public void equalsRefWithNullTest() {
		Device wm2 = null;
		assertFalse(dev.equals(wm2));
	}

	@Test
	public void equalsRefWithOtherClassTest() {
		Room room = new Room(RoomTypes.KITCHEN, "kitchen");
		assertFalse(dev.equals(room));
	}

	@Test(expected = NullPointerException.class)
	public void equalsFromNullTest() {
		dev = null;
		Device dev2 = new Device(1000);
		dev.equals(dev2);
	}

	@Test
	public void hashCodeTest() {
		Device dev2 = new Device(1200);
		assertTrue(dev.hashCode() == dev2.hashCode());
	}

	@Test(expected = NullPointerException.class)
	public void hashCodeNullTest() {
		dev = null;
		dev.hashCode();
	}

	@Test
	public void hashCode2Test() {
		Device wm2 = new WashingMachine(1000);
		assertFalse(dev.hashCode() == wm2.hashCode());
	}
}
