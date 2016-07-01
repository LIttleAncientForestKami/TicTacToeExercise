package com.epam.jedrzejewski.board;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PutSignsOnGameBoardTest {

    private Board boardToPutO = new Board(3);

    private Board boardToPutX = new Board(3);

    @Test(dataProvider = "cells")
    public void putOinValidPositionTest(Cell cell) {
        //Arrange
        cell.setSign(Sign.EMPTY);
        boardToPutO.placeO(cell);

        //Act
        boolean result = cell.containsSign(Sign.O);

        //Assert
        assertTrue(result);
    }

    /* It should be possible to put O on taken by X position in board(despite thought this violate tic tac toe rules)
    *   because the validation to prevent this will be done outside the board class */
    @Test(dataProvider = "cells")
    public void putOInTakenByXPositionTest(Cell cell) {
        //Arrange
        cell.setSign(Sign.EMPTY);
        boardToPutO.placeX(cell);
        boardToPutO.placeO(cell);

        //Act
        boolean result = cell.containsSign(Sign.O);

        //Assert
        assertTrue(result);
    }

    @Test(dataProvider = "cells")
    public void putXinValidPositionTest(Cell cell) {
        //Arrange
        cell.setSign(Sign.EMPTY);
        boardToPutX.placeX(cell);

        //Act
        boolean result = cell.containsSign(Sign.X);

        //Assert
        assertTrue(result);

    }

    /* Same explanation as in comment to putOInTakenByXPositionTest*/
    @Test(dataProvider = "cells")
    public void putXInTakenByOPositionTest(Cell cell) {
        //Arrange
        cell.setSign(Sign.EMPTY);
        boardToPutX.placeO(cell);
        boardToPutX.placeX(cell);

        //Act
        boolean result = cell.containsSign(Sign.X);

        //Assert
        assertTrue(result);
    }


    @DataProvider()
    public Object[][] cells() {
        return new Object[][]{{Cell.one}, {Cell.two},{Cell.three},{Cell.four},{Cell.five},{Cell.six},{Cell.seven},{Cell.eight},{Cell.nine}};
    }
}
