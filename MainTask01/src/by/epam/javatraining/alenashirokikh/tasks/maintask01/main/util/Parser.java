package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util;

import java.io.FileInputStream;
import java.io.IOException;

public class Parser {
	public static String parse(String fileName) throws IOException {
		try (FileInputStream fileReader = new FileInputStream(fileName)) {
			StringBuilder b = new StringBuilder("");
			int c = 0;
			
			while ((c = fileReader.read()) != -1) {
				b.append((char)c);
			}
			return b.toString();
		}
	}
}
