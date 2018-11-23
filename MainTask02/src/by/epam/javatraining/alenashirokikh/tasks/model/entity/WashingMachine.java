package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe washing machine.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.model.exception.SwitchOffEquipmentException;

public class WashingMachine extends Equipment {
	private WashingTypes type;

	public WashingMachine() {
	}

	public WashingMachine(int power) {
	}

	public void wash(WashingTypes type) throws SwitchOffEquipmentException {
		if (this.isSwitchOn()) {
			this.type = type;
			working = true;
		} else {
			throw new SwitchOffEquipmentException("You should switch on your washing machine");
		}
	}

	public void stopWash() {
		if (this.isWorking()) {
			working = false;
		}
	}
}
