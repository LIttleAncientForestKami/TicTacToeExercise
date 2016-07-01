package com.epam.jedrzejewski.game;

import com.epam.jedrzejewski.board.Board;
import com.epam.jedrzejewski.board.Cell;
import com.epam.jedrzejewski.board.Sign;
import com.epam.jedrzejewski.input.UserInput;
import com.epam.jedrzejewski.winningChecking.WinController;

public class TicTacToeGame {
    private UserInput userInput;

    private Board board;

    private WinController winController;

    private int boardSize;

    private void initGameElements(int boardSize, int winningStrike) {
        this.boardSize = boardSize;
        board = new Board(boardSize);
        winController = new WinController(boardSize, winningStrike);
        userInput = new UserInput();
    }

    private TicTacToeGame putO() {
        Cell cell = userInput.whereToPlaceO(board, boardSize);
        board.placeO(cell);
        if (winController.checkIfOWins(cell)) announceEndGame(Sign.O);
        return this;
    }


    private TicTacToeGame putX() {
        Cell cell = userInput.whereToPlaceX(board, boardSize);
        board.placeX(cell);
        if (winController.checkIfXWins(cell)) announceEndGame(Sign.X);
        return this;
    }

    private void announceEndGame(Sign sign) {
        System.out.println(board);
        System.out.println(sign + " wins");
        System.exit(0);
    }


    private void draw() {
        System.out.println(board);
        System.out.println("Game end - draw");
        System.exit(0);
    }

    private void play() {
        putO().putX().putO().putX().putO().putX().putO().putX().putO().draw();
    }

    public void startGame(int boardSize, int winningStrike) {
        initGameElements(boardSize, winningStrike);
        play();
    }
}
