package com.maciejkocur.tictactoe.board;

public interface Board {
    void applyMark(int i, Mark circle);

    Mark getMarkAtField(int i);
}
