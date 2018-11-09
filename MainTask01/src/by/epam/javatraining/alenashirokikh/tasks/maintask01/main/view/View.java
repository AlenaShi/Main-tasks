package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

/**
 * The program helps use logging and print methods.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
import org.apache.log4j.Logger;

public class View {
	private View() {
	}

	private static View instance;
	private static Logger log;

	public static View getLogger(Class clazz) {
		if (instance == null) {
			instance = new View();
		}
		log = Logger.getLogger(clazz);
		return instance;
	}

	public void log(Object msg) {
		log.info(msg);
	}

	public void print(Object msg) {
		System.out.println(msg);
	}

}
