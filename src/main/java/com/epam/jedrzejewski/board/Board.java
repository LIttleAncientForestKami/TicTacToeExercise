package com.epam.jedrzejewski.board;

import java.util.*;

public class Board {
    private EnumSet<Cell> boardCells;
    private int boardSize;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        boardCells = new BoardBuilder().buildBoard(boardSize);
    }

    public void placeO(Cell cell) {
        cell.setSign(Sign.O);
    }

    public void placeX(Cell cell) {
        cell.setSign(Sign.X);
    }

    @Override
    public String toString() {
        StringBuilder board = new StringBuilder();
        boardCells.stream().forEach(cell ->board.append(cell.shouldHaveNewLine(boardSize) ? cell + "\n" : cell));
        return board.toString();
    }

}
