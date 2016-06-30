package com.danielzaucha.game.tictactoe.game;

import com.danielzaucha.game.tictactoe.arbiter.Arbiter;
import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.display.Logger;
import com.danielzaucha.game.tictactoe.input.Input;
import com.danielzaucha.game.tictactoe.player.controller.PlayerController;

/**
 * Created by daniel on 24.06.16.
 */
public class Game implements GameBase{

    int boardSize=3;
    Board board = new Board(boardSize);
    PlayerController playerController = new PlayerController(board, boardSize);
    Arbiter arbiter = new Arbiter(board, boardSize);

    public Game(){
        Logger.printWelcomeMessage();
        Logger.printBoard(board);
    }
    @Override
    public void run()
    {
        playerController.run()//1
                        .run()//2
                        .run()//3
                        .run()//4
                        .run()//5
                        .run()//6
                        .run()//7
                        .run()//8
                        .run();//9
    }
}
