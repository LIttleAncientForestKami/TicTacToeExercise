package game;

import board.Board;
import player.CurrentPlayer;
import player.Player;
import player.PlayerInput;

import java.util.InputMismatchException;

/**
 * Created by kuba on 24.06.16.
 */
public class GameController {
    private CurrentPlayer currentPlayer;
    private Board board;
    private PlayerInput playerInput;


    GameController(CurrentPlayer currentPlayer, Board board, PlayerInput playerInput) {
        this.currentPlayer = currentPlayer;
        this.board = board;
        this.playerInput = playerInput;
    }

    void play()throws InputMismatchException {
        Player player = currentPlayer.getCurrentPlayer();
        int move = playerInput.move();
        board.putMarkOnBoard(move, player.getMark());
        currentPlayer.changeCurrentPlayer();
    }
}
