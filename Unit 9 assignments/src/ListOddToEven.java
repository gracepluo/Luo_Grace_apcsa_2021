//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static boolean go( List<Integer> ray )
	{
		int firstOddNumber = -1;
		for(int i = 0; i < ray.size(); i++){
          if (ray.get(i) % 2 == 1 && firstOddNumber == -1 ){
            firstOddNumber = i;
          }else if(ray.get(i) % 2 == 0 && firstOddNumber != 1) {
            return ray.get(i) - firstOddNumber;
          }
        }
      	
      	return firstOddNumber;
	}
}