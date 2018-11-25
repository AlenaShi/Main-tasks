package by.epam.javatraining.alenashirokikh.tasks.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.entity.Equipment;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.DishWasher;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Home;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.ListConteiner;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Refrigerator;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.RoomTypes;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.WashingMachine;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.WashingMachine.WashingTypes;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.EquipmentLogicException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchEquipmentException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchRoomException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.SwitchOffEquipmentException;

public class UsingDevicesTest {
	private static Home home;
	private static Equipment ref;
	private static WashingMachine wm;
	private static Equipment dw;

	@BeforeClass
	public static void init()
			throws ListConteinerOutOfBoundException, NoSuchRoomException, SwitchOffEquipmentException {
		home = new Home();
		home.addRoom(RoomTypes.KITCHEN);
		home.addRoom(RoomTypes.WASHROOM);
		ref = new Refrigerator(1000, "ert345h");
		wm = new WashingMachine(1200, "ert345h");
		dw = new DishWasher(1100, "ert345h");
		home.getRoom("kitchen").addDevice(ref);
		home.getRoom("kitchen").addDevice(dw);
		home.getRoom("washroom").addDevice(wm);
		ref.switchOn();
		wm.switchOn();
		wm.work(WashingTypes.EVERYDAY);
	}

	@Test
	public void findAllPowerTest()
			throws NoSuchEquipmentException, ListConteinerOutOfBoundException, NoSuchRoomException {
		assertEquals(3300, UsingDevices.findAllPower(home));
	}

	@Test
	public void findPowerSwitchedOnTest()
			throws NoSuchEquipmentException, ListConteinerOutOfBoundException, NoSuchRoomException {
		assertEquals(2200, UsingDevices.findPowerSwitchedOn(home));
	}

	@Test
	public void findPowerWorkingTest()
			throws NoSuchEquipmentException, ListConteinerOutOfBoundException, NoSuchRoomException {
		assertEquals(2200, UsingDevices.findPowerWorking(home));
	}

	@Test
	public void findWithPowerTest() throws NoSuchEquipmentException, ListConteinerException, NoSuchRoomException {
		String expected = "WashingMachine has 1200Vt power";

		assertEquals(expected, UsingDevices.findWithPower(1200, home).toString());
	}

	@Test
	public void findWithTypeTest() throws NoSuchEquipmentException, ListConteinerException, NoSuchRoomException {
		String expected = "WashingMachine has 1200Vt power";

		assertEquals(expected, UsingDevices.findWithType(WashingMachine.class, home).toString());
	}

	@Test
	public void findWorkingTest() throws NoSuchEquipmentException, ListConteinerException, NoSuchRoomException {
		String expected = "Refrigerator has 1000Vt power volume - 0.0 WashingMachine has 1200Vt power";

		assertEquals(expected, UsingDevices.findWorking(home).toString());
	}

	@Test
	public void findAllDevicesTest() throws NoSuchEquipmentException, ListConteinerException, NoSuchRoomException {
		String expected = "Refrigerator has 1000Vt power volume - 0.0 DishWasher has 1100Vt power WashingMachine has 1200Vt power";

		assertEquals(expected, UsingDevices.findAllDevices(home).toString());
	}

	@Test
	public void findSwitchedOnTest() throws NoSuchEquipmentException, ListConteinerException, NoSuchRoomException {
		String expected = "Refrigerator has 1000Vt power volume - 0.0 WashingMachine has 1200Vt power";

		assertEquals(expected, UsingDevices.findSwitchedOn(home).toString());
	}

	@Test
	public void findRoomsWithDevicesTest()
			throws NoSuchEquipmentException, ListConteinerException, NoSuchRoomException {
		String expected = "kitchen";

		assertEquals(expected, UsingDevices.findRoomsWithDevices(Refrigerator.class, home).toString());
	}

	@Test
	public void findDeviceTest() throws NoSuchEquipmentException, ListConteinerException, NoSuchRoomException {
		String expected = "kitchen";

		assertEquals(expected, UsingDevices.findDevice(ref, home).toString());
	}

	@Test
	public void sortTest() throws ListConteinerException, NoSuchRoomException, EquipmentLogicException {
		String expected = "DishWasher has 1100Vt power Refrigerator has 1000Vt power volume - 0.0 WashingMachine has 1200Vt power";
		ListConteiner<Equipment> list = new ListConteiner<Equipment>();
		list.add(wm);
		list.add(ref);
		list.add(dw);

		assertEquals(expected, UsingDevices.sort(list).toString());
	}

	@Test
	public void findMaxPowerTest() throws NoSuchEquipmentException, NoSuchRoomException, ListConteinerException {
		String expected = "WashingMachine has 1200Vt power";

		assertEquals(expected, UsingDevices.findMaxPower(home).toString());
	}

}
