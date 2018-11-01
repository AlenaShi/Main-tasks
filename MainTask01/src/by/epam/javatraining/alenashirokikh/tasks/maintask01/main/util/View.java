package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.util;

/**
 * The program helps use logging and print methods.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
import org.apache.log4j.Logger;

public class View {
	public static final Logger LOG = Logger.getRootLogger();

	public static void log(Object msg) {
		LOG.info(msg);
	}

	public static void print(Object msg) {
		System.out.println(msg);
	}

}
