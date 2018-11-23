package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe surrounding of rooms.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchRoomException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;

public class Home {
	private ListConteiner<Room> rooms = new ListConteiner<Room>();;

	public Home() throws NullElementException {
		rooms.add(new Room(RoomTypes.HALL));
	}

	public Home(Home otherHome) throws NullElementException {
		if (otherHome != null && otherHome.size() != 0) {
			this.rooms = otherHome.rooms;
		} else {
			rooms.add(new Room(RoomTypes.HALL));
		}
	}

	public void addRoom(RoomTypes type) throws NullElementException {
		rooms.add(new Room(type));
	}

	public void addRoom(RoomTypes type, String roomName) throws NullElementException {
		rooms.add(new Room(type, roomName));
	}

	public void addRoom(Room room) throws NullElementException, NoSuchRoomException {
		if (room != null) {
			rooms.add(room);
		} else {
			throw new NoSuchRoomException("No such room to add");
		}
	}

	public void deleteRoom(int index) throws NoSuchRoomException {
		if (rooms.size() > 1 && index >= 0 && index < rooms.size()) {
			rooms.remove(index);
		} else {
			throw new NoSuchRoomException("There is no sucn room or it's last roon in home");
		}
	}

	public int size() {
		return rooms.size();
	}

	public Room getRoom(int index) throws NoSuchRoomException, ListConteinerOutOfBoundException {
		if (index >= 0 && index < rooms.size()) {
			return rooms.get(index);
		} else {
			throw new NoSuchRoomException("No such room in home");
		}
	}

	public Room getRoom(String name) throws NoSuchRoomException, ListConteinerOutOfBoundException {
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getName().equals(name)) {
				return rooms.get(i);
			}
		}
		throw new NoSuchRoomException("No such room in home");
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < rooms.size(); i++) {
			try {
				b.append(rooms.get(i)).append(", ");
			} catch (ListConteinerOutOfBoundException e) {
				e.printStackTrace();
			}
		}
		b.delete(b.length() - 2, b.length());
		return b.toString();
	}
}
