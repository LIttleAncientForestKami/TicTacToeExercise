package com.epam.jedrzejewski.winningChecking;

import com.epam.jedrzejewski.board.Cell;
import com.epam.jedrzejewski.board.Sign;

import java.util.Set;
import java.util.stream.Collectors;


public class WinController {
    private Set<Sequence> validSequences;

    public WinController(int sequenceSize, int winningStrike) {
        validSequences = new SequencesBuilder().getSequencesForSize(sequenceSize);
    }

    public boolean checkIfOWins(Cell cell) {
        return helperWinningCheckMethod(cell, Sign.X);
    }


    public boolean checkIfXWins(Cell cell) {
        return helperWinningCheckMethod(cell, Sign.O);
    }


    private boolean helperWinningCheckMethod(Cell cell, Sign otherSign) {
        removeSequencesWichContainsOtherSign(cell, otherSign);
        return checkIfAnyValidSequenceContainsWinningStrike(cell);
    }

    private void removeSequencesWichContainsOtherSign(Cell cell, Sign otherSign) {
        Set<Sequence> sequencesToBeRemoved = getAllSequencesForCell(cell).stream().filter(sequence -> sequence.containsOtherSign(otherSign)).collect(Collectors.toSet());
        validSequences.removeAll(sequencesToBeRemoved);
    }


    private boolean checkIfAnyValidSequenceContainsWinningStrike(Cell cell) {
        Set<Sequence> sequencesToCheck = getAllSequencesForCell(cell);
        return sequencesToCheck.stream().filter(sequence -> sequence.hasEmptySigns()).findAny().isPresent();
    }

    private Set<Sequence> getAllSequencesForCell(Cell cell) {
        return validSequences.stream().filter(sequence -> sequence.containsCell(cell)).collect(Collectors.toSet());
    }
}
