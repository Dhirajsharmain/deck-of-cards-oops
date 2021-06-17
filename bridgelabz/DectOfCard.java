/**
 * ****************************************************************************
 * Purpose: This Class is implemented Setup the initial game with deck of cards
 * and make sure we have unique cards, The number of cards are 52.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 16-06-2021 **********************************************************
 */
package bridgelabz;

public class DectOfCard {

    public static String[] cardsSuit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String[] cardsRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[] deck = new String[52];
    public static void main(String[] args) {

        makeDeck();
    }

    /**
     * method for Making deck of card
     */
    private static void makeDeck(){
        for (int i = 0; i < cardsRank.length; i++) {
            for (int j = 0; j < cardsSuit.length; j++) {
                deck[cardsSuit.length * i + j] = cardsRank[i] + " of " + cardsSuit[j];
            }
        }
    }
}
