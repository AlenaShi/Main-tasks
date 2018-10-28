package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.TheGCD;

public class TheGCDView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 726;
		int b = 132;
		
		int result = TheGCD.getGreatestCommonDivisor(a, b);
		
		View.log(result);
	}

}
