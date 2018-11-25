package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe vacuum cleaner.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
public class VacuumCleaner extends Equipment {
	private double noise;

	public VacuumCleaner() {
	}

	public VacuumCleaner(int power, String model, double noise) {
		super(power, model);
		this.noise = noise;
	}

	public double getNoise() {
		return noise;
	}
}
