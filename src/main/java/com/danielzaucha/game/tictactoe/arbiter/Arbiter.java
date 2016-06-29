package com.danielzaucha.game.tictactoe.arbiter;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.board.BoardObserver;
import com.danielzaucha.game.tictactoe.player.base.Sign;

import java.util.Set;

/**
 * Created by daniel on 29.06.16.
 */
public class Arbiter extends BoardObserver {

    WinningSequences winningSequences = new WinningSequences();
    int step;

    public Arbiter(Board board){
        this.board = board;
        this.board.attach(this);
    }

    private boolean compareSequencesAndStartAfterFourMove(Sign s, int pos){
        step++;
        if(step>=5){
            return compareSequences(s, pos);
        }
        return false;
    }

    private boolean compareSequences(Sign s, int pos){
        for(Set<Integer> set : winningSequences.getWinningSequence(pos))
            if(board.getSignCoordinates(s).containsAll(set)) return true;
        return false;
    }

    public void update(Sign s, int pos){
        if(compareSequencesAndStartAfterFourMove(s, pos)) System.out.println("The winner is: " + s);
    }
}
