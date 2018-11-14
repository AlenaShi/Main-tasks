package by.epam.javatraining.alenashirokikh.tasks.addition.model.exception;

public class NullMatrixException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7882905280507307208L;

	public NullMatrixException() {
		super();

	}

	public NullMatrixException(String message) {
		super(message);
	}
}
