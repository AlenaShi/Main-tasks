package by.epam.javatraining.alenashirokikh.tasks.model.entity;

/**
 * The program describe list for using with Objects.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import java.util.Arrays;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;

public class ListConteiner<T> {
	private static final int INITIAL_SIZE = 10;
	private Object[] array;
	private int count = 0;

	public ListConteiner() {
		array = new Object[INITIAL_SIZE];
	}

	private void enlargeArray() {
		array = Arrays.copyOf(array, array.length * 2);

	}

	public void add(T el) {
		if (el != null) {
			if (count < array.length) {
				array[count++] = el;
			} else {
				enlargeArray();
				array[count++] = el;
			}
		}
	}

	public void add(int index, T el) {
		if (index <= count && index >= 0) {
			if (count + 1 > array.length) {
				enlargeArray();
			}
			if (index != count && index != 0) {
				Object[] temp = Arrays.copyOfRange(array, index, count);
				System.arraycopy(array, 0, array, 0, index);
				array[index] = el;
				System.arraycopy(temp, 0, array, index + 1, temp.length);
				count++;
			} else if (index == count) {
				array[index] = el;
				count++;
			} else {
				if (count != 0) {
					Object[] temp = new Object[count + 1];
					temp[0] = el;
					System.arraycopy(array, 0, temp, 1, count);
					array = temp;
					count++;
				}
			}
		}
	}

	public int size() {
		return count;
	}

	public void remove(int index) {
		if (index < count && index >= 0) {
			if (index != count - 1 && index != 0) {
				Object[] temp = Arrays.copyOfRange(array, index + 1, count);
				System.arraycopy(array, 0, array, 0, index);
				System.arraycopy(temp, 0, array, index, temp.length);
				count--;
			} else if (index == count - 1) {
				System.arraycopy(array, 0, array, 0, count - 1);
				count--;
			} else {
				if (count != 0) {
					System.arraycopy(array, 1, array, 0, count);
					count--;
				}
			}
		}
	}

	public boolean remove(T el) {
		for (int i = 0; i < count; i++) {
			if (array[i].equals(el)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	public void set(int index, T el) throws ListConteinerException {
		if (el != null) {
			if (index < count && index >= 0 && el != null) {
				array[index] = el;
			} else {
				throw new ListConteinerException("There is no such index or element is null");
			}
		}
	}

	public T get(int index) throws ListConteinerOutOfBoundException {
		if (index < count && index >= 0) {
			return (T) array[index];
		}
		throw new ListConteinerOutOfBoundException("Index out of bound of ListConteiner");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(array[i]).append(" ");
		}
		sb.delete(sb.length() - 1, sb.length());
		return sb.toString();
	}
}
