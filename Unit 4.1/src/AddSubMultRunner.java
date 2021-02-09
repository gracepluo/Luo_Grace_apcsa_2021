//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMultRunner
{
	public static void main( String args[] )
	{
		double result;
		AddSubMult checkinstance = new AddSubMult();

				result = checkinstance.check( 10, 20);
				System.out.println(result);
				result = checkinstance.check( 20, 10);	
				System.out.println(result);
				result = checkinstance.check( 20, 20);
				System.out.println(result);
				result = checkinstance.check( 10, 10);	
				System.out.println(result);
				result = checkinstance.check( 0, 1);	
				System.out.println(result);
				result = checkinstance.check( 1, 0 );	
				System.out.println(result);
				result = checkinstance.check( 3.1, 5.7);	
				System.out.println(result);
				result = checkinstance.check( 5.2, 3.8 );	
				System.out.println(result);
				result = checkinstance.check( 5342, 323 );
				System.out.println(result);
		
	}
}