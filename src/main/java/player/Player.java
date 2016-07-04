package player;


import java.util.Set;

public class Player {
    private Mark mark;
    private PlayerMoves playerMoves = new PlayerMoves();

    public Player(Mark mark) {
        this.mark = mark;
    }

    public Mark getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return mark.toString();
    }

    public Set<Integer> returnListOfMoves() {
        return playerMoves.getPlayerMoves();
    }

    public void addToListOfMoves(int i) {
        playerMoves.addMove(i);
    }
}
