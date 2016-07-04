package com.epam.tictactoe.controller;

import com.epam.tictactoe.arbiter.Arbiter3x3;
import com.epam.tictactoe.arbiter.IArbiter;
import com.epam.tictactoe.board.*;
import com.epam.tictactoe.enums.GameState;
import com.epam.tictactoe.input.ConsoleInput;
import com.epam.tictactoe.managers.IPlayerManager;
import com.epam.tictactoe.managers.PlayerManager;
import com.epam.tictactoe.player.IPlayer;

/**
 * @author Grzegorz Sledz
 *
 * Class is needded to create game logic for Tic Tac Toe.
 */
public class TicTacToeGame {
    private final IPlayerManager playerManager;
    private final IArbiter arbiter;
    private final BoardPlayerController boardPlayerController;

    public TicTacToeGame(IDimension dimension) {
        IBoard board = new Board(dimension);
        this.playerManager = new PlayerManager();
        this.arbiter = new Arbiter3x3(board);
        this.boardPlayerController = new BoardPlayerController(board,new ConsoleInput());
    }

    public TicTacToeGame playO() {
        nextTurn(playerManager.playerO());
        return this;
    }

    public TicTacToeGame playX() {
        nextTurn(playerManager.playerX());
        return this;
    }

    private void nextTurn(IPlayer player) {
        boardPlayerController.doMove(player);
        boardPlayerController.showBoard();
        GameState gameState = arbiter.checkIsWinner(player);
        checkGameState(gameState, player);
    }

    private void checkGameState(GameState gameState, IPlayer player) {
        if (gameState == GameState.WINNER) {
            System.out.println("The winner is: " + player);
            stop();
        }
        if (gameState == GameState.NOBODY_WIN) {
            System.out.println("Nobody won");
            stop();
        }
    }

    private void stop() {
        System.exit(0);
    }
}
