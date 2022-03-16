package userregistrationlambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner sc = new Scanner(System.in);
	

	public void firstName() {
		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		boolean result = Pattern.matches("[A-Z][a-z]{2,}", firstName);
		if(result) 
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid ... Please Enter Valid First Name");
	}
}
