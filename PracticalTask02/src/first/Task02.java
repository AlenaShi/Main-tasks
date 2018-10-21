package first;

public class Task02 {
	public static double getA(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public static double getB(double x2, double y2, double x3, double y3) {
		return Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
	}

	public static double getC(double x1, double y1, double x3, double y3) {
		return Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
	}

	public static boolean isTriangular(double x1, double y1, double x2, double y2, double x3, double y3) {
		double a = Task02.getA(x1, y1, x2, y2);
		double b = Task02.getB(x2, y2, x3, y3);
		double c = Task02.getC(x1, y1, x3, y3);

		return a + b > c && a + c > b && b + c > a;
	}

	public static boolean isReactTriangular(double x1, double y1, double x2, double y2, double x3, double y3) {
		double a = Task02.getA(x1, y1, x2, y2);
		double b = Task02.getB(x2, y2, x3, y3);
		double c = Task02.getC(x1, y1, x3, y3);

		return a == Math.sqrt(b * b + c * c) || b == Math.sqrt(a * a + c * c) || c == Math.sqrt(b * b + a * a);
	}
}