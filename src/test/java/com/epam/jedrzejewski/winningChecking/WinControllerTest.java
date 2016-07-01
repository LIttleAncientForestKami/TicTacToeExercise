package com.epam.jedrzejewski.winningChecking;

import com.epam.jedrzejewski.board.Board;
import com.epam.jedrzejewski.board.Cell;
import com.epam.jedrzejewski.board.Sign;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class WinControllerTest {


    @Test(dataProvider = "arraysWithCellsToPutSign")
    public void OWinsTest(Cell... cells) {
        //Arrange
        WinController winController = new WinController(3, 3);
        Board board = new Board(3);
        Arrays.stream(cells).forEach(cell -> board.placeO(cell));

        //Assert
        assertTrue(winController.checkIfOWins(cells[cells.length - 1]));
    }

    @Test(dataProvider = "arraysWithCellsToPutSign")
    public void ODoNotWinTest(Cell... cells) {
        //Arrange
        Board board = new Board(3);
        WinController winController = new WinController(3, 3);
        Arrays.stream(cells).forEach(cell -> board.placeX(cell));

        //Assert
        assertFalse(winController.checkIfOWins(cells[cells.length - 1]));

    }

    @Test(dataProvider = "arraysWithCellsToPutSign")
    public void XWinsTest(Cell... cells) {
        //Arrange
        Board board = new Board(3);
        WinController winController = new WinController(3, 3);
        Arrays.stream(cells).forEach(cell -> board.placeX(cell));

        //Assert
        assertTrue(winController.checkIfXWins(cells[cells.length - 1]));
    }

    @Test(dataProvider = "arraysWithCellsToPutSign")
    public void XDoNotWinTest(Cell... cells) {
        //Arrange
        Board board = new Board(3);
        WinController winController = new WinController(3, 3);
        Arrays.stream(cells).forEach(cell -> board.placeO(cell));

        //Assert
        assertFalse(winController.checkIfXWins(cells[cells.length - 1]));
    }

    @DataProvider
    public Object[][] arraysWithCellsToPutSign() {
        return new Object[][]{new Cell[]{Cell.one, Cell.two, Cell.three}, new Cell[]{Cell.one, Cell.four, Cell.seven},
                new Cell[]{Cell.three, Cell.five, Cell.seven}, new Cell[]{Cell.one, Cell.five, Cell.nine}};
    }
}