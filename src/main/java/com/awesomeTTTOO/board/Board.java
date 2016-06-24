package com.awesomeTTTOO.board;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class Board {
    private Map<Integer, String> gameBoard;
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
}
