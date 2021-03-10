import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{	
	List<Integer> vals;
	vals = new ArrayList<Integer>();
	vals.add(2);
	vals.add(4);
	vals.add(6);
	vals.add(8);
	vals.add(8);
  
	System.out.println(ListDown.go(vals));
	}
}