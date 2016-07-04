package com.maciejkocur.tictactoe.board.impl;

import com.maciejkocur.tictactoe.board.Mark;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBoardBuilder {

    public Map<Field, Mark> createMap() {
        HashMap<Field, Mark> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            map.put(new Field(i), Mark.EMPTY);
        }
        return map;
    }
}
