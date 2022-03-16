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
	

	/**
	 * Method to Enter Email
	 * e.g. abc.xyz@bl.co.in Email address has 3 parts mandatory and 2 parts optional
	 * if entered email matches the pattern then it gives true value
	 * else it gives false Invalid email address
	 */
	public void email() {
		System.out.println("Enter the Email : ");
		String Email = sc.next();
		boolean result = Pattern.matches("^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$", Email);
		//boolean result = Pattern.matches("^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$", Email);
		if(result)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid... Please Enter Valid Email Adderss");
	}
	
	/**
	 * Method to Enter Mobile Number
	 * e.g. 91 9876543210 Mobile Number have 2 parts country code and 10 digit number
	 * if entered mobile number matches the pattern then it gives true value
	 * else it gives false Invalid mobile Number
	 */
	public void moblieNumber() {
		System.out.println("Enter Mobile Number : ");
		String Mobile = sc.next();
		boolean result = Pattern.matches("^[0-9]{1,}\\s[0-9]{10}$", Mobile);
		if(result)
			System.out.println("Valid Mobile Number");
		else 
			System.out.println("Invalid.... Please Enter Valid Mobile Number");
	}
	
	/**
	 * Method to validate Password
	 * 1. password should have minimum 8 Characters
	 * 2. Password should have at least 1 Upper case Character 
	 * 3. password should have at least 1 numeric Number in password 
	 * 4. password should have exactly 1 special character
	 */
	public void password() {
		System.out.println("Enter Password : ");
		String Password = sc.next();
		boolean result = Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$", Password);
		//"^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$"
		if(result)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}	
}
