package second;

public class TestSimilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 5;
		double b = 5;
		double c = 5;
		double d = 6;
		
		boolean first = Similar.isSimilar(a, b, c);
		boolean second = Similar.isSimilar(a, b, d);
		
		System.out.println("Is a, b, c is similar? " + first);
		System.out.println("Is a, b, d is similar? " + second);
	}

}
