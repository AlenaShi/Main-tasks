package by.epam.javatraining.alenashirokikh.tasks.view;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class PrintFile implements Printable {
	private static PrintLog printLog = PrintLog.getLogger(PrintFile.class);

	private void writeFile(String fileName, String msg) throws IOException {
		try (FileWriter writer = new FileWriter(fileName)) {
			writer.write(msg);
		}
	}

	@Override
	public void print(Object msg) {
		// TODO Auto-generated method stub
		String filename = "D://task.txt";
		try {
			writeFile(filename, (String) msg);
		} catch (FileNotFoundException e) {
			printLog.printError("File for recording not found.");
		} catch (IOException e) {
			printLog.printError("Problems with writing or closing file.");
		}
	}

	@Override
	public void printError(Object msg) {
		// TODO Auto-generated method stub
		String filename = "";
		try {
			writeFile(filename, "Exception: " + msg);
		} catch (FileNotFoundException e) {
			printLog.printError("File not found.");
		} catch (IOException e) {
			printLog.printError("Problems with writing or closing file.");
		}
	}

}
