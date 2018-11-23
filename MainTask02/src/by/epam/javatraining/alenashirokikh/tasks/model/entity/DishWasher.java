package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe dishwasher.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.model.exception.SwitchOffEquipmentException;

public class DishWasher extends Equipment {
	private DishWashingTypes type;

	public DishWasher() {
	}

	public DishWasher(int power) {
	}

	public void wash(DishWashingTypes type) throws SwitchOffEquipmentException {
		if (this.isSwitchOn()) {
			this.type = type;
			working = true;
		} else {
			throw new SwitchOffEquipmentException("You should switch on your dishwasher");
		}
	}

	public void stopWash() {
		if (this.isWorking()) {
			working = false;
		}
	}

	
}
