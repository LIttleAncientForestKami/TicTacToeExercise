package com.tdudzik.tictactoe;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.board.BoardSize;
import com.tdudzik.tictactoe.logic.io.InputHandler;
import com.tdudzik.tictactoe.logic.io.OutputOperations;
import com.tdudzik.tictactoe.logic.player.HumanPlayer;
import com.tdudzik.tictactoe.logic.player.Player;
import com.tdudzik.tictactoe.ui.ConsoleInputOperations;

import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class GameEngine {

    private final OutputOperations outputOperations;

    private final AtomicInteger integer = new AtomicInteger(0);

    public GameEngine(OutputOperations outputOperations) {
        this.outputOperations = outputOperations;
    }

    public void launch() {
        Board board = Board.from(BoardSize.of(3));

        Player player1 = new HumanPlayer(UUID.randomUUID().toString(), "Player 1");
        Player player2 = new HumanPlayer(UUID.randomUUID().toString(), "Player 2");

        InputHandler inputHandler = new InputHandler(new ConsoleInputOperations(new Scanner(System.in)));

        player1.playAsX(inputHandler, board);
        player2.playAsO(inputHandler, board);
        player1.playAsX(inputHandler, board);

        outputOperations.drawBoard(board);
    }

}
