package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util;

import java.util.Random;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class Initializer {
	public static Conteiner randomInit(Conteiner vector, int from, int to) throws NullArrayException {
		Random rand = new Random();
		for (int i = 0; i < vector.getArray().length; i++) {
			vector.getArray()[i] = (double) rand.nextInt(to - from + 1) + from;
		}
		return vector;
	}
}
