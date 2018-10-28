package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.DifferentDigits;

public class DifferentDigitsView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = UserInput.getNumber();

		int result = DifferentDigits.getNumberOfDifferentDigits(a);
		View.log("The number of digits: " + result);
	}

}
