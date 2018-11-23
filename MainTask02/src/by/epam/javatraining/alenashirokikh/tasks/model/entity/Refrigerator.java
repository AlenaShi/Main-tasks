package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe refrigerator.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
public class Refrigerator extends Device {
	private double volume;
	private int temperature;
	private int freezerTemperature;

	public Refrigerator() {
	}

	public Refrigerator(int power) {
	}

	public Refrigerator(int power, double volume) {
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	@Override
	public void switchOn() {
		super.switchOn();
		working = true;
	}

	@Override
	public void switchOff() {
		super.switchOff();
		working = false;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temp) {
		if (temp > 2 && temp < 14) {
			this.temperature = temp;
		}
	}

	public int getFreezerTemperature() {
		return freezerTemperature;
	}

	public void setFreezerTemperature(int temp) {
		if (temp > -22 && temp < -10) {
			this.freezerTemperature = temp;
		}
	}

}
