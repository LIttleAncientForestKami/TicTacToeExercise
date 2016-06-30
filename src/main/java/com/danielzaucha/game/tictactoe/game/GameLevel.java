package com.danielzaucha.game.tictactoe.game;

/**
 * Created by daniel on 29.06.16.
 */
public class GameLevel {
    int level;
    int maxLevel;

    public GameLevel(int maxLevel){
        this.maxLevel = maxLevel;
    }

    public void nextLevel(){
        level++;
    }

    public boolean lastLevel(){
        if(level>=maxLevel) return true;
        return false;
    }
}
