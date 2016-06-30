package com.epam.tictactoe.managers;

import com.epam.tictactoe.player.IPlayer;
import com.epam.tictactoe.player.PlayerO;
import com.epam.tictactoe.player.PlayerX;

/**
 * Created by grzegorz_sledz on 27.06.16.
 */
public class PlayerManager implements IPlayerManager {

    IPlayer currentPlayer;

    private final IPlayer first;
    private final IPlayer second;

    public PlayerManager(){
        this.first=new PlayerO();
        this.currentPlayer=this.first;
        this.second=new PlayerX();;
    }
    public PlayerManager(IPlayer first, IPlayer second){
        this.first=first;
        this.currentPlayer=first;
        this.second=second;
    }

    public IPlayer next() {
        if(currentPlayer.equals(first)){
            this.currentPlayer=second;
        }else{
            this.currentPlayer=first;
        }
        return this.currentPlayer;
    }

    public IPlayer current() {
        return this.currentPlayer;
    }
}
