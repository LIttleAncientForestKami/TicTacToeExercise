package com.tictac.field.impl;

import com.tictac.field.CellFactory;

import java.util.*;

/**
 * Created by olgaermolaeva on 04.07.16.
 */
public class CellFactoryMap implements CellFactory {

    private int size;
    private EventRegistrator eventRegistrator;
    private Map<Integer, Cell> cells = new HashMap<>();
    private List<SymbolStorageWithRegistration> rows = new LinkedList<>();
    private List<SymbolStorageWithRegistration> columns = new LinkedList<>();
    private SymbolStorageWithRegistration leftDiagonal = new SymbolStorageWithRegistration();
    private SymbolStorageWithRegistration rightDiagonal = new SymbolStorageWithRegistration();
    private Diagonalscreator diagonals;

    public CellFactoryMap(int size) {
        this.size = size;
    }

    public void setEventRegistrator(EventRegistrator eventRegistrator) {
        this.eventRegistrator = eventRegistrator;
    }


    public Map<Integer, Cell> createCells() {
        prepareForCreatingCells();
        for (int i = 1; i <= size * size; i++) {
            Cell cell = new Cell(i);
            linkCellsWithSymbolStorages(cell);
            cells.put(i, cell);
        }
        return cells;
    }

    private void linkCellsWithSymbolStorages(Cell cell) {
        ArrayList<SymbolStorageWithRegistration> myStorage = new ArrayList<>();
        int position = cell.getPosition();
        // add ref to row
        int rowNumber = position % size > 0 ? position / size : position / size - 1;
        myStorage.add(rows.get(rowNumber));
        // add ref to column
        int columnNumber = position % size > 0 ? position % size : size - 1;
        myStorage.add(columns.get(columnNumber));
        // addDiagonals
        if (diagonals.HasLeftDiagonal(position)) {
            myStorage.add(leftDiagonal);
        }
        if (diagonals.HasRightDiagonal(position)) {
            myStorage.add(rightDiagonal);
        }
        cell.setMyLinkedStorage(myStorage);
    }

    private void prepareForCreatingCells() {
        populateSymbolStorageLists();
        diagonals = new Diagonalscreator();
    }

    private void populateSymbolStorageLists() {
        for (int i = 0; i < size; i++) {
            SymbolStorageWithRegistration symbolStorage = new SymbolStorageWithRegistration();
            symbolStorage.setEventRegistrator(eventRegistrator);
            rows.add(symbolStorage);
        }
        for (int i = 0; i < size; i++) {
            SymbolStorageWithRegistration symbolStorage = new SymbolStorageWithRegistration();
            symbolStorage.setEventRegistrator(eventRegistrator);
            columns.add(symbolStorage);
        }
        leftDiagonal.setEventRegistrator(eventRegistrator);
        rightDiagonal.setEventRegistrator(eventRegistrator);
    }

    private class Diagonalscreator {
        Set<Integer> cellsWithLeftDiagonal = new HashSet<>();
        Set<Integer> cellsWithRightDiagonal = new HashSet<>();

        public Diagonalscreator() {
            for (int i = 1; i <= size * size; i += size + 1) {
                cellsWithLeftDiagonal.add(i);
            }
            for (int i = size; i < size * size; i += size - 1) {
                cellsWithLeftDiagonal.add(i);
            }
        }

        private boolean HasLeftDiagonal(int position) {
            return cellsWithLeftDiagonal.contains(position);

        }

        private boolean HasRightDiagonal(int position) {
            return cellsWithRightDiagonal.contains(position);

        }
    }
}