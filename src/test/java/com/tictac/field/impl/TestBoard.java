package com.tictac.field.impl;

import com.tictac.Symbol;
import com.tictac.field.impl.Board;
import com.tictac.field.impl.Cell;
import com.tictac.field.impl.CellFactoryMap;
import org.testng.annotations.Test;

import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by olgaermolaeva on 30.06.16.
 */

public class TestBoard {

    Map<Integer,Cell> cells = new CellFactoryMap(3).createCells();

    @Test
    public void TestEmptyField() {
        // given
        Board board = new Board(3);
        board.setCells(cells);

        // when
        int position1 = board.getCellOnPosition(1).getPosition();
        Symbol symbol1 = board.getCellOnPosition(1).getSymbol();
        int position3 = board.getCellOnPosition(3).getPosition();
        Symbol symbol3 = board.getCellOnPosition(3).getSymbol();
        // then
        assertEquals(position1, 1);
        assertEquals(null, symbol1);
        assertEquals(position3, 3);
        assertEquals(null, symbol3);
    }

    @Test
    public void TestSequenceOfInputs() {
        // given
        Board board = new Board(3);
        board.setCells(cells);
        board.updateCell(1,Symbol.O);
        board.updateCell(8,Symbol.X);

        // when
        Symbol symbol1 = board.getCellOnPosition(1).getSymbol();
        Symbol symbol8 = board.getCellOnPosition(8).getSymbol();

        // then
        assertEquals(symbol1, Symbol.O);
        assertEquals(symbol8, Symbol.X);

    }
}
