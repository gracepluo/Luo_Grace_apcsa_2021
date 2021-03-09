//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	
    private int sum;
    
	public OddToEvenRunner(){
		sum = 0;
    }

      public OddToEvenRunner(int arr[]){
          sum=0; 
      }
      


	public static void main( String args[] )
	{
      	int lastval = args.length-1;
      	System.out.println("last int = " + lastval);
		for(int i = 1; i < args.length; i++){
        
    	  if ( args[i] >= lastval){
    		  sum += args[i];
    		  System.out.println("added =" + args[i]);
    	  }
      
         }
         return sum;
	}
	
}