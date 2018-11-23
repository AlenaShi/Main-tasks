package by.epam.javatraining.alenashirokikh.tasks.view;

/**
 * The program helps use print methods.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
public class PrinterCreator {
	public static Printable create(LoggerType name) {
		Printable log;
		switch (name) {
		case CONSOLE:
			log = new PrintConsole();
			break;
		case FILE:
			log = new PrintFile();
			break;
		default:
			log = PrintLog.getLogger(PrinterCreator.class);
		}
		return log;
	}

}