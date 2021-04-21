//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
 public static int countOddDigits(int num)
 {
   int a;
   if(num>0)
   {
     if(num%2==0) a=0;
     else a=1;
     a+=countOddDigits(num/10);
   }
   else a=0;
     return a;
 }
}