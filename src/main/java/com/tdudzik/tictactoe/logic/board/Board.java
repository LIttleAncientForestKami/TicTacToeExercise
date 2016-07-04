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

    public boolean thereAreTheSameMarksSideBySideHorizontally(int numberOfMarks) {
        if (numberOfMarks != 3) {
            throw new UnsupportedOperationException("Not supported yet. You can check if there are the same marks horizontally only for 3 marks.");
        }

        if (marksOnPositionsAreSame(Position.of(1), Position.of(2), Position.of(3))) {
            return true;
        } else if (marksOnPositionsAreSame(Position.of(4), Position.of(5), Position.of(6))) {
            return true;
        } else if (marksOnPositionsAreSame(Position.of(7), Position.of(8), Position.of(9))) {
            return true;
        }

        return false;
    }

    public boolean thereAreTheSameMarksSideBySideVertically(int numberOfMarks) {
        if (numberOfMarks != 3) {
            throw new UnsupportedOperationException("Not supported yet. You can check if there are the same marks vertically only for 3 marks.");
        }

        if (marksOnPositionsAreSame(Position.of(1), Position.of(4), Position.of(7))) {
            return true;
        } else if (marksOnPositionsAreSame(Position.of(2), Position.of(5), Position.of(8))) {
            return true;
        } else if (marksOnPositionsAreSame(Position.of(3), Position.of(6), Position.of(9))) {
            return true;
        }

        return false;
    }

    public boolean thereAreTheSameMarksSideBySideDiagonally(int numberOfMarks) {
        if (numberOfMarks != 3) {
            throw new UnsupportedOperationException("Not supported yet. You can check if there are the same marks vertically only for 3 marks.");
        }

        if (marksOnPositionsAreSame(Position.of(1), Position.of(5), Position.of(9))) {
            return true;
        } else if (marksOnPositionsAreSame(Position.of(3), Position.of(5), Position.of(7))) {
            return true;
        }

        return false;
    }

    private boolean marksOnPositionsAreSame(Position position1, Position position2, Position position3) {
        if (isOccupied(position1) && isOccupied(position2) && isOccupied(position3)) {
            Mark mark1 = markOn(position1);
            Mark mark2 = markOn(position2);
            Mark mark3 = markOn(position3);

            if (mark1.equals(mark2) && mark2.equals(mark3) && !mark1.equals(Mark.NONE)) {
                return true;
            }
        }

        return false;
    }

    public boolean everyPositionIsOccupied() {
        return marksByPosition.values().stream().filter(m -> m.equals(Mark.NONE)).count() == 0;
    }

}
