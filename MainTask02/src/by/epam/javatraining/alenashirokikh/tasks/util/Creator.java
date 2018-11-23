package by.epam.javatraining.alenashirokikh.tasks.util;

/**
 * The program creates surrounding for devices and fills it with devices from file.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.model.entity.Equipment;
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
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchEquipmentException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchRoomException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.SwitchOffEquipmentException;

public class Creator {
	public static Home create(String fileName) throws IOException, ListConteinerOutOfBoundException,
			SwitchOffEquipmentException, NoSuchRoomException, NoSuchEquipmentException {
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

	public static Equipment createDevice(Room room, String infoDevice)
			throws SwitchOffEquipmentException, NoSuchEquipmentException {
		Equipment equipment = null;
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
				equipment = new Refrigerator(power);
				room.addDevice(equipment);
				break;
			case "washing machine":
				equipment = new WashingMachine(power);
				room.addDevice(equipment);
				break;
			case "dishwasher":
				equipment = new DishWasher(power);
				room.addDevice(equipment);
				break;
			case "vacuum cleaner":
				equipment = new VacuumCleaner(power);
				room.addDevice(equipment);
				break;
			}

			if (info.length > 2) {
				for (int i = 2; i < info.length; i++) {
					if (info[i].contains("switchOn")) {
						equipment.switchOn();

					} else if (info[i].contains("switchOff")) {
						equipment.switchOff();

					} else if (info[i].contains("setTemperature") && equipment.getClass() == Refrigerator.class) {
						String temperature = null;
						for (int j = 0; j < info[i].length(); j++) {
							if (Character.isDigit(info[i].charAt(j))) {
								temperature += info[i].charAt(j);
							}
						}
						((Refrigerator) equipment).setTemperature(Integer.parseInt(temperature));
					} else if (info[i].contains("setFreezerTemperature") && equipment.getClass() == Refrigerator.class) {
						String temperature = null;
						for (int j = 0; j < info[i].length(); j++) {
							if (Character.isDigit(info[i].charAt(j))) {
								temperature += info[i].charAt(j);
							}
						}
						((Refrigerator) equipment).setFreezerTemperature(Integer.parseInt(temperature));

					} else if (info[i].contains("wash") && equipment.getClass() == WashingMachine.class) {
						if (info[i].contains("EVERYDAY")) {
							((WashingMachine) equipment).wash(WashingTypes.EVERYDAY);
						}

						else if (info[i].contains("SOFT")) {
							((WashingMachine) equipment).wash(WashingTypes.SOFT);
						} else if (info[i].contains("COTTON")) {
							((WashingMachine) equipment).wash(WashingTypes.COTTON);
						} else if (info[i].contains("CLEANING")) {
							((WashingMachine) equipment).wash(WashingTypes.CLEANING);
						} else if (info[i].contains("SPINNING")) {
							((WashingMachine) equipment).wash(WashingTypes.SPINNING);
						} else if (info[i].contains("RINSING")) {
							((WashingMachine) equipment).wash(WashingTypes.RINSING);
						}

					} else if (info[i].contains("wash") && equipment.getClass() == DishWasher.class) {
						if (info[i].contains("ECO")) {
							((DishWasher) equipment).wash(DishWashingTypes.ECO);
						} else if (info[i].contains("ECONOM")) {
							((DishWasher) equipment).wash(DishWashingTypes.ECONOM);
						} else if (info[i].contains("INTENSIVE")) {
							((DishWasher) equipment).wash(DishWashingTypes.INTENSIVE);
						} else if (info[i].contains("GLASS")) {
							((DishWasher) equipment).wash(DishWashingTypes.GLASS);
						}

					} else if (info[i].contains("stopWash") && equipment.getClass() == WashingMachine.class) {
						((WashingMachine) equipment).stopWash();

					} else if (info[i].contains("stopWash") && equipment.getClass() == DishWasher.class) {
						((DishWasher) equipment).stopWash();
					}
				}
			}
			return equipment;
		} else
			throw new NoSuchEquipmentException("No such device in file");
	}

	static boolean contain(String[] str, String method) {
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(method)) {
				return true;
			}
		}
		return false;
	}

	public static ListConteiner<Equipment> createList(Home home)
			throws  NoSuchEquipmentException, ListConteinerOutOfBoundException, NoSuchRoomException {
		ListConteiner<Equipment> list = new ListConteiner<Equipment>();
		for (int i = 0; i < home.size(); i++) {
			for (int j = 0; j < home.getRoom(i).devicesListSize(); j++) {
				list.add(home.getRoom(i).getDevice(j));
			}
		}
		return list;
	}

}
