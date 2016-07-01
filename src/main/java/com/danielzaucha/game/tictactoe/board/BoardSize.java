package com.danielzaucha.game.tictactoe.board;

/**
 * Created by daniel on 23.06.16.
 */
public class BoardSize extends Number {
    private final int size;

    public BoardSize(int size)
    {
        this.size = size;
    }

    public int intValue() {
        return size;
    }

    public long longValue() {
        return (long)size;
    }

    public float floatValue() {
        return (float)size;
    }

    public double doubleValue() {
        return (double)size;
    }
}
