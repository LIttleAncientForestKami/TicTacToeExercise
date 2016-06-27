package com.awesomeTTTOO.board;

import com.awesomeTTTOO.engine.InputHandler;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class BoardManager {

    private Board board;
    private InputHandler input;
    private String visualBoard;


    /*
    This method will be used in the future if we will want to change our Board initial size
    public int boardSize() {

        return input.handleInput();
    }
    */

    public BoardManager(){
        input = new InputHandler();
        board=new Board(3);

    }

    public String showField(int i) {
        return board.presentBoard().get(i);
    }

    public void putInBoard(int i, String o) {
        board.presentBoard().put(i,o);

    }

    public String boardDrawn(int size){
        visualBoard="";
        int field =1;
        for(int z=1;z<=size;z++){
            for(int i=1;i<=size;i++){
                visualBoard+="|"+showField(field)+"|";
                field++;
            }
            visualBoard+="\n";}


        return visualBoard;
    }
}
