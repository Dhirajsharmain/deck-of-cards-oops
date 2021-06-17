package bridgelabz;

public class DectOfCard {
    public static void main(String[] args) {
        String[] cardsSuit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] cardsRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // initialize deck
        String[] deck = new String[52];
        for (int i = 0; i < cardsRank.length; i++) {
            for (int j = 0; j < cardsSuit.length; j++) {
                deck[cardsSuit.length * i + j] = cardsRank[i] + " of " + cardsSuit[j];
            }
        }

        for (String element:deck) {
            System.out.println(element);
        }

    }
}
