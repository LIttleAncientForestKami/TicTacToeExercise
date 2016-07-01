package com.epam.jedrzejewski.board;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

class BoardBuilder {
    private Map<Integer, EnumSet<Cell>> boards = new HashMap<>();

    BoardBuilder() {
        createBoards();
    }

    EnumSet<Cell> buildBoard(int boardSize) {
        return boards.getOrDefault(boardSize, EnumSet.noneOf(Cell.class));
    }


    private void createBoards() {
        boards.put(3, EnumSet.range(Cell.one, Cell.nine));
    }
}