package com.epam.jedrzejewski.winningChecking;


import com.epam.jedrzejewski.board.Cell;
import com.epam.jedrzejewski.board.Sign;

public interface Sequence {

    boolean containsCell(Cell cell);

    boolean containsOtherSign(Sign otherSign);

    boolean hasEmptySigns();
}
