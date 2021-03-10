import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{		
		List<Integer> arra;
		arra = new ArrayList<Integer>();
		arra.add(-99);
		arra.add(1);
		arra.add(2);
		arra.add(3);
		arra.add(4);
		arra.add(5);
		arra.add(6);
		arra.add(7);
		arra.add(8);
		arra.add(9);
		arra.add(10);
		arra.add(5);
		System.out.println(ListSumFirst.go(arra));

	}
}