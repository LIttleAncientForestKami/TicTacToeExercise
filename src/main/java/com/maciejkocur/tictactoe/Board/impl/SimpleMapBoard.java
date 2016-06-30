package com.maciejkocur.tictactoe.Board.impl;

import com.maciejkocur.tictactoe.Board.Board;
import com.maciejkocur.tictactoe.Board.Mark;

import java.util.Map;

public class SimpleMapBoard implements Board {
    Map<Integer, Mark> board;

    public SimpleMapBoard(Map<Integer, Mark> board) {
        this.board = board;
    }

    public void applyMark(int fieldNumber, Mark mark) {
        if (!board.containsKey(fieldNumber)) {
            board.put(fieldNumber, mark);
        }
    }

    public Mark getMarkAtField(int fieldNumber) {
        return board.get(fieldNumber);
    }
}
