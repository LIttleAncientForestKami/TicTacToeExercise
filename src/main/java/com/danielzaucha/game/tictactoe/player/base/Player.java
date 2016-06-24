package com.danielzaucha.game.tictactoe.player.base;

import com.danielzaucha.game.tictactoe.board.Board;

/**
 * Created by daniel on 24.06.16.
 */
public interface Player {

    void play(Board board, int pos);
}
