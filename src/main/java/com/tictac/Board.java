package com.tictac;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by olgaermolaeva on 30.06.16.
 */
public class Board {

    private final int size;

    List<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>();

    public Board(int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            ArrayList<Cell> internalArray = new ArrayList<Cell>();
            for (int j = 0; j <size ; j++) {
                internalArray.add(new Cell(null));
            }
            cells.add(internalArray);
        }
    }

    public Symbol getCentralPositionSymbol() {
        return Symbol.O;
    }


    public Cell getCellOnPosition(int position) {
        int columnNumber = (position % size) > 0 ? (position % size - 1) : size - 1;
        return cells.get(columnNumber).get(position/size);

    }

    public void createCell(int position) {
        int columnNumber = (position % size) > 0 ? (position % size - 1) : size - 1;
        cells.get(columnNumber).add(position/size,new Cell(position));

    }
}


