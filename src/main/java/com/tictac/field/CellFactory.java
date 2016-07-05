package com.tictac.field;

import java.util.Map;

/**
 * Created by olgaermolaeva on 04.07.16.
 */
public interface CellFactory {
    Map<Integer, Cell> createCells(int size);
}
