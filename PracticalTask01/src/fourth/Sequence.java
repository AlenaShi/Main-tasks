package fourth;

public class Sequence {
	public static boolean isDescending (double a) {
		double a4 = a % 10;
		a /= 10;
		double a3 = a % 10;
		a /= 10;
		double a2 =a % 10;
		a /= 10;
		double a1 =a % 10;
		return (a1 > a2) && (a2 > a3) && (a3 > a4);
	}
	public static boolean isAscending (double a) {
		double a4 = a % 10;
		a /= 10;
		double a3 = a % 10;
		a /= 10;
		double a2 =a % 10;
		a /= 10;
		double a1 =a % 10;
		return (a1 < a2) && (a2 < a3) && (a3 < a4);
	}
}
