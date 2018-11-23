package by.epam.javatraining.alenashirokikh.tasks.view;

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
