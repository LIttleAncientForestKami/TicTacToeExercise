package com.maciejkocur.tictactoe.Board.impl;

import com.maciejkocur.tictactoe.Board.Mark;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBoardBuilder {

    public Map<Integer, Mark> createMap() {
        return new HashMap<>();
    }
}
