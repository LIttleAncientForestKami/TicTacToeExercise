package com.maciejkocur.tictactoe.engine;

import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.Mark;
import com.maciejkocur.tictactoe.board.impl.Field;
import com.maciejkocur.tictactoe.player.Player;
import com.maciejkocur.tictactoe.ui.BoardView;

import java.io.IOException;

/**
 * Created by maciej_kocur on 04.07.16.
 */
public class Game {

    private final Board board;
    private final Player player1;
    private final Player player2;
    private final BoardView boardView;
    private Player currentPlayer;
    private Mark currentMark;

    public Game(Board board, Player player1, Player player2, BoardView boardView) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.boardView = boardView;
        this.currentPlayer = player1;
        this.currentMark = Mark.CIRCLE;
    }

    public void start() throws IOException {
        while (true) {
            boardView.display(board);
            Field field = currentPlayer.chooseField(board.getAvailableFields());
            board.applyMark(field, currentMark);
            switchPlayer();
        }
    }

    private void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
            currentMark = Mark.CROSS;
        } else {
            currentPlayer = player1;
            currentMark = Mark.CIRCLE;
        }
    }

}
