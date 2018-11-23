package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe washing machine.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

public class WashingMachine extends Device {
	WashingTypes type;

	public WashingMachine() {
		super();
		this.name = "Washing machine";
	}

	public WashingMachine(int power) {
		super(power);
		this.name = "Washing machine";
	}

	public void wash(WashingTypes type) throws UsingSwitchOffDeviceException {
		if (this.isSwitchOn()) {
			this.type = type;
			working = true;
		} else {
			throw new UsingSwitchOffDeviceException("You should switch on your washing machine");
		}
	}

	public void stopWash() {
		if (this.isWorking()) {
			working = false;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		WashingMachine device = (WashingMachine) obj;
		return this.getPower() == device.getPower();
	}

	@Override
	public int hashCode() {
		final int prime = 85;
		int result = 1;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (this.getPower() <= 0 ? 0 : this.getPower() * prime);
		return result;
	}

}
