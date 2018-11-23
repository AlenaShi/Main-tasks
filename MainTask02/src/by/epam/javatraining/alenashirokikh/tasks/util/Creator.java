package by.epam.javatraining.alenashirokikh.tasks.util;

/**
 * The program creates surrounding for devices and fills it with devices from file.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
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
import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

public class Creator {
	public static Home create(String fileName) throws IOException, ListConteinerOutOfBoundException,
			UsingSwitchOffDeviceException, NoSuchRoomException, NoSuchDeviceException {
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

	public static Home createHome() {
		return new Home();
	}

	public static Room createRoom(Home home, String str) throws NoSuchRoomException {
		String[] info = str.split(" ");
		RoomTypes type = null;
		Room room;
		String s = null;
		for (RoomTypes el : RoomTypes.values()) {
			s += el.name();
		}
		if (s.contains(info[0].toUpperCase())) {
			type = RoomTypes.valueOf(info[0].toUpperCase());
		}
		if (info.length > 1) {
			room = new Room(type, info[1]);
			home.addRoom(room);
		} else {
			room = new Room(type);
			home.addRoom(room);
		}
		return room;
	}

	public static Device createDevice(Room room, String infoDevice)
			throws UsingSwitchOffDeviceException, NoSuchDeviceException {
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

	public static ListConteiner<Device> createList(Home home)
			throws  NoSuchDeviceException, ListConteinerOutOfBoundException, NoSuchRoomException {
		ListConteiner<Device> list = new ListConteiner<Device>();
		for (int i = 0; i < home.size(); i++) {
			for (int j = 0; j < home.getRoom(i).devicesListSize(); j++) {
				list.add(home.getRoom(i).getDevice(j));
			}
		}
		return list;
	}

}
