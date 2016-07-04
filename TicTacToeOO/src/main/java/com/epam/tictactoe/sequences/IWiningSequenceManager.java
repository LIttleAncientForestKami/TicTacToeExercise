package com.epam.tictactoe.sequences;

import com.epam.tictactoe.board.IPosition;

import java.util.List;

/**
 * @author Grzegorz Sledz
 */
public interface IWiningSequenceManager {
    public List<WinningSequence> getSequences(IPosition lastTurn);
}
