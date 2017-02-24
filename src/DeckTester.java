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
		String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String[] suit = {"Diamonds","Hearts","Clubs","Spades"};
		int[] point = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		String[] blank = {};
		String[] blank2 = {};
		int[] blank3 = {};
		Deck one = new Deck(rank,suit,point);
		Deck two = new Deck(rank,suit,point);
		Deck three = new Deck(blank,blank2,blank3);
		
		System.out.println(one.isEmpty());
		System.out.println(one);
		System.out.println(one.size());
		one.deal();
		System.out.println(one.size());
		System.out.println(one);
		
		System.out.println(two.isEmpty());
		System.out.println(two);
		System.out.println(two.size());
		two.deal();
		System.out.println(two.size());
		System.out.println(two);
		
		System.out.println(three.isEmpty());
		System.out.println(three);
		System.out.println(three.size());
		three.deal();
		System.out.println(three.size());
		System.out.println(three);
	}
}
