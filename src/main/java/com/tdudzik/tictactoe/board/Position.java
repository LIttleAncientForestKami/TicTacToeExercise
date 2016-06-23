package com.tdudzik.tictactoe.board;

public class Position {

    private final int value;

    public Position(int value) {
        this.value = value;
    }

    public static Position of(int value) {
        return new Position(value);
    }

    public int getValue() {
        return value;
    }

}
