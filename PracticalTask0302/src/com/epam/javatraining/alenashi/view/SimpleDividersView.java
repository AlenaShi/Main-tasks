package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.SimpleDividers;

public class SimpleDividersView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = UserInput.getNumber();
		String result = SimpleDividers.getSimpleDividers(a);

		View.log(result);
	}

}
