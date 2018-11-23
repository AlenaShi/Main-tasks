package by.epam.javatraining.alenashirokikh.tasks.view;

/**
 * The program print information to console.
 * 
 * @author Alena Shirokikh
 * @version 1.0 22.11.2018
 */
public class PrintConsole implements Printable {

	@Override
	public void print(Object msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	@Override
	public void printError(Object msg) {
		// TODO Auto-generated method stub
		System.out.println("Exception: " + msg);
	}
}
