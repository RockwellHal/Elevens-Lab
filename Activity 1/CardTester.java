/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    Card one = new Card("jack", "clubs", 11);
	    Card two = new Card("joker", "spades", 1000000);
	    Card three = new Card("king", "conquering", 1000001);
	    Card four = new Card("jack", "clubs", 11);
	    
	    System.out.println(one.matches(two));
	    System.out.println(one.matches(four));
	    System.out.println(three.toString());
	}
}
