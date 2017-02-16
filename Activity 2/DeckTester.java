/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = new String[] {"king", "jack", "eight", "queen", "joker", "ace"};
		String[] suits = new String[] {"spades", "clubs", "hearts", "spades", "chaos", "hearts"};
		int[] values = new int[] {12, 11, 8, 13, 0, 1};
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1);
		System.out.println(deck1.size());
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.deal().toString());
		System.out.println(deck1.size());
		for(int i = 0; i < 5; i++) {
		    System.out.println(deck1.deal().toString());
		    System.out.println(deck1.isEmpty());
		  }
	}
}
