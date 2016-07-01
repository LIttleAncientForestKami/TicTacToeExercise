package com.maciejkocur.tictactoe.board.impl;

import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.Mark;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimpleMapBoard implements Board {
    Map<Integer, Mark> board;

    public SimpleMapBoard(Map<Integer, Mark> board) {
        this.board = board;
    }


    @Override
    public void applyMark(Integer fieldNumber, Mark mark) {
        if (board.containsKey(fieldNumber) && board.get(fieldNumber) == Mark.EMPTY) {
            board.put(fieldNumber, mark);
        }
    }

    @Override
    public Mark getMarkAtField(Integer fieldNumber) {
        return board.get(fieldNumber);
    }

    @Override
    public Set<Integer> getAvailableFields() {
        Set<Integer> availableMoves = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            if (board.containsKey(i) && board.get(i) == Mark.EMPTY) {
                availableMoves.add(i);
            }
        }
        return availableMoves;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int position = 3 * i + j + 1;
                if (board.containsKey(position) && board.get(position) != Mark.EMPTY) {
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