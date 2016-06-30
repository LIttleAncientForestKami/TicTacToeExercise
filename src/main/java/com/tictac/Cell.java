package com.tictac;

/**
 * Created by olgaermolaeva on 30.06.16.
 */
public class Cell {
    int position;

    public Cell(int position) {
        this.position = position;
    }

    public boolean hasDiagonal() {
        return true;
    }

    public Boolean isCentral() {
        return true;
    }
}
