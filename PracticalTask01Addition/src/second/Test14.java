package second;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 4;
		double b = 4;
		double c = 4;
		double d = 5;

		boolean equiTr1 = Task14.isEquilateralTriangle(a, b, c);
		boolean equiTr2 = Task14.isEquilateralTriangle(a, b, d);

		System.out.println("Is it an equilateral triangle(4,4,4)? " + equiTr1);
		System.out.println("Is it an equilateral triangle(4,4,5)? " + equiTr2);
	}

}
