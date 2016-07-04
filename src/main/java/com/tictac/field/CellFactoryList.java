package com.tictac.field;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by olgaermolaeva on 04.07.16.
 */
public class CellFactoryList implements CellFactory {

    private List<List<Cell>> cells = new ArrayList<List<Cell>>();

    public List<List<Cell>> createCells(int size) {
        for (int i = 0; i < size; i++) {
            ArrayList<Cell> internalArray = new ArrayList<Cell>();
            for (int j = 0; j < size; j++) {
                Cell cell = new Cell(i*size + j +1);
                linkCellsWithSymbolStorages(cell);
                internalArray.add(cell);
            }
            cells.add(internalArray);
        }
        return cells;
    }

    private void linkCellsWithSymbolStorages(Cell cell) {
    // TODO implement links to symbolStorages
    }


}
