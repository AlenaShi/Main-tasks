package by.epam.javatraining.alenashirokikh.tasks.addition.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Validator {
	public static List<String> findValideInfo(String fileName) throws IOException {
		String p = "\\s+";
		List<String> result = new ArrayList<String>();
		StringBuilder temp = new StringBuilder();
		List<String> str = Parser.parse(fileName);
		for (int i = 0; i < str.size(); i++) {
			String[] values = str.get(i).split(p);
			temp.delete(0, temp.length());
			for (int j = 0; j < values.length; j++) {
				int c = 0;
				while (c < values[j].length()) {

					if (Character.isDigit(values[j].charAt(c)) || values[j].charAt(c) == '-'
							|| values[j].charAt(c) == '.') {
						temp.append(values[j].charAt(c));
					}
					c++;
				}
				if (temp.charAt(temp.length() - 1) != ' ') {
					temp.append(" ");
				}
			}
			result.add(temp.toString());
		}
		return result;
	}

	public static boolean isValidSquareMatrix(List<String> list) {
		boolean result = false;

		if (list != null) {
			int countPrev = list.get(0).split(" ").length;
			int countCur = 0;
			for (int i = 1; i < list.size(); i++) {
				countCur = list.get(i).split(" ").length;
				if (countCur != countPrev) {
					return result;
				}
			}
			if (countCur == list.size()) {
				result = true;
			}
		}
		return result;
	}
}
