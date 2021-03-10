import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{			
		List<Integer> vals;
		vals = new ArrayList<Integer>();
		vals.add(31);
		vals.add(12);
		vals.add(6);
		vals.add(2);
		vals.add(1);
      
		System.out.println(ListDown.go(vals));
	}
}