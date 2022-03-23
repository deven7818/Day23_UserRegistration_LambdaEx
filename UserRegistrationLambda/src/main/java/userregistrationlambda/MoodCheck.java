package userregistrationlambda;


/**
 * 
 * 1. This is for checking the mood if happy or sad test case
 * 2. If mood is happy then it will return Entry Successful
 * 3. If Mood is sad then it will return Entry failed 
 *
 */
public class MoodCheck {

	
	public String alalyseMood(String mood) {
		if(mood.toLowerCase().contains("happy")) {
			return "Entry Successful";
		}
		else if(mood.toLowerCase().contains("sad")) {
			return "Entry Failed";
		}else
			return null;
	}
}
