package com.tictac;

import com.tictac.field.Board;
import com.tictac.field.Cell;
import com.tictac.field.CellFactoryList;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by olgaermolaeva on 30.06.16.
 */

public class TestBoard {

    List<List<Cell>> cells = new ArrayList<List<Cell>>();


    @Test
    public void ifCellHasDiagonal() {
        // given
        Board board = new Board(3);
        CellFactoryList mockFactory = mock(CellFactoryList.class);
        when(mockFactory.createCells(3)).thenReturn(getMockFactoryEmptyField(3));
        board.setCells(mockFactory.createCells(3));

        Cell cellTotest = board.getCellOnPosition(3);
        // when
        Boolean isDiagonal = cellTotest.hasDiagonal();
        Boolean isCentral = cellTotest.isCentral();
        // then
        assertTrue(isDiagonal);
        assertTrue(isCentral);

    }
    @Test
    public void TestEmptyField() {
        // given
        Board board = new Board(5);

        CellFactoryList mockFactory = mock(CellFactoryList.class);
        when(mockFactory.createCells(3)).thenReturn(getMockFactoryEmptyField(3));
        board.setCells(mockFactory.createCells(3));

        // when
        int position1 = board.getCellOnPosition(1).position;
        Symbol symbol1 = board.getCellOnPosition(1).getSymbol();
        int position3 = board.getCellOnPosition(3).position;
        Symbol symbol3 = board.getCellOnPosition(3).getSymbol();
        // then
        assertEquals(position1,1);
        assertEquals( null,symbol1);
        assertEquals(position3, 3);
        assertEquals(null,symbol3);
    }

    @Test
    public void TestSequenceOfInputs() {
        // given
        Board board = new Board(5);
        CellFactoryList mockFactory = mock(CellFactoryList.class);
        when(mockFactory.createCells(3)).thenReturn(getMockFactory_O_X_O_X_Field(3));
        board.setCells(mockFactory.createCells(3));

        // when
        Symbol symbol1 = board.getCellOnPosition(1).getSymbol();
        Symbol symbol3 = board.getCellOnPosition(3).getSymbol();
        // then
        assertEquals(symbol1, Symbol.O);
        assertEquals(symbol3, Symbol.X);

    }

    private List<List<Cell>> getMockFactoryEmptyField(int size){
        for (int i = 0; i < size; i++) {
            ArrayList<Cell> internalArray = new ArrayList<Cell>();
            for (int j = 0; j < size; j++) {
                Cell cell = new Cell(i*size + j +1);
                internalArray.add(cell);
            }
            cells.add(internalArray);
        }
        return cells;
    }
    private List<List<Cell>> getMockFactory_O_X_O_X_Field(int size){
        for (int i = 0; i < size; i++) {
            ArrayList<Cell> internalArray = new ArrayList<Cell>();
            for (int j = 0; j < size; j++) {
                Cell cell = new Cell(i*size + j +1);
                internalArray.add(cell);
            }
            cells.add(internalArray);
        }
        // position 1
        cells.get(0).get(0).setSymbol(Symbol.O);
        // position == size
        cells.get(0).get(size-1).setSymbol(Symbol.X);
        return cells;
    }
}




















