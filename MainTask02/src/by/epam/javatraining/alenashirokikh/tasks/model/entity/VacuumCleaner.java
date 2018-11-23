package by.epam.javatraining.alenashirokikh.tasks.model.entity;

public class VacuumCleaner extends Device {
	public VacuumCleaner() {
		super();
		name = "Vacuum cleaner";
	}

	public VacuumCleaner(int power) {
		super(power);
		name = "Vacuum cleaner";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		DishWasher device = (DishWasher) obj;
		return name.equals(device.name) && this.getPower() == device.getPower();
	}

	@Override
	public int hashCode() {
		final int prime = 41;
		int result = 1;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (this.getPower() <= 0 ? 0 : this.getPower() * prime);
		return result;
	}

}
