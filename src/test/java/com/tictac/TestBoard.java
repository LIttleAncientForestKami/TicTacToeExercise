package com.tictac;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by olgaermolaeva on 30.06.16.
 */

@Test
public class TestBoard {

    public void applyForOInCentre() {
        // given
        Board board = new Board();
        // when
        Symbol toTest = board.getCentralPositionSymbol();
        // then
        assertTrue(toTest.equals(Symbol.O));
    }

    public void applyForEmptyCellAnywhere() {
        // given
        Board board = new Board();
        // when
        Cell toTest1 = board.getCellOnPosition(1);
        Cell toTest2 = board.getCellOnPosition(3);
        // then
        assertTrue(toTest1 == null);
        assertTrue(toTest2 == null);

    }

    public void ifCellHasDiagonal() {
        // given
        Board board = new Board();
        Cell cellTotest = board.getCellOnPosition(5);
        // when
        Boolean isDiagonal = cellTotest.hasDiagonal();
        Boolean isCentral = cellTotest.isCentral();
        // then
        assertTrue(isDiagonal);
        assertTrue(isCentral);

    }


}
