package com.epam.javatraining.alenashi.view;

import java.util.Scanner;

public class UserInput {
	public static int getNumber() {

		Scanner in = new Scanner(System.in);
		System.out.println("Please, enter number.");
		int number = in.nextInt();
		in.close();
		return number;
	}
}