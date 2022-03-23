package userregistrationlambda;


/**
 * 1. Created custom exception class which extends Exception class
 *
 */
@SuppressWarnings("serial")
public class CustomException extends Exception{
	public CustomException (String message) {
		super(message);
	}

}
