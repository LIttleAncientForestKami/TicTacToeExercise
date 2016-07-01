package com.danielzaucha.game.tictactoe.player.controller;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.input.Input;
import com.danielzaucha.game.tictactoe.player.base.Player;
import com.danielzaucha.game.tictactoe.player.base.PlayerType;
import com.danielzaucha.game.tictactoe.player.base.Sign;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static sun.audio.AudioPlayer.player;

/**
 * Created by daniel on 30.06.16.
 */
public class PlayerControllerTest {

    int boardSize;
    Board board;

    @BeforeMethod
    public void initialize(){
        //given before
        boardSize = 3;
        board = new Board(boardSize);
    }

    @DataProvider(name = "firstSequence")
    private Object[][] firstSequence() {
        return new Object[][] {{1, Sign.X, 2, Sign.O, 3, Sign.X},
                {2, Sign.X, 4, Sign.O, 9, Sign.X},
                {3, Sign.X, 9, Sign.O, 8, Sign.X},
                };
    }

    @DataProvider(name = "secondSequence")
    private Object[][] secondSequence() {
        return new Object[][] {{1, Sign.X, 1, Sign.O},
                {2, Sign.X, 2, Sign.O},
                {3, Sign.X, 3, Sign.O},
        };
    }

    @Test(dataProvider = "firstSequence")
    public void allowsToChangeReferenceToCurrentPlayer(Integer pos1, Sign sign1, Integer pos2, Sign sign2, Integer pos3, Sign sign3){
        //given
        PlayerController playerController = new PlayerController(board, boardSize);
        Player playerO = (Player) playerController.playerO; //expected currentPlayer after three moves

        //when
        board.placeCharacterOnBoard(pos1,sign1);
        board.placeCharacterOnBoard(pos2,sign2);
        board.placeCharacterOnBoard(pos3,sign3);

        //then
        assertEquals(playerController.curPlayer, playerO);
    }

    @Test(dataProvider = "secondSequence")
    public void forbidToChangeReferenceToCurrentPlayer(Integer pos1, Sign sign1, Integer pos2, Sign sign2){
        //given
        PlayerController playerController = new PlayerController(board, boardSize);
        Player playerX = (Player) playerController.playerX; //expected currentPlayer after two moves

        //when
        board.placeCharacterOnBoard(pos1, sign1);
        board.placeCharacterOnBoard(pos2, sign2);

        //then
        assertNotEquals(playerController.curPlayer, playerX);
    }
}