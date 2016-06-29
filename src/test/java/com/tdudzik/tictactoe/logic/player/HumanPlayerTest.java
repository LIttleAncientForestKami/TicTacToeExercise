package com.tdudzik.tictactoe.logic.player;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.board.Mark;
import com.tdudzik.tictactoe.logic.board.Position;
import com.tdudzik.tictactoe.logic.io.InputHandler;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;

public class HumanPlayerTest {

    @Test
    public void playAsX() {
        // Given
        Player player = new HumanPlayer("player1-id", "Player1");

        InputHandler inputHandlerMock = mock(InputHandler.class);
        when(inputHandlerMock.readHumanPlayerPosition("Player1")).thenReturn(Position.of(1));

        Board boardMock = mock(Board.class);

        // When
        player.playAsX(inputHandlerMock, boardMock);

        // Then
        verify(boardMock).placeMark(Position.of(1), Mark.X);
    }

}