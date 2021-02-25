//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
    private int first;

    
	public RayOddToEven(){
        first = 0;
    }

      public RayOddToEven(int arr[]){
          first=0; 
      }
      


	public int go(int[] ray)
	{
      	int firstOddNumber = -1;
		for(int i = 0; i < ray.length; i++){
          if (ray[i] % 2 == 1 && firstOddNumber == -1 ){
            firstOddNumber = i;
          }else if(ray[i] % 2 == 0 && firstOddNumber != 1) {
            return i - firstOddNumber;
          }
        }
      	
      	return -1;
	}
}