package userregistrationlambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {


	/*
	 * Scanner class object to get value from user
	 */
	Scanner sc = new Scanner(System.in);
	

	/**
	 * Method to Enter FirstName
	 * First Name should start with capital and has minimum 3 characters
	 * if entered firstName matches the pattern then it gives true value
	 * else it gives false Invalid first name
	 */
	public void firstName() {
		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		boolean result = Pattern.matches("[A-Z][a-z]{2,}", firstName);
		if(result) 
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid ... Please Enter Valid First Name");
	}
	
	/**
	 * Method to Enter LastName
	 * Last Name should start with capital and has minimum 3 characters
	 * if entered lastName matches the pattern then it gives true value
	 * else it gives false Invalid Last name
	 */
	public void lastName() {
		System.out.println("Enter last Name : ");
		String lastName = sc.next();
		boolean result = Pattern.matches("[A-Z][a-z]{2,}", lastName);
		if(result) 
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid ... Please Enter Valid Last Name");
	}
}
