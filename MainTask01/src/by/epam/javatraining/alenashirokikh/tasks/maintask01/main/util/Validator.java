package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Validator {
	public static List<String> findValideInfo(String fileName) throws IOException {
		String p = "\\s+";
		List<String> result = new ArrayList<String>();
		StringBuilder temp = new StringBuilder();
		String[] str = Parser.parse(fileName).split(p);
		for (int i = 0; i < str.length; i++) {
			temp.delete(0, temp.length());
			for (int j = 0; j < str[i].length(); j++) {
				if (Character.isDigit(str[i].charAt(j)) || str[i].charAt(j) == '-' || str[i].charAt(j) == '.') {
					temp.append(str[i].charAt(j));
				}
			}
			result.add(temp.toString());

		}
		return result;
	}
}
