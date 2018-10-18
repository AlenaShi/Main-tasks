package fourth;

public class Sequence {
	public static boolean isDescending(double a) {
		double a4 = (int) a % 10;
		double a3 = (int) (a /= 10) % 10;
		double a2 = (int) (a /= 10) % 10;
		double a1 = (int) (a /= 10) % 10;
		return (a1 > a2) && (a2 > a3) && (a3 > a4);
	}

	public static boolean isAscending(double a) {
		double a4 = (int) a % 10;
		double a3 = (int) (a /= 10) % 10;
		double a2 = (int) (a /= 10) % 10;
		double a1 = (int) (a /= 10) % 10;
		return (a1 < a2) && (a2 < a3) && (a3 < a4);
	}
}
