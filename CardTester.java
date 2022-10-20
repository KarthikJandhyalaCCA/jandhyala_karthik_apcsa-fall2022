import java.util.ArrayList;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		ArrayList<Card> card1;
		card1 = new ArrayList<Card>();
		card1.add(new Card("7", "clubs", 7));
		
		ArrayList<Card> card2;
		card2 = new ArrayList<Card>();
		card2.add(new Card("7", "clubs", 7));
		
		ArrayList<Card> card3;
		card3 = new ArrayList<Card>();
		card3.add(new Card("ace", "diamonds", 1));
		//Card card1 = new Card("7", "clubs", 7);
		//Card card2 = new Card("7", "clubs", 7);
		//Card card3 = new Card("ace", "diamonds", 1);
		System.out.println(card1.get(0).suit());
		System.out.println(card1.get(0).rank());
		System.out.println(card1.get(0).pointValue());
		System.out.println(card1.get(0).matches(card2.get(0)));
		System.out.println(card1.get(0).matches(card3.get(0)));
		System.out.println(card1 + "\n");
		
		System.out.println(card2.get(0).suit());
		System.out.println(card2.get(0).rank());
		System.out.println(card2.get(0).pointValue());
		System.out.println(card2.get(0).matches(card1.get(0)));
		System.out.println(card2.get(0).matches(card3.get(0)));
		System.out.println(card2 + "\n");
		
		System.out.println(card3.get(0).suit());
		System.out.println(card3.get(0).rank());
		System.out.println(card3.get(0).pointValue());
		System.out.println(card3.get(0).matches(card2.get(0)));
		System.out.println(card3.get(0).matches(card1.get(0)));
		System.out.println(card3 + "\n");
	}
}
