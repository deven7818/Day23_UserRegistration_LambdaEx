package userregistrationlambda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for checking the users mood either he is happy or sad.
 * 
 */
public class MoodTest 
{
 
	MoodCheck mood = new MoodCheck();
   
	/**
	 * we check mood if the user is happy then it will return true
	 */
	@Test
    public void happyMoodThenReturnEntrySuccessful() {
        String result = mood.alalyseMood("User is Happy");
        assertEquals("Entry Successful", result);
    }
    
	/**
	 * we check mood if the user is sad 
	 */
    @Test
    public void sadMoodThenReturnEntryFaild() {
        String result = mood.alalyseMood("User is sad");
        assertEquals("Entry failed", result);
    }
}
