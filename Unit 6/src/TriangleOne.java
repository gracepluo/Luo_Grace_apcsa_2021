//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		String rev = word;
		for(int x=0; x<rev.length(); x++)
		{
			//System.out.println("word = " + word);
			System.out.println(word);
			word = word.substring(0, word.length()-1);
			}
		}
	}
