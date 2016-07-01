package com.maciejkocur.tictactoe.board;

import java.util.Set;

public interface Board {
    void applyMark(int i, Mark circle);

    Mark getMarkAtField(int i);

    Set<Integer> getAvailableFields();
}
