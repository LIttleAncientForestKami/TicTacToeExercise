package com.epam.jedrzejewski.winningChecking;

import com.epam.jedrzejewski.board.Cell;
import com.epam.jedrzejewski.board.Sign;

import java.util.EnumSet;
import java.util.Set;


class Sequences3Lenght implements Sequence {

    private EnumSet<Cell> cells;

    Sequences3Lenght(EnumSet<Cell> cells) {
        this.cells = cells.size() <= 3 ? cells : EnumSet.noneOf(Cell.class);
    }

    @Override
    public boolean containsCell(Cell cell) {
        return cells.contains(cell);
    }

    @Override
    public boolean containsOtherSign(Sign otherSign) {
        return cells.stream().filter(cell -> cell.containsSign(otherSign)).findAny().isPresent();
    }


    @Override
    public boolean hasEmptySigns() {
        return !(cells.stream().filter(cell -> (cell.containsSign(Sign.EMPTY))).findAny().isPresent());
    }


    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sequences3Lenght)) return false;
        if (other == null) return false;
        Sequences3Lenght otherSequence = (Sequences3Lenght) other;
        return cells.equals(otherSequence.cells);
    }

    @Override
    public int hashCode() {
        return cells.hashCode();
    }
}
