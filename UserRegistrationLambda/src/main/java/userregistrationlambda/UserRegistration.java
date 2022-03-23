package userregistrationlambda;

import java.util.Scanner;
import java.util.regex.Pattern;


/**
 * * PROCEDURE
 *  1. Method for FirstName validation if exception occurs it throw custom exception
 *  2. Method for LastName validation
 *  3. Method for Email validation
 *  4. Method for Mobile Number validation
 *  5. Method for Password Validation
 *  6. Method for multiple email sample validation
 */

public class UserRegistration {

	/*
	 * Scanner class object
	 */
	Scanner sc = new Scanner(System.in);
	

	/**
	 * Method to validate firstName passed the firstName as parameter
	 * 
	 * @param firstName - firstName of user to validate
	 * @return - returns the validation of first name with matched condition
	 * @throws CustomException - if try condition not satisfy then it throw CustomException
	 */
	public static boolean firstName(String firstName) throws CustomException {
		try {
			return Pattern.matches("[A-Z][a-z]{2,}", firstName);
		} catch (Exception ex) {
			throw new CustomException("Invalid FirstName");

		}
	}

	/**
	 * Method to validate lastName passed the lastName as parameter
	 * 
	 * @param lastName - lastName of user to validate
	 * @return - returns the validation of last name with matched condition
	 * @throws CustomException - if try condition not satisfy then it throw CustomException
	 */
	public static boolean lastName(String lastName) throws CustomException {
		try {
			return Pattern.matches("[A-Z][a-z]{2,}", lastName);
		} catch (Exception ex) {
			throw new CustomException("Invalid lastName");

		}
	}

	/**
	 * Method to validate email passed the email as parameter
	 * 
	 * @param email - email of user to validate
	 * @return - returns the validation of email with matched condition
	 * @throws CustomException - if try condition not satisfy then it throw CustomException
	 */
	public static boolean email(String email) throws CustomException {
		try {
			return Pattern.matches("^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$", email);
		} catch (Exception ex) {
			throw new CustomException("Invalid email");

		}
	}

	/**
	 * Method to validate Mobile Number passed the mobileNumber as parameter
	 * 
	 * @param mobileNumber - mobileNumber of user to validate
	 * @return - returns the validation of mobileNumber with matched condition
	 * @throws CustomException - if try condition not satisfy then it throw CustomException
	 */
	public static boolean mobileNumber(String mobileNumber) throws CustomException {
		try {
			return Pattern.matches("^([0-9]{2}[\\\\s]?){1}[0-9]{9,10}$", mobileNumber);
		} catch (Exception ex) {
			throw new CustomException("Invalid Mobile Number");

		}
	}

	/**
	 * Method to validate password passed the password as parameter
	 * 
	 * @param password - password of user to validate
	 * @return - returns the validation of password with matched condition
	 * @throws CustomException - if try condition not satisfy then it throw
	 *                         CustomException
	 */
	public static boolean password(String password) throws CustomException {
		try {
			return Pattern.matches("^(?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\\\@\\\\#\\\\^][a-zA-Z0-9]*$",
					password);
		} catch (Exception ex) {
			throw new CustomException("Invalid Password");

		}
	}


}
