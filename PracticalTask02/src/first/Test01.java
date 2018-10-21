package first;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View.print("The program counts the heads and the eyes of dragon.");

		double a = 123;
		double b = 223;
		double c = 333;

		int heads1 = Task01.getHeadNum(a);
		int eyes1 = Task01.getEyesNum(a);
		int heads2 = Task01.getHeadNum(b);
		int eyes2 = Task01.getEyesNum(b);
		int heads3 = Task01.getHeadNum(c);
		int eyes3 = Task01.getEyesNum(c);

		View.print("First dragon has " + heads1 + " heads and " + eyes1 + " eyes.");
		View.print("Second dragon has " + heads2 + " heads and " + eyes2 + " eyes.");
		View.print("Third dragon has " + heads3 + " heads and " + eyes3 + " eyes.");
	}

}
