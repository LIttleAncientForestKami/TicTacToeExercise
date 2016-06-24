package com.danielzaucha.game.tictactoe.game;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.input.Input;
import com.danielzaucha.game.tictactoe.player.controller.PlayerController;

/**
 * Created by daniel on 24.06.16.
 */
public class Game implements GameBase{

    Board board = new Board(3);
    Input input = new Input(3);
    PlayerController playerController = new PlayerController(board, input);

    @Override
    public void run()
    {
        while(true)
        {
            input.read();
            System.out.println(board);
        }
    }
}
