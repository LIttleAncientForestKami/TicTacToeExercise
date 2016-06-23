package com.tdudzik.tictactoe.board;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PositionTest {

    @Test
    public void createPosition() {
        // When
        Position position = Position.of(10);

        // Then
        assertEquals(10, position.getValue());
    }

}