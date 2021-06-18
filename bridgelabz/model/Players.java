package bridgelabz.model;

public class Players {
    String playerName;
    String[] playerCards;

    public Players(String playerName, String[] playerCards) {
        this.playerName = playerName;
        this.playerCards = playerCards;
    }

    public Players() {
        super();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String[] getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(String[] playerCards) {
        this.playerCards = playerCards;
    }

    @Override
    public String toString() {
        return "Players{" +
                "playerName='" + playerName + '\'' +
                ", playerCards=" + playerCards +
                '}';
    }
}
