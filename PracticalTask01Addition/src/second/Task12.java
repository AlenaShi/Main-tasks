package second;

public class Task12 {
	public static boolean isInFirstQuarter(double x, double y) {
		return x > 0 && y > 0;
	}

	public static boolean isInSecondQuarter(double x, double y) {
		return x < 0 && y > 0;
	}

	public static boolean isInThirdQuarter(double x, double y) {
		return x < 0 && y < 0;
	}

	public static boolean isInFourthQuarter(double x, double y) {
		return x > 0 && y < 0;
	}
}
