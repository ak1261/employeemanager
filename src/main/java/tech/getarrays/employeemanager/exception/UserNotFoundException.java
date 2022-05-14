package tech.getarrays.employeemanager.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8815532376621238006L;

	public UserNotFoundException(String message) {
        super(message);
    }
}
