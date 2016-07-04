package com.tdudzik.tictactoe.logic.game;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WinningSequenceLengthTest {

    @Test
    public void winningSequenceLenghtsAreEqualWhenTheyHaveTheSameValue() {
        assertEquals(WinningSequenceLength.of(3), WinningSequenceLength.of(3));
    }

    @Test
    public void winningSequenceLenghtsAreEqualWhenTheyDoesNotHaveTheSameValue() {
        assertNotEquals(WinningSequenceLength.of(3), WinningSequenceLength.of(6));
    }

}