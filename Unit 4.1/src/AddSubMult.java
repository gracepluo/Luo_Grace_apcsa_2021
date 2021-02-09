////(c) A+ Computer Science
////www.apluscompsci.com
////Name -
//
//import static java.lang.System.*; 
//import java.util.Scanner;
//
//public class AddSubMult
//{
//	public static double check( double a, double b )
//	{
//		return 0;
//	}
//}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	private double c;
	
	public AddSubMult()
	{
		c = 0;
	
	}
	
	public double check( double a, double b )
	{
	// public calcIf(){
		
		if (a<b) {
			c= b-a;
		}else if (a==b) {
			c = a*b;
		}else {
			c= a-b;
		}
		return c;
		
	}
		public void print()
		{
			System.out.printf("the result is" + c );



		}
	}
