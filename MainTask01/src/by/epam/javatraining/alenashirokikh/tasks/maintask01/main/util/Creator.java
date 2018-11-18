package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;

public class Creator {
	public static Conteiner create() {
		return new Conteiner();
	}

	public static Conteiner create(int size) {
		return new Conteiner(size);
	}

	public static Conteiner create(double[] array) {
		return new Conteiner(array);
	}
}
