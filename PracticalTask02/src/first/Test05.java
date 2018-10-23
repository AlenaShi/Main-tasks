package first;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 28;
		int b = 2;
		int c = 1996;
		int a1 = 29;
		int b1 = 2;
		int c1 = 1996;
		int a2 = 29;
		int b2 = 2;
		int c2 = 2001;

		String date = Task05Logic.getNextDayLogic(a, b, c);
		String date1 = Task05Logic.getNextDayLogic(a1, b1, c1);
		String date2 = Task05Logic.getNextDayLogic(a2, b2, c2);

		View.print(date);
		View.print(date1);
		View.print(date2);
	}

}
