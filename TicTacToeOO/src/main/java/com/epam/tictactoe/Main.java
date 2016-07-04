package com.epam.tictactoe;

import com.epam.tictactoe.board.Dimension;
import com.epam.tictactoe.controller.TicTacToeGame;

/**
 * @author Grzegorz Sledz
 *
 * Main class
 */
public class Main {

    public static void main(String[] args){
        TicTacToeGame game=new TicTacToeGame(new Dimension(3));
        game.playO().playX().playO().playX().playO().playX().playO().playX().playO();
    }
}
