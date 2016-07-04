package com.maciejkocur.tictactoe.board.impl;

import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.Mark;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimpleMapBoard implements Board {
    Map<Field, Mark> board;

    public SimpleMapBoard(Map<Field, Mark> board) {
        this.board = board;
    }


    @Override
    public void applyMark(Field field, Mark mark) {
        if (board.containsKey(field) && board.get(field) == Mark.EMPTY) {
            board.put(field, mark);
        }
    }

    @Override
    public Mark getMarkAtField(Field field) {
        return board.get(field);
    }

    @Override
    public Set<Field> getAvailableFields() {
        Set<Field> availableMoves = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            if (board.containsKey(new Field(i)) && board.get(new Field(i)) == Mark.EMPTY) {
                availableMoves.add(new Field(i));
            }
        }
        return availableMoves;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Field field = new Field(3 * i + j + 1);
                if (board.containsKey(field) && board.get(field) != Mark.EMPTY) {
                    sb.append("\t");
                    sb.append(board.get(field).toString());
                } else {
                    sb.append("\t");
                    sb.append(String.valueOf(3 * i + j + 1));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}