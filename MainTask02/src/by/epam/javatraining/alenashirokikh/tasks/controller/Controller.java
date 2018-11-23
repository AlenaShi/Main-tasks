package by.epam.javatraining.alenashirokikh.tasks.controller;

import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.model.entity.Equipment;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Home;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.ListConteiner;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Refrigerator;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Room;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.DeviceException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchRoomException;
import by.epam.javatraining.alenashirokikh.tasks.model.logic.UsingDevices;
import by.epam.javatraining.alenashirokikh.tasks.util.Creator;
import by.epam.javatraining.alenashirokikh.tasks.view.LoggerType;
import by.epam.javatraining.alenashirokikh.tasks.view.Printable;
import by.epam.javatraining.alenashirokikh.tasks.view.PrinterCreator;

public class Controller {
	public static void main(String[] args) {
		Printable printLog = PrinterCreator.create(LoggerType.LOGGER);
		try {
			Home home = Creator.create("D://array.txt");
			Refrigerator ref2 = new Refrigerator(1200);
			ListConteiner<Equipment> list = Creator.createList(home);

			int allPower = UsingDevices.findAllPower(home);
			printLog.print(allPower);

			int powerSwitchOn = UsingDevices.findPowerSwitchedOn(home);
			printLog.print(powerSwitchOn);

			int powerWorking = UsingDevices.findPowerWorking(home);
			printLog.print(powerWorking);

			ListConteiner<Equipment> listSwitchedOn = UsingDevices.findSwitchedOn(home);
			printLog.print(listSwitchedOn);

			ListConteiner<Room> roomsWithDevices = UsingDevices.findRoomsWithDevices(Refrigerator.class, home);
			printLog.print(roomsWithDevices);

			Room roomsWithRef = UsingDevices.findDevice(ref2, home);
			printLog.print(roomsWithRef);

			ListConteiner<Equipment> sortList = UsingDevices.sort(list);
			printLog.print(sortList);

		} catch (ListConteinerException e) {
			// TODO Auto-generated catch block
			printLog.printError("Problems with listConteiner");
		} catch (DeviceException e) {
			// TODO Auto-generated catch block
			printLog.printError("Problems with device");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			printLog.printError("Problems with file");
		} catch (NoSuchRoomException e) {
			// TODO Auto-generated catch block
			printLog.printError("Problems with room");
		} 
	}
}
