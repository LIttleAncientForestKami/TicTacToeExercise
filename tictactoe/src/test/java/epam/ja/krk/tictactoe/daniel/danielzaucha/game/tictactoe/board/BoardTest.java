package epam.ja.krk.tictactoe.daniel.danielzaucha.game.tictactoe.board;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.testng.Assert.*;


@Test()
public class BoardTest {

    @Test
    public void checkBoardOutput()
    {
        Board b1 = new Board(3);
        Map<Integer, Sign> map = new LinkedHashMap<Integer, Sign>(b1.board);

        b1.placeCharacterOnBoard(5, Sign.O);
        map.put(5, Sign.O);

        assertEquals(b1.board, map);
    }
}
