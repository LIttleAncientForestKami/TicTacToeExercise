package io;

import board.Board;

public class BoardPrinter {

    void printBoard(Board b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.makeAMove(1);
        b.makeAMove(2);
        b.makeAMove(7);
        BoardPrinter bp = new BoardPrinter();
        bp.printBoard(b);
    }
}
