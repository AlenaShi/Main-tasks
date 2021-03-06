package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.logic;

/**
 * The program finds the element with using linear search.
 * 
 * @author Alena Shirokikh
 * @version 2.0 2.11.2018
 */
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.entity.Conteiner;
import by.epam.javatraining.alenashirokikh.tasks.maintask01.main.model.exception.NullArrayException;

public class Search {
	/**
	 * The method finds the element with using linear search.
	 * 
	 * @throws NullArrayException
	 */
	public static int findElementByLinearSearch(Conteiner array, double element) throws NullArrayException {
		if (array != null && array.getArray().length != 0) {
			for (int i = 0; i < array.getArray().length; i++) {
				if (element == array.getArray()[i]) {
					return i;
				}
			}
			return -1;
		} else {
			throw new NullArrayException();
		}

	}// O(n)

	/**
	 * The method finds an element with using binary search.
	 * 
	 * @throws NullArrayException
	 */
	public static int findElementByBinarySearch(Conteiner array, double element) throws NullArrayException {
		// work with sorted array
		if (array != null && array.getArray().length != 0) {
			int index = -1;
			int left = 0;
			int right = array.getArray().length - 1;
			int mid = 0;
			while (left <= right) {
				mid = (left + right) / 2;
				if (element > array.getArray()[mid]) {
					left = mid + 1;
				} else if (element < array.getArray()[mid]) {
					right = mid - 1;
				} else {
					index = mid;
					break;
				} // O(n)
			}
			return index;
		} else {
			throw new NullArrayException();
		}
	}
}