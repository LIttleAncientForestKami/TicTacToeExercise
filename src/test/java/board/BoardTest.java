package board;

import org.testng.annotations.Test;
import player.Mark;

import static org.testng.Assert.assertEquals;

/**
 * Created by kuba on 23.06.16.
 */
public class BoardTest {

    @Test
    public void putMarkOnBoardTest(){
        Board board = new Board();
        board.putMarkOnBoard(5, Mark.O);
        assertEquals(board.board.get(5),Mark.O);

    }
}