package com.epam.tictactoe.managers;

import com.epam.tictactoe.player.IPlayer;
import com.epam.tictactoe.player.PlayerO;
import com.epam.tictactoe.player.PlayerX;

/**
 * @author Grzegorz Sledz
 *
 * Class responsible for storing game players
 */
public class PlayerManager implements IPlayerManager {

    private final IPlayer playerO;
    private final IPlayer playerX;

    public PlayerManager(){
        this.playerO =new PlayerO();
        this.playerX =new PlayerX();;
    }
    public PlayerManager(IPlayer playerO, IPlayer playerX){
        this.playerO =playerO;
        this.playerX = playerX;
    }

    public IPlayer playerO(){
        return this.playerO;
    }
    public IPlayer playerX(){
        return this.playerX;
    }


}
