package com.epam.jedrzejewski.board;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class DisplayingBoardGameTest {

    private Board empty3x3Board = new Board(3);

    private Board fill3x3Board = new Board(3);

    private Board boardWithInvalidSize = new Board(-100);


    @Test
    public void emptyBoardToStringTest() {
        //Arrange
        String empty3x3BoardView = "1 2 3 \n4 5 6 \n7 8 9 \n";

        //Assert
        assertEquals(empty3x3BoardView, empty3x3Board.toString());
    }

    /*
  * It is possible to put only O signs to the board(even thought
  * this violate tic tac toe rules) because changing  Sign to put,
  * will be done outside board class.
  * */
    @Test(dataProvider = "cellsToFill3x3Board")
    public void fillBoardToStringTest(Cell[] cells) throws Exception {
        //Arrange
        Arrays.asList(cells).stream().forEach(cell -> fill3x3Board.placeO(cell));
        String boardFilledWithOs = "O O O \nO O O \nO O O \n";

        //Act
        String stringViewOfWholeBoard = fill3x3Board.toString();

        //Assert
        assertEquals(boardFilledWithOs, stringViewOfWholeBoard);
    }

    @DataProvider
    Object[][] cellsToFill3x3Board() {
        return new Object[][]{{new Cell[]{Cell.one, Cell.two, Cell.three, Cell.four, Cell.five, Cell.six, Cell.seven, Cell.eight, Cell.nine}}};
    }

    @Test
    public void invalidSizeBoardToStringTest() {
        //Arrange
        String emptyString = "";

        //Act
        String invalidBoardView = boardWithInvalidSize.toString();

        //Assert
        assertEquals(emptyString, invalidBoardView);
    }
}