package com.epam.tictactoe.input;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

/**
 * Created by grzegorz_sledz on 01.07.16.
 */
public class ConsoleInputTest {

    @Test
    public void readInt16() {
        Integer expectedValue = 16;
        IInput console = new ConsoleInput(new ByteArrayInputStream("16".getBytes()));
        Assert.assertTrue(expectedValue == console.readInt());
    }
}
