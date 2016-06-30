package com.maciejkocur.tictactoe.Board;

public interface Board {
    void applyMark(int i, Mark circle);

    Mark getMarkAtField(int i);
}
