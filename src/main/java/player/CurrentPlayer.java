package player;

/**
 * Created by kuba on 24.06.16.
 */
public class CurrentPlayer {
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Player getCurrentPlayer() {
        System.out.println("now is " + currentPlayer + " move");
        return currentPlayer;
    }

    public CurrentPlayer(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = this.player1;
    }


    public void changeCurrentPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }
}
