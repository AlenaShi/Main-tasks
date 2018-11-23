package by.epam.javatraining.alenashirokikh.tasks.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.entity.Device;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.DishWasher;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Home;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.ListConteiner;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Refrigerator;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.RoomTypes;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.WashingMachine;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.WashingTypes;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.DeviceException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchDeviceException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchRoomException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

public class UsingDevicesTest {
	private static Home home;
	private static Device ref;
	private static WashingMachine wm;
	private static Device dw;

	@BeforeClass
	public static void init() throws ListConteinerOutOfBoundException, NoSuchRoomException,
			UsingSwitchOffDeviceException {
		home = new Home();
		home.addRoom(RoomTypes.KITCHEN);
		home.addRoom(RoomTypes.WASHROOM);
		ref = new Refrigerator(1000);
		wm = new WashingMachine(1200);
		dw = new DishWasher(1100);
		home.getRoom("kitchen").addDevice(ref);
		home.getRoom("kitchen").addDevice(dw);
		home.getRoom("washroom").addDevice(wm);
		ref.switchOn();
		wm.switchOn();
		wm.wash(WashingTypes.EVERYDAY);
	}

	@Test
	public void findAllPowerTest()
			throws NoSuchDeviceException, ListConteinerOutOfBoundException, NoSuchRoomException{
		assertEquals(3300, UsingDevices.findAllPower(home));
	}

	@Test
	public void findPowerSwitchedOnTest()
			throws NoSuchDeviceException, ListConteinerOutOfBoundException, NoSuchRoomException {
		assertEquals(2200, UsingDevices.findPowerSwitchedOn(home));
	}

	@Test
	public void findPowerWorkingTest()
			throws NoSuchDeviceException, ListConteinerOutOfBoundException, NoSuchRoomException {
		assertEquals(2200, UsingDevices.findPowerWorking(home));
	}

	@Test
	public void findWithPowerTest()
			throws NoSuchDeviceException, ListConteinerException, NoSuchRoomException {
		String expected = "Washing machine has 1200Vt power";

		assertEquals(expected, UsingDevices.findWithPower(1200, home).toString());
	}

	@Test
	public void findWithTypeTest()
			throws NoSuchDeviceException, ListConteinerException, NoSuchRoomException{
		String expected = "Washing machine has 1200Vt power";

		assertEquals(expected, UsingDevices.findWithType(WashingMachine.class, home).toString());
	}

	@Test
	public void findWorkingTest()
			throws NoSuchDeviceException, ListConteinerException, NoSuchRoomException{
		String expected = "Refrigerator has 1000Vt power Washing machine has 1200Vt power";

		assertEquals(expected, UsingDevices.findWorking(home).toString());
	}

	@Test
	public void findAllDevicesTest()
			throws NoSuchDeviceException, ListConteinerException, NoSuchRoomException {
		String expected = "Refrigerator has 1000Vt power DishWasher has 1100Vt power Washing machine has 1200Vt power";

		assertEquals(expected, UsingDevices.findAllDevices(home).toString());
	}

	@Test
	public void findSwitchedOnTest()
			throws NoSuchDeviceException, ListConteinerException, NoSuchRoomException {
		String expected = "Refrigerator has 1000Vt power " + "Washing machine has 1200Vt power";

		assertEquals(expected, UsingDevices.findSwitchedOn(home).toString());
	}

	@Test
	public void findRoomsWithDevicesTest()
			throws NoSuchDeviceException, ListConteinerException, NoSuchRoomException {
		String expected = "kitchen";

		assertEquals(expected, UsingDevices.findRoomsWithDevices(Refrigerator.class, home).toString());
	}

	@Test
	public void findDeviceTest()
			throws NoSuchDeviceException, ListConteinerException, NoSuchRoomException{
		String expected = "kitchen";

		assertEquals(expected, UsingDevices.findDevice(ref, home).toString());
	}

	@Test
	public void sortTest() throws ListConteinerException, NoSuchRoomException, DeviceException {
		String expected = "DishWasher has 1100Vt power Refrigerator has 1000Vt power Washing machine has 1200Vt power";
		ListConteiner<Device> list = new ListConteiner<Device>();
		list.add(wm);
		list.add(ref);
		list.add(dw);

		assertEquals(expected, UsingDevices.sort(list).toString());
	}

	@Test
	public void findMaxPowerTest()
			throws NoSuchDeviceException, NoSuchRoomException,ListConteinerException {
		String expected = "Washing machine has 1200Vt power";

		assertEquals(expected, UsingDevices.findMaxPower(home).toString());
	}

}
