package com.epam.ticTacToe.game;

import com.epam.ticTacToe.board.BoardSize;

/**
 * Created by damian on 04.07.16.
 */
public class TicTacToeGameLauncher {

    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame(new BoardSize(3));
        ticTacToeGame
                .start()
                .placeO()
                .placeX()
                .placeO()
                .placeX()
                .placeO()
                .placeX()
                .placeO()
                .placeX()
                .placeO()
                .end();
    }
}
