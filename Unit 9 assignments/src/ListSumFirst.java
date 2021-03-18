//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
//	public static int go(List<Integer> ray)
//	{
//	    private int sum;
//	    // private int[] arrp;
//	     
//	 	public RaySumLast(){
//	         sum = 0;
//	     }
//
//	       public RaySumLast(int arr[]){
//	           sum=0; 
//	     	//  arrp = arr;
//	       }
//	       


	public int go(int[] ray) {
  		int sum = 0;

        for (int i = 1; i < ray.length; i++) {
            if (ray[i] > ray[0]) {
                sum += ray[i];
            }
        }
  
  
        return sum;
    }
	
	}
