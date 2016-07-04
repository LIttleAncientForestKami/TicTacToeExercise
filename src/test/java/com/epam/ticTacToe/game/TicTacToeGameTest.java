package com.epam.ticTacToe.game;

import com.epam.ticTacToe.board.BoardSize;
import com.epam.ticTacToe.board.FieldStatus;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;

import static org.testng.Assert.*;

/**
 * Created by damian on 04.07.16.
 */
public class TicTacToeGameTest {

    private TicTacToeGame mTicTacToeGame;

    @BeforeMethod
    public void setUp() {
        /**
         * Arrange
         */
        mTicTacToeGame = new TicTacToeGame(new BoardSize(3));
        mTicTacToeGame.start();
    }

    @DataProvider(name = "input")
    public Object[][] userInput() {
        /**
         * Arrange
         */
        return new Object[][]{{2, FieldStatus.O, "1O3\n456\n789\n"}, {6, FieldStatus.X, "123\n45X\n789\n"},
                {9, FieldStatus.O, "123\n456\n78O\n"}, {1, FieldStatus.X, "X23\n456\n789\n"},
                {8, FieldStatus.O, "123\n456\n7O9\n"}};
    }

    @Test(dataProvider = "input")
    public void testPlacingMarksUsingScanner(int fieldIndex, FieldStatus mark, String boardStringView) {
        /**
         * Arrange
         */
        ByteArrayInputStream in = new ByteArrayInputStream(String.valueOf(fieldIndex).getBytes());
        System.setIn(in);
        /**
         * Art
         */
        if (mark == FieldStatus.O) {
            mTicTacToeGame.placeO();
        } else {
            mTicTacToeGame.placeX();
        }
        /**
         * Assert
         */
        Field privateGameBoardField = null;
        try {
            privateGameBoardField = TicTacToeGame.class.getDeclaredField("mGameBoard");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        privateGameBoardField.setAccessible(true);
        String gameBoardStringValue = "";
        try {
            gameBoardStringValue = privateGameBoardField.get(mTicTacToeGame).toString();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertEquals(gameBoardStringValue, boardStringView);
    }


    @AfterMethod
    public void tearDown() {
        mTicTacToeGame = null;
    }
}