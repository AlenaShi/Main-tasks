package first;

public class Task02Logic {
	public static String getTriangularLogic(double x1, double y1, double x2, double y2, double x3, double y3) {
		String result = "";
		if (Task02.isTriangular(x1, y1, x2, y2, x3, y3)) {
			if (Task02.isReactTriangular(x1, y1, x2, y2, x3, y3)) {
				result = "This is a react triangular.";
			} else {
				result = "This is not a react triangular.";
			}
		} else {
			result = "This is not a triangular.";
		}
		return result;
	}
}
