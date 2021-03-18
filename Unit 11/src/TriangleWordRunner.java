//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner scan = new Scanner(System.in);
		char c;
		boolean firstRun = true;
		do {
			if (!firstRun)
				System.out.println("\n");
			System.out.println("Enter a word :: ");
			TriangleWord.printTriangle(scan.next());
			
				System.out.println("\n");
			System.out.println("Do you want to enter more sample input? ");
			
			c = scan.next().charAt(0);
			firstRun = false;
		} while (c == 'Y' || c == 'y');
		scan.close();
	}
}