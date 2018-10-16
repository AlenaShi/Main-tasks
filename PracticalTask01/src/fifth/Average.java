package fifth;

public class Average {
	public static double getArithAvr (double a) {
		double a6 = (int)a % 10;
		a /= 10;
		double a5 = (int)a % 10;
		a /= 10;
		double a4 = (int)a % 10;
		a /= 10;
		double a3 =(int) a % 10;
		a /= 10;
		double a2 =(int) a % 10;
		a /= 10;
		double a1 =(int) a % 10;
		System.out.println("number" + a1+";" + a2+";" + a3+";"+ a4+";"+ a5+";"+ a6);
		return ((a1+a2+a3+a4+a5+a6))/6;
		
	}
	public static double getGeomAvr (double a) {
		double rate = 1d/6;
		double a6 = (int)a % 10;
		a /= 10;
		double a5 = (int)a % 10;
		a /= 10;
		double a4 = (int)a % 10;
		a /= 10;
		double a3 = (int)a % 10;
		a /= 10;
		double a2 =(int)a % 10;
		a /= 10;
		double a1 =(int)a % 10;
		
		return Math.pow((a1*a2*a3*a4*a5*a6), rate);
	}
}
