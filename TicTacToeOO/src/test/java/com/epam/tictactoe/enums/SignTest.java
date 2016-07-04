package com.epam.tictactoe.enums;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * @author Grzegorz Sledz
 */
public class SignTest {

    @Test
    public void toStringEnumSignXShouldBeX() {
        Assert.assertEquals("X", Sign.X.toString());
    }

    @Test
    public void toStringEnumSignOShouldBeO() {
        Assert.assertEquals("O", Sign.O.toString());
    }

}