package com.awesomeTTTOO.board;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class Board {
    private Map<Integer, String> gameBoard;
    private String visualBoard;

    public Board(){}

    public Board(int size) {
        boardInit(size);

    }

    public String showField(int i) {



        return gameBoard.get(i);
    }

    private void boardInit(int size){
        gameBoard=new HashMap<Integer, String>();
        for(int i=1;i<=size;i++){
            gameBoard.put(i,Signs.EMPTY.toString());
        }
    }

    public Map<Integer,String> currentState(){


        return this.gameBoard;
    }

    public String boardDrawn(int size){
        visualBoard="";
        for(int z=1;z<=size;z++){
        for(int i=1;i<=size;i++){
            visualBoard+="|"+showField(i)+"|";

        }
            visualBoard+="\n";}


        return visualBoard;
    }
}
