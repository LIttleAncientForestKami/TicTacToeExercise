package com.tdudzik.tictactoe.ui;

import com.tdudzik.tictactoe.logic.board.Position;
import com.tdudzik.tictactoe.logic.io.InputOperations;

import java.util.Scanner;

public class ConsoleInputOperations implements InputOperations {

    private final Scanner scanner;

    public ConsoleInputOperations(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position readPosition(String playerName) {
        System.out.print(playerName + ": ");
        int position = scanner.nextInt();

        return Position.of(position);
    }

}
