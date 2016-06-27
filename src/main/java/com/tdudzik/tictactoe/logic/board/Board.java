package com.tdudzik.tictactoe.logic.board;

import java.util.Map;

public class Board {

    private final Map<Position, Mark> marksByPosition;

    Board(Map<Position, Mark> marksByPosition) {
        this.marksByPosition = marksByPosition;
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
