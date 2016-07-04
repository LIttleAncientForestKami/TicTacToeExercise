package com.tictac.field;

import com.tictac.field.Cell;

import java.util.List;

/**
 * Created by olgaermolaeva on 04.07.16.
 */
public interface CellFactory {
    List<List<Cell>> createCells(int size);
}
