package fifth;

public class TestAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 123456;
		double b = 111111;
		
		double aArith = Average.getArithAvr(a);
		double aGeom = Average.getGeomAvr(a);
		double bArith = Average.getArithAvr(b);
		double bGeom = Average.getGeomAvr(b);

		System.out.println("Arithmetic average of a is " + aArith);
		System.out.println("Geometry average of a is " + aGeom);
		System.out.println("Arithmetic average of b is " + bArith);
		System.out.println("Geometry average of b is " + bGeom);
	}

}
