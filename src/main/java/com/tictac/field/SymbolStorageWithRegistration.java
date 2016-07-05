package com.tictac.field;

import com.tictac.Symbol;

/**
 * Created by olgaermolaeva on 05.07.16.
 */
public class SymbolStorageWithRegistration implements SymbolStorage {
    private Symbol essentialSymbol;
    public boolean isWinner;

    public void update(Symbol symbol) {
        essentialSymbol = symbol;
    }

    public void goToCheck() {

    }
}
