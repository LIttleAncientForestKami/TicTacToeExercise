package com.epam.ticTacToe.board;

/**
 * Created by damian on 30.06.16.
 */
public class Field implements Comparable<Field> {
    private int mXCoordinate;
    private int mYCoordinate;

    public Field(int mXCoordinate, int mYCoordinate) {
        this.mXCoordinate = mXCoordinate;
        this.mYCoordinate = mYCoordinate;
    }

    public int compareTo(Field field) {
        if ((mXCoordinate < field.mXCoordinate && mYCoordinate <= field.mYCoordinate) || mYCoordinate < field.mYCoordinate) {
            return -1;
        } else if ((mXCoordinate > field.mXCoordinate && mYCoordinate == field.mYCoordinate) || (mYCoordinate > field.mYCoordinate)) {
            return 1;
        }
        return 0;
    }
}
