package com.tictac;



/**
 * Created by olgaermolaeva on 30.06.16.
 */
public class Board {


    public Symbol getCentralPositionSymbol() {
        return Symbol.O;
    }


    public Cell getCellOnPosition(int position) {
        return new Cell(position);
    }
}
