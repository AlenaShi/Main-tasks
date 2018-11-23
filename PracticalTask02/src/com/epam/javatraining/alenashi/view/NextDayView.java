package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.NextDayLogic;
import com.epam.javatraining.alenashi.util.UserInput;
import com.epam.javatraining.alenashi.util.View;

public class NextDayView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = UserInput.readNumber("Enter day");
		int b = UserInput.readNumber("Enter month");
		int c = UserInput.readNumber("Enter year");

		String date = NextDayLogic.findNextDayLogic(a, b, c);

		View.log(date);
	}
}
