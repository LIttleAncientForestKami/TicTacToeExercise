package player;

import board.Mark;

public class Player {
    private final Mark mark;
    private final String nick;

    public Player(String name, Mark mark) {
        nick = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nick);
        sb.append(" [");
        sb.append(mark);
        sb.append("]");
        return sb.toString();
    }
}
