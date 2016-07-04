package com.epam.ticTacToe.input;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

import static org.testng.Assert.*;

/**
 * Created by damian on 04.07.16.
 */
public class InputReaderTest {

    @DataProvider(name = "input")
    public Object[][] userInput() {
        /**
         * Art
         */
        return new Object[][] {{2, "2"}, {6, "6"}, {9, "9"}, {1, "1"}, {8, "8"}};
    }

    @Test(dataProvider = "input")
    public void testReadInput(int fieldNumber, String userInput) throws Exception {
        /**
         * Arrange
         */
        InputReader inputReader = new InputReader();
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);
        /**
         * Assert
         */
        assertEquals(inputReader.readInput(), fieldNumber);
    }

}