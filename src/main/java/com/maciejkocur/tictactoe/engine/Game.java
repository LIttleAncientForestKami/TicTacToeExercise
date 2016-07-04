package com.maciejkocur.tictactoe.engine;

import com.maciejkocur.tictactoe.arbiter.Arbiter;
import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.impl.Field;
import com.maciejkocur.tictactoe.player.Player;
import com.maciejkocur.tictactoe.ui.BoardView;

import java.io.IOException;

public class Game {

    private final Board board;
    private Arbiter arbiter;
    private final Player player1;
    private final Player player2;
    private final BoardView boardView;
    private Player currentPlayer;

    public Game(Board board, Arbiter arbiter, Player player1, Player player2, BoardView boardView) {
        this.board = board;
        this.arbiter = arbiter;
        this.player1 = player1;
        this.player2 = player2;
        this.boardView = boardView;
        this.currentPlayer = player1;
    }

    public void start() throws IOException {
        while (true) {
            boardView.display(board);
            Field field = currentPlayer.chooseField(board.getAvailableFields());
            board.applyMark(field, currentPlayer.getMark());
            if (arbiter.isGameOver(field)) {
                arbiter.announceResult();
                boardView.display(board);
                return;
            }
            switchPlayer();
        }
    }

    private void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

}
