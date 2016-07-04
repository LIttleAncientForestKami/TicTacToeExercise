package com.tdudzik.tictactoe.logic.game;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.board.BoardSize;

public class GameRules {

    private final BoardSize boardSize;
    private final WinningSequenceLength winningSequenceLength;

    public GameRules(BoardSize boardSize, WinningSequenceLength winningSequenceLength) {
        this.boardSize = boardSize;
        this.winningSequenceLength = winningSequenceLength;
    }

    public BoardSize getBoardSize() {
        return boardSize;
    }

    public WinningSequenceLength getWinningSequenceLength() {
        return winningSequenceLength;
    }

    public boolean gameWasWon(Board board) {
        return board.thereAreTheSameMarksSideBySideHorizontally(winningSequenceLength.getValue()) ||
                board.thereAreTheSameMarksSideBySideVertically(winningSequenceLength.getValue()) ||
                board.thereAreTheSameMarksSideBySideDiagonally(winningSequenceLength.getValue());
    }

    public boolean gameEndedInDraw(Board board) {
        return board.everyPositionIsOccupied();
    }

}
