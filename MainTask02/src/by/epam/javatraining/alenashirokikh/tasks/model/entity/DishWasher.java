package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

public class DishWasher extends Device {
	DishWashingTypes type;
	public DishWasher() {
		super();
		name = "DishWasher";
	}

	public DishWasher(int power) {
		super(power);
		name = "DishWasher";
	}

	public void wash(DishWashingTypes type) throws UsingSwitchOffDeviceException {
		if (this.isSwitchOn()) {
			this.type = type;
			working = true;
		} else {
			throw new UsingSwitchOffDeviceException("You should switch on your dishwasher");
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
		DishWasher device = (DishWasher) obj;
		return this.getPower() == device.getPower();
	}

	@Override
	public int hashCode() {
		final int prime = 34;
		int result = 1;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (this.getPower() <= 0 ? 0 : this.getPower() * prime);
		return result;
	}

}
