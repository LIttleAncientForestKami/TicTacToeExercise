package com.tictac;

import com.tictac.field.impl.Board;
import com.tictac.field.impl.CellFactoryMap;
import com.tictac.field.impl.EventRegistrator;

/**
 * Created by Olga Ermolaeva on 04.07.16.
 */
public class TictactoeStarter {
    public static void main(String[] args) {
        Board board = new Board(3);
        EventRegistrator eventRegistrator = new EventRegistrator(3);
        CellFactoryMap cellFactoryMap = new CellFactoryMap(3);
        cellFactoryMap.setEventRegistrator(eventRegistrator);
        board.setCells(cellFactoryMap.createCells());
        board.printBoard();
    }

}
