package seventh;

public class Exchange {
	public static void change (double a, double b) {	
		
		b += a;
		a = b - a;
		b = b - a;	 
		
		System.out.println("a = " + a);
		System.out.println("b = "+ b);
	
	
	}
}
