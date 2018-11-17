package by.epam.javatraining.alenashirokikh.tasks.maintask01.main.view;

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
		String filename = "";
		try {
			writeFile(filename, (String) msg);
		} catch (FileNotFoundException e) {
			printLog.erLog("File not found.");
		} catch (IOException e) {
			printLog.erLog("Problems with writing or closing file.");
		}
	}

}
