package com.maciejkocur.tictactoe.board.impl;

import com.maciejkocur.tictactoe.board.Mark;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBoardBuilder {

    public Map<Integer, Mark> createMap() {
        return new HashMap<>();
    }
}
