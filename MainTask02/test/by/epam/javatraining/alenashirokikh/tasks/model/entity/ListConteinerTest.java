package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;
import by.epam.javatraining.alenashirokikh.tasks.model.exception.NullElementException;

public class ListConteinerTest {
	private ListConteiner<String> str;

	@Before
	public void init() {
		str = new ListConteiner<>();
	}

	@After
	public void destroy() {
		str = null;
	}

	@Test
	public void listConteinerTest() {
		assertNotNull(str);
	}

	@Test
	public void addTest() throws NullElementException {
		str.add("One");
		String expected = "One";
		assertEquals(expected, str.toString());
	}

	@Test
	public void add11Test() throws NullElementException {
		for (int i = 0; i < 11; i++) {
			str.add("One");
		}

		String expected = "One One One One One One One One One One One";
		assertEquals(expected, str.toString());
	}

	@Test(expected = NullPointerException.class)
	public void addToNullTest() throws NullElementException {
		str = null;
		str.add("one");
	}

	@Test(expected=NullElementException.class)
	public void addNullElTest() throws NullElementException {
		str.add(null);
	}

	@Test
	public void size0Test() {
		int expected = 0;
		assertEquals(expected, str.size());
	}

	@Test
	public void size1Test() throws NullElementException {
		str.add("One");
		int expected = 1;
		assertEquals(expected, str.size());
	}

	@Test
	public void size11Test() throws NullElementException {
		for (int i = 0; i < 11; i++) {
			str.add("One");
		}
		int expected = 11;
		assertEquals(expected, str.size());
	}

	@Test(expected = NullPointerException.class)
	public void sizeToNullTest() {
		str = null;
		str.size();
	}

	@Test
	public void remove0Test() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		String expected = "One Two";

		str.remove(0);
		assertEquals(expected, str.toString());
	}

	@Test
	public void remove1Test() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		String expected = "Three Two";

		str.remove(1);
		assertEquals(expected, str.toString());
	}

	@Test
	public void removeLastTest() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		String expected = "Three One";

		str.remove(2);
		assertEquals(expected, str.toString());
	}

	@Test
	public void removeEmptyTest() {
		str.remove(0);
		assertNotNull(str);
	}

	@Test
	public void sizeAfterRemove0Test() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		int expected = 2;

		str.remove(0);
		assertEquals(expected, str.size());
	}

	@Test
	public void sizeAfterRemove1Test() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		int expected = 2;

		str.remove(1);
		assertEquals(expected, str.size());
	}

	@Test
	public void sizeAfterRemoveLastTest() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		int expected = 2;

		str.remove(2);
		assertEquals(expected, str.size());
	}

	@Test(expected = NullPointerException.class)
	public void removeFromNullTest() {
		str = null;
		str.remove(0);
	}

	@Test
	public void RemoveOutOfBoundTest() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		int expected = 3;

		str.remove(4);
		assertEquals(expected, str.size());
	}

	@Test
	public void removeElText() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		str.remove("One");
		String expected = "Three Two";
		assertEquals(expected, str.toString());
	}

	@Test
	public void removeElOutOfBoundText() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		str.remove("Four");
		String expected = "Three One Two";
		assertEquals(expected, str.toString());
	}

	@Test
	public void removeElNullText() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		str.remove(null);
		String expected = "Three One Two";
		assertEquals(expected, str.toString());
	}
	
	@Test
	public void removeElTrueText() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");

		assertTrue(str.remove("One"));
	}

	@Test
	public void removeElFalseText() throws NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");

		assertFalse(str.remove("Four"));
	}

	@Test(expected = NullPointerException.class)
	public void removeElListNullTest() throws ListConteinerOutOfBoundException {
		str = null;
		str.remove(0);
	}

	@Test
	public void getTest() throws ListConteinerOutOfBoundException, NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		String expected = "One";
		assertEquals(expected, str.get(1));
	}

	@Test(expected = NullPointerException.class)
	public void getNullTest() throws ListConteinerOutOfBoundException {
		str = null;
		str.get(0);
	}

	@Test(expected = ListConteinerOutOfBoundException.class)
	public void getOutOfBoundTest() throws ListConteinerOutOfBoundException, NullElementException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		str.get(5);
	}
}
