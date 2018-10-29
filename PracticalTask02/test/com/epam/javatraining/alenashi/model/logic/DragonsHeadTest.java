package com.epam.javatraining.alenashi.model.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DragonsHeadTest {
	@Test
	public void testCountHeadNumDragon1() {
		double age = 123;
		int heads = 372;
		assertEquals(heads, HeadsNumberLogic.countHeadNum(age));
	}

	@Test
	public void testGetHeadNumDragon2() {
		double age = 223;
		int heads = 649;
		assertEquals(heads, HeadsNumberLogic.countHeadNum(age));
	}

	@Test
	public void testGetHeadNumDragon3() {
		double age = 333;
		int heads = 836;
		assertEquals(heads, HeadsNumberLogic.countHeadNum(age));
	}

	@Test
	public void testEyesNumDragon() {
		double age = 123;
		int eyes = 744;
		assertEquals(eyes, EyesNumberLogic.countEyesNum(age));
	}

}
