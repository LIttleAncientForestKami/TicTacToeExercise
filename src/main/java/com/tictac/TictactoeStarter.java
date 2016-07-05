package com.tictac;

import com.tictac.field.Board;
import com.tictac.field.CellFactoryMap;

/**
 * Created by olgaermolaeva on 04.07.16.
 */
public class TictactoeStarter {
    public static void main(String[] args) {
        Board board = new Board(3);
        board.setCells(new CellFactoryMap().createCells(3));
        board.printBoard();
    }

}
