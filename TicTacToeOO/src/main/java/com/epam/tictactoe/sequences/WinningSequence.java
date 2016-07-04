
package com.epam.tictactoe.sequences;

import com.epam.tictactoe.board.IPosition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Grzegorz Sledz
 *
 * Class for representing possbile winning turn sequences
 */
public abstract class WinningSequence {

    protected final List<IPosition> winningSequenceList;

    public WinningSequence() {
        this.winningSequenceList = new ArrayList<IPosition>();
    }

    public List<IPosition> getPositions(){
        return  this.winningSequenceList;
    }

}