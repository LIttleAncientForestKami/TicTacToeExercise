package com.danielzaucha.game.tictactoe.board;

import com.danielzaucha.game.tictactoe.input.Input;
import com.danielzaucha.game.tictactoe.player.base.Sign;
import com.danielzaucha.game.tictactoe.player.controller.PlayerController;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by daniel on 24.06.16.
 */
public class BoardTest {

    PlayerController playerController;
    Map<Integer, Sign> map;
    Board board;

    @BeforeMethod
    public void setReferencesToPlayerController()
    {
        board = new Board(3);

        //Because PlayerController is observer of Board, we have to create reference to him
        playerController = new PlayerController(board, 3);
        map = initializeBoard(3);
    }

    @Test
    public void allowsPlaceMarkOAtTheCenterOfBoard()
    {
        board.placeCharacterOnBoard(5, Sign.O);
        map.put(5, Sign.O);

        assertEquals(board.board, map);
    }

    @Test
    public void allowsPlaceSequenceOfMarksOnBoard()
    {
        board.placeCharacterOnBoard(1, Sign.O);
        board.placeCharacterOnBoard(2, Sign.X);
        board.placeCharacterOnBoard(3, Sign.O);

        map.put(1, Sign.O);
        map.put(2, Sign.X);
        map.put(3, Sign.O);

        assertEquals(board.board, map);
    }

    @Test
    public void forbidsPlaceSequenceOfMarksOnBoard()
    {
        board.placeCharacterOnBoard(1, Sign.O);
        board.placeCharacterOnBoard(2, Sign.X);
        board.placeCharacterOnBoard(2, Sign.O);

        map.put(1, Sign.O);
        map.put(2, Sign.X);
        map.put(2, Sign.O);

        assertNotEquals(board.board, map);
    }

    private Map<Integer, Sign> initializeBoard(int size)
    {
        Map<Integer, Sign> map = new LinkedHashMap<>();
        int len = size*size;
        for(int i=1; i<=len; i++){
            map.put(i, Sign.N);
        }
        return map;
    }
}
