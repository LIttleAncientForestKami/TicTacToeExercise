package com.danielzaucha.game.tictactoe.board;

import com.danielzaucha.game.tictactoe.player.base.Sign;
import com.danielzaucha.game.tictactoe.player.controller.PlayerController;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
        //given
        board = new Board(3);
        playerController = new PlayerController(board, 3);
        map = initializeBoard(3);
    }

    @Test
    public void allowsPlaceMarkOAtTheCenterOfBoard()
    {
        //when
        board.placeCharacterOnBoard(5, Sign.O);
        map.put(5, Sign.O);

        //than
        assertEquals(board.board, map);
    }

    @DataProvider(name="firstSequences")
    private Object[][] firstSequences(){
        return new Object[][]{{1, Sign.O, 2, Sign.X, 3, Sign.O},
            {1, Sign.X, 5, Sign.O, 7, Sign.X},
            {7, Sign.X, 8, Sign.O, 5, Sign.X},
        };
    }

    @DataProvider(name="secondSequences")
    private Object[][] secondSequences(){
        return new Object[][]{{1, Sign.O, 2, Sign.X, 2, Sign.O},
                {1, Sign.X, 5, Sign.O, 5, Sign.X},
                {7, Sign.X, 8, Sign.O, 8, Sign.X},
        };
    }

    @Test(dataProvider = "firstSequences")
    public void allowsPlaceSequenceOfMarksOnBoard(Integer pos1, Sign sign1, Integer pos2, Sign sign2, Integer pos3, Sign sign3)
    {
        //when
        board.placeCharacterOnBoard(pos1, sign1);
        board.placeCharacterOnBoard(pos2, sign2);
        board.placeCharacterOnBoard(pos3, sign3);

        map.put(pos1, sign1);
        map.put(pos2, sign2);
        map.put(pos3, sign3);

        //than
        assertEquals(board.board, map);
    }

    @Test(dataProvider = "secondSequences")
    public void forbidsPlaceSequenceOfMarksOnBoard(Integer pos1, Sign sign1, Integer pos2, Sign sign2, Integer pos3, Sign sign3)
    {
        //when
        board.placeCharacterOnBoard(pos1, sign1);
        board.placeCharacterOnBoard(pos2, sign2);
        board.placeCharacterOnBoard(pos3, sign3);

        map.put(pos1, sign1);
        map.put(pos2, sign2);
        map.put(pos3, sign3);

        //than
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
