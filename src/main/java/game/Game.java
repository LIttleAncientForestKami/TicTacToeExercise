package game;

import board.Board;
import palyer.*;

import java.util.InputMismatchException;

/**
 * Created by kuba on 27.06.16.
 */
public class Game {
    public static void main(String[] args) {
        Player player2 = new Player(Mark.X);
        Player player1 = new Player(Mark.O);
        CurrentPlayer currentPlayer = new CurrentPlayer(player1, player2);
        Board board = new Board();
        InputValidator inputValidator = new InputValidator();
        inputValidator.init();
        PlayerInput playerInput = new PlayerInput(inputValidator);
        GameController gameController = new GameController(currentPlayer, board, playerInput);


        while (true){
            try {
                gameController.play();
            }catch (InputMismatchException e){
                System.out.println("Wrong Input Try Again");
            }

        }
    }
}
