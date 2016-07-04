package com.maciejkocur.tictactoe.arbiter;

import com.maciejkocur.tictactoe.board.impl.Field;

public interface Arbiter {

    boolean isGameOver(Field lastMove);

    void announceResult();
}
