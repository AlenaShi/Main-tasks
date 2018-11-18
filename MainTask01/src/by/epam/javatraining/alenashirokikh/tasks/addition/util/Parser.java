package by.epam.javatraining.alenashirokikh.tasks.addition.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
	public static List<String> parse(String fileName) throws IOException {
		try (FileReader fileReader = new FileReader(fileName); BufferedReader bufReader=new BufferedReader(fileReader)) {
			//StringBuilder b = new StringBuilder("");
			List<String> b = new ArrayList<String>();
			String c;
			
			while ((c = bufReader.readLine()) != null) {
				b.add(c);
				//b.append('\n');
			}
			return b;
		}
	}
}
