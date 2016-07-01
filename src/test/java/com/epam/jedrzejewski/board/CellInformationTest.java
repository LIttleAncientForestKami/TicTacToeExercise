package com.epam.jedrzejewski.board;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class CellInformationTest {

    @Test(dataProvider = "cellsWithNewLineNeeded")
    public void cellsThatShouldHaveNewLineTest(Cell cell, int boardSize) {
        assertTrue(cell.shouldHaveNewLine(boardSize));
    }

    @DataProvider
    public Object[][] cellsWithNewLineNeeded() {
        return new Object[][]{{Cell.three, 3}, {Cell.six, 3}, {Cell.nine, 3}};
    }


    @Test(dataProvider = "cellsWithoutNewLineNeeded")
    public void cellsThatShouldNotHaveNewLineTest(Cell cell, int boardSize) {
        assertFalse(cell.shouldHaveNewLine(boardSize));
    }

    @DataProvider
    public Object[][] cellsWithoutNewLineNeeded() {
        return new Object[][]{{Cell.one, 3}, {Cell.two, 3}, {Cell.four, 3}, {Cell.five, 3}, {Cell.seven, 3}, {Cell.eight, 3}};
    }


    @Test(dataProvider = "cellsAndSigns")
    public void cellsWithSignContainsTest(Cell cell, Sign sign) {
        //Arrange
        cell.setSign(sign);

        //Act
        boolean containsSign = cell.containsSign(sign);

        //Assert
        assertTrue(containsSign);
    }


    @Test(dataProvider = "cellsAndSigns")
    public void emptyCellsContainsTest(Cell cell, Sign sign) {
        //Arrange
        cell.setSign(Sign.EMPTY);

        //Assert
        assertFalse(cell.containsSign(sign));
    }

    @DataProvider
    public Object[][] cellsAndSigns() {
        return new Object[][]{{Cell.one, Sign.X}, {Cell.two, Sign.O}};
    }

}
