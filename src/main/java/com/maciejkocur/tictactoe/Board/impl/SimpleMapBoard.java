package com.maciejkocur.tictactoe.Board.impl;

import com.maciejkocur.tictactoe.Board.Board;
import com.maciejkocur.tictactoe.Board.Mark;

import java.util.Map;

public class SimpleMapBoard implements Board {
    Map<Integer, Mark> board;

    public SimpleMapBoard(Map<Integer, Mark> board) {
        this.board = board;
    }

    public void appliesMark(int fieldNumber, Mark mark) {
        board.put(fieldNumber, mark);
    }

    public Mark getMarkAtField(int fieldNumber) {
        return board.get(fieldNumber);
    }
}
