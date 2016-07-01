package com.epam.tictactoe;

import com.epam.tictactoe.board.Dimension;
import com.epam.tictactoe.controller.TicTacToeGame;

/**
 * Created by grzegorz_sledz on 30.06.16.
 */
public class Main {

    public static void main(String[] args){
        TicTacToeGame game=new TicTacToeGame(new Dimension(3));
        game.playO().playX().playO().playX().playO().playX().playO().playX().playO();
    }
}
