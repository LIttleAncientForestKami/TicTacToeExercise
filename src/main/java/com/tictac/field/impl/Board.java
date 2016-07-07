package com.tictac.field.impl;


import com.tictac.Symbol;

import java.util.Map;

/**
 * Created by olgaermolaeva on 30.06.16.
 */
public class Board {

    private final int size;
    private Map<Integer, Cell> cells;

    public Board(int size) {
        this.size = size;
    }

    public void setCells(Map<Integer, Cell> cells) {
        this.cells = cells;
    }

    public Cell getCellOnPosition(int position) {
        return cells.get(position);
    }

    public void updateCell(int cellPosition, Symbol symbol) {
        getCellOnPosition(cellPosition).update(symbol);
    }

    // do not test this method. It is just for console representation
    public void printBoard() {
        for (int i = 0; i < cells.size(); i++) {
            if ((i + 1) % size == 0) {
                System.out.println("");
            }
            if (cells.get(i).getSymbol() != null) {
                System.out.print(cells.get(i).getSymbol());
            } else {
                System.out.print(cells.get(i).getPosition());
            }
        }
    }

}


