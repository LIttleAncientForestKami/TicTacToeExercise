package com.tictac.field;

import com.tictac.field.impl.Cell;

import java.util.Map;

/**
 * Created by Olga Ermolaeva on 04.07.16.
 */
public interface CellFactory {
    Map<Integer, Cell> createCells();
}
