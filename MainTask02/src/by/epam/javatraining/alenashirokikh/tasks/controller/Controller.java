package by.epam.javatraining.alenashirokikh.tasks.controller;

import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.model.entity.Home;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.HomeNullException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchDeviceException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchRoomException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;
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
			int allPower = UsingDevices.findAllPower(home);
			printLog.print(allPower);
			
			int powerSwitchOn =UsingDevices.findPowerSwitchedOn(home);
			printLog.print(powerSwitchOn);
			
			int powerWorking =UsingDevices.findPowerWorking(home);
			printLog.print(powerWorking);

		} catch (ListConteinerOutOfBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UsingSwitchOffDeviceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchRoomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchDeviceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HomeNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
