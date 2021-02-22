//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		
		return greatestCommonFactor(greatestCommonFactor(a,b), c);
	}
	
	private int greatestCommonFactor(int num1,int num2){
		int gcd = 1;
		for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
		return gcd;
	}

	public String toString()
	{
		String output="";
		
		int x1, x2, x3; 

        for(x1 = 1; x1 < number; x1++)
        {
            for(x2 = 1; x2 < number; x2++)
            {
                for(x3 = 1; x3 < number; x3++)
                {
                    int a= x1, b=x2, c=x3;

                    if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
                    {
                       
                        	if(a < b && ((a % 2 == 0 && b % 2 != 0 && c % 2 != 0) || (a % 2 != 0 && b % 2 == 0 && c % 2 != 0)))
                        		if(greatestCommonFactor(a,b,c) <= 1){
                        			output += x1 +" "+ x2 +" "+ x3 + "\n";
                        		}
                        		
                        
                    }
                }
            }
        } 

	

		return output+"\n";
	}
}
