package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds if the array is in the ascending order or if the array is in the descending order. .
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class Order {
	/**
	 * The method finds if the array is in the ascending order.
	 * 
	 * @throws NullArrayException
	 */
	public static boolean isOrderedAscending(Conteiner array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			for (int i = 1; i < array.getArray().length; i++) {
				if (array.getArray()[i] < array.getArray()[i - 1]) {
					return false;
				}
			}
			return true;
		} else {
			throw new NullArrayException();
		} // O(n);
	}

	/**
	 * The method finds if the array is in the descending order.
	 * 
	 * @throws NullArrayException
	 */
	public static boolean isOrderedDescending(Conteiner array) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			for (int i = 0; i < array.getArray().length - 1; i++) {
				if (array.getArray()[i] < array.getArray()[i + 1]) {
					return false;
				}
			}
			return true;
		} else {
			throw new NullArrayException();
		}
	}
}// O(n)
