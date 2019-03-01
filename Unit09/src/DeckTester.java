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
		
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		String[] suits = {"Hearts","Spades","Clubs","Diamonds"};
		int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,1};
		
		Deck test = new Deck(ranks, suits, values);
		
//		for (int i = 0; i < 52; i++)
//			System.out.println(test.deal());
		
		System.out.println(test);
		
/*		System.out.println(test);
		
		String[] ranks1 = {"jack","queen","king"};
		String[] suits1 = {"diamonds"};
		int[] values1 = {11, 12, 13};
		
		Deck test1 = new Deck(ranks1, suits1, values1);
		
		System.out.println(test1.isEmpty());
		System.out.println(test1);
		
		
		String[] ranks2 = {"ace"};
		String[] suits2 = {"diamonds"};
		int[] values2 = {1};
		
		Deck test2 = new Deck(ranks2, suits2, values2);
		
		System.out.println(test2.deal());
		System.out.println(test2);*/
	}
}


