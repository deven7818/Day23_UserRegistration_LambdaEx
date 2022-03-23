package userregistrationlambda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserValidationTest {

	/**
	 * PROCEDURE 1. Test case for firstName 2. Test case for lastName 3. Test case
	 * for emailName 4. Test case for mobileNumber 5. Test case for password
	 */

	/**
	 * Test case for firstName
	 */
	@Test
	public void firstNameValidation() {
		assertEquals(true, UserRegistration.firstName());
	}

	/**
	 * Test case for firstName
	 */
	@Test
	public void lastNameValidation() {
		assertEquals(true, UserRegistration.lastName());
	}

	/**
	 * Test case for Email
	 */
	@Test
	public void emailValidation() {
		assertEquals(true, UserRegistration.email());
	}

	/**
	 * Test case for Mobile Number
	 */
	@Test
	public void mobileNumberValidation() {
		assertEquals(true, UserRegistration.moblieNumber());
	}

	/**
	 * Test case for Password
	 */
	@Test
	public void passwordValidation() {
		assertEquals(true, UserRegistration.password());
	}

	/**
	 * 1. Taking valid and Invalid email samples in String array 2. Test case for
	 * valid email 3. Test case for Invalid email
	 */

	/**
	 * String array sample for valid email
	 */
	public String validEmail[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

	/**
	 * String Array sample for invalid email
	 */
	public String inValidEmail[] = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
			".abc@abc.com", "abc()@gmail.com", "abc@%.com", "abc..2002@gmail.com", "abc.@gmail.com",
			"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

	/**
	 * Test case for valid email samples
	 */
	@Test
	public void validEmailTest() {
		for (int i = 0; i < validEmail.length; i++) {
			String valid = validEmail[i];

			Boolean email = UserRegistration.multipleEmails(valid);
			assertEquals(true, email);
		}
	}

	/**
	 * Test case for invalid email samples
	 */
	@Test
	public void inValidEmailTest() {
		for (int i = 0; i < inValidEmail.length; i++) {
			String invalid = inValidEmail[i];

			Boolean email = UserRegistration.multipleEmails(invalid);
			assertEquals(false, email);
		}
	}
}
