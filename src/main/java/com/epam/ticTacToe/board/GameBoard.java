package com.epam.ticTacToe.board;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by damian on 28.06.16.
 */
public class GameBoard {

    private final int SIDE_SIZE;
    private Map<Field, FieldStatus> mBoard;


    public GameBoard(int size) {
        SIDE_SIZE = size;
        mBoard = new TreeMap<>();
        for (int i = 0; i < SIDE_SIZE * SIDE_SIZE; i++) {
                mBoard.put(intToCoordinatesConverter(i), stringToFieldStatusConverter(""));
        }
    }

    public void placeMark(String s, int index) {
        mBoard.put(intToCoordinatesConverter(index - 1), stringToFieldStatusConverter(s));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        for (Map.Entry<Field, FieldStatus> entry : mBoard.entrySet()
                ) {
            FieldStatus fieldStatus = entry.getValue();
            stringBuilder.append(fieldStatus == FieldStatus.FREE ? i : fieldStatus);
            if (i % SIDE_SIZE == 0) {
                stringBuilder.append("\n");
            }
            i++;
        }
        return stringBuilder.toString();
    }

    private FieldStatus stringToFieldStatusConverter(String s) {
        FieldStatus result = FieldStatus.FREE;
        switch (s) {
            case "O" :
                result = FieldStatus.O;
                break;
            case "X" :
                result = FieldStatus.X;
                break;
        }
        return result;
    }

    private Field intToCoordinatesConverter(int i) {
        return new Field((i) % SIDE_SIZE, (i) / SIDE_SIZE);
    }
}
