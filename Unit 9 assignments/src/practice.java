import java.io.*;
import java.util.*;
import java.lang.*;

public class practice {

	public static void main(String[] args) {
	    int arr[] = {5, 4, 10, 11, 12, 7, 1, 3};
	    insertionSort(arr);
	  }
	
	
	public static void insertionSort(int[] arr)
	  {
	    // Iterate through elements
	      int n = arr.length; 
	    // Find current value of the array at a given index
	        for (int j = n-1; j > 1; j--) {  
	            int place = arr[j];  
	            int i = j+1;  
	    // Iterate with all elements to elements to the left: Is it greater than element to the left? Swap it. Else? Check element to the left of left
	            while ( (i < n) && ( arr [i] < place ) ) {  
	                arr [i-1] = arr [i];  
	                i--;  
	            }  
	            arr[i-1] = place;  
	  	      System.out.println(Arrays.toString(arr));            
	        }
		      System.out.println(Arrays.toString(arr));  
	 
	  }
	
	
}
//5 4 10 11 12 7 1 3 o
//4 5 10 11 12 7 1 3 y
//4 5 10 11 12 7 1 3 y
//4 5 10 11 12 7 1 3 y
//4 5 10 11 12 7 1 3 y
//4 5 7 10 11 12 1 3 
//1 4 5 7 10 11 12 3
//1 3 4 5 7 10 11 12
