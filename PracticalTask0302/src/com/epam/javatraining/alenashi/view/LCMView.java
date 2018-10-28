package com.epam.javatraining.alenashi.view;

import com.epam.javatraining.alenashi.model.logic.LCM;

public class LCMView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 10;
		
		int result = LCM.getLCM(a, b);
		
		View.log(result);
	}

}
