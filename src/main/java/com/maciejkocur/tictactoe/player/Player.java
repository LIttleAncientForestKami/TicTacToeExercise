package com.maciejkocur.tictactoe.player;

import com.maciejkocur.tictactoe.board.Mark;
import com.maciejkocur.tictactoe.board.impl.Field;

import java.io.IOException;
import java.util.Set;

public interface Player {

    Field chooseField(Set<Field> fields) throws IOException;

    Mark getMark();
}
