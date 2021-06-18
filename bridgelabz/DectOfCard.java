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

import java.util.Set;
import java.util.TreeSet;

public class DectOfCard {

    private static String[] cardsSuit = {"Club", "Diamond", "Heart", "Spade"};
    private static String[] cardsValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static Set<String > deck = new TreeSet<>();

    /**
     * Starting point os this program
     * @param args
     */
    public static void main(String[] args) {

        makeDeck();
    }

    private static void makeDeck(){
        for ( String i : cardsSuit) {
            for (String j : cardsValue) {
                deck.add(i + " of " + j);
            }
        }
    }

}
