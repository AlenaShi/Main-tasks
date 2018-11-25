package by.epam.javatraining.alenashirokikh.tasks.model.entity;

public class DishWasher extends Equipment {
	private DishWashingTypes type;
	public final static DishWashingTypes DEFAULT_TYPE = DishWashingTypes.ECO;

	public DishWasher() {
	}

	public DishWasher(int power, String model) {
		super(power, model);
	}

	@Override
	public void work() {
		if (this.isSwitchOn()) {
			this.type = DEFAULT_TYPE;
			super.work();
		}
	}

	public void work(DishWashingTypes type) {
		if (this.isSwitchOn()) {
			this.type = type;
			super.work();
		}
	}

	public enum DishWashingTypes {
		ECO, ECONOM, INTENSIVE, GLASS
	}

}
