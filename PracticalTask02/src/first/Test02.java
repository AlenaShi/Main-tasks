package first;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View.log("This program detects triangular and founds react triangular.");
		double x1 = 1;
		double y1 = 1;
		double x2 = 1;
		double y2 = 3;
		double x3 = 3;
		double y3 = 1;

		String result = Task02Logic.getTriangularLogic(x1, y1, x2, y2, x3, y3);

		View.log(result);
	}

}
