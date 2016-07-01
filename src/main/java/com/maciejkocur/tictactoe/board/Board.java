package com.maciejkocur.tictactoe.board;

import java.util.Set;

public interface Board {
    void applyMark(Integer i, Mark circle);

    Mark getMarkAtField(Integer i);

    Set<Integer> getAvailableFields();

}
