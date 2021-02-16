//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.ArrayList;

public class Perfect
{
   private int pernum;
   private String valid;

	//add constructors
   public Perfect(int number) {
	   pernum = number;
	   valid= "";
   }
  
	//add a set method
  public void setNumber(int number){
    pernum = number;
    //System.out.println("number = " + pernum);
  }

  public void setValid(int number){
	    valid = "";
  }
  
  public void isPerfect()
  {
	  int sum = 0;
	  ArrayList<Integer> divisors = new ArrayList<Integer>();
      for(int i = pernum-1; i > 0; i--){
    	  if(pernum%i==0){
    		  divisors.add(i);
    	  }
      }
      
      
      for(Integer anInt : divisors){
        sum += anInt;
      }
      //System.out.println("sum = " + sum);
      if(sum==pernum){
    	  //System.out.println("true");
    	  valid = " is perfect"; 
      }else{
    	 // System.out.println("false");
        valid = " is not perfect";
      }
	}

	public String toString()
	{
		isPerfect();
		//System.out.println("valid = " + valid);
		return pernum + valid;

	}
	
}