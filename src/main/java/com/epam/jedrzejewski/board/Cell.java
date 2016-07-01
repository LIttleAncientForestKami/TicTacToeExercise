package com.epam.jedrzejewski.board;

public enum Cell {

    /**
     * Enums are indexed from 0. With empty being 0 indices are from 1, which suits user input better
     **/
    empty(0), one(1), two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9);

    private int position;
    private Sign sign;

    Cell(int position) {
        this.position = position;
        this.sign = Sign.EMPTY;
    }

    boolean shouldHaveNewLine(int boardSize) {
        return position % boardSize == 0;
    }
    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public boolean containsSign(Sign sign) {
        return this.sign.equals(sign);
    }

    @Override
    public String toString() {
        return sign.equals(Sign.EMPTY) ? position + " " : sign.toString() + " ";
    }
}
