package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe base class for devices.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
public class Equipment implements Comparable<Equipment> {
	private boolean on;
	protected int power;
	private Room room;
	protected boolean working;

	public Equipment() {
		on = false;
	}

	public Equipment(int power) {
		on = false;
		this.power = Math.abs(power);
	}

	public boolean isWorking() {
		return working;
	}

	public int getPower() {
		return power;
	}

	void setRoom(Room room) {
		this.room = room;
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
		working=false;
	}

	public boolean isSwitchOn() {
		return on;
	}

	public String getName() {
		return this.getClass().toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Equipment device = (Equipment) obj;
		return this.getPower() == device.getPower();
	}

	@Override
	public int hashCode() {
		final int prime = 34;
		int result = 1;
		result = prime * result + (this.getPower() <= 0 ? 0 : this.getPower() * prime);
		return result;
	}

	public int compareTo(Equipment device) {
		if (this.getName().compareTo(device.getName()) != 0) {
			return this.getName().compareTo(device.getName());
		} else {
			return this.power - device.power;
		}
	}

	@Override
	public String toString() {
		return getName() + " has " + power + "Vt power";
	}
}
