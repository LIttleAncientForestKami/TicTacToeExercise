package com.danielzaucha.game.tictactoe.arbiter;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.board.BoardObserver;
import com.danielzaucha.game.tictactoe.display.Logger;
import com.danielzaucha.game.tictactoe.game.GameLevel;
import com.danielzaucha.game.tictactoe.game.GameResult;
import com.danielzaucha.game.tictactoe.player.base.Sign;

import java.util.Set;

/**
 * Created by daniel on 29.06.16.
 */
public class Arbiter extends BoardObserver {

    GameLevel gameLevel;
    WinningSequences winningSequences = new WinningSequences();

    public Arbiter(Board board, int size){
        this.board = board;
        this.board.attach(this);
        gameLevel = new GameLevel(size*size);
    }

    private boolean compareSequencesAndStartAfterFourMove(Sign s, int pos){
        boolean compare = compareSequences(s, pos);
        gameLevel.nextLevel();
        if(gameLevel.lastLevel() && !compare){
            Logger.announceResult(GameResult.DRAW, null);
            return false;
        }
        return compare;
    }

    boolean compareSequences(Sign s, int pos){
        for(Set<Integer> set : winningSequences.getWinningSequence(pos))
            if(board.getSignCoordinates(s).containsAll(set)) return true;
        return false;
    }

    public void update(Sign s, int pos){
        if(compareSequencesAndStartAfterFourMove(s, pos)){
            Logger.announceResult(GameResult.WIN, s);
            System.exit(0);
        }
    }
}
