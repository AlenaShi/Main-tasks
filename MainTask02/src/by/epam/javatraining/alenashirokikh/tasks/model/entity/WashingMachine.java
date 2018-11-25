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
	public final static WashingTypes DEFAULT_TYPE = WashingTypes.EVERYDAY;

	public WashingMachine() {
	}

	public WashingMachine(int power, String model) {
		super(power, model);
	}

	@Override
	public void work() {
		if (this.isSwitchOn()) {
			this.type = DEFAULT_TYPE;
			super.work();
		}
	}

	public void work(WashingTypes type) throws SwitchOffEquipmentException {
		if (this.isSwitchOn()) {
			this.type = type;
			super.work();
		}
	}

	public enum WashingTypes {
		EVERYDAY, SOFT, COTTON, CLEANING, SPINNING, RINSING
	}
}