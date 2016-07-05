package com.tictac.field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by olgaermolaeva on 04.07.16.
 */
public class CellFactoryMap implements CellFactory {

    private Map<Integer, Cell> cells = new HashMap<Integer, Cell>();

    public Map<Integer, Cell> createCells(int size) {
        for (int i = 1; i <= size * size; i++) {
            Cell cell = new Cell(i);
            linkCellsWithSymbolStorages(cell);
            cells.put(i, cell);
        }
        return cells;
    }

    private void linkCellsWithSymbolStorages(Cell cell) {
        ArrayList<SymbolStorageWithRegistration> myStorage = new ArrayList<>();
        myStorage.add(new SymbolStorageWithRegistration());
        cell.setMyLinkedStorage(myStorage);
    }


}
