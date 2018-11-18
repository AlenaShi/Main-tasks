package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program reverses the array.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class Reversing {
	public static Conteiner reverseArray(Conteiner array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			for (int i = 0; i < array.getArray().length / 2; i++) {
				array.getArray()[i] = array.getArray()[i] + array.getArray()[array.getArray().length - 1 - i]; // swap
																												// items
				array.getArray()[array.getArray().length - 1 - i] = array.getArray()[i]
						- array.getArray()[array.getArray().length - 1 - i];
				array.getArray()[i] = array.getArray()[i] - array.getArray()[array.getArray().length - 1 - i];
			}
			return array;
		} else {
			throw new NullArrayException();
		}
	}
}// O(n)
