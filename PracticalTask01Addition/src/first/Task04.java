package first;

public class Task04 {
	public static boolean isOnePositive(double a, double b, double c) {
		return (a > 0 && b <= 0 && c <= 0) || (a <= 0 && b > 0 && c <= 0) || (a <= 0 && b <= 0 && c > 0);
	}
}
