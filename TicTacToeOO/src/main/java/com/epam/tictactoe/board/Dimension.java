package com.epam.tictactoe.board;

public class Dimension implements IDimension {

    private final int value;

    public Dimension(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dimension))
            return false;
        if (obj == this)
            return true;
        Dimension dimension = (Dimension) obj;
        return dimension.value == this.value;
    }

    @Override
    public int hashCode() {
        return this.value;
    }
}
