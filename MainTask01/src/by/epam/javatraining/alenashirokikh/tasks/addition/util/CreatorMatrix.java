package by.epam.javatraining.alenashirokikh.tasks.addition.util;

import java.io.IOException;
import java.util.List;

import by.epam.javatraining.alenashirokikh.tasks.addition.model.entity.Matrix;
import by.epam.javatraining.alenashirokikh.tasks.addition.model.exception.NotValidMatrixException;

public class CreatorMatrix {
	public static Matrix createSquareMatrix(String fileName) throws IOException, NotValidMatrixException {
		List<String> list = Validator.findValideInfo(fileName);
		if (Validator.isValidSquareMatrix(list)) {
			int column = list.get(0).split(" ").length;
			double[][] array = new double[list.size()][column];
			for (int i = 0; i < list.size(); i++) {
				String[] temp = list.get(i).split(" ");
				for (int j = 0; j < column; j++) {
					array[i][j] = Double.valueOf(temp[j]);
				}
			}
			return new Matrix(array);
		}
		throw new NotValidMatrixException();
	}
}
