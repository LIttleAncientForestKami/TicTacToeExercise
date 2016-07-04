package com.epam.tictactoe.arbiter;

import com.epam.tictactoe.board.*;
import com.epam.tictactoe.enums.GameState;
import com.epam.tictactoe.enums.Sign;
import com.epam.tictactoe.managers.PlayerManager;
import com.epam.tictactoe.player.IPlayer;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Grzegorz Sledz
 */
public class Arbiter3x3Test {

    private IBoard board;
    private IArbiter arbiter;
    private PlayerManager playerManager;

    private void simulateMove(IPosition position, IPlayer player, IBoard board) {
        board.placeMark(position, player.sign());
        player.saveTurn(position);
    }

    @BeforeMethod
    public void initialize() {
        this.board = new Board(new Dimension(3));
        this.arbiter = new Arbiter3x3(board);
        this.playerManager = new PlayerManager();
    }

    @Test
    public void playerODiagonalWinnerTest() {
        simulateMove(new Position(1), playerManager.playerO(), board);
        simulateMove(new Position(5), playerManager.playerO(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerO()), GameState.NO_WINNER);
        simulateMove(new Position(9), playerManager.playerO(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerO()), GameState.WINNER);
    }

    @Test
    public void nobodyWinnerTest() {
        simulateMove(new Position(1), playerManager.playerO(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerO()), GameState.NO_WINNER);
        simulateMove(new Position(2), playerManager.playerX(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerX()), GameState.NO_WINNER);
        simulateMove(new Position(3), playerManager.playerO(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerO()), GameState.NO_WINNER);
        simulateMove(new Position(5), playerManager.playerX(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerX()), GameState.NO_WINNER);
        simulateMove(new Position(4), playerManager.playerO(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerO()), GameState.NO_WINNER);
        simulateMove(new Position(7), playerManager.playerX(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerX()), GameState.NO_WINNER);
        simulateMove(new Position(8), playerManager.playerO(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerO()), GameState.NO_WINNER);
        simulateMove(new Position(6), playerManager.playerX(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerX()), GameState.NO_WINNER);
        simulateMove(new Position(9), playerManager.playerO(), board);
        Assert.assertEquals(arbiter.checkIsWinner(playerManager.playerO()), GameState.NOBODY_WIN);
    }
}
