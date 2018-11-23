package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.UsingSwitchOffDeviceException;

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

	public void clean() throws UsingSwitchOffDeviceException {
		if (isSwitchOn()) {
			working = true;
		} else {
			throw new UsingSwitchOffDeviceException("You should switch on your vacum cleaner");
		}
	}

	public void stopClean() {
		working = false;
	}
}
