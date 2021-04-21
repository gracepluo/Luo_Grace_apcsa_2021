//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	public WordSortTwo(String sentence)
	{
    	
			String[]lets = sentence.split("sentence");
    		Arrays.sort(lets);
    		for(String item:lets){
      			System.out.println(item);
    		}
  	}
}