package com.epam.jedrzejewski.input;

import com.epam.jedrzejewski.board.Cell;
import com.epam.jedrzejewski.board.Sign;

class InputValidator {

    Cell getValidCell(String userInput, int boardSize) {
        if (userInput == null || userInput.length() == 0) return Cell.empty;
        return isDigit(userInput) && isInRange(userInput, boardSize) && isCellEmpty(userInput) ? Cell.values()[Integer.parseInt(userInput)] : Cell.empty;
    }

    private boolean isDigit(String userInput) {
        return userInput.chars().mapToObj(i -> (char) i).allMatch(character -> Character.isDigit(character));
    }

    private boolean isInRange(String userInput, int boardSize) {
        Integer placedNumber = Integer.parseInt(userInput);
        return placedNumber >= 1 && placedNumber <= Math.pow(boardSize, 2);
    }

    private boolean isCellEmpty(String userInput) {
        return Cell.values()[Integer.parseInt(userInput)].containsSign(Sign.EMPTY);
    }
}
