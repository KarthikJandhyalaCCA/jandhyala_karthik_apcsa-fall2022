import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if(containsPairSum11(selectedCards) || containsJQK(selectedCards)){
            return true;
        }
        return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		List<Integer> indexedCards = cardIndexes();
        if(containsPairSum11(indexedCards) || containsJQK(indexedCards)){
            return true;
        }
        return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if(selectedCards.size() == 2){
			if ((cardAt(selectedCards.get(0)).rank() =="1") && (cardAt(selectedCards.get(1)).rank() =="10") || (cardAt(selectedCards.get(0)).rank() =="10") && (cardAt(selectedCards.get(1)).rank() =="1")){
                return true;
            }
            if ((cardAt(selectedCards.get(0)).rank() =="2") && (cardAt(selectedCards.get(1)).rank() =="9")  || (cardAt(selectedCards.get(0)).rank() =="9") && (cardAt(selectedCards.get(1)).rank() =="2")){
                return true;
            }
			if ((cardAt(selectedCards.get(0)).rank() =="3") && (cardAt(selectedCards.get(1)).rank() =="8")  || (cardAt(selectedCards.get(0)).rank() =="8") && (cardAt(selectedCards.get(1)).rank() =="3")){
                return true;
            }
			if ((cardAt(selectedCards.get(0)).rank() =="4") && (cardAt(selectedCards.get(1)).rank() =="7")  || (cardAt(selectedCards.get(0)).rank() =="7") && (cardAt(selectedCards.get(1)).rank() =="4")){
                return true;
            }
			if ((cardAt(selectedCards.get(0)).rank() =="5") && (cardAt(selectedCards.get(1)).rank() =="6")  || (cardAt(selectedCards.get(0)).rank() =="6") && (cardAt(selectedCards.get(1)).rank() =="5")){
                return true;
            }
			if ((cardAt(selectedCards.get(0)).rank() =="6") && (cardAt(selectedCards.get(1)).rank() =="5")  || (cardAt(selectedCards.get(0)).rank() =="5") && (cardAt(selectedCards.get(1)).rank() =="6")){
                return true;
            }
			if ((cardAt(selectedCards.get(0)).rank() =="7") && (cardAt(selectedCards.get(1)).rank() =="4")  || (cardAt(selectedCards.get(0)).rank() =="4") && (cardAt(selectedCards.get(1)).rank() =="7")){
                return true;
            }
			if ((cardAt(selectedCards.get(0)).rank() =="8") && (cardAt(selectedCards.get(1)).rank() =="3")  || (cardAt(selectedCards.get(0)).rank() =="3") && (cardAt(selectedCards.get(1)).rank() =="8")){
                return true;
            }
			if ((cardAt(selectedCards.get(0)).rank() =="9") && (cardAt(selectedCards.get(1)).rank() =="2")  || (cardAt(selectedCards.get(0)).rank() =="2") && (cardAt(selectedCards.get(1)).rank() =="9")){
                return true;
            }
			if ((cardAt(selectedCards.get(0)).rank() =="10") && (cardAt(selectedCards.get(1)).rank() =="1") || (cardAt(selectedCards.get(0)).rank() =="1") && (cardAt(selectedCards.get(1)).rank() =="10")){
                return true;
            }
			
        }
        return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if(selectedCards.size() == 3){
            if ((cardAt(selectedCards.get(0)).rank() =="jack") && (cardAt(selectedCards.get(1)).rank() =="queen") && (cardAt(selectedCards.get(2)).rank() =="king")){
                return true;
            }
            else if ((cardAt(selectedCards.get(0)).rank() =="jack") && (cardAt(selectedCards.get(2)).rank() =="queen") && (cardAt(selectedCards.get(1)).rank() =="king")){
                return true;
            }
            else if ((cardAt(selectedCards.get(1)).rank() =="jack") && (cardAt(selectedCards.get(0)).rank() =="queen") && (cardAt(selectedCards.get(2)).rank() =="king")){
                return true;
            }
            else if ((cardAt(selectedCards.get(1)).rank() =="jack") && (cardAt(selectedCards.get(2)).rank() =="queen") && (cardAt(selectedCards.get(0)).rank() =="king")){
                return true;
            }
            else if ((cardAt(selectedCards.get(2)).rank() =="jack") && (cardAt(selectedCards.get(1)).rank() =="queen") && (cardAt(selectedCards.get(0)).rank() =="king")){
                return true;
            }
            else if ((cardAt(selectedCards.get(2)).rank() =="jack") && (cardAt(selectedCards.get(0)).rank() =="queen") && (cardAt(selectedCards.get(1)).rank() =="king")){
                return true;
            }
        }
        return false;
	}
}
