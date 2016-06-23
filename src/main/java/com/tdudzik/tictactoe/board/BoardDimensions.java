package com.tdudzik.tictactoe.board;

public class BoardDimensions {

    private final int x;
    private final int y;

    private BoardDimensions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static BoardDimensions of(int x, int y) {
        return new BoardDimensions(x, y);
    }

    public int numberOfPositions() {
        return x * y;
    }

}
