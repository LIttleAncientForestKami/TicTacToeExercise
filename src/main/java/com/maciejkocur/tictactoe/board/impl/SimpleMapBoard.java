package com.maciejkocur.tictactoe.board.impl;

import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.Mark;

import java.util.Map;

public class SimpleMapBoard implements Board {
    Map<Integer, Mark> board;

    public SimpleMapBoard(Map<Integer, Mark> board) {
        this.board = board;
    }

    @Override
    public void applyMark(int fieldNumber, Mark mark) {
        if (!board.containsKey(fieldNumber)) {
            board.put(fieldNumber, mark);
        }
    }

    @Override
    public Mark getMarkAtField(int fieldNumber) {
        return board.get(fieldNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.containsKey(3 * i + j + 1)) {
                    sb.append("\t");
                    sb.append(board.get(3 * i + j + 1).toString());
                } else {
                    sb.append("\t");
                    sb.append(3 * i + j + 1);
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}