package com.awesomeTTTOO.referee;

import com.awesomeTTTOO.board.Board;

import java.util.*;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class Referee {
     private WinningSequences winningSequences;

    public Referee() {
        winningSequences = new WinningSequences();
    }


    public boolean checkIfSomeoneWon(Board board) {
        if(winningSequences.playerWon(board))
        return true;
        return false;
    }

    public boolean checkIfDraw(){
        return winningSequences.draw();
    }


}
