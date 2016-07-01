package com.maciejkocur.tictactoe.board.impl;

public class Field {
    Integer value;

    public Field(Integer value) {
        this.value = value;
    }

    Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        return value != null ? value.equals(field.value) : field.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
