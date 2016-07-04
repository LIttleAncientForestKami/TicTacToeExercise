package player;

import java.util.Set;
import java.util.TreeSet;

public class PlayerMoves {
    private Set<Integer> playerMoves = new TreeSet<>();

    public Set<Integer> getPlayerMoves() {
        return playerMoves;
    }

    void addMove(int i) {
        playerMoves.add(i);
    }
}
