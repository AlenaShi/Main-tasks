package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe base class for devices.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
public abstract class Device implements Comparable<Device> {
	private boolean on;
	private int power;
	private Room room;
	protected String name;
	protected boolean working = false;

	public Device() {
		on = false;
		power = 1000;
	}

	public Device(int power) {
		on = false;
		if (power > 0) {
			this.power = power;
		} else {
			this.power = Math.abs(power);
		}
		name = "Device";
	}

	public boolean isWorking() {
		return working;
	}

	public int getPower() {
		return power;
	}

	void setRoom(Room room) {
		if (room != null) {
			this.room = room;
		}
	}

	boolean hasRoom() {
		return room != null;
	}

	Room getRoom() {
		return room;
	}

	public void switchOn() {
		if (room != null) {
			on = true;
		}
	}

	public void switchOff() {
		on = false;
	}

	public boolean isSwitchOn() {
		return on;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public abstract boolean equals(Object obj);

	@Override
	public abstract int hashCode();

	public int compareTo(Device device) {
		if (this.name.compareTo(device.name) != 0) {
			return this.name.compareTo(device.name);
		} else {
			return this.power - device.power;
		}
	}

	@Override
	public String toString() {
		return getName() + " has " + power + "Vt power";
	}
}
