package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util;

import java.io.IOException;
import java.util.List;

import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.DoubleVector;

public class CreatorConteiner {
	public static DoubleVector createConteiner(String fileName) throws IOException {

		List<String> list = Validator.findValideInfo(fileName);
		double[] array = new double[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = Double.valueOf(list.get(i));
		}
		return new DoubleVector(array);
	}
}