package com.epam.tictactoe.controller;

import com.epam.tictactoe.board.Board;
import com.epam.tictactoe.board.Dimension;
import com.epam.tictactoe.board.IBoard;
import com.epam.tictactoe.board.Position;
import com.epam.tictactoe.input.ConsoleInput;
import com.epam.tictactoe.input.IInput;
import com.epam.tictactoe.managers.IPlayerManager;
import com.epam.tictactoe.managers.PlayerManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

/**
 * @author Grzegorz Sledz
 */
public class BoardPlayerControllerTest {

    @Test
    public void playerODoMoveOnPosition4Test(){
        IBoard board=new Board(new Dimension(3));
        IInput consoleInput= new ConsoleInput(new ByteArrayInputStream("4".getBytes()));
        IPlayerManager playerManager=new PlayerManager();
        BoardPlayerController controller=new BoardPlayerController(board,consoleInput);

        controller.doMove(playerManager.playerO());
        Assert.assertEquals(playerManager.playerO().turnsAmount(),1);
        Assert.assertEquals(playerManager.playerO().sign(),board.elementAt(new Position(4)));
    }
}
