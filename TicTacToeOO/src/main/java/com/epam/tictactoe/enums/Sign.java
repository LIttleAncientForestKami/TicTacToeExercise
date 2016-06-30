package com.epam.tictactoe.enums;

public enum Sign {

    O("O"), X("X"), EMPTY("-");

    private final String value;

    private Sign(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

}
