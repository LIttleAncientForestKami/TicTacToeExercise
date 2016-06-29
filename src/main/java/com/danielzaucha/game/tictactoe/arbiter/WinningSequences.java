package com.danielzaucha.game.tictactoe.arbiter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by daniel on 29.06.16.
 */
public class WinningSequences {
    Set<Set<Integer>> getWinningSequence(int pos){
        Set<Set<Integer>> winningSequence = new HashSet<>();
        switch(pos){
            case 1:
                winningSequence.add(Sequences.FROW.convertToSet());
                winningSequence.add(Sequences.FCOL.convertToSet());
                winningSequence.add(Sequences.FDI.convertToSet());
                break;
            case 2:
                winningSequence.add(Sequences.FROW.convertToSet());
                winningSequence.add(Sequences.SCOL.convertToSet());
                break;
            case 3:
                winningSequence.add(Sequences.FROW.convertToSet());
                winningSequence.add(Sequences.TCOL.convertToSet());
                winningSequence.add(Sequences.SDI.convertToSet());
                break;
            case 4:
                winningSequence.add(Sequences.SROW.convertToSet());
                winningSequence.add(Sequences.FCOL.convertToSet());
                break;
            case 5:
                winningSequence.add(Sequences.SROW.convertToSet());
                winningSequence.add(Sequences.SCOL.convertToSet());
                winningSequence.add(Sequences.FDI.convertToSet());
                winningSequence.add(Sequences.SDI.convertToSet());
                break;
            case 6:
                winningSequence.add(Sequences.SROW.convertToSet());
                winningSequence.add(Sequences.TCOL.convertToSet());
                break;
            case 7:
                winningSequence.add(Sequences.TROW.convertToSet());
                winningSequence.add(Sequences.FCOL.convertToSet());
                winningSequence.add(Sequences.SDI.convertToSet());
                break;
            case 8:
                winningSequence.add(Sequences.TROW.convertToSet());
                winningSequence.add(Sequences.SCOL.convertToSet());
                break;
            case 9:
                winningSequence.add(Sequences.TROW.convertToSet());
                winningSequence.add(Sequences.TCOL.convertToSet());
                winningSequence.add(Sequences.FDI.convertToSet());
                break;
        }
        return winningSequence;
    }
}
