package com.awesomeTTTOO.engine;

import com.awesomeTTTOO.board.BoardManager;
import com.awesomeTTTOO.players.Player;
import com.awesomeTTTOO.players.PlayerO;
import com.awesomeTTTOO.players.PlayerX;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class GameRunner {
    private boolean gameRun;
    private int turns;
    private Player[]players;
    private BoardManager boardManager;

    public GameRunner(){
        gameRun=true;
        turns=0;
        players= new Player[]{new PlayerO(), new PlayerX()};
        boardManager=new BoardManager();

    }


    public void gameRun(){
        test:
        while(true){

            for(Player p :players){

                p.play(boardManager);

                System.out.println(boardManager.boardDrawn());
                turns++;
                if(turns>8)break test;
            }


        }
    }




}
