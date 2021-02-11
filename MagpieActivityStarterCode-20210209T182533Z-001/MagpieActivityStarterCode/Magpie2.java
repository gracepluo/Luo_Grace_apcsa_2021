/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}


	public String getResponse(String statement)
	{
		String response = "";

		if (statement.indexOf("no") >= 0 || statement.indexOf("No") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("Lira") >= 0 || statement.indexOf("lira") >= 0) {
			response = "The mafia of the joyous grows."; //1
		} else if (statement.indexOf("Sakoi") >= 0 || statement.indexOf("sakoi") >= 0) {
			response = "Sa koi pond."; //2
		} else if (statement.indexOf("Daybreak") >= 0 || statement.indexOf("daybreak") >= 0) {
			response = "Wake up"; //3
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
	    	response = "Tell me more about your pets."; //pets
	    } else if (statement.indexOf("Mr.Mauro") >= 0) {
	    	response = "He is a good teacher."; //teacher
	    } else if (statement.trim().length() == 0) {
	    	response = "Say something, please."; //null
	    } else {
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
		final int numr = 6;
		double rand = Math.random();
		int whichResponse = (int)(rand * numr);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hope that works.";
		}
		else if (whichResponse == 2)
		{
			response = "Do they know?";
		}
		else if (whichResponse == 3)
		{
			response = "Sounds suspicous.";
		}
		else if (whichResponse == 4)
		{
			 response = "Anything works.";
		}
		else if (whichResponse == 5)
		{
			response = "This is nice.";
		}
		return response;
	}
}
