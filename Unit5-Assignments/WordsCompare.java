//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
		wordOne = "";
		wordTwo = "";
		compare = 0;
	}

	public WordsCompare(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		compare = 0;
	}

	public void setWordOne(String one)
	{
		wordOne = one;
	}

	public void setWordTwo(String two)
	{
		wordTwo = two;
	}
	
	public int compareTo(WordsCompare word)
	{
		return 0;
	}
	
	public void compare()
	{
		if(wordOne.compareTo(wordTwo) < 0)
		{
			compare = -1;
		}
		else
		{
			compare = 1;
		}
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}