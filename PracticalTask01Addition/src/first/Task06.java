package first;

public class Task06 {
	public static boolean areEven(double a, double b, double c) {
		return (a % 2 == 0 && a != 0) && (b != 0 && b % 2 == 0) && (c != 0 && c % 2 == 0);
	}
}
