package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchDeviceException;

public class RoomTest {
	private Room room;

	@Before
	public void init() {
		room = new Room();
	}

	@After
	public void destroy() {
		room = null;
	}

	@Test
	public void roomTest() {
		assertEquals("hall", room.toString());
	}

	@Test
	public void roomWithTypeTest() {
		room = new Room(RoomTypes.KITCHEN);
		assertEquals("kitchen", room.toString());
	}

	@Test
	public void roomWithNameTest() {
		room = new Room(RoomTypes.BEDROOM, "bedroom 1");
		assertEquals("bedroom 1", room.toString());
	}

	@Test
	public void getNameTest() {
		room = new Room(RoomTypes.BEDROOM, "bedroom 1");
		assertEquals("bedroom 1", room.getName());
	}

	@Test(expected = NullPointerException.class)
	public void getNameNullTest() {
		room = null;
		room.getName();
	}

	@Test
	public void getNameWithoutNameTest() {
		room = new Room(RoomTypes.BEDROOM);
		assertEquals("bedroom", room.getName());
	}

	@Test
	public void addDeviceTest() {
		room = new Room(RoomTypes.KITCHEN);
		Device ref = new Refrigerator(1200);
		room.addDevice(ref);
		assertEquals(1, room.devicesListSize());
	}

	@Test(expected = NullPointerException.class)
	public void addToNullTest() {
		room = null;
		Refrigerator ref = new Refrigerator(1200);
		room.addDevice(ref);
	}

	@Test
	public void addDeviceToOtherRoomTest() {
		room = new Room(RoomTypes.KITCHEN);
		Device ref = new Refrigerator(1200);
		room.addDevice(ref);
		Room room2 = new Room(RoomTypes.KITCHEN);
		room2.addDevice(ref);
		assertEquals(0, room.devicesListSize());
	}

	@Test
	public void deleteDeviceTest() {
		room = new Room(RoomTypes.KITCHEN);
		Device ref = new Refrigerator(1200);
		room.addDevice(ref);
		room.deleteDevice(ref);
		assertEquals(0, room.devicesListSize());
	}

	@Test
	public void deleteOtherDeviceTest() {
		room = new Room(RoomTypes.KITCHEN);
		Device ref = new Refrigerator(1200);
		room.addDevice(ref);
		room.deleteDevice(new Refrigerator(1000));
		assertEquals(1, room.devicesListSize());
	}

	@Test(expected = NullPointerException.class)
	public void deleteFromNullTest() {
		room = null;
		room.deleteDevice(new Refrigerator(1000));
	}

	@Test
	public void devicesListSizeTest() {
		room = new Room(RoomTypes.KITCHEN);
		assertEquals(0, room.devicesListSize());
	}

	@Test(expected = NullPointerException.class)
	public void devicesListSizeFromNullTest() {
		room = null;
		room.devicesListSize();
	}

	@Test
	public void getDeviceTest() throws ListConteinerException, NoSuchDeviceException {
		room = new Room(RoomTypes.KITCHEN);
		Device ref = new Refrigerator(1200);
		Device wm = new WashingMachine(1200);
		room.addDevice(ref);
		room.addDevice(wm);
		assertEquals(wm, room.getDevice(1));

	}

	@Test(expected = NoSuchDeviceException.class)
	public void getDevice2Test() throws ListConteinerOutOfBoundException, NoSuchDeviceException {
		room = new Room(RoomTypes.KITCHEN);
		room.getDevice(2);
	}

	@Test
	public void equalsRoomTest() {
		room = new Room(RoomTypes.KITCHEN);
		Room room2 = new Room(RoomTypes.KITCHEN);
		assertTrue(room.equals(room2));
	}

	@Test
	public void equalsRoomWithDifferentTypesTest() {
		room = new Room(RoomTypes.KITCHEN);
		Room room2 = new Room(RoomTypes.BEDROOM);
		assertFalse(room.equals(room2));
	}

	@Test
	public void equalsRoomWithNameTest() {
		room = new Room(RoomTypes.KITCHEN, "kitchen");
		Room room2 = new Room(RoomTypes.KITCHEN, "kitchen 2");
		assertFalse(room.equals(room2));
	}

	@Test
	public void equalsRoomWithSameNameTest() {
		room = new Room(RoomTypes.KITCHEN, "kitchen");
		Room room2 = new Room(RoomTypes.KITCHEN, "kitchen");
		assertTrue(room.equals(room2));
	}

	@Test
	public void equalsRoomWithNullTest() {
		room = new Room(RoomTypes.KITCHEN, "kitchen");
		Room room2 = null;
		assertFalse(room.equals(room2));
	}

	@Test
	public void equalsRoomWithOtherClassTest() {
		room = new Room(RoomTypes.KITCHEN, "kitchen");
		Device dev = new Refrigerator(1000);
		assertFalse(room.equals(dev));
	}

	@Test(expected = NullPointerException.class)
	public void equalsFromNullTest() {
		room = null;
		Room room2 = new Room(RoomTypes.KITCHEN, "kitchen");
		room.equals(room2);
	}

	@Test
	public void hashCodeTest() {
		room = new Room(RoomTypes.KITCHEN, "kitchen");
		Room room2 = new Room(RoomTypes.KITCHEN, "kitchen");
		assertTrue(room.hashCode() == room2.hashCode());
	}

	@Test(expected = NullPointerException.class)
	public void hashCodeNullTest() {
		room = null;
		room.hashCode();
	}

	@Test
	public void hashCode2Test() {
		room = new Room(RoomTypes.KITCHEN);
		Room room2 = new Room(RoomTypes.BEDROOM);
		assertFalse(room.hashCode() == room2.hashCode());
	}

	@Test
	public void toStringTest() {
		room = new Room(RoomTypes.KITCHEN);
		assertEquals("kitchen", room.toString());
	}

	@Test(expected = NullPointerException.class)
	public void toStringNullTest() {
		room = null;
		room.toString();
	}
}
