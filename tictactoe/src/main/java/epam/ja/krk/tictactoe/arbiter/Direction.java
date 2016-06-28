package epam.ja.krk.tictactoe.arbiter;

/**
 * Created by ehsan on 27.06.16.
 */
public enum Direction {

    TOP,
    BOTTOM,
    LEFT,
    RIGHT,
    TOP_LEFT,
    TOP_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_RIGHT,
    OPPOSITE;

    public Direction opposite() {
        Direction oppositeDirection = null;
        switch (this) {
            case RIGHT:
                oppositeDirection = LEFT;
                break;
            case LEFT:
                oppositeDirection = RIGHT;
                break;
            case TOP:
                oppositeDirection = BOTTOM;
                break;
            case BOTTOM:
                oppositeDirection = TOP;
                break;
            case TOP_LEFT:
                oppositeDirection = BOTTOM_RIGHT;
                break;
            case TOP_RIGHT:
                oppositeDirection = BOTTOM_LEFT;
                break;
            case BOTTOM_LEFT:
                oppositeDirection = TOP_RIGHT;
                break;
            case BOTTOM_RIGHT:
                oppositeDirection = TOP_LEFT;
                break;
        }
        return oppositeDirection;
    }
}
