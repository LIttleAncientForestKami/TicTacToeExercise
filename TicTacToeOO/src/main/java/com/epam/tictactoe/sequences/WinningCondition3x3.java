package com.epam.tictactoe.sequences;

import com.epam.tictactoe.board.Position;

/**
 * @author Grzegorz Sledz
 *
 * Enum stores possible winning condition for board size 3x3
 */
public enum WinningCondition3x3 {

    ROW1(new WinningSequence3x3(new Position(1), new Position(2), new Position(3))),
    ROW2(new WinningSequence3x3(new Position(4), new Position(5), new Position(6))),
    ROW3(new WinningSequence3x3(new Position(7), new Position(8), new Position(9))),
    COL1(new WinningSequence3x3(new Position(1), new Position(4), new Position(7))),
    COL2(new WinningSequence3x3(new Position(2), new Position(5), new Position(8))),
    COL3(new WinningSequence3x3(new Position(3), new Position(6), new Position(9))),
    DIAG1(new WinningSequence3x3(new Position(1), new Position(5), new Position(9))),
    DIAG2(new WinningSequence3x3(new Position(3), new Position(5), new Position(7)));

    private final WinningSequence value;

    WinningCondition3x3(WinningSequence value) {
        this.value = value;
    }

    public WinningSequence condition() {
        return value;
    }
}
