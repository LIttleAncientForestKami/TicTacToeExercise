package game;

import board.Board;
import board.BoardPrinter;
import player.*;

import java.util.InputMismatchException;

public class Game {
    public static void main(String[] args) {
        Player player2 = new Player(Mark.X);
        Player player1 = new Player(Mark.O);
        CurrentPlayer currentPlayer = new CurrentPlayer(player1, player2);
        Board board = new Board();
        BoardPrinter boardPrinter = new BoardPrinter(board);
        InputValidator inputValidator = new InputValidator();
        inputValidator.init();
        PlayerInput playerInput = new PlayerInput(inputValidator);
        GameController gameController = new GameController(currentPlayer, board, playerInput);
        boardPrinter.printBoard();

        while (true){
            try {
                gameController.play();
            }catch (InputMismatchException e){
                System.out.println("Wrong Input Try Again");
            }
        }

    }
}
