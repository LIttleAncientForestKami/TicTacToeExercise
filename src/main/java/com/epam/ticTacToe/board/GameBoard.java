package com.epam.ticTacToe.board;

/**
 * Created by damian on 28.06.16.
 */
public class GameBoard {

    private String mBoard;

    public GameBoard() {
        mBoard = "789\n456\n123\n";
    }

    public void placeMark(String o) {
        mBoard = mBoard.replace("5", o);
    }

    @Override
    public String toString() {
        return mBoard;
    }
}
