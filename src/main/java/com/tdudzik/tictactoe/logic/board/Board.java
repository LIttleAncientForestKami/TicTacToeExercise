package com.tdudzik.tictactoe.logic.board;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private final BoardSize size;
    private final Map<Position, Mark> marksByPosition;

    Board(BoardSize size, Map<Position, Mark> marksByPosition) {
        this.size = size;
        this.marksByPosition = marksByPosition;
    }

    public static Board from(BoardSize boardSize) {
        Map<Position, Mark> marksByPosition = new HashMap<>();
        for (int i = 0; i < boardSize.getValue() * boardSize.getValue(); i++) {
            marksByPosition.put(Position.of(i + 1), Mark.NONE);
        }

        return new Board(boardSize, marksByPosition);
    }

    public BoardSize getSize() {
        return size;
    }

    public boolean positionExists(Position position) {
        return marksByPosition.containsKey(position);
    }

    public boolean isOccupied(Position position) {
        if (!positionExists(position)) {
            throw new IllegalStateException("Position does not exists.");
        }

        return !marksByPosition.get(position).equals(Mark.NONE);
    }

    public Mark markOn(Position position) {
        if (!positionExists(position)) {
            throw new IllegalStateException("Position does not exists.");
        }

        return marksByPosition.get(position);
    }

    public void placeMark(Position position, Mark mark) {
        if (isOccupied(position)) {
            throw new IllegalStateException("Position is already occupied.");
        }

        marksByPosition.put(position, mark);
    }

}
