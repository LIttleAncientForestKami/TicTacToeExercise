package com.tictac.field.impl;
import com.tictac.Symbol;
import java.util.List;

/**
 * Created by olgaermolaeva on 05.07.16.
 */
public class EventRegistrator {

    private int size;
    private int counterOfBroken;
    private boolean isWinner;

    public EventRegistrator(int size) {
        this.size = size;
    }

    public void checkUpStorage(List<Symbol> symbolList) {
        if (!isWinner) {
            isWinner = symbolList.size() == size;
        }
    }

    public void registerBroken() {
        counterOfBroken++;
    }

    public boolean isWinner() {
        return isWinner;
    }
}
