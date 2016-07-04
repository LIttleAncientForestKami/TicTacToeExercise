package com.epam.ticTacToe.game;

import com.epam.ticTacToe.board.BoardSize;
import com.epam.ticTacToe.board.FieldStatus;
import com.epam.ticTacToe.board.GameBoard;
import com.epam.ticTacToe.input.InputReader;

/**
 * Created by damian on 04.07.16.
 */
public class TicTacToeGame {

    private GameBoard mGameBoard;
    private final BoardSize BOARD_SIZE;
    private InputReader mInputReader;

    public TicTacToeGame(BoardSize BOARD_SIZE) {
        this.BOARD_SIZE = BOARD_SIZE;
        mInputReader = new InputReader();
    }

    public TicTacToeGame start() {
        System.out.println("Tic Tac Toe game \nPlayer O starts.");
        mGameBoard = new GameBoard(BOARD_SIZE);
        return this;
    }

    public TicTacToeGame placeX() {
        int index;
        System.out.println("Player X moves: ");
        index = mInputReader.readInput();
        mGameBoard.placeMark(FieldStatus.X, index);
        return this;
    }

    public TicTacToeGame placeO() {
        int index;
        System.out.println("Player O moves: ");
        index = mInputReader.readInput();
        mGameBoard.placeMark(FieldStatus.O, index);
        return this;
    }

    public void end() {
        System.out.println("Draw!");
    }
}
