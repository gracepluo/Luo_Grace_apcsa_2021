//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "";
		lookFor = 'a';
	}

	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		while (sentence.indexOf(lookFor) == 0)
		    sentence = sentence.substring(1);
		while (sentence.indexOf(lookFor) > 0)
		{
		    sentence = sentence.substring(0, sentence.indexOf(lookFor))+
		               sentence.substring(sentence.indexOf(lookFor)+1);
//		    System.out.println(sentence);
		}
		return sentence;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;

	}
}