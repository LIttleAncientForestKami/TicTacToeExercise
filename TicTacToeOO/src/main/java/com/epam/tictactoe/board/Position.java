package com.epam.tictactoe.board;


/**
 * @author Grzegorz Sledz
 *
 * Class is responsible for representing position on board
 */
public class Position implements IPosition {
    private final int value;

    public Position(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Position))
            return false;
        if (obj == this)
            return true;
        Position position = (Position) obj;
        return position.value == this.value;
    }
    @Override
    public int hashCode() {
        return this.value;
    }


    @Override
    public String toString() {
        return "Position: "+value;
    }
}
