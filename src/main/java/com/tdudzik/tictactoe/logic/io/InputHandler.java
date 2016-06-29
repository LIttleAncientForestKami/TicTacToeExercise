package com.tdudzik.tictactoe.logic.io;

import com.tdudzik.tictactoe.logic.board.Position;

public class InputHandler {

    private final InputOperations inputOperations;

    public InputHandler(InputOperations inputOperations) {
        this.inputOperations = inputOperations;
    }

    public Position readHumanPlayerPosition(String playerName) {
        return inputOperations.readPosition(playerName);
    }

}
