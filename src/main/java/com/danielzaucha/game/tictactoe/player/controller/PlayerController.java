package com.danielzaucha.game.tictactoe.player.controller;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.input.Input;
import com.danielzaucha.game.tictactoe.player.base.Player;
import com.danielzaucha.game.tictactoe.player.base.PlayerO;
import com.danielzaucha.game.tictactoe.player.base.PlayerX;

/**
 * Created by daniel on 24.06.16.
 */
public class PlayerController extends PlayerControllerObserver{

    Player player1 = new PlayerX();
    Player player2 = new PlayerO();
    Player curPlayer = player1;

    public PlayerController(Board board, Input input)
    {
        this.board = board;
        this.board.attach(this);
        input.attach(this);
    }

    @Override
    public void play(int pos)
    {
        curPlayer.play(board, pos);
    }

    @Override
    public void changePlayer()
    {
        if(curPlayer.equals(player1)) curPlayer = player2;
        else curPlayer = player1;
    }
}
