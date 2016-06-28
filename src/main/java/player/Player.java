package player;

/**
 * Created by kuba on 24.06.16.
 */
public class Player {
    private Mark mark;

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
}
