package second;

public class Task11 {
	public static boolean isPalindrom(double a) {
		int a4 = (int) a % 10;
		int a3 = (int) (a /= 10) % 10;
		int a2 = (int) (a /= 10) % 10;
		int a1 = (int) (a /= 10) % 10;
		return a1 == a4 && a2 == a3;
	}
}
