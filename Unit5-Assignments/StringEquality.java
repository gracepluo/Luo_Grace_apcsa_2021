//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
      wordOne = "";
      wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
      // here initialize with one and two res[ectively 
      wordOne = one;
      wordTwo = two;
	}

	public void setWords(String one, String two)
	{
      wordOne = one;
      wordTwo = two;
	}

	public boolean checkEquality( )
	{
      // here with the help of if and equals method do check if wordOne and wordTwo are eqaul, if yes return true else return false
		if(wordOne.compareTo(wordTwo) == 0){
          return true;
        }else{
          return false;
        }
	}

	public String toString()
	{
      if (checkEquality() == false){
		return wordOne + " does not have the same letters as " + wordTwo ;
      } else {
	return wordOne + " does have the same letters as " + wordTwo;
      }
	}
}