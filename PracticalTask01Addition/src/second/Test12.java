package second;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 3;
		double y1 = 4;
		double x2 = -3;
		double y2 = 3;
		double x3 = -3;
		double y3 = -7;
		double x4 = 4;
		double y4 = -5;

		boolean quat1 = Task12.isInFirstQuarter(x1, y1);
		boolean quat2 = Task12.isInSecondQuarter(x2, y2);
		boolean quat3 = Task12.isInThirdQuarter(x3, y3);
		boolean quat4 = Task12.isInFourthQuarter(x4, y4);

		System.out.println("Is point(3,4) in first quarter? " + quat1);
		System.out.println("Is point(-3,3) in second quarter? " + quat2);
		System.out.println("Is point(-3,-7) in third quarter? " + quat3);
		System.out.println("Is point(4,-5) in fourth quarter? " + quat4);
	}

}
