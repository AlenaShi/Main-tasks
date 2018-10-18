package second;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 1;
		double y1 = 5;
		double x2 = 6;
		double y2 = 2;
		double x = 3;
		double y = 7;

		boolean inReact = Task18.isInReactangle(x1, y1, x2, y2, x, y);

		System.out.println("Is a point(3,3) in reactangle? " + inReact);
	}

}
