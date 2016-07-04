package com.tdudzik.tictactoe.logic.game;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.board.BoardSize;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.assertEquals;

public class GameRulesTest {

    private final GameRulesDataProvider gameRulesDataProvider = new GameRulesDataProvider();

    @DataProvider
    public Object[][] gameWasWonDataProvider() {
        return gameRulesDataProvider.gameWasWon();
    }

    @DataProvider
    public Object[][] gameEndedInDrawDataProvider() {
        return gameRulesDataProvider.gameEndedInDraw();
    }

    @Test(dataProvider = "gameWasWonDataProvider")
    public void gameWasWon(Board boardMock, boolean gameShouldBeWon) {
        // Given
        BoardSize boardSizeMock = mock(BoardSize.class);
        WinningSequenceLength winningSequenceLengthMock = mock(WinningSequenceLength.class);

        GameRules gameRules = new GameRules(boardSizeMock, winningSequenceLengthMock);

        // When
        boolean gameWasWon = gameRules.gameWasWon(boardMock);

        // Then
        assertEquals(gameShouldBeWon, gameWasWon);
    }

    @Test(dataProvider = "gameEndedInDrawDataProvider")
    public void gameEndedInDraw(Board boardMock, boolean gameShouldBeEndedInDraw) {
        // Given
        BoardSize boardSizeMock = mock(BoardSize.class);
        WinningSequenceLength winningSequenceLengthMock = mock(WinningSequenceLength.class);

        GameRules gameRules = new GameRules(boardSizeMock, winningSequenceLengthMock);

        // When
        boolean gameEndedInDraw = gameRules.gameEndedInDraw(boardMock);

        // Then
        assertEquals(gameShouldBeEndedInDraw, gameEndedInDraw);
    }

}