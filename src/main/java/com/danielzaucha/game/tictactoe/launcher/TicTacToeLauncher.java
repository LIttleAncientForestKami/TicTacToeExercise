package com.danielzaucha.game.tictactoe.launcher;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.player.Sign;

/**
 * Created by daniel on 23.06.16.
 */
public class TicTacToeLauncher {
    public static void main(String[] args)
    {
        Board board = new Board(3);
        board.placeCharacterOnBoard(5, Sign.O);
        System.out.println(board);
    }
}
