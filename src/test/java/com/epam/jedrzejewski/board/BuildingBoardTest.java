package com.epam.jedrzejewski.board;

import com.epam.jedrzejewski.board.BoardBuilder;
import com.epam.jedrzejewski.board.Cell;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.EnumSet;

import static org.testng.Assert.*;

public class BuildingBoardTest {

    private BoardBuilder boardBuilder = new BoardBuilder();

    /**
    * Board in my implementations is represented
    * as a EnumSet<Cell>
    * */
    @Test
    public void build3x3BoardTest() {
        //Arrange
        EnumSet<Cell> expectedBoard = EnumSet.range(Cell.one, Cell.nine);

        //Act
        EnumSet<Cell> result = boardBuilder.buildBoard(3);

        //Assert
        assertEquals(expectedBoard, result);
    }


    @Test
    public void builInvalidSizeBoardTest() {
        //Arrange
        EnumSet<Cell> expectedBoard = EnumSet.noneOf(Cell.class);

        //Act
        EnumSet<Cell> result = boardBuilder.buildBoard(-12121);

        //Assert
        assertEquals(expectedBoard, result);
    }

}