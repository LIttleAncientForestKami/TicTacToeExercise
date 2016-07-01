package com.epam.tictactoe.managers;

import com.epam.tictactoe.player.IPlayer;
import com.epam.tictactoe.player.PlayerO;
import com.epam.tictactoe.player.PlayerX;

/**
 * Created by grzegorz_sledz on 27.06.16.
 */
public class PlayerManager implements IPlayerManager {

    IPlayer currentPlayer;

    private final IPlayer playerO;
    private final IPlayer playerX;

    public PlayerManager(){
        this.playerO =new PlayerO();
        this.currentPlayer=this.playerO;
        this.playerX =new PlayerX();;
    }
    public PlayerManager(IPlayer playerO, IPlayer playerX){
        this.playerO =playerO;
        this.currentPlayer=playerO;
        this.playerX = playerX;
    }

    public IPlayer playerO(){
        return this.playerO;
    }
    public IPlayer playerX(){
        return this.playerX;
    }


}
