package player;

import org.mockito.stubbing.OngoingStubbing;

import java.util.Set;
import java.util.TreeSet;

public class PlayerMoves {
    private Set<Integer> playerMoves = new TreeSet<>();

    public Set<Integer> getPlayerMoves() {
        return playerMoves;
    }

    public void addMove(int i) {
        playerMoves.add(i);
    }
}
