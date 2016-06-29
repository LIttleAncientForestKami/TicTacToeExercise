package com.tdudzik.tictactoe.logic.board;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BoardSizeTest {

    @Test
    public void createBoardSize() {
        assertEquals(3, BoardSize.of(3).getValue());
    }

}