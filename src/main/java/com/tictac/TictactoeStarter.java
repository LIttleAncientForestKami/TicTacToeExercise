package com.tictac;

/**
 * Created by olgaermolaeva on 04.07.16.
 */
public class TictactoeStarter {
    public static void main(String[] args) {
        Board board = new Board(3);
        board.printBoard();
        board.createCell(1);
        board.getCellOnPosition(1).setSymbol(Symbol.O);
        board.createCell(2);
        board.getCellOnPosition(2).setSymbol(Symbol.X);
        board.createCell(3);
        board.getCellOnPosition(3).setSymbol(Symbol.O);
        board.createCell(4);
        board.getCellOnPosition(4).setSymbol(Symbol.X);
        board.printBoard();
    }

}
