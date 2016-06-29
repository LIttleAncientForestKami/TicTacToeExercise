package com.tdudzik.tictactoe;

import com.tdudzik.tictactoe.ui.ConsoleOutputOperations;

public class TicTacToeGame {

    public static void main(String[] args) {

        GameEngine gameEngine = new GameEngine(new ConsoleOutputOperations());
        gameEngine.launch();

    }

}
