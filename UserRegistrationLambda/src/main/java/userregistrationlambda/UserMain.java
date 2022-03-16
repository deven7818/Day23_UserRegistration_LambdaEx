package userregistrationlambda;


/**
 * PRODEDURE
 * User Registration 
 * User Registration System needs to ensure all validations are in place during the User Entry
 * 1. User needs to enter a valid First Name
 * 
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
    }
}
