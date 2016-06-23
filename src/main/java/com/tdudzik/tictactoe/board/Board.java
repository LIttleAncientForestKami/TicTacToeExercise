package com.tdudzik.tictactoe.board;

import javafx.geometry.Pos;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private final Map<Position, Mark> marksByPosition;

    Board(Map<Position, Mark> marksByPosition) {
        this.marksByPosition = marksByPosition;
    }

    public static Board fromBoardDimensions(BoardDimensions boardDimensions) {
        Map<Position, Mark> marksByPosition = new HashMap<>();
        return new Board(marksByPosition);
    }

    public boolean positionExists(Position position) {
        return marksByPosition.containsKey(position);
    }

}
