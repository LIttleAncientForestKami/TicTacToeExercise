package com.epam.tictactoe.controller;

import com.epam.tictactoe.board.IBoard;
import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.board.Position;
import com.epam.tictactoe.input.ConsoleInput;
import com.epam.tictactoe.input.IInput;
import com.epam.tictactoe.player.IPlayer;

/**
 * @author Grzegorz Sledz
 *
 * Class responsible for getting field number from console input and printing state of board;
 */
public class BoardPlayerController {

    private final IBoard board;
    private final IInput consoleInput;

    public BoardPlayerController(IBoard board,IInput input) {
        this.board = board;
        this.consoleInput =input;
    }

    public void doMove(IPlayer player) {
        boolean isCorrectMove = false;
        IPosition toPosition;
        do {
            System.out.println(player + " choose field [1-" + board.dimension().value() * board.dimension().value() + "]: ");
            toPosition = new Position(consoleInput.readInt());
            isCorrectMove = board.placeMark(toPosition, player.sign());
            if (!isCorrectMove) {
                System.out.println(toPosition + " is not valid. Try again!!");
            }
        } while (!isCorrectMove);
        player.saveTurn(toPosition);
    }
    public void showBoard(){
        System.out.println(board);
    }
}
