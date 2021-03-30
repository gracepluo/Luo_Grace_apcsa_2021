/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		Card second = new Card("Club","Three",3);
		System.out.println(second.toString());
		Card first = new Card("Heart","Two",2);
		System.out.println(first.suit());
		System.out.println(first.rank());
		System.out.println(first.pointValue());
		System.out.println(first.matches(second));
		System.out.println(first.toString());
		Card third = new Card("Spade","Four",4);
		System.out.println(third.toString());
		Card fifth = new Card("Spade","Four",4);
		System.out.println(fifth.suit());
		System.out.println(fifth.rank());
		System.out.println(fifth.pointValue());
		System.out.println(fifth.matches(third));
		System.out.println(fifth.toString());
		
	}
}
