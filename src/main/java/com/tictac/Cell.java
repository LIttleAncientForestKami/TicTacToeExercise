package com.tictac;

/**
 * Created by olgaermolaeva on 30.06.16.
 */
public class Cell {
    Integer position;
    private Symbol symbol;

    public Cell(Integer position) {
        this.position = position;
    }

    public boolean hasDiagonal() {
        return true;
    }

    public Boolean isCentral() {
        return true;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
