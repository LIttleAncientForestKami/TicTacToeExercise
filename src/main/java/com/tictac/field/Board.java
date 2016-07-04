package com.tictac.field;


import com.tictac.Symbol;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by olgaermolaeva on 30.06.16.
 */
public class Board {

    private final int size;

    private List<List<Cell>> cells;

    public Board(int size) {
        this.size = size;
    }

    public void setCells(List<List<Cell>> cells){
        this.cells = cells;
    }

    public Symbol getCentralPositionSymbol() {
        return Symbol.O;
    }


    public Cell getCellOnPosition(int position) {
        int rowNumber = ((position -1)/ size);
        int columnNumber = position%size >0 ? position%size -1: size-1;
        return cells.get(rowNumber).get(columnNumber);

    }


    // do not test this method. It is just for console representation
    public void printBoard(){
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size ; j++) {
                if (cells.get(i).get(j).getSymbol()!=null) {
                    System.out.print(cells.get(i).get(j).getSymbol());
                }else{
                    System.out.print(cells.get(i).get(j).position);
                }
            }
            System.out.println("");
        }
    }
}


