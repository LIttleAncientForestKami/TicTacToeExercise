package com.epam.jedrzejewski.input;

import com.epam.jedrzejewski.board.Board;
import com.epam.jedrzejewski.board.Cell;
import com.epam.jedrzejewski.board.Sign;

import java.util.Scanner;

public class UserInput {

    private Scanner scanner = new Scanner(System.in);
    private InputValidator inputValidator = new InputValidator();


    private Cell getUserInputForSign(Sign sign, Board boardToDisplay, int boardSize) {
        Cell cell;
        do {
            System.out.println(boardToDisplay);
            System.out.println("Where do we put next " + sign);
            cell = inputValidator.getValidCell(scanner.nextLine(), boardSize);
        } while (cell == Cell.empty);
        return cell;
    }

    public Cell whereToPlaceO(Board board, int boardSize) {
        return getUserInputForSign(Sign.O, board, boardSize);
    }

    public Cell whereToPlaceX(Board board, int boardSize) {
        return getUserInputForSign(Sign.X, board, boardSize);
    }
}
