package com.epam.tictactoe.board;


/**
 * Created by grzegorz_sledz on 24.06.16.
 */
public class Position implements IPosition, Comparable {
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

    public int compareTo(Object o) {
        Position position = (Position) o;
        return new Integer(this.value).compareTo(position.value);
    }

    @Override
    public String toString() {
        return "Position: "+value;
    }
}
