
/**
 * An object of type Hand represents a hand of cards.  The
 * cards belong to the class Card.  A hand is empty when it
 * is created, and any number of cards can be added to it.
 */
package bridgelabz.model;

import java.util.ArrayList;

public class Players {
    private ArrayList<Card> player;

    public Players() {
        player = new ArrayList<Card>();
    }


    public void setPlayer(ArrayList<Card> player) {
        this.player = player;
    }
}
