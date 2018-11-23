package by.epam.javatraining.alenashirokikh.tasks.util;

import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.model.entity.Device;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.DishWasher;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.DishWashingTypes;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Home;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.ListConteiner;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Refrigerator;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Room;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.RoomTypes;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.VacuumCleaner;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.WashingMachine;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.WashingTypes;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchDeviceException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchRoomException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

public class Creator {
	public static Home create(String fileName) throws IOException, ListConteinerOutOfBoundException,
			NullElementException, UsingSwitchOffDeviceException, NoSuchRoomException, NoSuchDeviceException {
		ListConteiner<String> result = new ListConteiner<String>();
		Room room = null;
		ListConteiner<String> str = Parser.parse(fileName);
		Home home = createHome();
		for (int i = 0; i < str.size(); i++) {
			String[] line = str.get(i).split(";");
			if (line.length != 0) {
				room = createRoom(home, line[0]);
			}
			for (int j = 1; j < line.length; j++) {
				String infoDevice = line[j];
				createDevice(room, infoDevice);
			}
		}
		return home;
	}

	public static Home createHome() throws NullElementException {
		return new Home();
	}

	public static Room createRoom(Home home, String str) throws NullElementException, NoSuchRoomException {
		String[] info = str.split(" ");
		RoomTypes type;
		Room room = null;

		switch (info[0].toUpperCase()) {
		case "BEDROOM":
			type = RoomTypes.BEDROOM;
			break;
		case "LIVINGROOM":
			type = RoomTypes.LIVINGROOM;
			break;
		case "KITCHEN":
			type = RoomTypes.KITCHEN;
			break;
		case "WASHROOM":
			type = RoomTypes.WASHROOM;
			break;
		case "WC":
			type = RoomTypes.WC;
			break;
		case "STOREROOM":
			type = RoomTypes.STOREROOM;
			break;
		case "PARLOR":
			type = RoomTypes.PARLOR;
			break;
		default:
			type = RoomTypes.HALL;
			break;
		}
		if (info.length > 1) {
			room = new Room(type, info[1]);
			home.addRoom(room);
		} else {
			room=new Room(type);
			home.addRoom(room);
		}
		return room;
	}

	public static Device createDevice(Room room, String infoDevice)
			throws UsingSwitchOffDeviceException, NullElementException, NoSuchDeviceException {
		Device device = null;
		int power;
		if (infoDevice != null) {
			String[] info = infoDevice.split(",");
			if (info.length > 0) {
				power = Integer.parseInt(info[1]);
			} else {
				power = 1000;
			}
			switch (info[0].toLowerCase()) {
			case "refrigerator":
				device = new Refrigerator(power);
				room.addDevice(device);
				break;
			case "washing machine":
				device = new WashingMachine(power);
				room.addDevice(device);
				break;
			case "dishwasher":
				device = new DishWasher(power);
				room.addDevice(device);
				break;
			case "vacuum cleaner":
				device = new VacuumCleaner(power);
				room.addDevice(device);
				break;
			}
			
			if (info.length > 2) {
				for (int i = 2; i < info.length; i++) {
					if (info[i].contains("switchOn")) {
						device.switchOn();

					} else if (info[i].contains("switchOff")) {
						device.switchOff();

					} else if (info[i].contains("setTemperature") && device.getClass() == Refrigerator.class) {
						String temperature = null;
						for (int j = 0; j < info[i].length(); j++) {
							if (Character.isDigit(info[i].charAt(j))) {
								temperature += info[i].charAt(j);
							}
						}
						((Refrigerator) device).setTemperature(Integer.parseInt(temperature));
					} else if (info[i].contains("setFreezerTemperature") && device.getClass() == Refrigerator.class) {
						String temperature = null;
						for (int j = 0; j < info[i].length(); j++) {
							if (Character.isDigit(info[i].charAt(j))) {
								temperature += info[i].charAt(j);
							}
						}
						((Refrigerator) device).setFreezerTemperature(Integer.parseInt(temperature));

					} else if (info[i].contains("wash") && device.getClass() == WashingMachine.class) {
						if (info[i].contains("EVERYDAY")) {
							((WashingMachine) device).wash(WashingTypes.EVERYDAY);
						}

						else if (info[i].contains("SOFT")) {
							((WashingMachine) device).wash(WashingTypes.SOFT);
						} else if (info[i].contains("COTTON")) {
							((WashingMachine) device).wash(WashingTypes.COTTON);
						} else if (info[i].contains("CLEANING")) {
							((WashingMachine) device).wash(WashingTypes.CLEANING);
						} else if (info[i].contains("SPINNING")) {
							((WashingMachine) device).wash(WashingTypes.SPINNING);
						} else if (info[i].contains("RINSING")) {
							((WashingMachine) device).wash(WashingTypes.RINSING);
						}

					} else if (info[i].contains("wash") && device.getClass() == DishWasher.class) {
						if (info[i].contains("ECO")) {
							((DishWasher) device).wash(DishWashingTypes.ECO);
						} else if (info[i].contains("ECONOM")) {
							((DishWasher) device).wash(DishWashingTypes.ECONOM);
						} else if (info[i].contains("INTENSIVE")) {
							((DishWasher) device).wash(DishWashingTypes.INTENSIVE);
						} else if (info[i].contains("GLASS")) {
							((DishWasher) device).wash(DishWashingTypes.GLASS);
						}

					} else if (info[i].contains("stopWash") && device.getClass() == WashingMachine.class) {
						((WashingMachine) device).stopWash();

					} else if (info[i].contains("stopWash") && device.getClass() == DishWasher.class) {
						((DishWasher) device).stopWash();
					}
				}
			}
			return device;
		} else
			throw new NoSuchDeviceException("No such device in file");
	}

	static boolean contain(String[] str, String method) {
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(method)) {
				return true;
			}
		}
		return false;
	}

}
