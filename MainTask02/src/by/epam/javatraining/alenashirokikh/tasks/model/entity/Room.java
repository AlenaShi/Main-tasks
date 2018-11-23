package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe surrounding of devices.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchEquipmentException;

public class Room {
	RoomTypes type;
	private String roomName;
	ListConteiner<Equipment> devices = new ListConteiner<>();

	public Room() {
		type = RoomTypes.HALL;
		roomName = type.name().toLowerCase();
	}

	public Room(RoomTypes type) {
		this.type = type;
		roomName = type.name().toLowerCase();
	}

	public Room(RoomTypes type, String roomName) {
		this.type = type;
		if (roomName != null) {
			this.roomName = roomName;
		} else {
			this.roomName = type.name().toLowerCase();
		}
	}

	public String getName() {
		return roomName;
	}

	public void addDevice(Equipment device) {
		if (device != null) {
			if (!device.hasRoom()) {
				device.setRoom(this);
				devices.add(device);
			} else {
				device.getRoom().deleteDevice(device);
				device.setRoom(this);
				devices.add(device);
			}
		}
	}

	public void deleteDevice(Equipment device) {
		if (devices.remove(device)) {
			device.setRoom(null);
		}
	}

	public int devicesListSize() {
		return devices.size();
	}

	public Equipment getDevice(int index) throws NoSuchEquipmentException, ListConteinerOutOfBoundException {
		if (index >= 0 && index < devices.size()) {
			return devices.get(index);
		} else {
			throw new NoSuchEquipmentException("Index of device is out of bound");
		}
	}

	public ListConteiner<Equipment> getList() {
		return devices;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Room otherRoom = (Room) obj;
		return roomName.equals(otherRoom.roomName) && type == otherRoom.type;
	}

	@Override
	public int hashCode() {
		final int prime = 23;
		int result = 1;
		result = prime * result + (roomName == null ? 0 : roomName.hashCode());
		result = prime * result + (type == null ? 0 : type.hashCode() * prime);
		return result;
	}

	@Override
	public String toString() {
		return roomName + ": " + this.getList().toString();
	}
}
