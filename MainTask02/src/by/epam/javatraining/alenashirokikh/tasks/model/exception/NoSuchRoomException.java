package by.epam.javatraining.alenashirokikh.tasks.model.exception;

public class NoSuchRoomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1821738856520380496L;

	public NoSuchRoomException() {
		super();
	}

	public NoSuchRoomException(String message) {
		super(message);
	}
}
