//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	
	private double bill, amt;
	
	public Discount()
	{
		amt = 0;
		bill = 0;
	}

	public Discount(double arg)
	{
		amt = arg;
		if (amt > 2000) {
			bill = amt*0.85;
		}
		else {
			bill = amt;
		}

	}
	
	
	public void printbill()
	{
		System.out.printf( "cost is  :: " + bill );
	}
	

}	
