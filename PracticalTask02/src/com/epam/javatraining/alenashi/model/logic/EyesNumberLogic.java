package com.epam.javatraining.alenashi.model.logic;

public class EyesNumberLogic {
	public static int countEyesNum(double age) {
		return HeadsNumberLogic.countHeadNum(age) * 2;
	}
}
