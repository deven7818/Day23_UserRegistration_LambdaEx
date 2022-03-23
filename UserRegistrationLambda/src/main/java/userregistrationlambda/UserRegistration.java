package userregistrationlambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	/*
	 * Scanner class object
	 */
	Scanner sc = new Scanner(System.in);

	/**
	 * Method to Enter FirstName 1. First Name should start with capital and has
	 * minimum 3 characters 2. if entered firstName matches the pattern then it
	 * gives true value else it gives false Invalid first name
	 * 
	 * @return - validation of firstName
	 * 
	 */
	public static boolean firstName() {
		UserRegistration user = new UserRegistration();
		System.out.println("Enter First Name : ");
		String regex = "[A-Z][a-z]{2,}";
		String firstName = user.sc.next();
		return Pattern.matches(regex, firstName);
	}

	/**
	 * Method to Enter LastName 1. Last Name should start with capital and has
	 * minimum 3 characters 2. if entered lastName matches the pattern then it gives
	 * true value else it gives false Invalid Last name
	 * 
	 * @return - validation of lastName
	 */
	public static boolean lastName() {
		UserRegistration user = new UserRegistration();
		System.out.println("Enter last Name : ");
		String regex = "[A-Z][a-z]{2,}";
		String lastName = user.sc.next();
		return Pattern.matches(regex, lastName);
	}

	/**
	 * Method to Enter Email 1. e.g. abc.xyz@bl.co.in Email address has 3 parts
	 * mandatory and 2 parts optional 2. if entered email matches the pattern then
	 * it gives true value else it gives false Invalid email address
	 * 
	 * @return - validation of email address
	 */
	public static boolean email() {
		UserRegistration user = new UserRegistration();
		System.out.println("Enter the Email : ");
		String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
		String email = user.sc.next();
		return Pattern.matches(regex, email);
	}

	/**
	 * Method to Enter Mobile Number 1. e.g. 91 9876543210 Mobile Number have 2
	 * parts country code and 10 digit number 2. if entered mobile number matches
	 * the pattern then it gives true value else it gives false Invalid mobile
	 * Number
	 * 
	 * @return - validation of Mobile number
	 */
	public static boolean moblieNumber() {
		UserRegistration user = new UserRegistration();
		System.out.println("Enter Mobile Number : ");
		String regex = "^[0-9]{1,}\\s{1}[0-9]{10}$";
		String mobile = user.sc.next();
		return Pattern.matches(regex, mobile);

	}

	/**
	 * Method to validate Password 1. password should have minimum 8 Characters 2.
	 * Password should have at least 1 Upper case Character 3. password should have
	 * at least 1 numeric Number in password 4. password should have exactly 1
	 * special character
	 * 
	 * @return - validation of password
	 */
	public static boolean password() {
		UserRegistration user = new UserRegistration();
		System.out.println("Enter Password : ");
		String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$";
		String password = user.sc.next();
		return Pattern.matches(regex, password);

	}

	/**
	 * Parameterized Method for Multiple Email validation validation
	 * 
	 * @return - mails matches regex
	 */
	public static boolean multipleEmails(String mails) {
		return mails.matches("^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
	}

}
