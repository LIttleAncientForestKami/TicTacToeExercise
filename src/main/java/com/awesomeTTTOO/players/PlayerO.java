package com.awesomeTTTOO.players;


import com.awesomeTTTOO.board.BoardManager;
import com.awesomeTTTOO.engine.InputHandler;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class PlayerO implements Player {

    private String sign;
    private InputHandler inputHandler;

    public PlayerO(){
        this.sign="O";
        inputHandler=new InputHandler();


    }

    public void play(BoardManager boardManager) {
        System.out.println("Choose the field to put on O. Choose from 1-9");
        int field = inputHandler.handleInput();
        if(field!=0){
        if(boardManager.putInBoard(field,sign).equals("again"))
        {field=inputHandler.handleInput();
        boardManager.putInBoard(field,sign);}}

    }



}
