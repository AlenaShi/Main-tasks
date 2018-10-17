package second;

public class Task13 {
	public static boolean isTriangular (double a, double b, double c) {
		return a + b > c || a + c > b || b + c > a;
	}
}
