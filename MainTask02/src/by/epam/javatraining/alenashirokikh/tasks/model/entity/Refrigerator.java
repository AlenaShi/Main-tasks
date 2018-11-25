package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe refrigerator.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
public class Refrigerator extends Equipment {
	private double volume;
	private int temperature;
	private int freezerTemperature;

	public Refrigerator() {
	}

	public Refrigerator(int power, String model) {
		super(power, model);
	}

	public Refrigerator(int power, String model, double volume) {
		super(power, model);
		this.volume = volume;

	}

	public Refrigerator(int power, String model, double volume, int temperature, int freezerTemperature) {
		super(power, model);
		this.volume = volume;
		this.temperature = temperature;
		this.freezerTemperature = freezerTemperature;
	}

	public double getVolume() {
		return volume;
	}

	@Override
	public void switchOn() {
		super.switchOn();
		work();
	}

	@Override
	public void switchOff() {
		super.switchOff();
		stopWork();
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Refrigerator device = (Refrigerator) obj;
		return this.getName() == device.getName() && this.getPower() == device.getPower()
				&& this.volume == device.volume;
	}

	@Override
	public int hashCode() {
		final int prime = 34;
		int result = 1;
		result = prime * result + (this.getName() == null ? 0 : this.getName().hashCode());
		result = prime * result + (this.getPower() <= 0 ? 0 : this.getPower() * prime);
		result = (int) (prime * result + (this.volume <= 0 ? 0 : this.volume * prime));
		return result;
	}

	public String toString() {
		return super.toString() + " volume - " + this.getVolume();
	}
}
