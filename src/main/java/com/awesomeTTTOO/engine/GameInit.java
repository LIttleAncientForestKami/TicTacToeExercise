package com.awesomeTTTOO.engine;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class GameInit {
    private boolean gameRun;

    public GameInit(){
        gameRun=true;
    }




    public boolean gameRunning() {
        if (gameRun) return true;
        else return false;


    }
}
