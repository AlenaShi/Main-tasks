package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.TriangularLogic;
import com.epam.javatraining.alenashi.util.UserInput;
import com.epam.javatraining.alenashi.util.View;

public class TriangularView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View.log("This program detects triangular and founds react triangular.");
		double x1 = UserInput.readNumber("Enter x1");
		double y1 = UserInput.readNumber("Enter y1");
		double x2 = UserInput.readNumber("Enter x2");
		double y2 = UserInput.readNumber("Enter y2");
		double x3 = UserInput.readNumber("Enter x3");
		double y3 = UserInput.readNumber("Enter y3");

		String result = TriangularLogic.detectTriangular(x1, y1, x2, y2, x3, y3);

		View.log(result);
	}

}
