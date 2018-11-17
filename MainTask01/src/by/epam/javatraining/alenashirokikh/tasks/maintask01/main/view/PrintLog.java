package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

import org.apache.log4j.Logger;

/**
 * The program helps use logging methods.
 * 
 * @author Alena Shirokikh
 * @version 1.0 30.10.2018
 */
public class PrintLog implements Printable {

	private PrintLog() {
	}
	private static PrintLog instance;
	private static Logger log;

	public static PrintLog getLogger(Class clazz) {
		if (instance == null) {
			instance = new PrintLog();
		}
		log = Logger.getLogger(clazz);
		return instance;
	}

	public void erLog(Object msg) {
		log.error(msg);
	}

	@Override
	public void print(Object msg) {
		// TODO Auto-generated method stub
		log.info(msg);
	}

}
