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
		
		String[] ranks = {"jack","queen","king"};
		String[] suits = {"hearts","spades","clubs","diamonds"};
		int[] values = {11, 12, 13};
		
		Deck test = new Deck(ranks, suits, values);
		
		System.out.println(test);
		
		
/*		String[] ranks1 = {"queen","king"};
		String[] suits1 = {"diamonds"};
		int[] values1 = {11, 12, 13};
		
		Deck test1 = new Deck(ranks1, suits1, values1);
		
		System.out.println(test1);
		
		
		String[] ranks2 = {"ace"};
		String[] suits2 = {"diamonds"};
		int[] values2 = {11};
		
		Deck test2 = new Deck(ranks2, suits2, values2);
		
		System.out.println(test2);*/
	}
}


