//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String rev = word;
		String back = "";
		int pos=word.length()-1;
		while(pos>=0){
	        back = back.concat(word.substring(pos));
	        word = word.substring(0,pos);
			pos--;
		    }
		word = rev;
		return back;
	}

 	public String toString()
 	{
 		return word;
	}
 	
 	public void runTest(String s) {
 		setString(s);
		System.out.println(getFirstChar());
		System.out.println(getLastChar());
		System.out.println(getBackWards());
		System.out.println(toString());
 	}
}