package by.epam.javatraining.alenashirokikh.tasks.util;

/**
 * The program read information from file.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import by.epam.javatraining.alenashirokikh.tasks.model.entity.ListConteiner;

public class Parser {
	public static ListConteiner<String> parse(String fileName)
			throws FileNotFoundException, IOException {
		ListConteiner<String> str = new ListConteiner<>();
		try (FileReader reader = new FileReader(fileName); BufferedReader bf = new BufferedReader(reader)) {
			String s;
			while ((s = bf.readLine()) != null) {
				str.add(s);
				;

			}
		}
		return str;
	}
}