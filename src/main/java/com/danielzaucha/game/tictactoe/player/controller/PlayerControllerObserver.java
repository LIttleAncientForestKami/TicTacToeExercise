package com.danielzaucha.game.tictactoe.player.controller;

import com.danielzaucha.game.tictactoe.board.Board;

/**
 * Created by daniel on 24.06.16.
 */
public abstract class PlayerControllerObserver {

    protected Board board;
    public abstract void changePlayer();
    public abstract void play(int pos);
}
