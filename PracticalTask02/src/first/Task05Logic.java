package first;

public class Task05Logic {
	public static String getNextDayLogic(int a, int b, int c) {
		String nextDay = "There is a mistake: wrong date";
		if (!Task05.isNotACalendarDay(a, b, c)) {
			if (b != 2 && (a != 28 || a != 29)) {
				nextDay = Task05.getNextDay(a, b, c);

			} else {
				nextDay = Task05.getEndOfFebruary(a, b, c);
			}
		}
		return nextDay;
	}
}
