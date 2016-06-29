package com.danielzaucha.game.tictactoe.player.controller;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.board.BoardObserver;
import com.danielzaucha.game.tictactoe.input.Input;
import com.danielzaucha.game.tictactoe.player.base.PlayerBase;
import com.danielzaucha.game.tictactoe.player.base.Player;
import com.danielzaucha.game.tictactoe.player.base.PlayerType;
import com.danielzaucha.game.tictactoe.player.base.Sign;

/**
 * Created by daniel on 24.06.16.
 */
public class PlayerController extends BoardObserver implements PlayerControllerBase {

    PlayerBase playerX;
    PlayerBase playerO;
    PlayerBase curPlayer;

    public PlayerController(Board board, int boardSize)
    {
        Input input = new Input(boardSize);

        playerX = new Player(PlayerType.HUMAN, Sign.X, input);
        playerO = new Player(PlayerType.HUMAN, Sign.O, input);
        curPlayer = playerX;

        this.board = board;
        this.board.attach(this);
    }

    @Override
    public PlayerControllerBase run() {
        curPlayer.play(board);
        return this;
    }

    @Override
    public void update(Sign s, int pos){
        changePlayer();
    }

    private void changePlayer() {
        if(curPlayer.equals(playerX)) curPlayer = playerO;
        else curPlayer = playerX;
    }

}
