package com.tdudzik.tictactoe.logic.game;

import com.tdudzik.tictactoe.logic.board.Board;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameRulesDataProvider {

    public Object[][] gameWasWon() {
        Board boardMock1 = mock(Board.class);
        when(boardMock1.thereAreTheSameMarksSideBySideHorizontally(anyInt())).thenReturn(true);
        when(boardMock1.thereAreTheSameMarksSideBySideVertically(anyInt())).thenReturn(false);
        when(boardMock1.thereAreTheSameMarksSideBySideDiagonally(anyInt())).thenReturn(false);
        when(boardMock1.everyPositionIsOccupied()).thenReturn(false);

        Board boardMock2 = mock(Board.class);
        when(boardMock2.thereAreTheSameMarksSideBySideHorizontally(anyInt())).thenReturn(false);
        when(boardMock2.thereAreTheSameMarksSideBySideVertically(anyInt())).thenReturn(true);
        when(boardMock2.thereAreTheSameMarksSideBySideDiagonally(anyInt())).thenReturn(false);
        when(boardMock2.everyPositionIsOccupied()).thenReturn(false);

        Board boardMock3 = mock(Board.class);
        when(boardMock3.thereAreTheSameMarksSideBySideHorizontally(anyInt())).thenReturn(false);
        when(boardMock3.thereAreTheSameMarksSideBySideVertically(anyInt())).thenReturn(false);
        when(boardMock3.thereAreTheSameMarksSideBySideDiagonally(anyInt())).thenReturn(true);
        when(boardMock3.everyPositionIsOccupied()).thenReturn(false);

        Board boardMock4 = mock(Board.class);
        when(boardMock4.thereAreTheSameMarksSideBySideHorizontally(anyInt())).thenReturn(false);
        when(boardMock4.thereAreTheSameMarksSideBySideVertically(anyInt())).thenReturn(false);
        when(boardMock4.thereAreTheSameMarksSideBySideDiagonally(anyInt())).thenReturn(false);
        when(boardMock4.everyPositionIsOccupied()).thenReturn(false);

        return new Object[][]{
                {boardMock1, true},
                {boardMock2, true},
                {boardMock3, true},
                {boardMock4, false}
        };
    }

    public Object[][] gameEndedInDraw() {
        Board boardMock1 = mock(Board.class);
        when(boardMock1.thereAreTheSameMarksSideBySideHorizontally(anyInt())).thenReturn(false);
        when(boardMock1.thereAreTheSameMarksSideBySideVertically(anyInt())).thenReturn(false);
        when(boardMock1.thereAreTheSameMarksSideBySideDiagonally(anyInt())).thenReturn(false);
        when(boardMock1.everyPositionIsOccupied()).thenReturn(true);

        Board boardMock2 = mock(Board.class);
        when(boardMock2.thereAreTheSameMarksSideBySideHorizontally(anyInt())).thenReturn(false);
        when(boardMock2.thereAreTheSameMarksSideBySideVertically(anyInt())).thenReturn(false);
        when(boardMock2.thereAreTheSameMarksSideBySideDiagonally(anyInt())).thenReturn(false);
        when(boardMock2.everyPositionIsOccupied()).thenReturn(false);

        return new Object[][]{
                {boardMock1, true},
                {boardMock2, false}
        };
    }

}
