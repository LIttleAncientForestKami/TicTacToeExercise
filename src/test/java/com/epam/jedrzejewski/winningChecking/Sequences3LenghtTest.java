package com.epam.jedrzejewski.winningChecking;

import com.epam.jedrzejewski.board.Cell;
import com.epam.jedrzejewski.board.Sign;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.EnumSet;

import static org.testng.Assert.*;

public class Sequences3LenghtTest {


    @Test
    public void containsCellMethodTest() {
        //Arrange
        Sequences3Lenght sequence = new Sequences3Lenght(EnumSet.range(Cell.one, Cell.three));

        //Assert
        assertTrue(sequence.containsCell(Cell.one));
        assertTrue(sequence.containsCell(Cell.two));
        assertTrue(sequence.containsCell(Cell.three));
        assertFalse(sequence.containsCell(Cell.five));

    }

    @Test(dataProvider = "cellsAndSigns")
    public void containsOtherSignMethodTest(EnumSet<Cell> cells, Sign otherSign) {
        //Arrange
        cells.stream().forEach(cell -> cell.setSign(Sign.EMPTY));
        Sequences3Lenght emptySequence = new Sequences3Lenght(cells);

        //Assert
        assertFalse(emptySequence.containsOtherSign(otherSign));
        assertTrue(emptySequence.containsOtherSign(Sign.EMPTY));
    }

    @Test(dataProvider = "cellsAndSigns")
    public void sequenceWithWinningStrikeTest(EnumSet<Cell> cells, Sign singToFillCells) {
        //Arrange
        cells.stream().forEach(cell -> cell.setSign(singToFillCells));
        Sequences3Lenght fillSequence = new Sequences3Lenght(cells);

        //Assert
        assertTrue(fillSequence.hasEmptySigns());
    }

    @DataProvider
    public Object[][] cellsAndSigns() {
        return new Object[][]{{EnumSet.range(Cell.one, Cell.three), Sign.X}, {EnumSet.range(Cell.two, Cell.four), Sign.O}, {EnumSet.range(Cell.five, Cell.seven), Sign.O}};
    }


    @Test(dataProvider = "cells")
    public void sequenceWithoutWinningStrikeTest(EnumSet<Cell> cells) {
        //Arrange
        cells.stream().forEach(cell -> cell.setSign(Sign.EMPTY));
        Sequences3Lenght cellWithoutWinningStrike = new Sequences3Lenght(cells);

        //Assert
        assertFalse(cellWithoutWinningStrike.hasEmptySigns());
    }

    @DataProvider
    public Object[][] cells() {
        return new Object[][]{{EnumSet.range(Cell.one, Cell.three)}, {EnumSet.range(Cell.two, Cell.four)}, {EnumSet.range(Cell.five, Cell.seven)}};
    }

    @Test
    public void sequenceEqualityTest(Sequence first, Sequence second) {
        //Arrange
        Sequence basicSequence = new Sequences3Lenght(EnumSet.range(Cell.one, Cell.five));
        Sequence equalTobasicSequence = new Sequences3Lenght(EnumSet.range(Cell.one, Cell.five));
        Sequence notEqualToBasicSequence = new Sequences3Lenght(EnumSet.range(Cell.one, Cell.five));

        assertTrue(basicSequence.equals(equalTobasicSequence));
        assertFalse(basicSequence.equals(notEqualToBasicSequence));
    }
}

