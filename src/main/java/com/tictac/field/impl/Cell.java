package com.tictac.field.impl;

import com.tictac.Symbol;

import java.util.List;

/**
 * Created by olgaermolaeva on 30.06.16.
 */
public class Cell {

    private Integer position;
    private Symbol symbol;
    private List<SymbolStorageWithRegistration> myLinkedStorage;

    public List<SymbolStorageWithRegistration> getMyLinkedStorage() {
        return myLinkedStorage;
    }

    public Cell(Integer position) {
        this.position = position;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Integer getPosition() {
        return position;
    }

    public void setMyLinkedStorage(List<SymbolStorageWithRegistration> myLinkedStorage) {
        this.myLinkedStorage = myLinkedStorage;
    }

    public void update(Symbol symbol) {
        this.symbol = symbol;
        for (SymbolStorageWithRegistration item : myLinkedStorage) {
            if (!item.isBroken) {
                item.update(symbol);
            }
        }
    }
}
