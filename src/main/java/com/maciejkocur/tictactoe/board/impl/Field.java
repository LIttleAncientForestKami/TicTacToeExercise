package com.maciejkocur.tictactoe.board.impl;

import java.util.HashSet;
import java.util.Set;

public class Field {
    private final Integer value;

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

    public Set<Field> getColumn() {
        Set<Field> column = new HashSet<>();
        int columnNumber = (this.value() - 1) % 3;
        column.add(new Field(columnNumber + 1));
        column.add(new Field(columnNumber + 4));
        column.add(new Field(columnNumber + 7));
        return column;
    }

    public Set<Field> getRow() {
        Set<Field> row = new HashSet<>();
        int rowNumber = (this.value() - 1) / 3;
        row.add(new Field(rowNumber + 1));
        row.add(new Field(rowNumber + 2));
        row.add(new Field(rowNumber + 3));
        return row;
    }

    public Set<Field> getPrimaryDiagonal() {
        Set<Field> primaryDiagonal = new HashSet<>();
        int rowNumber = (this.value() - 1) / 3;
        int columnNumber = (this.value() - 1) % 3;
        primaryDiagonal.add(new Field(1));
        primaryDiagonal.add(new Field(5));
        primaryDiagonal.add(new Field(9));
        return primaryDiagonal;
    }

    public Set<Field> getSecondaryDiagonal() {
        Set<Field> secondaryDiagonal = new HashSet<>();
        int rowNumber = (this.value() - 1) / 3;
        int columnNumber = (this.value() - 1) % 3;
        secondaryDiagonal.add(new Field(3));
        secondaryDiagonal.add(new Field(5));
        secondaryDiagonal.add(new Field(7));
        return secondaryDiagonal;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
