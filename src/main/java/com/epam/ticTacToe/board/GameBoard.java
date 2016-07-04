package com.epam.ticTacToe.board;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by damian on 28.06.16.
 */
public class GameBoard {

    private final int SIZE;
    private Map<Field, FieldStatus> mBoard;


    public GameBoard(BoardSize size) {
        SIZE = size.value();
        mBoard = new TreeMap<>();
        for (int i = 0; i < SIZE * SIZE; i++) {
                mBoard.put(intToCoordinatesConverter(i), FieldStatus.FREE);
        }
        System.out.println(this);
    }

    public void placeMark(FieldStatus mark, int index) {
        mBoard.put(intToCoordinatesConverter(index - 1), mark);
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        for (Map.Entry<Field, FieldStatus> entry : mBoard.entrySet()
                ) {
            FieldStatus fieldStatus = entry.getValue();
            stringBuilder.append(fieldStatus == FieldStatus.FREE ? i : fieldStatus);
            if (i % SIZE == 0) {
                stringBuilder.append("\n");
            }
            i++;
        }
        return stringBuilder.toString();
    }

    private Field intToCoordinatesConverter(int i) {
        return new Field((i) % SIZE, (i) / SIZE);
    }
}
