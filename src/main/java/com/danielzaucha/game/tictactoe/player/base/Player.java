package com.danielzaucha.game.tictactoe.player.base;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.display.Logger;
import com.danielzaucha.game.tictactoe.input.Input;

/**
 * Created by daniel on 24.06.16.
 */
public class Player implements PlayerBase {

    PlayerType playerType;
    Sign s;
    Input input;

    public Player(PlayerType playerType, Sign s, Input input){
        this.playerType = playerType;
        this.s = s;
        this.input = input;
    }
    @Override
    public void play(Board board) {

        int pos=0;

        while(!board.placeCharacterOnBoard(pos, s)){
            Logger.printPlayerShell(s);
            pos = input.read();
        }
    }
}
