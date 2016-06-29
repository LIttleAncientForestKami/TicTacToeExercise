package com.tdudzik.tictactoe.logic.board;

import java.util.HashMap;
import java.util.Map;

public class BoardDataProvider {

    public Object[][] sameMarksHorizontally() {
        Map<Position, Mark> positions1 = new HashMap<>();
        positions1.put(Position.of(1), Mark.X);
        positions1.put(Position.of(2), Mark.X);
        positions1.put(Position.of(3), Mark.X);
        positions1.put(Position.of(4), Mark.NONE);
        positions1.put(Position.of(5), Mark.NONE);
        positions1.put(Position.of(6), Mark.NONE);
        positions1.put(Position.of(7), Mark.NONE);
        positions1.put(Position.of(8), Mark.NONE);
        positions1.put(Position.of(9), Mark.NONE);

        Map<Position, Mark> positions2 = new HashMap<>();
        positions2.put(Position.of(1), Mark.NONE);
        positions2.put(Position.of(2), Mark.NONE);
        positions2.put(Position.of(3), Mark.NONE);
        positions2.put(Position.of(4), Mark.O);
        positions2.put(Position.of(5), Mark.O);
        positions2.put(Position.of(6), Mark.O);
        positions2.put(Position.of(7), Mark.NONE);
        positions2.put(Position.of(8), Mark.NONE);
        positions2.put(Position.of(9), Mark.NONE);

        Map<Position, Mark> positions3 = new HashMap<>();
        positions3.put(Position.of(1), Mark.NONE);
        positions3.put(Position.of(2), Mark.NONE);
        positions3.put(Position.of(3), Mark.NONE);
        positions3.put(Position.of(4), Mark.NONE);
        positions3.put(Position.of(5), Mark.NONE);
        positions3.put(Position.of(6), Mark.NONE);
        positions3.put(Position.of(7), Mark.X);
        positions3.put(Position.of(8), Mark.X);
        positions3.put(Position.of(9), Mark.X);

        return new Object[][]{
                {positions1, 3, true},
                {positions2, 3, true},
                {positions3, 3, true}
        };
    }

    public Object[][] sameMarksVertically() {
        Map<Position, Mark> positions1 = new HashMap<>();
        positions1.put(Position.of(1), Mark.X);
        positions1.put(Position.of(2), Mark.NONE);
        positions1.put(Position.of(3), Mark.NONE);
        positions1.put(Position.of(4), Mark.X);
        positions1.put(Position.of(5), Mark.NONE);
        positions1.put(Position.of(6), Mark.NONE);
        positions1.put(Position.of(7), Mark.X);
        positions1.put(Position.of(8), Mark.NONE);
        positions1.put(Position.of(9), Mark.NONE);

        Map<Position, Mark> positions2 = new HashMap<>();
        positions2.put(Position.of(1), Mark.NONE);
        positions2.put(Position.of(2), Mark.X);
        positions2.put(Position.of(3), Mark.NONE);
        positions2.put(Position.of(4), Mark.NONE);
        positions2.put(Position.of(5), Mark.X);
        positions2.put(Position.of(6), Mark.NONE);
        positions2.put(Position.of(7), Mark.NONE);
        positions2.put(Position.of(8), Mark.X);
        positions2.put(Position.of(9), Mark.NONE);

        Map<Position, Mark> positions3 = new HashMap<>();
        positions3.put(Position.of(1), Mark.NONE);
        positions3.put(Position.of(2), Mark.NONE);
        positions3.put(Position.of(3), Mark.X);
        positions3.put(Position.of(4), Mark.NONE);
        positions3.put(Position.of(5), Mark.NONE);
        positions3.put(Position.of(6), Mark.X);
        positions3.put(Position.of(7), Mark.NONE);
        positions3.put(Position.of(8), Mark.NONE);
        positions3.put(Position.of(9), Mark.X);

        return new Object[][]{
                {positions1, 3, true},
                {positions2, 3, true},
                {positions3, 3, true}
        };
    }

    public Object[][] noSameMarks() {
        Map<Position, Mark> positions1 = new HashMap<>();
        positions1.put(Position.of(1), Mark.X);
        positions1.put(Position.of(2), Mark.X);
        positions1.put(Position.of(3), Mark.NONE);
        positions1.put(Position.of(4), Mark.O);
        positions1.put(Position.of(5), Mark.O);
        positions1.put(Position.of(6), Mark.NONE);
        positions1.put(Position.of(7), Mark.NONE);
        positions1.put(Position.of(8), Mark.O);
        positions1.put(Position.of(9), Mark.NONE);

        Map<Position, Mark> positions2 = new HashMap<>();
        positions2.put(Position.of(1), Mark.O);
        positions2.put(Position.of(2), Mark.NONE);
        positions2.put(Position.of(3), Mark.X);
        positions2.put(Position.of(4), Mark.NONE);
        positions2.put(Position.of(5), Mark.O);
        positions2.put(Position.of(6), Mark.O);
        positions2.put(Position.of(7), Mark.NONE);
        positions2.put(Position.of(8), Mark.X);
        positions2.put(Position.of(9), Mark.X);

        return new Object[][]{
                {positions1, 3, false},
                {positions2, 3, false}
        };
    }

}
