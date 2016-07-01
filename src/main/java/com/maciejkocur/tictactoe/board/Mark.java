package com.maciejkocur.tictactoe.board;


public enum Mark {
    CIRCLE, CROSS, EMPTY;

    @Override
    public String toString() {
        if (this == CIRCLE) {
            return "O";
        } else if (this == CROSS) {
            return "X";
        } else {
            return " ";
        }
    }
}
