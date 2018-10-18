package third;

public class Task24 {
	public static double getNumberOfSquare(double a, double b, double c) {
		return (int) (b / a) * (int) (c / a);
	}

	public static double getFreeSpace(double a, double b, double c) {
		return b * c - a * a * (int) (b / a) * (int) (c / a);
	}
}
