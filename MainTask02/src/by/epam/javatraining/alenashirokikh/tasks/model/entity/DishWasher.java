package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe dishwasher.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

public class DishWasher extends Equipment {
	private DishWashingTypes type;

	public DishWasher() {
	}

	public DishWasher(int power) {
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

	
}
