package com.epam.jedrzejewski.input;

import com.epam.jedrzejewski.board.Board;
import com.epam.jedrzejewski.board.Cell;
import com.epam.jedrzejewski.board.Sign;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.InputMismatchException;

import static org.testng.Assert.*;


public class InputValidatorClassTest {
    private InputValidator inputValidator = new InputValidator();
    private int boardSize = 3;

    @Test
    public void nullUserInputTest() {
        assertEquals(Cell.empty, inputValidator.getValidCell(null, 3));
    }


    @Test
    public void emptyStringUserInputTest() {
        assertEquals(Cell.empty, inputValidator.getValidCell("", 3));
    }


    @Test(dataProvider = "validInputs")
    public void validUserInputTest(String userInput) throws InputMismatchException {
        //Arrange
        Arrays.stream(Cell.values()).forEach(cell -> cell.setSign(Sign.EMPTY));
        Cell expectedCell = Cell.values()[Integer.parseInt(userInput)];

        //Act
        Cell cellFromUserInput = inputValidator.getValidCell(userInput, boardSize);

        //Assert
        assertEquals(expectedCell, cellFromUserInput);
    }


    @DataProvider
    public Object[][] validInputs() {
        return new Object[][]{{"1"}, {"2"}, {"3"}, {"4"}, {"5"}, {"6"}, {"7"}, {"8"}, {"9"}};
    }


    @Test(dataProvider = "invalidInputs")
    public void invalidUserInputTest(String invalidInput) {
        assertEquals(Cell.empty, inputValidator.getValidCell(invalidInput, boardSize));
    }

    @DataProvider
    public Object[][] invalidInputs() {
        return new Object[][]{{"asdasdasdasdas dasd dasdasd"}, {" sdaldkasdlklwke"}, {"1.23232"}, {"1   2"}, {"O"}};
    }
}