package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.MoodSensor;
import com.epam.javatraining.alenashi.util.UserInput;
import com.epam.javatraining.alenashi.util.View;

public class MoodSensorView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = UserInput.readNumber("Please, enter your mood on scale of 10.");

		String result = MoodSensor.detectMood(a);

		View.log(result);
	}

}
