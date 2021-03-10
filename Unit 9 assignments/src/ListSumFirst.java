//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
	    private int sum;
	    // private int[] arrp;
	     
	 	public RaySumLast(){
	         sum = 0;
	     }

	       public RaySumLast(int arr[]){
	           sum=0; 
	     	//  arrp = arr;
	       }
	       


	 	public int go(int[] ray)
	 	{
	       	int lastval = ray[ray.length -1];
	       	System.out.println("last int = " + lastval);
	 		for(int i = 1; i < ray.length; i++){
	         
	     	  if ( ray[i] >= lastval){
	     		  sum += ray[i];
	     		  System.out.println("added =" + ray[i]);
	     	  }
	       
	          }
	          return sum;
	 	}
	
	}
}