package game;

import board.Board;
import player.*;

import java.util.InputMismatchException;

public class Game {
    public static void main(String[] args) {
        Player player2 = new Player(Mark.X);
        Player player1 = new Player(Mark.O);
        CurrentPlayer currentPlayer = new CurrentPlayer(player1, player2);
        Board board = new Board();
        InputValidator inputValidator = InputValidator.getValidator();
        PlayerInput playerInput = new PlayerInput(inputValidator);
        GameController gameController = new GameController(currentPlayer, board, playerInput);
        System.out.println(board);

        boolean winingFlag = false;
        while (!winingFlag) {
            try {
                winingFlag = gameController.play();
            } catch (InputMismatchException e) {
                System.out.println("Wrong Input Try Again");
            }
        }

    }
}
