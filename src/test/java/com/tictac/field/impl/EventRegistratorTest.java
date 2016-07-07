package com.tictac.field.impl;

import com.tictac.Symbol;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by olgaermolaeva on 05.07.16.
 */
public class EventRegistratorTest {

    @Test
    public void TestWinners() {
        // given
        Board board = new Board(3);
        EventRegistrator eventRegistrator = new EventRegistrator(3);
        CellFactoryMap cellFactoryMap = new CellFactoryMap(3);
        cellFactoryMap.setEventRegistrator(eventRegistrator);

        // when
        board.setCells(cellFactoryMap.createCells());
        board.updateCell(1, Symbol.O);
        board.updateCell(2, Symbol.O);
        board.updateCell(3, Symbol.O);

        // then
        assertEquals(eventRegistrator.isWinner(),true);
    }

}