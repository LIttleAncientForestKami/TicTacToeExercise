package com.danielzaucha.game.tictactoe.launcher;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.game.Game;
import com.danielzaucha.game.tictactoe.player.Sign;

/**
 * Created by daniel on 23.06.16.
 */
public class TicTacToeLauncher {
    public static void main(String[] args)
    {
        Game game = new Game();

        game.run();
    }
}
