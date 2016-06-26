package player;

public class PlayerChanger {
    public Player changePlayer(Player current, Player p1, Player p2) {
        if (current.equals(p1)) {
            return p2;
        }
        return p1;
    }
}
