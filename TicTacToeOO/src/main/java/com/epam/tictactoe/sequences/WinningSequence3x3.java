package com.epam.tictactoe.sequences;

import com.epam.tictactoe.board.IPosition;

/**
 * @author Grzegorz Sledz
 *
 * Class for representing possbile winning turn sequences for board 3x3
 */
public class WinningSequence3x3 extends WinningSequence {
    public WinningSequence3x3(IPosition pos1, IPosition pos2, IPosition pos3) {
        winningSequenceList.add(pos1);
        winningSequenceList.add(pos2);
        winningSequenceList.add(pos3);
    }
}
