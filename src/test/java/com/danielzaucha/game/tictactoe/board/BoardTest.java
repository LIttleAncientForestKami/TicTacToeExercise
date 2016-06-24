package com.danielzaucha.game.tictactoe.board;

import com.danielzaucha.game.tictactoe.player.base.Sign;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by daniel on 24.06.16.
 */
@Test()
public class BoardTest {

    @Test
    public void checkBoardOutput()
    {
        Board b1 = new Board(3);
        Map<Integer, Sign> map = new LinkedHashMap<>(b1.board);

        b1.placeCharacterOnBoard(5, Sign.O);
        map.put(5, Sign.O);

        assertEquals(b1.board, map);
    }
}
