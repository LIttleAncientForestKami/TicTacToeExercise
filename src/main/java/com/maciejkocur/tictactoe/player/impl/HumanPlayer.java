package com.maciejkocur.tictactoe.player.impl;

import com.maciejkocur.tictactoe.board.impl.Field;
import com.maciejkocur.tictactoe.player.Player;
import com.maciejkocur.tictactoe.ui.InputReader;

import java.io.IOException;
import java.util.Set;

public class HumanPlayer implements Player {
    InputReader inputReader;

    public HumanPlayer(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    @Override
    public Field chooseField(Set<Field> fields) throws IOException {
        while (true) {
            Integer input = inputReader.readInput();
            Field field = new Field(input);
            if (fields.contains(field)) {
                return field;
            } else {
                System.out.println("Move Not Available!");
            }
        }
    }
}
