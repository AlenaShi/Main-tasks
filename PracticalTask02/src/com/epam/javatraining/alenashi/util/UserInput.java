package com.epam.javatraining.alenashi.util;

import java.util.Scanner;

public class UserInput {
	static Scanner in;
	static {
		in = new Scanner(System.in);
	}

	public static int readNumber(String msg) {
		System.out.println(msg);
		return in.nextInt();
	}
}