package game;

import arbiter.Arbiter;
import board.Board;
import player.CurrentPlayer;
import player.Player;
import player.PlayerInput;

import java.util.InputMismatchException;

class GameController {
    private CurrentPlayer currentPlayer;
    private Board board;
    private PlayerInput playerInput;
    private Arbiter arbiter;


    GameController(CurrentPlayer currentPlayer, Board board, PlayerInput playerInput) {
        this.currentPlayer = currentPlayer;
        this.board = board;
        this.playerInput = playerInput;
        this.arbiter = Arbiter.getArbiter();
    }

    boolean play()throws InputMismatchException {
        Player player = currentPlayer.getCurrentPlayer();
        int move = playerInput.move();
        currentPlayer.changeCurrentPlayer();
        board.putMarkOnBoard(move, player.getMark());
        player.addToListOfMoves(move);
        System.out.println(board);
        return arbiter.decide(player);
    }
}
