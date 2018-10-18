package third;

public class Task23 {
	public static double getDay(double a, double b) {// b - first week day in
														// year
		return (a + b) % 7 - 1;
	}
}
