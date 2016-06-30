package com.tdudzik.tictactoe.ui;

import com.tdudzik.tictactoe.logic.board.Position;
import com.tdudzik.tictactoe.logic.io.InputOperations;
import com.tdudzik.tictactoe.logic.player.HumanPlayer;
import com.tdudzik.tictactoe.logic.player.Player;
import com.tdudzik.tictactoe.logic.player.PlayerFactory;

import java.util.Scanner;
import java.util.UUID;

public class ConsoleInputOperations implements InputOperations {

    private final Scanner scanner;
    private final PlayerFactory playerFactory;

    public ConsoleInputOperations(Scanner scanner, PlayerFactory playerFactory) {
        this.scanner = scanner;
        this.playerFactory = playerFactory;
    }

    @Override
    public Player readPlayer1() {
        System.out.print("Player 1: ");
        String playerName = scanner.nextLine();

        return playerFactory.createHumanPlayer(playerName);
    }

    @Override
    public Player readPlayer2() {
        System.out.print("Player 2: ");
        String playerName = scanner.nextLine();

        return playerFactory.createHumanPlayer(playerName);
    }

    @Override
    public Position readPosition(String playerName) {
        System.out.print(playerName + ": ");
        int position = scanner.nextInt();

        return Position.of(position);
    }

}
