package com.tictac;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by olgaermolaeva on 30.06.16.
 */

@Test
public class TestBoard {

    public void applyForOInCentre() {
        // given
        Board board = new Board();

        // when
        Symbol toTest = board.getCentralPositionSymbol();

        // then

        assertTrue(toTest.equals(Symbol.O));

    }




}
