package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.PerfectNumberLogic;

public class PerfectNumberView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = UserInput.getNumber();
		String perfect = PerfectNumberLogic.isPerfect(num);

		View.print("This is " + perfect);
	}

}
