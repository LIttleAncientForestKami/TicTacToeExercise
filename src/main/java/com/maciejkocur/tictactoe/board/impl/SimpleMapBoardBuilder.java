package com.maciejkocur.tictactoe.board.impl;

import com.maciejkocur.tictactoe.board.Mark;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBoardBuilder {

    public Map<Integer, Mark> createMap() {
        HashMap<Integer, Mark> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            map.put(i, Mark.EMPTY);
        }
        return map;
    }
}
