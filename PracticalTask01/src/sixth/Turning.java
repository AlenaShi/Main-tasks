package sixth;

public class Turning {
	public static double turn (double a) {
		int b=(int)a;
		
		double c=(b%10)*1000000+b/1000000;    //turn 1 and 7 numbers
		b = (b - (b / 1000000) * 1000000)/10;
		c+=(b%10)*100000+(b/10000)*10;    //turn 2 and 6 numbers
		b = (b - (b / 10000) * 10000)/10;
		c+=(b%10)*10000+(b/100)*100;    //turn 3 and 5 numbers
		b = (b - (b / 100) * 100)/10;
		c+=b*1000;
	
		return c;
		
	}
}
