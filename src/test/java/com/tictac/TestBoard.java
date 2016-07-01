package com.tictac;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by olgaermolaeva on 30.06.16.
 */

public class TestBoard {
    @Test
    public void applyForOInCentre() {
        // given
        Board board = new Board(5);
        // when
        Symbol toTest = board.getCentralPositionSymbol();
        // then
        assertTrue(toTest.equals(Symbol.O));
    }

    @Test
    public void applyForCellsAnywhere() {
        // given
        Board board = new Board(5);
        board.createCell(5);
        // when
        Cell toTest1 = board.getCellOnPosition(5);
        Cell toTest2 = board.getCellOnPosition(3);
        // then
        assertTrue(toTest1.position == 5);
        assertEquals(toTest2.position, null);

    }

    @Test
    public void ifCellHasDiagonal() {
        // given
        Board board = new Board(5);
        Cell cellTotest = board.getCellOnPosition(5);
        // when
        Boolean isDiagonal = cellTotest.hasDiagonal();
        Boolean isCentral = cellTotest.isCentral();
        // then
        assertTrue(isDiagonal);
        assertTrue(isCentral);

    }

    @Test
    public void TestSequenceOfInputs() {
        // given
        Board board = new Board(5);
        board.createCell(1);
        board.getCellOnPosition(1).setSymbol(Symbol.O);
        board.createCell(2);
        board.getCellOnPosition(2).setSymbol(Symbol.X);
        board.createCell(3);
        board.getCellOnPosition(3).setSymbol(Symbol.O);
        board.createCell(4);
        board.getCellOnPosition(4).setSymbol(Symbol.X);
        // when
        Symbol symbol1 = board.getCellOnPosition(1).getSymbol();
        Symbol symbol2 = board.getCellOnPosition(2).getSymbol();
        Symbol symbol3 = board.getCellOnPosition(3).getSymbol();
        Symbol symbol4 = board.getCellOnPosition(4).getSymbol();

        // then
        assertEquals(symbol1,Symbol.O);
        assertEquals(symbol2,Symbol.X);
        assertEquals(symbol3,Symbol.O);
        assertEquals(symbol4,Symbol.X);
    }

}




















