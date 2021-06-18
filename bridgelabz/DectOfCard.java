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

import bridgelabz.model.Players;

import java.util.*;

public class DectOfCard {

    private static String[] suit = {"Club", "Diamond", "Heart", "Spade"};
    private static String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static Set<String> deck = new TreeSet<>();
    private static List<Players> playersList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Starting point os this program
     *
     * @param args
     */
    public static void main(String[] args) {

        makeDeck();
        addPlayer();
        System.out.println(playersList);
    }

    private static void makeDeck() {
        for (String i : suit) {
            for (String j : value) {
                deck.add(i + " of " + j);
            }
        }
    }

    private static void addPlayer() {
        Players players = new Players();
        System.out.print("Enter number of player : ");
        int numOfPlayer = scanner.nextInt();
        if (numOfPlayer <= 4 && numOfPlayer >= 2) {
            for (int i = 1; i <= numOfPlayer; i++) {
                System.out.print("Enter name of " + i + "st player : ");
                String playerName = scanner.next();
                players.setPlayerName(playerName);
                playersList.add(players);
            }
        } else {
            System.out.println("Please select players between 2 to 4");
        }
        scanner.close();
    }

}
