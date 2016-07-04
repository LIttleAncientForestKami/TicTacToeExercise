package com.maciejkocur.tictactoe.player.impl;

import com.maciejkocur.tictactoe.board.Mark;
import com.maciejkocur.tictactoe.board.impl.Field;
import com.maciejkocur.tictactoe.player.Player;
import com.maciejkocur.tictactoe.ui.InputReader;
import com.maciejkocur.tictactoe.ui.impl.SimpleInputReader;

import java.io.IOException;
import java.util.Set;

public class HumanPlayer implements Player {
    private final InputReader inputReader;
    private final Mark mark;

    public HumanPlayer(InputReader inputReader, Mark mark) {
        this.inputReader = inputReader;
        this.mark = mark;
    }



    @Override
    public Field chooseField(Set<Field> fields) throws IOException {
        while (true) {
            System.out.println("Player " + mark);
            Integer input = inputReader.readInput();
            Field field = new Field(input);
            if (fields.contains(field)) {
                return field;
            } else {
                System.out.println("Move Not Available!");
            }
        }
    }

    @Override
    public Mark getMark() {
        return mark;
    }
}
