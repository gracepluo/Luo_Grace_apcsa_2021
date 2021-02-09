//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));

		System.out.println("6 is odd :: " + NumberVerify.isOdd(6));
		System.out.println("6 is even :: " + NumberVerify.isEven(6));
		
		System.out.println("2 is odd :: " + NumberVerify.isOdd(2));
		System.out.println("2 is even :: " + NumberVerify.isEven(2));
		
		System.out.println("0 is odd :: " + NumberVerify.isOdd(05));
		System.out.println("0 is even :: " + NumberVerify.isEven(0));
		//add in more test cases
	}
}