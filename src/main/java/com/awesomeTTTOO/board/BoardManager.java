package com.awesomeTTTOO.board;

import com.awesomeTTTOO.engine.InputHandler;
import com.awesomeTTTOO.referee.Referee;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class BoardManager {

    private Board board;
    private String visualBoard;
    private int size = 3;
    private Referee referee;


    /*
    This method will be used in the future if we will want to change our Board initial size
    public int boardSize() {

        return input.handleInput();
    }
    */

    public BoardManager() {
        board = new Board(size);
        referee = new Referee();

    }

    private String showField(int i) {
        return board.presentBoard().get(i);
    }

    public String putInBoard(int i, String o) {
        if (isTaken(i)) {
            board.presentBoard().put(i, o);
            notifyReferee(o);
            if (referee.checkIfDraw()){
                System.out.println("It's a draw");
                System.exit(0);}
        } else {
            System.out.println("Sorry this field is taken, try again");
            return "again";
        }
        return "";
    }

    private void notifyReferee(String s) {
        if (referee.checkIfSomeoneWon(board)) {
            System.out.println("The player " + s + " has won");
            System.exit(0);
        }
        ;
    }

    public String boardDrawn() {
        visualBoard = "";
        int field = 1;
        for (int z = 1; z <= size; z++) {
            for (int i = 1; i <= size; i++) {
                visualBoard += "|" + showField(field) + "|";
                field++;
            }
            visualBoard += "\n";
        }


        return visualBoard;
    }

    public boolean isTaken(int i) {
        return (showField(i).equals(" "));
    }
}
