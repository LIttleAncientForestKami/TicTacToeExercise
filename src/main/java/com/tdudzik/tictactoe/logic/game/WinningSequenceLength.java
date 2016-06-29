package com.tdudzik.tictactoe.logic.game;

public class WinningSequenceLength {

    private final int value;

    public WinningSequenceLength(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WinningSequenceLength that = (WinningSequenceLength) o;

        return value == that.value;

    }

    @Override
    public int hashCode() {
        return value;
    }

}
