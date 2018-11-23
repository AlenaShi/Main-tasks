package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.SimpleNumber;

public class SimpleNumberView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = UserInput.readNumber("Input number");
		String result = SimpleNumber.isSimpleNumber(a);

		View.log(result);
	}

}
