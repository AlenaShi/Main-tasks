package first;

import java.util.Scanner;

public class Task04 {
	public static String getMood(int a) {
		if (a <= 4) {
			return ":(";
		} else if (a <= 7) {
			return ":|";
		} else {
			return ":)";
		}
	}

	public static int getNum() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please, enter your mood on scale of 10.");
		int mood = in.nextInt();
		in.close();
		return mood;
	}
}
