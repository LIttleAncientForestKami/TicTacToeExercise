package com.tictac.field;

import com.tictac.Symbol;

import java.util.List;

/**
 * Created by olgaermolaeva on 30.06.16.
 */
public class Cell {
    public Integer position;
    private Symbol symbol;

    public List<SymbolStorageWithRegistration> getMyLinkedStorage() {
        return myLinkedStorage;
    }

    private List<SymbolStorageWithRegistration> myLinkedStorage;

    public Cell(Integer position) {
        this.position = position;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setMyLinkedStorage(List<SymbolStorageWithRegistration> myLinkedStorage) {
        this.myLinkedStorage = myLinkedStorage;
    }

    public void update(Symbol symbol) {
        this. symbol = symbol;
        for (SymbolStorageWithRegistration item : myLinkedStorage ) {
            item.update(symbol);
        }
    }
}
