package com.tdudzik.tictactoe;

import com.tdudzik.tictactoe.logic.player.PlayerFactory;
import com.tdudzik.tictactoe.ui.ConsoleInputOperations;
import com.tdudzik.tictactoe.ui.ConsoleOutputOperations;

import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {

        GameEngine gameEngine = new GameEngine(new ConsoleInputOperations(new Scanner(System.in), new PlayerFactory()), new ConsoleOutputOperations());
        gameEngine.launch();

    }

}
