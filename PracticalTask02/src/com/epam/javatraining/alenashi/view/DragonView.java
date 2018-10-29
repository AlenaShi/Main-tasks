package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.EyesNumberLogic;
import com.epam.javatraining.alenashi.model.logic.HeadsNumberLogic;
import com.epam.javatraining.alenashi.util.UserInput;
import com.epam.javatraining.alenashi.util.View;

public class DragonView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View.log("The program counts the heads and the eyes of dragon.");

		double age = UserInput.readNumber("Please, enter the age of dragon.");

		int heads = HeadsNumberLogic.countHeadNum(age);
		int eyes = EyesNumberLogic.countEyesNum(age);

		View.log("Dragon has " + heads + " heads and " + eyes + " eyes.");
	}
}
