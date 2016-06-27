package com.awesomeTTTOO.board;

import com.awesomeTTTOO.engine.InputHandler;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class BoardManager {

    private Board board;
     private String visualBoard;
    private int size = 3;


    /*
    This method will be used in the future if we will want to change our Board initial size
    public int boardSize() {

        return input.handleInput();
    }
    */

    public BoardManager(){
        board=new Board(size);

    }

    public String showField(int i) {
        return board.presentBoard().get(i);
    }

    public void putInBoard(int i, String o) {
        if(!isTaken(i))
        board.presentBoard().put(i,o);
        else
            System.out.println("Sorry this field is taken, you've lost your turn");

    }

    public String boardDrawn(){
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

    public boolean isTaken(int i) {
        return showField(i)==" "? true:false;
    }
}
