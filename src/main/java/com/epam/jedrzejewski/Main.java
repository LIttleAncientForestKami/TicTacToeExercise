package com.epam.jedrzejewski;


import com.epam.jedrzejewski.game.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
        int boardSize = 3;
        int winningStrike = 3;
        new TicTacToeGame().startGame(boardSize, winningStrike);
    }
}
