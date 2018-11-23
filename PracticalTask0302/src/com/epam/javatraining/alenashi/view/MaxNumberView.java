package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.MaxNumber;

public class MaxNumberView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = UserInput.readNumber("Input number");
		int result = MaxNumber.getNumber(a);
		View.log("max = " + result);
	}

}
