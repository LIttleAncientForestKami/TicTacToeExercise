package com.tdudzik.tictactoe;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.board.BoardSize;
import com.tdudzik.tictactoe.logic.board.Mark;
import com.tdudzik.tictactoe.logic.game.Game;
import com.tdudzik.tictactoe.logic.game.GameRules;
import com.tdudzik.tictactoe.logic.game.WinningSequenceLength;
import com.tdudzik.tictactoe.logic.io.InputHandler;
import com.tdudzik.tictactoe.logic.io.InputOperations;
import com.tdudzik.tictactoe.logic.io.OutputOperations;
import com.tdudzik.tictactoe.logic.player.HumanPlayer;
import com.tdudzik.tictactoe.logic.player.Player;
import com.tdudzik.tictactoe.ui.ConsoleInputOperations;

import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class GameEngine {

    private final InputOperations inputOperations;
    private final OutputOperations outputOperations;

    private final AtomicInteger integer = new AtomicInteger(0);

    public GameEngine(InputOperations inputOperations, OutputOperations outputOperations) {
        this.inputOperations = inputOperations;
        this.outputOperations = outputOperations;
    }

//    public void launch() {
//        Board board = Board.from(BoardSize.of(3));
//
//        Player player1 = new HumanPlayer(UUID.randomUUID().toString(), "Player 1");
//        Player player2 = new HumanPlayer(UUID.randomUUID().toString(), "Player 2");
//
//        InputHandler inputHandler = new InputHandler(new ConsoleInputOperations(new Scanner(System.in)));
//
//        player1.playAsX(inputHandler, board);
//        player2.playAsO(inputHandler, board);
//        player1.playAsX(inputHandler, board);
//
//        outputOperations.drawBoard(board);
//    }
    public void launch() {
        GameRules gameRules = new GameRules(BoardSize.of(3), WinningSequenceLength.of(3));
        Board board = Board.from(gameRules.getBoardSize());

        Player player1 = inputOperations.readPlayer1();
        Player player2 = inputOperations.readPlayer2();

        Game game = new Game(gameRules, board, player1, Mark.X, player2, new Game.GameResult(false, Optional.empty()));
        while (!game.isOver()) {
            game = game.playTurn(new InputHandler(inputOperations), outputOperations);
        }

        if (game.wasWon()) {
            outputOperations.gameWasWon(board, game.getWinner());
        } else {
            outputOperations.gameEndedInDraw(board);
        }
    }

}
