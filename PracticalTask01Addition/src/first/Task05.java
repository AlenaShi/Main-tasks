package first;

public class Task05 {
	public static boolean areTwoPositive(double a, double b, double c) {
		return (a > 0 && b > 0 && c <= 0) || (a > 0 && b <= 0 && c > 0) || (a <= 0 && b > 0 && c > 0);
	}
}
