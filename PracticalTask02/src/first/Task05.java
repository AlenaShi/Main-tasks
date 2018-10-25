package first;

public class Task05 {
	public static String getNextDay(int a, int b, int c) {
		String date = "";
		if (!isEndOfMonthNotFebruary(a, b)) {
			date = ++a + "." + b + "." + c;
		} else if (b != 12) {
			date = 1 + "." + ++b + "." + c;
		} else {
			date = 1 + "." + 1 + "." + ++c;
		}
		return date;
	}

	public static boolean isEndOfMonthNotFebruary(int a, int b) {
		if ((a == 30 && (b == 4 || b == 6 || b == 9 || b == 11))
				|| (a == 31 && (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12))) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isLeapYear(int a, int b, int c) {
		if ((c % 4 == 0 && c % 100 != 0) || c % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static String getEndOfFebruary(int a, int b, int c) {
		if (a == 29 || !isLeapYear(a, b, c)) {
			return 1 + "." + ++b + "." + c;
		} else {
			return ++a + "." + b + "." + c;
		}
	}

	public static boolean isNotACalendarDay(int a, int b, int c) {
		if (a > 31 || b > 12 || (a == 31 && (b == 4 || b == 6 || b == 9 || b == 11)) || (a > 29 && b == 2)
				|| (a == 29 && b == 2 && !isLeapYear(a, b, c))) {
			return true;
		} else {
			return false;
		}
	}
}
