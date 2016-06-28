package com.awesomeTTTOO.players;

import com.awesomeTTTOO.board.BoardManager;
import com.awesomeTTTOO.engine.InputHandler;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class PlayerX implements Player {

    private String sign;
    private InputHandler inputHandler;

    public PlayerX(){
        this.sign="X";
        inputHandler=new InputHandler();

    }

    public String insertSign() {

        return sign;
    }

    public void play(BoardManager boardManager) {
        System.out.println("Choose the field to put on X. Choose from 1-9");
        int field = inputHandler.handleInput();
        if(boardManager.putInBoard(field,insertSign()).equals("again"))
        {field=inputHandler.handleInput();
            boardManager.putInBoard(field,insertSign());}
    }
}
