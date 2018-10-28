package first;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task01Test {

	@Test
	public void testGetHeadNumDragon1() {
		double age = 123;
		int heads = 372;
		assertEquals(heads, Task01.getHeadNum(age));
	}

	@Test
	public void testGetHeadNumDragon2() {
		double age = 223;
		int heads = 649;
		assertEquals(heads, Task01.getHeadNum(age));
	}

	@Test
	public void testGetHeadNumDragon3() {
		double age = 333;
		int heads = 836;
		assertEquals(heads, Task01.getHeadNum(age));
	}

	@Test
	public void testEyesNumDragon() {
		double age = 123;
		int eyes = 744;
		assertEquals(eyes, Task01.getEyesNum(age));
	}

}
