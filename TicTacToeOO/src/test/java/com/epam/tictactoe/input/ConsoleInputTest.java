package com.epam.tictactoe.input;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

/**
 * @author Grzegorz Sledz
 */
public class ConsoleInputTest {

    @Test
    public void readInt16FromConsoleInput() {
        Integer expectedValue = 16;
        IInput console = new ConsoleInput(new ByteArrayInputStream("16".getBytes()));
        Assert.assertTrue(expectedValue == console.readInt());
    }
}
