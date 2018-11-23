package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe refrigerator.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
public class Refrigerator extends Device {
	private double volume = 200;
	private int temperature = 4;
	private int freezerTemperature = -18;

	public Refrigerator() {
		super();
		this.name = "Refrigerator";
	}

	public Refrigerator(int power) {
		super(power);
		this.name = "Refrigerator";
	}

	public Refrigerator(int power, double volume) {
		super(power);
		this.name = "Refrigerator";
		this.volume = volume;
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

	public void setTemperature(int temp) {
		if (temp > 2 && temp < 14) {
			this.temperature = temp;
		}
	}

	public void setFreezerTemperature(int temp) {
		if (temp > -22 && temp < -10) {
			this.freezerTemperature = temp;
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
		Refrigerator device = (Refrigerator) obj;
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
