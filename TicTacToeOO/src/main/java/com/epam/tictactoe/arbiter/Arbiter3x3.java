package com.epam.tictactoe.arbiter;


import com.epam.tictactoe.board.IBoard;
import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.enums.GameState;
import com.epam.tictactoe.player.IPlayer;
import com.epam.tictactoe.sequences.IWiningSequenceManager;
import com.epam.tictactoe.sequences.WiningSequenceManager3x3;
import com.epam.tictactoe.sequences.WinningSequence;

import java.util.List;
import java.util.ListIterator;

/**
 * @author Grzegorz Sledz
 * Class is responsible for checking if player is winner
 */
public class Arbiter3x3 implements IArbiter {

    final IBoard board;
    final IWiningSequenceManager winingSequenceManager;

    public Arbiter3x3(IBoard board) {
        this.board = board;
        this.winingSequenceManager = new WiningSequenceManager3x3();
    }

    public GameState checkIsWinner(IPlayer player) {
        if (isWinner(player)) {
            return GameState.WINNER;
        }
        if (board.checkIsFullyFilled()) {
            return GameState.NOBODY_WIN;
        }
        return GameState.NO_WINNER;
    }

    private boolean isWinner(IPlayer player) {
        if (player.turnsAmount() <= 2) {
            return false;
        }
        List<WinningSequence> winningSequences = winingSequenceManager.getSequences(player.lastTurn());
        return checkWinningSequences(winningSequences);
    }

    private boolean checkWinningSequences(List<WinningSequence> winningSequence) {
        for (WinningSequence ws : winningSequence) {
            if (checkBoardsElements(ws.getPositions())) {
                return true;
            }
        }
        return false;
    }


    private boolean checkBoardsElements(List<IPosition> positions) {
        ListIterator listIt = positions.listIterator();
        IPosition pos1 = (IPosition) listIt.next();

        while (listIt.hasNext()) {
            IPosition nextPos = (IPosition) listIt.next();
            if (!board.elementAt(pos1).equals(board.elementAt(nextPos))) {
                return false;
            }
        }
        return true;
    }


}