package board;

import org.testng.annotations.Test;
import player.Mark;

import static org.testng.Assert.assertEquals;

public class BoardTest {

    @Test
    public void putMarkOnBoardTest() {
        Board board = new Board();
        board.putMarkOnBoard(5, Mark.O);
        assertEquals(board.board.get(5), Mark.O);
    }
}