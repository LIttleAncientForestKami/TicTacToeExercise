package com.tdudzik.tictactoe.logic.game;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.board.Mark;
import com.tdudzik.tictactoe.logic.io.InputHandler;
import com.tdudzik.tictactoe.logic.io.OutputOperations;
import com.tdudzik.tictactoe.logic.player.Player;

import java.util.Optional;

public class Game {

    private final GameRules gameRules;
    private final Board board;
    private final Player currentPlayer;
    private final Mark currentMark;
    private final Player opponentOfCurrentPlayer;
    private final GameResult gameResult;

    public Game(
            GameRules gameRules,
            Board board,
            Player currentPlayer,
            Mark currentMark,
            Player opponentOfCurrentPlayer,
            GameResult gameResult
    ) {
        this.gameRules = gameRules;
        this.board = board;
        this.currentPlayer = currentPlayer;
        this.currentMark = currentMark;
        this.opponentOfCurrentPlayer = opponentOfCurrentPlayer;
        this.gameResult = gameResult;
    }

    public Game playTurn(InputHandler inputHandler, OutputOperations outputOperations) {
        outputOperations.drawBoard(board);
        switch (currentMark) {
            case X:
                currentPlayer.playAsX(inputHandler, board);
                break;
            case O:
                currentPlayer.playAsO(inputHandler, board);
                break;
            default:
                throw new AssertionError();
        }

        return new Game(gameRules, board, opponentOfCurrentPlayer, nextMark(), currentPlayer, gameResult());
    }

    private GameResult gameResult() {
        if (gameRules.gameWasWon(board)) {
            return new GameResult(true, Optional.of(currentPlayer));
        } else if (gameRules.gameEndedInDraw(board)) {
            return new GameResult(true, Optional.empty());
        } else {
            return new GameResult(false, Optional.empty());
        }
    }

    private Mark nextMark() {
        return currentMark.equals(Mark.X) ? Mark.O : Mark.X;
    }

    public boolean isOver() {
        return gameResult.gameIsOver();
    }

    public boolean wasWon() {
        return gameResult.getWinner().isPresent();
    }

    public Player getWinner() {
        if (!wasWon()) {
            throw new IllegalStateException("There is no winner.");
        }

        return gameResult.getWinner().get();
    }

    public static class GameResult {

        private final boolean gameIsOver;
        private final Optional<Player> winner;

        public GameResult(boolean gameIsOver, Optional<Player> winner) {
            this.gameIsOver = gameIsOver;
            this.winner = winner;
        }

        public boolean gameIsOver() {
            return gameIsOver;
        }

        public Optional<Player> getWinner() {
            return winner;
        }

    }

}
