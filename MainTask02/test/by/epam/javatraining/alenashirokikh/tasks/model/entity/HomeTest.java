package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchRoomException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;

public class HomeTest {
	private Home home;

	@Before
	public void init() throws NullElementException {
		home = new Home();
	}

	@After
	public void destroy() {
		home = null;
	}

	@Test
	public void homeTest() {
		String expected = "hall";
		assertEquals(expected, home.toString());
	}

	@Test
	public void addRoomTest() throws NullElementException {
		home.addRoom(RoomTypes.LIVINGROOM);
		String expected = "hall, livingroom";
		assertEquals(expected, home.toString());
	}

	@Test
	public void addRoomWithNameTest() throws NullElementException {
		home.addRoom(RoomTypes.BEDROOM, "bedroom 1");
		String expected = "hall, bedroom 1";
		assertEquals(expected, home.toString());
	}

	@Test
	public void addRoomWithNameNullTest() throws NullElementException {
		home.addRoom(RoomTypes.BEDROOM, null);
		String expected = "hall, bedroom";
		assertEquals(expected, home.toString());
	}

	@Test(expected = NullPointerException.class)
	public void addRoomNullHomeTest() throws NoSuchRoomException, NullElementException {
		home = null;
		home.addRoom(RoomTypes.HALL);
	}

	@Test
	public void deleteRoom0Test() throws NoSuchRoomException, NullElementException {
		home.addRoom(RoomTypes.LIVINGROOM);
		home.addRoom(RoomTypes.BEDROOM, "bedroom 1");
		String expected = "livingroom, bedroom 1";
		home.deleteRoom(0);
		assertEquals(expected, home.toString());
	}

	@Test
	public void deleteRoom2Test() throws NoSuchRoomException, NullElementException {
		home.addRoom(RoomTypes.LIVINGROOM);
		home.addRoom(RoomTypes.BEDROOM, "bedroom 1");
		String expected = "hall, livingroom";
		home.deleteRoom(2);
		assertEquals(expected, home.toString());
	}

	@Test(expected = NoSuchRoomException.class)
	public void deleteLastRoomTest() throws NoSuchRoomException {
		home.deleteRoom(0);
	}

	@Test(expected = NoSuchRoomException.class)
	public void deleteRoomOutOfBoundTest() throws NoSuchRoomException {
		home.deleteRoom(2);
	}

	@Test(expected = NullPointerException.class)
	public void deleteRoomNullHomeTest() throws NoSuchRoomException {
		home = null;
		home.deleteRoom(2);
	}

	@Test
	public void sizeTest() throws NullElementException {
		home.addRoom(RoomTypes.LIVINGROOM);
		home.addRoom(RoomTypes.BEDROOM, "bedroom 1");
		int expected = 3;
		assertEquals(expected, home.size());
	}

	@Test(expected = NullPointerException.class)
	public void sizeNullHomeTest() {
		home = null;
		home.size();
	}

	@Test
	public void getRoomIndexTest() throws NoSuchRoomException, ListConteinerException{
		home.addRoom(RoomTypes.LIVINGROOM);
		home.addRoom(RoomTypes.BEDROOM, "bedroom 1");
		String expected = "hall";
		assertEquals(expected, home.getRoom(0).toString());
	}

	@Test
	public void getRoomNameTest() throws NoSuchRoomException, ListConteinerException {
		home.addRoom(RoomTypes.LIVINGROOM);
		home.addRoom(RoomTypes.BEDROOM, "bedroom 1");
		String expected = "bedroom 1";
		assertEquals(expected, home.getRoom("bedroom 1").toString());
	}

	@Test(expected = NoSuchRoomException.class)
	public void getRoomIndexOutOfBoundTest() throws NoSuchRoomException, ListConteinerException {
		home.addRoom(RoomTypes.LIVINGROOM);
		home.addRoom(RoomTypes.BEDROOM, "bedroom 1");
		home.getRoom(-4);
	}

	@Test(expected = NoSuchRoomException.class)
	public void getRoomWithOtherNameTest() throws NoSuchRoomException, ListConteinerException {
		home.addRoom(RoomTypes.LIVINGROOM);
		home.addRoom(RoomTypes.BEDROOM, "bedroom 1");
		home.getRoom("bedroom 2");
	}

	@Test(expected = NullPointerException.class)
	public void getRoomNameNullHomeTest() throws NoSuchRoomException, ListConteinerOutOfBoundException {
		home = null;
		home.getRoom("bedroom 2");
	}

	@Test(expected = NullPointerException.class)
	public void getRoomIndexNullHomeTest() throws NoSuchRoomException, ListConteinerOutOfBoundException {
		home = null;
		home.getRoom(0);
	}

	@Test
	public void toStringTest() throws NoSuchRoomException, NullElementException {
		home.addRoom(RoomTypes.LIVINGROOM);
		home.addRoom(RoomTypes.BEDROOM, "bedroom 1");
		String expected = "hall, livingroom, bedroom 1";
		assertEquals(expected, home.toString());
	}

	@Test(expected = NullPointerException.class)
	public void toStringNullHomeTest() {
		home = null;
		home.toString();
	}
}
