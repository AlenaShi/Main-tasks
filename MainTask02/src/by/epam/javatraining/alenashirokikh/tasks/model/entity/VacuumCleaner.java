package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.SwitchOffEquipmentException;

/**
 * The program describe vacuum cleaner.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
public class VacuumCleaner extends Equipment {
	public VacuumCleaner() {
	}

	public VacuumCleaner(int power) {
	}

	public void clean() throws SwitchOffEquipmentException {
		if (isSwitchOn()) {
			working = true;
		} else {
			throw new SwitchOffEquipmentException("You should switch on your vacum cleaner");
		}
	}

	public void stopClean() {
		working = false;
	}
}
