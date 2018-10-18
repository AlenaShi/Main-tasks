package third;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 200;
		double b = 10;

		double day = Task23.getDay(a, 0);// starts on Monday
		double day2 = Task23.getDay(b, 2);// starts on Wednesday

		System.out.println("200 day is " + (int) day);
		System.out.println("10 day is " + (int) day2);
	}

}
