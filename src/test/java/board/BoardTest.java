package board;

import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;

/**
 * Created by kuba on 23.06.16.
 */
public class BoardTest {

    @Test
    public void putMarkOnTableTest(){
        Board board = new Board();
        board.putMarkOnTable(5,"0");
        assertEquals(board.board.get(5),"O");

    }
}