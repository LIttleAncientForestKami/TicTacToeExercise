package com.maciejkocur.tictactoe.board;

import com.maciejkocur.tictactoe.board.impl.Field;

import java.util.Set;

public interface Board {
    void applyMark(Field field, Mark mark);

    Mark getMarkAtField(Field field);

    Set<Field> getAvailableFields();

}
