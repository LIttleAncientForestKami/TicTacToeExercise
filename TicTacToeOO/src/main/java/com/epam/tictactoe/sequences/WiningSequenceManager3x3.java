package com.epam.tictactoe.sequences;

import com.epam.tictactoe.board.IPosition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Grzegorz Sledz
 *
 * Class responsible for creating winning sequence for board dimension 3x3 based on player last turn
 */
public class WiningSequenceManager3x3 implements IWiningSequenceManager {

    private void addSequence(List<WinningSequence> winningSequence,WinningCondition3x3 condition3x3){
            winningSequence.add(condition3x3.condition());
    }
    public List<WinningSequence> getSequences(IPosition lastTurn) {
        List<WinningSequence> winningSequence = new ArrayList<WinningSequence>(4);
        switch (lastTurn.value()) {
            case 1:
                addSequence(winningSequence,WinningCondition3x3.ROW1);
                addSequence(winningSequence,WinningCondition3x3.COL1);
                addSequence(winningSequence,WinningCondition3x3.DIAG1);
                break;
            case 2:
                addSequence(winningSequence,WinningCondition3x3.ROW1);
                addSequence(winningSequence,WinningCondition3x3.COL2);
                break;
            case 3:
                addSequence(winningSequence,WinningCondition3x3.ROW1);
                addSequence(winningSequence,WinningCondition3x3.COL3);
                addSequence(winningSequence,WinningCondition3x3.DIAG2);
                break;
            case 4:
                addSequence(winningSequence,WinningCondition3x3.ROW2);
                addSequence(winningSequence,WinningCondition3x3.COL1);
                break;
            case 5:
                addSequence(winningSequence,WinningCondition3x3.ROW2);
                addSequence(winningSequence,WinningCondition3x3.COL2);
                addSequence(winningSequence,WinningCondition3x3.DIAG1);
                addSequence(winningSequence,WinningCondition3x3.DIAG2);
                break;
            case 6:
                addSequence(winningSequence,WinningCondition3x3.ROW2);
                addSequence(winningSequence,WinningCondition3x3.COL3);
                break;
            case 7:
                addSequence(winningSequence,WinningCondition3x3.ROW3);
                addSequence(winningSequence,WinningCondition3x3.COL1);
                addSequence(winningSequence,WinningCondition3x3.DIAG2);
                break;
            case 8:
                addSequence(winningSequence,WinningCondition3x3.ROW3);
                addSequence(winningSequence,WinningCondition3x3.COL2);
                break;
            case 9:
                addSequence(winningSequence,WinningCondition3x3.ROW3);
                addSequence(winningSequence,WinningCondition3x3.COL3);
                addSequence(winningSequence,WinningCondition3x3.DIAG1);
                break;
        }
        return winningSequence;
    }
}

