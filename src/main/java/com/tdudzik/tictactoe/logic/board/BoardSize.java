package com.tdudzik.tictactoe.logic.board;

public class BoardSize {

    private final int size;

    private BoardSize(int size) {
        this.size = size;
    }

    public static BoardSize of(int size) {
        return new BoardSize(size);
    }

    public int getValue() {
        return size;
    }

}
