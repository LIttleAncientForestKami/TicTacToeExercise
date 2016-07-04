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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoardSize boardSize = (BoardSize) o;

        return size == boardSize.size;

    }

    @Override
    public int hashCode() {
        return size;
    }
}
