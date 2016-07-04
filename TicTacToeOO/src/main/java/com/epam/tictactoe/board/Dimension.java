package com.epam.tictactoe.board;

/**
 * @author Grzegorz Sledz
 *
 * Class is responsible for representing board dimension
 */
public class Dimension implements IDimension {

    private final int value;

    public Dimension(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}
