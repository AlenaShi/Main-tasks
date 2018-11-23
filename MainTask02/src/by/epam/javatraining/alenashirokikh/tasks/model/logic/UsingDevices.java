package by.epam.javatraining.alenashirokikh.tasks.model.logic;

/**
 * The program find power for devices in different conditions, find device in home, 
 * find what devices are in home, find in which rooms are devices of determined type, sort devices.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Device;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Home;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.ListConteiner;
import by.epam.javatraining.alenashirokikh.tasks.model.entity.Room;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.DeviceNullException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.HomeNullException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchDeviceException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NoSuchRoomException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;

public class UsingDevices {
	public static int findAllPower(Home home)
			throws NoSuchRoomException, NoSuchDeviceException, HomeNullException, ListConteinerOutOfBoundException {
		int sum = 0;
		if (home != null && home.size() != 0) {
			for (int i = 0; i < home.size(); i++) {
				int size = home.getRoom(i).devicesListSize();
				for (int j = 0; j < size; j++) {
					sum += home.getRoom(i).getDevice(j).getPower();
				}

			}
			return sum;
		}
		throw new HomeNullException("Home is null");
	}

	public static int findPowerSwitchedOn(Home home)
			throws NoSuchRoomException, NoSuchDeviceException, HomeNullException, ListConteinerOutOfBoundException {
		int sum = 0;
		if (home != null && home.size() != 0) {
			for (int i = 0; i < home.size(); i++) {
				int size = home.getRoom(i).devicesListSize();
				for (int j = 0; j < size; j++) {
					if (home.getRoom(i).getDevice(j).isSwitchOn()) {
						sum += home.getRoom(i).getDevice(j).getPower();
					}
				}

			}
			return sum;
		}
		throw new HomeNullException("Home is null");
	}

	public static int findPowerWorking(Home home)
			throws NoSuchRoomException, NoSuchDeviceException, HomeNullException, ListConteinerOutOfBoundException {
		int sum = 0;
		if (home != null && home.size() != 0) {
			for (int i = 0; i < home.size(); i++) {
				int size = home.getRoom(i).devicesListSize();
				for (int j = 0; j < size; j++) {
					if (home.getRoom(i).getDevice(j).isWorking()) {
						sum += home.getRoom(i).getDevice(j).getPower();
					}
				}

			}
			return sum;
		}
		throw new HomeNullException("Home is null");
	}

	public static ListConteiner<Device> findWithPower(int power, Home home)
			throws ListConteinerException, NoSuchRoomException, NoSuchDeviceException, HomeNullException {
		ListConteiner<Device> result = new ListConteiner<Device>();
		if (home != null && home.size() != 0) {
			for (int i = 0; i < home.size(); i++) {
				int size = home.getRoom(i).devicesListSize();
				for (int j = 0; j < size; j++) {
					if (home.getRoom(i).getDevice(j).getPower() == power) {
						result.add(home.getRoom(i).getDevice(j));
					}
				}
			}
			return result;
		}
		throw new HomeNullException("Home is null");
	}

	public static ListConteiner<Device> findWithType(Class<? extends Device> clazz, Home home)
			throws ListConteinerException, NoSuchRoomException, NoSuchDeviceException, HomeNullException {
		ListConteiner<Device> result = new ListConteiner<Device>();
		if (home != null && home.size() != 0) {
			for (int i = 0; i < home.size(); i++) {
				int size = home.getRoom(i).devicesListSize();
				for (int j = 0; j < size; j++) {
					if (home.getRoom(i).getDevice(j).getClass() == clazz) {
						result.add(home.getRoom(i).getDevice(j));
					}
				}
			}
			return result;
		}
		throw new HomeNullException("Home is null");
	}

	public static ListConteiner<Device> findWorking(Home home)
			throws ListConteinerException, NoSuchRoomException, NoSuchDeviceException, HomeNullException {
		ListConteiner<Device> result = new ListConteiner<Device>();
		if (home != null && home.size() != 0) {
			for (int i = 0; i < home.size(); i++) {
				int size = home.getRoom(i).devicesListSize();
				for (int j = 0; j < size; j++) {
					if (home.getRoom(i).getDevice(j).isWorking()) {
						result.add(home.getRoom(i).getDevice(j));
					}
				}
			}
			return result;
		}
		throw new HomeNullException("Home is null");
	}

	public static ListConteiner<Device> findAllDevices(Home home)
			throws ListConteinerException, NoSuchRoomException, NoSuchDeviceException, HomeNullException {
		ListConteiner<Device> result = new ListConteiner<Device>();
		if (home != null && home.size() != 0) {
			for (int i = 0; i < home.size(); i++) {
				int size = home.getRoom(i).devicesListSize();
				for (int j = 0; j < size; j++) {
					result.add(home.getRoom(i).getDevice(j));
				}
			}
			return result;
		}
		throw new HomeNullException("Home is null");
	}

	public static ListConteiner<Device> findSwitchedOn(Home home)
			throws ListConteinerException, NoSuchRoomException, NoSuchDeviceException, HomeNullException {
		ListConteiner<Device> result = new ListConteiner<Device>();
		if (home != null && home.size() != 0) {
			for (int i = 0; i < home.size(); i++) {
				int size = home.getRoom(i).devicesListSize();
				for (int j = 0; j < size; j++) {
					if (home.getRoom(i).getDevice(j).isSwitchOn()) {
						result.add(home.getRoom(i).getDevice(j));
					}
				}
			}
			return result;
		}
		throw new HomeNullException("Home is null");
	}

	public static ListConteiner<Room> findRoomsWithDevices(Class<? extends Device> clazz, Home home)
			throws ListConteinerException, NoSuchRoomException, NoSuchDeviceException, HomeNullException {
		ListConteiner<Room> result = new ListConteiner<Room>();
		if (home != null && home.size() != 0) {
			for (int i = 0; i < home.size(); i++) {
				int size = home.getRoom(i).devicesListSize();
				for (int j = 0; j < size; j++) {
					if (home.getRoom(i).getDevice(j).getClass() == clazz) {
						result.add(home.getRoom(i));
					}
				}
			}
			return result;
		}
		throw new HomeNullException("Home is null");
	}

	public static Room findDevice(Device device, Home home)
			throws ListConteinerException, NoSuchRoomException, NoSuchDeviceException, HomeNullException {
		if (home != null && home.size() != 0) {
			if (device != null) {
				for (int i = 0; i < home.size(); i++) {
					int size = home.getRoom(i).devicesListSize();
					for (int j = 0; j < size; j++) {
						if (home.getRoom(i).getDevice(j).equals(device)) {
							return home.getRoom(i);
						}
					}
				}
			}
			throw new NoSuchDeviceException("There is no such device.");
		}
		throw new HomeNullException("Home is null");
	}

	public static ListConteiner<Device> sort(ListConteiner<Device> devices)
			throws DeviceNullException, ListConteinerException {
		if (devices != null && devices.size() != 0) {

			return doQuickSort(devices, 0, devices.size() - 1);
		}
		throw new DeviceNullException("Not found devices");
	}

	private static ListConteiner<Device> doQuickSort(ListConteiner<Device> devices, int left, int rightInclusive)
			throws ListConteinerException {

		int i = left;
		int j = rightInclusive;
		Device p = devices.get((left + rightInclusive) / 2);
		Device temp;

		do {
			while (devices.get(i).compareTo(p) < 0) {
				i++;
			}
			while (devices.get(j).compareTo(p) > 0) {
				j--;
			}
			if (i <= j) {
				temp = devices.get(i); // swap items
				devices.set(i, devices.get(j));
				devices.set(j, temp);
				++i;
				--j;
			}
		} while (i <= j);
		if (j > left)
			doQuickSort(devices, left, j);
		if (rightInclusive > i) {
			doQuickSort(devices, i, rightInclusive);
		}
		return devices;
	}

	public static Device findMaxPower(Home home)
			throws NoSuchRoomException, NoSuchDeviceException, HomeNullException, ListConteinerException {

		if (home != null && home.size() != 0) {
			ListConteiner<Device> devices = findAllDevices(home);
			if (devices.size() != 0) {
				Device max = devices.get(0);
				for (int i = 1; i < devices.size(); i++) {
					if (devices.get(i).compareTo(max) > 0) {
						max = devices.get(i);
					}

				}
				return max;
			}
			throw new NoSuchDeviceException("There is no device.");
		}
		throw new HomeNullException("Home is null");
	}

}
