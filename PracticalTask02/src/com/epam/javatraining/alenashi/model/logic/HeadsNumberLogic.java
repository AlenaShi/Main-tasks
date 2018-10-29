package com.epam.javatraining.alenashi.model.logic;

public class HeadsNumberLogic {
	public static final int YOUNG = 200;// Use int because heads and eyes can be
	public static final int OLD = 300; // only whole numbers
	public static final int HEAD_GR_200 = YOUNG * 3 + 3;
	public static final int HEAD_GR_300 = YOUNG * 3 + (OLD - YOUNG) * 2 + 3;

	public static int countHeadNum(double age) {
		int head = 0;

		if (age >= OLD) {
			head = (int) age - OLD + HEAD_GR_300;
		} else if (age >= YOUNG) {
			head = (int) (age - YOUNG) * 2 + HEAD_GR_200;
		} else {
			head = (int) age * 3 + 3;
		}
		return head;
	}
}
