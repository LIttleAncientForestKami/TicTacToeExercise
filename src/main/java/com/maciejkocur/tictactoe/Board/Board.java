package com.maciejkocur.tictactoe.Board;

public interface Board {
    void appliesMark(int i, Mark circle);

    Mark getMarkAtField(int i);
}
