package com.epam.jedrzejewski.board;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CellDisplayingTest {


    @Test
    public void emptyCellToStringMethodTest() {
        //Arrange
        String five = "5 ";

        //Act
        String stringOfEmptyCellFive = Cell.five.toString();

        //Assert
        assertEquals(five, stringOfEmptyCellFive);


    }


    @Test(dataProvider = "cellsWithSignToPut")
    public void cellWithSignToStringMethodTest(Cell cell, Sign sign) {
        //Arrange
        cell.setSign(sign);
        String signView = sign + " ";

        //Act
        String cellView = cell.toString();

        //Assert
        assertEquals(signView, cellView);

    }

    @DataProvider
    public Object[][] cellsWithSignToPut() {
        return new Object[][]{{Cell.one, Sign.X}, {Cell.one, Sign.O}};
    }
}