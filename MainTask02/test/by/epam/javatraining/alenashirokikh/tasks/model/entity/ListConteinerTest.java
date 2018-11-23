package by.epam.javatraining.alenashirokikh.tasks.model.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.alenashirokikh.tasks.model.exception.ListConteinerOutOfBoundException;

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
	public void addTest() {
		str.add("One");
		String expected = "One";
		assertEquals(expected, str.toString());
	}

	@Test
	public void add11Test() {
		for (int i = 0; i < 11; i++) {
			str.add("One");
		}

		String expected = "One One One One One One One One One One One";
		assertEquals(expected, str.toString());
	}

	@Test(expected = NullPointerException.class)
	public void addToNullTest() {
		str = null;
		str.add("one");
	}

	@Test
	public void size0Test() {
		int expected = 0;
		assertEquals(expected, str.size());
	}

	@Test
	public void size1Test() {
		str.add("One");
		int expected = 1;
		assertEquals(expected, str.size());
	}

	@Test
	public void size11Test() {
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
	public void remove0Test() {
		str.add("Three");
		str.add("One");
		str.add("Two");
		String expected = "One Two";

		str.remove(0);
		assertEquals(expected, str.toString());
	}

	@Test
	public void remove1Test() {
		str.add("Three");
		str.add("One");
		str.add("Two");
		String expected = "Three Two";

		str.remove(1);
		assertEquals(expected, str.toString());
	}

	@Test
	public void removeLastTest() {
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
	public void sizeAfterRemove0Test() {
		str.add("Three");
		str.add("One");
		str.add("Two");
		int expected = 2;

		str.remove(0);
		assertEquals(expected, str.size());
	}

	@Test
	public void sizeAfterRemove1Test() {
		str.add("Three");
		str.add("One");
		str.add("Two");
		int expected = 2;

		str.remove(1);
		assertEquals(expected, str.size());
	}

	@Test
	public void sizeAfterRemoveLastTest() {
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
	public void RemoveOutOfBoundTest() {
		str.add("Three");
		str.add("One");
		str.add("Two");
		int expected = 3;

		str.remove(4);
		assertEquals(expected, str.size());
	}

	@Test
	public void removeElText() {
		str.add("Three");
		str.add("One");
		str.add("Two");
		str.remove("One");
		String expected = "Three Two";
		assertEquals(expected, str.toString());
	}

	@Test
	public void removeElOutOfBoundText() {
		str.add("Three");
		str.add("One");
		str.add("Two");
		str.remove("Four");
		String expected = "Three One Two";
		assertEquals(expected, str.toString());
	}

	@Test
	public void removeElNullText() {
		str.add("Three");
		str.add("One");
		str.add("Two");
		str.remove(null);
		String expected = "Three One Two";
		assertEquals(expected, str.toString());
	}

	@Test
	public void removeElTrueText() {
		str.add("Three");
		str.add("One");
		str.add("Two");

		assertTrue(str.remove("One"));
	}

	@Test
	public void removeElFalseText() {
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
	public void getTest() throws ListConteinerOutOfBoundException {
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
	public void getOutOfBoundTest() throws ListConteinerOutOfBoundException {
		str.add("Three");
		str.add("One");
		str.add("Two");
		str.get(5);
	}
}
