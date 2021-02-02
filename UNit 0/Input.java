//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;

//int start
		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();

		System.out.print("Enter a second integer :: ");
		intTwo = keyboard.nextInt();

		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
//int end
		
//double start
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		
		System.out.print("Enter a second double :: ");
		doubleTwo = keyboard.nextDouble();
		
		System.out.println();
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
//double end
		
//float start
		System.out.print("Enter a Float :: ");
		floatOne = keyboard.nextFloat();
		
		System.out.print("Enter a second double :: ");
		floatTwo = keyboard.nextFloat();
		
		System.out.println();
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
//float end
		
//short start
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();
		
		System.out.print("Enter a second short :: ");
		shortTwo = keyboard.nextShort();
				
		System.out.println();
		System.out.println("Short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
//short end
	}
}