package com.epam.tictactoe.enums;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Grzesiek on 2016-06-23.
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