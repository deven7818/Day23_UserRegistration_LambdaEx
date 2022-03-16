package userregistrationlambda;


/**
 * PRODEDURE
 * User Registration 
 * User Registration System needs to ensure all validations are in place during the User Entry
 * 1. User needs to enter a valid First Name
 * 2. User needs to enter a valid Last Name
 * 3. User needs to enter a valid email address
 * 4. User needs to enter a valid mobile Number
 * 5. user needs to enter a valid password of minimum 8 characters
 */

public class UserMain {
    public static void main( String[] args ) {

    	/*
    	 * Creating object of userDetails class
    	 */
    	UserRegistration user = new UserRegistration();
    	
    	/**
    	 * calling firstName method to ensure valid first name
    	 */
    	user.firstName();
    	/**
    	 * calling LastName method to ensure valid Last name
    	 */
    	user.lastName();
    	/**
    	 * calling email method to ensure valid email
    	 */
    	user.email();
    	/**
    	 * calling moblieNumber method to ensure valid mobile Number
    	 */
    	user.moblieNumber();
    	/**
    	 * calling password method to ensure valid password of minimum 8 characters
    	 */
    	user.password();
    	/**
    	 * calling password method to ensure valid password of minimum 8 characters and have at least 1 uppercase
    	 */
    	user.password();
    }
}
