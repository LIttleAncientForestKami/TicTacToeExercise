package com.danielzaucha.game.tictactoe.game;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.player.Sign;

/**
 * Created by daniel on 24.06.16.
 */
public class Game {

    Board board = new Board(3);

    public void run()
    {
        board.placeCharacterOnBoard(5, Sign.O);
        System.out.println(board);
    }
}
