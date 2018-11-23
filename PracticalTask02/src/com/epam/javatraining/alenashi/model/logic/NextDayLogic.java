package com.epam.javatraining.alenashi.model.logic;

public class NextDayLogic {
	public static String findNextDayLogic(int a, int b, int c) {
		String nextDay = "There is a mistake: wrong date";

		if (!NextDay.isNotACalendarDay(a, b, c)) {
			if (b != 2 && (a != 28 || a != 29)) {
				nextDay = NextDay.findNextDay(a, b, c);

			} else {
				nextDay = NextDay.findEndOfFebruary(a, b, c);
			}
		}
		return nextDay;
	}
}
