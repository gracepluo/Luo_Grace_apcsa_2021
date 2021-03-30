/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank = {"jack", "king"};
		String[] suit = {"heart", "spade"};
		int[] value = {11, 13};
		Deck test = new Deck(rank, suit, value);
		System.out.println(test.isEmpty());
		System.out.println(test.toString());
		
	}
}
