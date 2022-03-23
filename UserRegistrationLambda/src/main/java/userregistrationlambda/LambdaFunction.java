package userregistrationlambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Interface
 *
 */
@FunctionalInterface
interface LambdaFunctionInterface {
	boolean regexPattern(String data, String name);
}

public class LambdaFunction {

	public static String firstName, lastName, email, mobile, password;
	public static String firstNameRegex, lastNameRegex, emailRegex, mobileRegex, passwordRegex;
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Created lambda expression in which we pass the regex expression and input to
	 * validate input regex will check input and validate that
	 * 
	 */
	public static void main(String[] args) {
		LambdaFunctionInterface validation = (regex, input) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			return matcher.matches();
		};

		/**
		 * checking the firstName and validate that with regex pattern here we call
		 * regexPattern method to check regex
		 */
		firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter FirstName : ");
		firstName = sc.next();
		if (validation.regexPattern(firstNameRegex, firstName)) {
			System.out.println("Valid first Name");
		} else {
			System.out.println("Invalid first Name");
		}

		/**
		 * checking the lastName and validate that with regex pattern here we call
		 * regexPattern method to check regex
		 */
		lastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter Last Name : ");
		lastName = sc.next();
		if (validation.regexPattern(lastNameRegex, lastName)) {
			System.out.println("Valid last Name");
		} else {
			System.out.println("Invalid last Name");
		}

		/**
		 * checking the email and validate that with regex pattern here we call
		 * regexPattern method to check regex
		 */
		emailRegex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
		System.out.println("Enter Email : ");
		email = sc.next();
		if (validation.regexPattern(emailRegex, email)) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid Email");
		}

		/**
		 * checking the mobileNumber and validate that with regex pattern here we call
		 * regexPattern method to check regex
		 */
		mobileRegex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		System.out.println("Enter Mobile Number : ");
		mobile = sc.next();
		if (validation.regexPattern(mobileRegex, mobile)) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid Mobile Number");
		}

		/**
		 * checking the password and validate that with regex pattern here we call
		 * regexPattern method to check regex
		 */
		passwordRegex = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
		System.out.println("Enter Password : ");
		password = sc.next();
		if (validation.regexPattern(passwordRegex, password)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid password");
		}

	}

}
