package com.epam.tictactoe.player;

import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.enums.Sign;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public  abstract class Player implements IPlayer {
    private final Sign sign;
    private final List<IPosition> turns;

    protected Player(Sign sign) {
        this.sign = sign;
        this.turns=new LinkedList<IPosition>();
    }

    public void saveTurn(IPosition position) {
        this.turns.add(position);
    }
    public IPosition lastTurn() {
        if(turns.size()==0){
            return null;
        }
        return this.turns.get(turns.size()-1);
    }

    @Override
    public String toString() {
        return "Player "+sign;
    }

    public Sign sign() {
        return this.sign;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }else{
            Player player=(Player)obj;
            return player.sign.equals(sign);
        }
    }
}
