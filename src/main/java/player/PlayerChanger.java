package player;

public class PlayerChanger {
    // changes the player
    public Player changePlayer(Player current, Player p1, Player p2) {
        if (current.equals(p1)) {
            return p2;
        }
        return p1;
    }
}
